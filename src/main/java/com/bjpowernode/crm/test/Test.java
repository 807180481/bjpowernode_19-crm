package com.bjpowernode.crm.test;

import com.bjpowernode.crm.settings.dao.UserDao;
import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.utils.SqlSessionUtil;

import javax.sound.midi.Soundbank;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        UserDao userDao = SqlSessionUtil.getSqlSession().getMapper(UserDao.class);
        List<User> list = userDao.select();
        for(User u :list){
            System.out.println(u);
        }
    }
}
