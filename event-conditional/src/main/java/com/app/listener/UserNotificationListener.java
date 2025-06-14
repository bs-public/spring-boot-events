package com.app.listener;

import com.app.NotificationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserNotificationListener {
  private static final Logger log = LoggerFactory.getLogger(UserNotificationListener.class);

  // @EventListener(condition = "#event.type == 'user'")
  @EventListener(condition = "#root.args[0].type == 'user'")
  public void handleUser(NotificationEvent event) {
    log.info("[USER] Received user notification: {}", event.message());
  }
}
