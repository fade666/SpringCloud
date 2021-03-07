package com.mawei.springcloud.service;

import com.mawei.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Maw
 * @Date 2020/12/14 23:17
 * @Version 1.0
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
