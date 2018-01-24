package com.leyo.springboot.web.req;

/**
 * Created by leyo on 2018/1/10.
 */
public class QueryActivityInfoReq {

    /**
     * ID
     */
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "QueryActivityInfoReq{" +
                "id=" + id +
                '}';
    }
}
