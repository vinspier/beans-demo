package org.example.beans.service.impl;

import org.example.beans.service.OrderService;
import org.example.beans.service.UserService;

/**
 *
 *
 * @author: vinspier
 * @date: 2020/11/21 15:13
 */
public class OrderServiceImpl implements OrderService {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
