package com.app.listener;

import com.app.UserCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Component
public class UserCreatedListener {
  private static final Logger log = LoggerFactory.getLogger(UserCreatedListener.class);

  @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
  public void handleUserCreated(UserCreatedEvent event) {
    log.info("[TX-EVENT] User created event handled for: {}", event.userName());
  }
}
