package com.leyo.springboot.web.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by leyo on 2018/1/17.
 */
public interface EventHandler<T extends ApplicationEvent> {

    void handle(T event);
}
