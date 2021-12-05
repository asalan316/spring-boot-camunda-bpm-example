package com.ak.bpm;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.Map;

import java.util.HashMap;

/**
 *  External class triggered from Send Notification Activity
 */
@Component
public class SendNotificationsDelegate implements JavaDelegate {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    Map<String, Object> storage = new HashMap<>();

    @Override
    public void execute(DelegateExecution execution) {
        logger.info("executing task send notifications : " + execution);
        storage.computeIfAbsent("eventName", k -> execution.getEventName() );
        logger.info("storage contains: "+ storage.toString() );
        logger.info("completed task: {}", execution.getCurrentActivityName());
    }



}
