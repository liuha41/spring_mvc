package com.baomidou.service.impl;

import com.baomidou.entity.User;
import com.baomidou.mapper.UserDao;
import com.baomidou.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黑马程序员
 * @since 2023-08-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
