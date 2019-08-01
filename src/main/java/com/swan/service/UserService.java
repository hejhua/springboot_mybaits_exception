package com.swan.service;

import com.swan.domain.User;

import java.util.List;

/**
 * UserService.java
 *
 * @类名 UserService
 * @描述
 * @作者 hejhua
 * @版权 深圳市十方鲸落科技有限公司
 * @版本 1.0
 * @时间 2019年07月31日 14:08:00
 */
public interface UserService {


     List<User> findAll();

    int update(User user);

    int delete(int id);

    int insert(User user);

    User selectUserById(int id);


}
