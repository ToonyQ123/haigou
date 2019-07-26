package com.qf.j1902.utils;

import com.qf.j1902.vo.MessageResult;
import com.qf.j1902.vo.MsgResult;

/**
 * Created by zhou on 2019/7/24.
 */
public class ResultFactory {
    public  static MessageResult buildSuccessResult(String  msg){

        return  buildMsgResult(ResultStatus.SUCCESS,msg,null);
    }
    public  static MessageResult buildFailResult(String  msg){

        return  buildMsgResult(ResultStatus.FAIL,msg,null);
    }
    public  static MessageResult buildNotFoundResult(String  msg){

        return  buildMsgResult(ResultStatus.NOTFOUND,msg,null);
    }

    private static    MessageResult buildMsgResult(ResultStatus resultStatus,String msg,Object data){
        return  new MessageResult(resultStatus.code,msg,data);
    }

}
