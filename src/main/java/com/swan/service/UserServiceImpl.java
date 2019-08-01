package com.swan.service;

import com.swan.domain.User;
import com.swan.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * UserServiceImpl.java
 *
 * @类名 UserServiceImpl
 * @描述
 * @作者 hejhua
 * @版权 深圳市十方鲸落科技有限公司
 * @版本 1.0
 * @时间 2019年07月31日 14:09:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAll() {

         List<User> list = userDao.add();
         if (list!=null && list.size()>0){
             return list;
         }
         return  null;

    }

    @Override
    public int update(User user) {

        return userDao.update(user);
    }

    @Override
    public int delete(int id) {

        return userDao.delete(id);
    }

    @Override
    public int insert(User user) {

        return userDao.insert(user);
    }

    @Override
    public User selectUserById(int id) {

        User user = userDao.selectUserById(id);
        if (!StringUtils.isEmpty(user)){
            return user;
        }
        return  null;
    }


}
