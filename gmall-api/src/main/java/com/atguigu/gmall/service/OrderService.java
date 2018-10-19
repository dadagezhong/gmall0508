package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.OrderInfo;

public interface OrderService {

    void saveOrder(OrderInfo orderInfo);

    String genTradeCode(String userId);

    boolean checkTradeCode(String userId, String tradeCode);

    OrderInfo getOrderInfoByOutTradeNo(String outTradeNo);
}
