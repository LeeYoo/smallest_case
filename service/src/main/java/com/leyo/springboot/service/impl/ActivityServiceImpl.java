package com.leyo.springboot.service.impl;

import com.leyo.springboot.dao.entity.MyTest;
import com.leyo.springboot.dao.mapper.MyTestMapper;
import com.leyo.springboot.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by leyo on 2018/1/11.
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private MyTestMapper myTestMapper;

    @Override
    public String query(int id) {
        MyTest myTest = myTestMapper.selectByPrimaryKey(id);

        return myTest.getName();
    }
}
