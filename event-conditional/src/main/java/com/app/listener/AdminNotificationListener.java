package com.app.listener;

import com.app.NotificationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AdminNotificationListener {
  private static final Logger log = LoggerFactory.getLogger(AdminNotificationListener.class);

  @EventListener(condition = "#event.type == 'admin'")
  public void handleAdmin(NotificationEvent event) {
    log.info("[ADMIN] Received admin notification: {}", event.message());
  }
}
