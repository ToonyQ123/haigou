package com.qf.j1902.shiro;


import com.qf.j1902.pojo.ManagePermission;
import com.qf.j1902.pojo.ManageUser;
import com.qf.j1902.service.ManagePermissionService;
import com.qf.j1902.service.ManageUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: shiro权限认证
 * @Project Name: haigou
 * @Author: Kiana
 * @CreateData: 15:39 2019/7/24
 */
public class MyRealm extends AuthorizingRealm {
    @Autowired
    private ManageUserService manageUserService;

    @Autowired
    private ManagePermissionService managePermissionService;
    //授权(权限管理)
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取用户名
        String primaryPrincipal = (String) principalCollection.getPrimaryPrincipal();
        //根据用户名获取用户权限
        Set<ManagePermission> managePermission = managePermissionService.selectOneByUserName(primaryPrincipal);
        Set<String> perms = new HashSet<>();
        //遍历权限
        for (ManagePermission perm: managePermission){
            //获取权限名称组成集合
            perms.add(perm.getPermName());
        }
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.setStringPermissions(perms);
        return simpleAuthorizationInfo;
    }


    //认证(登陆管理)
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取用户名
        String principal = (String) authenticationToken.getPrincipal();
        //根据用户名获取用户信息
        ManageUser user = manageUserService.findUserByUserName(principal);
        SimpleAuthenticationInfo simpleAuthenticationInfo = null;
        if (user != null){
            String password = user.getPassword();
            simpleAuthenticationInfo = new SimpleAuthenticationInfo(principal,password,this.getName());
        }
        return simpleAuthenticationInfo;
    }
}
