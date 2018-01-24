package com.leyo.springboot.web.exception;

import com.leyo.springboot.web.result.Result;
import org.springframework.http.HttpStatus;

/**
 * Created by leyo on 2018/1/16.
 */
public class ResultFactory {
    public final static int MISS_PARAM_CODE = 101;
    
    private ResultFactory() {
    }

    public static Result newNotFund() {
        Result result = new Result();
        result.setCode(HttpStatus.NOT_FOUND.value());
        result.setMsg(HttpStatus.NOT_FOUND.getReasonPhrase());
        return result;
    }

    public static Result newServerError() {
        Result result = new Result();
        result.setCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
        result.setMsg(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
        return result;
    }

    public static Result newMethodArgumentNotValid() {
        Result result = new Result();
        result.setCode(MISS_PARAM_CODE);
        result.setMsg("param not valid");
        return result;
    }
}
