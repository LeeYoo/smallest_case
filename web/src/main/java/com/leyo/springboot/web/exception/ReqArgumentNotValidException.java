package com.leyo.springboot.web.exception;

/**
 * Created by leyo on 2018/1/16.
 * 特定异常类型
 */
public class ReqArgumentNotValidException extends RuntimeException {

    public ReqArgumentNotValidException(){
        super();
    }

    public ReqArgumentNotValidException(String message){
        super(message);
    }
}
