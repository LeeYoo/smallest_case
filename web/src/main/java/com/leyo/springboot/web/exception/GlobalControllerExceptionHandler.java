package com.leyo.springboot.web.exception;

import com.leyo.springboot.web.result.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

/**
 * Created by leyo on 2018/1/16.
 * 统一异常处理
 * @ControllerAdvice 定义统一的异常处理类，而不是在每个Controller中逐个定义
 */
@ControllerAdvice
public class GlobalControllerExceptionHandler {
    protected final Logger logger = LoggerFactory.getLogger(GlobalControllerExceptionHandler.class);

    @InitBinder
    public void initBinder(WebDataBinder binder) {
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Result notFound() {
        return ResultFactory.newNotFund();
    }

    @ResponseBody
    @ExceptionHandler({RuntimeException.class})
    public Result runtimeException(RuntimeException e) {
        logger.error("server runtimeException : ", e);
        return ResultFactory.newServerError();
    }

    /**
     * @ExceptionHandler    用来定义函数针对的异常类型
     * @ResponseBody        用来返回Json格式的数据
     * @param excepion
     * @return
     */
    @ResponseBody
    @ExceptionHandler({ReqArgumentNotValidException.class})
    public Result notValid(ReqArgumentNotValidException excepion) {
        logger.error("ReqArgumentNotValidException : ", excepion);
        return ResultFactory.newMethodArgumentNotValid();
    }



}
