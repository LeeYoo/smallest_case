package com.leyo.springboot.web.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by leyo on 2018/1/17.
 * 特定业务消息处理器
 */
@Component
public class MyEventHandler implements EventHandler<MyApplicationEvent> {
    private Logger logger = LoggerFactory.getLogger(MyEventHandler.class);

    @Override
    public void handle(MyApplicationEvent event) {
        logger.info("特定业务消息处理器 : {}", event);
    }

}
