package com.app;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SyncNotificationListener {

  @EventListener
  public void handleSync(NotificationEvent event) {
    System.out.println(
        "[SYNC] Received: "
            + event.getMessage()
            + " on thread: "
            + Thread.currentThread().getName());
  }
}
