package com.leyo.springboot.web.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leyo on 2018/1/17.
 * 事件处理器注册中心
 */
@Component
public class EventHandlerRegister {

    @Autowired
    private MyEventHandler myEventHandler;

    private List<EventHandler> handlerListToC = new ArrayList<>();

    @PostConstruct
    public void initHandlerList() {
        registerToC(myEventHandler);
    }

    public void registerToC(EventHandler handler) {
        handlerListToC.add(handler);
    }

    public List<EventHandler> getHandlerListToC() {
        return handlerListToC;
    }

}
