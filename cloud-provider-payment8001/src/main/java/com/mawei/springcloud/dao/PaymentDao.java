package com.mawei.springcloud.dao;

import com.mawei.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Maw
 * @Date 2020/12/14 23:04
 * @Version 1.0
 */
@Mapper
public interface PaymentDao {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
