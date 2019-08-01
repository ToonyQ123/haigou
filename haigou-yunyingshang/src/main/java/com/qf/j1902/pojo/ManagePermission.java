package com.qf.j1902.pojo;

import lombok.Data;

/**
 * @Description:
 * @Project Name: leyou
 * @Author: Kiana
 * @CreateData: 16:01 2019/7/24
 */
@Data
public class ManagePermission {
    private int permId;  //权限ID
    private String permName;  //权限名称
    private String permUrl;  //权限操作路径
}
