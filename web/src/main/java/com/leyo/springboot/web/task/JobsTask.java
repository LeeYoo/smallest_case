package com.leyo.springboot.web.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by leyo on 2018/1/16.
 */
@Component
public class JobsTask {
    private Logger logger = LoggerFactory.getLogger(JobsTask.class);

    //任务1
    @Scheduled(cron = "0 0 3,6 * * ?")    //每天3点和6点
    public void job1() {
        logger.info("the task is starting for clearing redis2'cache…………………………start");

        logger.info("the task is starting for clearing redis2'cache…………………………end");
    }

}
