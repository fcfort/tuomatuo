package com.lami.tuomatuo.model.po;

import lombok.Data;

/**
 * Created by xujiankang on 2016/1/18.
 */
@Data
public class LoginParam {
    private Long userId;
    private String name;
    private String sign;
}
