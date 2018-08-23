package com.dnmanager.service.impl;

import com.dnmanager.HaltException;
import com.dnmanager.dao.UserMapper;
import com.dnmanager.pojo.User;
import com.dnmanager.pojo.UserExample;
import com.dnmanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean reg(User user) {

        UserExample u = new UserExample();
        UserExample.Criteria criteria = u.createCriteria();
        criteria.andVAccountEqualTo(user.getvAccount());
        List<User> users = userMapper.selectByExample(u);
        if (users != null && users.size() > 0) {
            throw new HaltException("账号已经被注册过了，请重新编写账号");
        }
        u.clear();
        UserExample.Criteria criteria1 = u.createCriteria();
        criteria1.andVPhoneEqualTo(user.getvPhone());
        List<User> users1 = userMapper.selectByExample(u);
        if (users1 != null && users1.size() > 0) {
            throw new HaltException("手机已经被注册过了，请重新编写手机");
        }
        user.setPassword("app_account");
        user.setRegTime((int)(System.currentTimeMillis() / 1000) );
        int i = userMapper.insertSelective(user);

        return true;
    }

    @Override
    public User login(User user) {
        String account = user.getvAccount();

        UserExample u = new UserExample();
        UserExample.Criteria criteria = u.createCriteria();
        criteria.andVAccountEqualTo(account);
        List<User> users = userMapper.selectByExample(u);
        if (users.size() == 0) {
            u.clear();
            UserExample.Criteria vPhone = u.createCriteria();
            vPhone.andVPhoneEqualTo(account);
            List<User> vphones = userMapper.selectByExample(u);
            if (vphones.size() == 0) {
                throw new HaltException("账号不存在");
            }

        }
        criteria.andVPasswordEqualTo(user.getvPassword());
        List<User> users1 = userMapper.selectByExample(u);
        if (users1.size() == 0) {
            u.clear();
            UserExample.Criteria phone2 = u.createCriteria();
            phone2.andVPhoneEqualTo(user.getvAccount())
                    .andVPasswordEqualTo(user.getvPassword());

            criteria.andVPasswordEqualTo(user.getvPassword());
            List<User> phoneUser = userMapper.selectByExample(u);
            if (users1.size() == 0) {
                throw new HaltException("账号与密码不匹配");
            }
        }

        return users1.get(0);
    }

    @Override
    public User forgetPw(User user) {
        UserExample u = new UserExample();
        UserExample.Criteria criteria = u.createCriteria();
        criteria.andVPhoneEqualTo(user.getvPhone());
        List<User> users = userMapper.selectByExample(u);

        if (users == null || users.size() == 0) {
            throw new HaltException("该手机号未绑定账号，请重新检查");
        }

        User user1 = users.get(0);
        user1.setvPassword(user.getvPassword());
        userMapper.updateByPrimaryKey(user1);
        return user1;
    }

    @Override
    public void resetDetails(User user) {


        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User getUserDetails(User user) {

        if (user.getId() == null) {
            throw new HaltException("异常了");
        }

        User user1 = userMapper.selectByPrimaryKey(user.getId());

        return user1;
    }
}
