package com.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
  private static final Logger log = LoggerFactory.getLogger(UserService.class);

  private final UserRepository userRepository;
  private final ApplicationEventPublisher publisher;

  public UserService(UserRepository userRepository, ApplicationEventPublisher publisher) {
    this.userRepository = userRepository;
    this.publisher = publisher;
  }

  @Transactional
  public User createUser(String name) {
    User user = userRepository.save(new User(name));

    // Event will be only published after commit
    log.info("User saved, will publish event after commit: {}", name);
    publisher.publishEvent(new UserCreatedEvent(name));

    return user;
  }
}
