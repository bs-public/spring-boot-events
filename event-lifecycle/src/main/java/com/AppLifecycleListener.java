package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class AppLifecycleListener {
  private static final Logger log = LoggerFactory.getLogger(AppLifecycleListener.class);

  @EventListener
  public void onStarted(ApplicationStartedEvent event) {
    log.info("[LIFECYCLE] Application started.");
  }

  @EventListener
  public void onReady(ApplicationReadyEvent event) {
    log.info("[LIFECYCLE] Application ready for requests.");
  }

  @EventListener
  public void onRefreshed(ContextRefreshedEvent event) {
    log.info("[LIFECYCLE] Application context refreshed.");
  }

  @EventListener
  public void onShutdown(ContextClosedEvent event) {
    log.info("[LIFECYCLE] Application context is shutting down.");
  }

  @EventListener
  public void onFailed(ApplicationFailedEvent event) {
    log.error("[LIFECYCLE] Application startup failed.", event.getException());
  }
}
