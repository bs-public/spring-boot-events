package com.app.listener;

import com.app.event.StepOneCompletedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StepTwoListener {
  private static final Logger log = LoggerFactory.getLogger(StepTwoListener.class);

  @EventListener
  public void onStepOneComplete(StepOneCompletedEvent event) {
    log.info("[Step 2] Processing after step 1: {}", event.payload());
    // Step 2 work...
  }
}
