package com.app.events.async;

import com.app.events.event.NotificationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncNotificationListener {

  @Async
  @EventListener
  public void handleAsync(NotificationEvent event) {
    System.out.println(
        "[ASYNC] Received: "
            + event.getMessage()
            + " on thread: "
            + Thread.currentThread().getName());
    try {
      Thread.sleep(1000); // Simulate long-running task
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}
