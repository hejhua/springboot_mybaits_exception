package com.swan.domain;

import lombok.Data;

/**
 * User.java
 *
 * @类名 User
 * @描述
 * @作者 hejhua
 * @版权 深圳市十方鲸落科技有限公司
 * @版本 1.0
 * @时间 2019年07月31日 14:07:00
 */
@Data
public class User {
    private Integer id;
    private  String username;
    private  String password;
    private  String address ;
    private  Integer age;
}
