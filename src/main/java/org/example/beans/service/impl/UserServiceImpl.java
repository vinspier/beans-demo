package org.example.beans.service.impl;

import org.example.beans.service.OrderService;
import org.example.beans.service.UserService;

/**
 *
 *
 * @author: vinspier
 * @date: 2020/11/21 15:13
 */
public class UserServiceImpl implements UserService {

    private OrderService orderService;

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
}
