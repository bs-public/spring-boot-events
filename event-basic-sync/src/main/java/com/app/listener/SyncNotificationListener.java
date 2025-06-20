package com.app.listener;

import com.app.NotificationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SyncNotificationListener {

  private static final Logger log = LoggerFactory.getLogger(SyncNotificationListener.class);

  @EventListener
  public void handleSync(NotificationEvent event) {
    log.info(
        "[SYNC] Received: {} on thread: {}", event.message(), Thread.currentThread().getName());
  }
}
