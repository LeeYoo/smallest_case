package com.leyo.springboot.web.result;

import java.io.Serializable;

/**
 * 结果类
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -1765922262613294441L;

    /**
     * 错误码 ,0默认成功
     */
    protected int code = ErrorCode.SUCCESS.code();

    public static final Result UNAUTHORIZED = new Result(401, "unauthorized");

    /**
     * 结果信息
     */
    protected String msg = "";

    public Result(){
        super();
    }

    public Result(String msg) {
        this.msg = msg;
    }

    public Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Result(ErrorCode errorCode) {
        this.code = errorCode.code();
        this.msg = errorCode.msg();
    }

    /**
     * 拷贝结果
     *
     * @param result 拷贝目标结果
     * @return 拷贝源结果
     */
    public Result copy(Result result) {
        if (result != null) {
            this.code = result.code;
            this.msg = result.msg;
        }
        return this;
    }

    /**
     * 失败
     *
     * @param code 错误码
     */
    public void fail(int code) {
        this.code = code;
    }

    /**
     * 失败
     *
     * @param code 错误码
     * @param msg  结果信息
     */
    public void fail(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 失败
     */
    public void fail(ErrorCode err) {
        this.code = err.code();
        this.msg = err.msg();
    }

    /**
     * 获取错误码
     */
    public int getCode() {
        return code;
    }

    /**
     * 设置错误码
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * 获取结果信息
     */
    public String getMsg() {
        return msg;
    }

    /**
     * 设置结果信息
     *
     * @param msg 结果信息
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Result [code=" + code + ", msg=" + msg + "]";
    }

    public boolean executeSuccess() {
        if (this.code == ErrorCode.SUCCESS.code()) {
            return true;
        }
        return false;
    }
}