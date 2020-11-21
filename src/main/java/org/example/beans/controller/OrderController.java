package org.example.beans.controller;

import org.example.beans.service.OrderService;

/**
 *  订单信息控制层
 *
 * @author: vinspier
 * @date: 2020/11/21 15:10
 */
public class OrderController {

    private OrderService orderService;

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
