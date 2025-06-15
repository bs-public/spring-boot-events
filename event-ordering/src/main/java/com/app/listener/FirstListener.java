package com.app.listener;

import com.app.NotificationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class FirstListener {
  private static final Logger log = LoggerFactory.getLogger(FirstListener.class);

  @EventListener
  public void onEvent(NotificationEvent event) {
    log.info("FirstListener received event: {}", event.message());
  }
}
