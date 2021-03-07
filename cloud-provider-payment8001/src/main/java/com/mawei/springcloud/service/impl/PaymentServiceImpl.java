package com.mawei.springcloud.service.impl;

import com.mawei.springcloud.dao.PaymentDao;
import com.mawei.springcloud.entities.Payment;
import com.mawei.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Maw
 * @Date 2020/12/14 23:18
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
