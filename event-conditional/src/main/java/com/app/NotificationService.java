package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
  private static final Logger log = LoggerFactory.getLogger(NotificationService.class);
  private final ApplicationEventPublisher publisher;

  public NotificationService(ApplicationEventPublisher publisher) {
    this.publisher = publisher;
  }

  public void sendNotification(String message, String type) {
    log.info("Publishing {} notification: {}", type, message);
    publisher.publishEvent(new NotificationEvent(message, type));
  }
}
