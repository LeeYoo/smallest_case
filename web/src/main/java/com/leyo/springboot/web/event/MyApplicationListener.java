package com.leyo.springboot.web.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by leyo on 2018/1/17.
 * 定义事件监听器
 */
@Component  //这里注意我们直接把监听类注册成组件
public class MyApplicationListener implements ApplicationListener<MyApplicationEvent> {

    @Autowired
    private EventHandlerRegister eventHandlerRegister;

    @Override
    @Async      //异步
    public void onApplicationEvent(MyApplicationEvent event) {
        eventHandlerRegister.getHandlerListToC().forEach(handler -> handler.handle(event));
    }
}
