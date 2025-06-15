package com.app.listener;

import com.app.event.StartProcessEvent;
import com.app.event.StepOneCompletedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class StepOneListener {
  private static final Logger log = LoggerFactory.getLogger(StepOneListener.class);
  private final ApplicationEventPublisher publisher;

  public StepOneListener(ApplicationEventPublisher publisher) {
    this.publisher = publisher;
  }

  @EventListener
  public void onStart(StartProcessEvent event) {
    log.info("[Step 1] Processing: {}", event.payload());
    // Step 1 work...
    publisher.publishEvent(new StepOneCompletedEvent(event.payload() + " [step1-done]"));
  }
}
