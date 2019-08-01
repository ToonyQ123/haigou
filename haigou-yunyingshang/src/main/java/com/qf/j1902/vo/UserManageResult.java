package com.qf.j1902.vo;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 15:41 2019/7/31
 */
@Data
public class UserManageResult {
    private long total; //当前总记录数
    private List<?> data;  //当前页结果集
}
