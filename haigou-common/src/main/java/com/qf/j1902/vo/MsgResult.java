package com.qf.j1902.vo;

import java.util.List;

public class MsgResult {
    private Integer status;
    private String maessage;
    private List<?> data;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMaessage() {
        return maessage;
    }

    public void setMaessage(String maessage) {
        this.maessage = maessage;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
