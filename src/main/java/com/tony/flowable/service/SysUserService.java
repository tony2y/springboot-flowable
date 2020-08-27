package com.tony.flowable.service;

import com.tony.flowable.entity.SysUser;

import java.util.List;

/**
 * @author zhu yong
 * @version 1.0
 * @date 2020/8/27 11:02
 */
public interface SysUserService {

    List<SysUser> getUserList(String name);
}
