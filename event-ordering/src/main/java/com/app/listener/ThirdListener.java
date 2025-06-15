package com.app.listener;

import com.app.NotificationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class ThirdListener {
  private static final Logger log = LoggerFactory.getLogger(ThirdListener.class);

  @EventListener
  public void onEvent(NotificationEvent event) {
    log.info("ThirdListener received event: {}", event.message());
  }
}
