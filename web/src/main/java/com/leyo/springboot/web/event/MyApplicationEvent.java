package com.leyo.springboot.web.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by leyo on 2018/1/17.
 * 自定义事件
 */
public class MyApplicationEvent extends ApplicationEvent {

    public MyApplicationEvent(Object source) {
        super(source);
    }
}
