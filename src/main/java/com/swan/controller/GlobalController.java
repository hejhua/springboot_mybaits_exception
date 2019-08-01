package com.swan.controller;

import com.swan.exception.HospitalException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
//controller层模拟异常的controller
public class GlobalController {
    @RequestMapping("/testError")
    public ResponseEntity<?> testError() throws HospitalException {
        throw new HospitalException("医院自定义异常！");
    }
    @RequestMapping("/testError2")
    public ResponseEntity<?> testError2() throws HospitalException {
        throw new NullPointerException("空指针异常！");
    }
}