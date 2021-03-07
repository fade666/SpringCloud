package com.mawei.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Maw
 * @Date 2020/12/14 22:42
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{

    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code, String msg){
        this(code,msg,null);
    }

}
