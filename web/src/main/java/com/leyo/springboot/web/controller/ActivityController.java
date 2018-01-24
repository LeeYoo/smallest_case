package com.leyo.springboot.web.controller;

import com.leyo.springboot.service.ActivityService;
import com.leyo.springboot.web.event.MyApplicationEvent;
import com.leyo.springboot.web.req.QueryActivityInfoReq;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author leyo
 * banner 活动
 */
@Controller
@RequestMapping("/smallest/case")
public class ActivityController {
    private Logger logger = LoggerFactory.getLogger(ActivityController.class);

    @Autowired
    private ActivityService activityService;

    @Autowired
    private ApplicationContext applicationContext;

    @RequestMapping(value = "/test/list", method = RequestMethod.GET)
    @ResponseBody
    public String queryTestList(@ModelAttribute QueryActivityInfoReq req) {
        logger.info("[web]ActivityController-queryActivityList，请求参数req={}", req);

        //使用监听器
        applicationContext.publishEvent(new MyApplicationEvent(new Object()));

        return activityService.query(req.getId());
    }

}
