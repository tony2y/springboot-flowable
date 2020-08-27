package com.tony.flowable.service.impl;

import com.tony.flowable.entity.SysUser;
import com.tony.flowable.mapper.SysUserMapper;
import com.tony.flowable.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhu yong
 * @version 1.0
 * @date 2020/8/27 11:02
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> getUserList(String name) {
        SysUser user = new SysUser();
        user.setRealname(name);
        return sysUserMapper.select(user);
    }
}
