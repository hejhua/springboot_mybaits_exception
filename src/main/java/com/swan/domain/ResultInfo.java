package com.swan.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * ResultInfo.java
 *
 * @类名 ResultInfo
 * @描述
 * @作者 hejhua
 * @版权 深圳市十方鲸落科技有限公司
 * @版本 1.0
 * @时间 2019年07月31日 15:05:00
 */
@Data
@Component
public class ResultInfo {

    private  Object data;
    private  String msg;
    private  String code;
}
