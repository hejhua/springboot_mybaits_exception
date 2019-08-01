package com.swan.controller;

import com.swan.domain.ResultInfo;
import com.swan.domain.User;
import com.swan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * UserController.java
 *
 * @类名 UserController
 * @描述
 * @作者 hejhua
 * @版权 深圳市十方鲸落科技有限公司
 * @版本 1.0
 * @时间 2019年07月31日 14:04:00
 */

@RestController
@RequestMapping("/user")

public class UserController {


    @Autowired
    private UserService userService;
    @Autowired
    private ResultInfo res;

   //测试成功
    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public ResultInfo add() {
        List<User> add = userService.findAll();
        if (add != null && add.size() > 0) {
            res.setData(add);
            res.setCode("OK");
            res.setMsg("查询列表成功");
            return res;
        }
        res.setMsg("查询失败");
        res.setData(null);
        res.setCode("error");
        return res;
    }


    @RequestMapping(value = "/update",method = RequestMethod.PUT)
    public ResultInfo update(@RequestBody User user) {

        int i = userService.update(user);
        if (i>0) {
            res.setMsg("更新数据成功");
            res.setData(i);
            res.setCode("OK");
            return res;
        }
        System.out.println(i);
        res.setMsg("更新失败");
        res.setData(null);
        res.setCode("error");
        return res;
    }
   //测试成功
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResultInfo delete(@PathVariable("id") int id) {
        int i = userService.delete(id);
        if (i >0) {
            res.setMsg("删除数据成功");
            res.setData(i);
            res.setCode("OK");
            return res;
        }
        System.out.println(i);
        res.setMsg("删除失败");
        res.setData(null);
        res.setCode("error");
        return res;
    }
   //测试成功
    @RequestMapping(value = "/selectUserById/{id}",method = RequestMethod.GET)
    public ResultInfo selectUserById(@PathVariable("id") int id) {
        User user = userService.selectUserById(id);
        if (!StringUtils.isEmpty(user)) {
            res.setMsg("查询数据成功");
            res.setData(user);
            res.setCode("OK");
            return res;
        }
        System.out.println(user);

        res.setMsg("查询失败");
        res.setData(null);
        res.setCode("error");
        return res;

    }

    @RequestMapping(value = "/insert",method =RequestMethod.POST)
    public ResultInfo insert(@RequestBody User user) {

        int insert = userService.insert(user);
        if (insert >0) {
            res.setMsg("插入数据成功");
            res.setData(insert);
            res.setCode("OK");
            return res;
        }
        res.setMsg("查询失败");
        res.setData(null);
        res.setCode("error");
        return res;
    }
}
