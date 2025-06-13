package com.app.events.basic;

import com.app.events.event.NotificationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notify")
public class NotificationController {
  private final ApplicationEventPublisher publisher;

  public NotificationController(ApplicationEventPublisher publisher) {
    this.publisher = publisher;
  }

  @GetMapping
  public String sendNotification(@RequestParam String message) {
    publisher.publishEvent(new NotificationEvent(message));
    return "Notification sent: " + message;
  }
}
