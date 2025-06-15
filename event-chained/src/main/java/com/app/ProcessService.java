package com.app;

import com.app.event.StartProcessEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class ProcessService {
  private static final Logger log = LoggerFactory.getLogger(ProcessService.class);
  private final ApplicationEventPublisher publisher;

  public ProcessService(ApplicationEventPublisher publisher) {
    this.publisher = publisher;
  }

  public String startProcess(String payload) {
    log.info("Starting process with payload: {}", payload);
    publisher.publishEvent(new StartProcessEvent(payload));
    log.info("Event published successfully with payload: {}", payload);
    return "Process started";
  }
}
