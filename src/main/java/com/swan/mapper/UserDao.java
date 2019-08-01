package com.swan.mapper;

import com.swan.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDao.java
 *
 * @类名 UserDao
 * @描述
 * @作者 hejhua
 * @版权 深圳市十方鲸落科技有限公司
 * @版本 1.0
 * @时间 2019年07月31日 14:22:00
 */

@Mapper
public interface UserDao {

    List<User> add();

    int update( User user);

    int delete(int id);

    int insert(@Param("user") User user);

    User selectUserById(int id);
}
