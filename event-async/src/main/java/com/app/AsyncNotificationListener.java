package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncNotificationListener {

  private static final Logger log = LoggerFactory.getLogger(AsyncNotificationListener.class);

  @Async(AsyncExecutors.NOTIFICATION_EXECUTOR)
  @EventListener
  public void handleAsync(NotificationEvent event) {
    log.info(
        "[ASYNC] Received: {} on thread: {}", event.getMessage(), Thread.currentThread().getName());
    try {
      Thread.sleep(1000); // Simulate long-running task
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      log.warn("Thread interrupted while handling async event for message: {}", event.getMessage());
    }
  }
}
