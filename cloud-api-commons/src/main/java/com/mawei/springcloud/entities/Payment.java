package com.mawei.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author Maw
 * @Date 2020/12/14 22:32
 * @Version 1.0
 */
//@Data 生成getter,setter等函数
//@NoArgsConstructor 生成无参构造函数
//@AllArgsConstructor //生成全参数构造函数
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private Long Id;
    private  String serial;

}
