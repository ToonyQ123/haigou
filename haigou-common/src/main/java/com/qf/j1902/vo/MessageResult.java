package com.qf.j1902.vo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by zhou on 2019/7/24.
 */
@Setter
@Getter
public class MessageResult {
    //状态码
    public Integer status;
    //短消息
    public String message;
    //返回的对象
    public Object data;

    @Override
    public String toString() {
        return "MessageResult{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public MessageResult() {

    }
    public  MessageResult(Integer status,String message,Object data){
        this.status=status;
        this.message=message;
        this.data=data;
    }
}
