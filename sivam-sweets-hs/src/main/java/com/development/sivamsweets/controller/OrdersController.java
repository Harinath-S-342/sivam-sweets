package com.development.sivamsweets.controller;

import com.development.sivamsweets.entity.Orders;
import com.development.sivamsweets.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/orders")
    public String openOrders(){
        return "orders";
    }
    @PostMapping("/orders")
    public Orders postOrders(@RequestBody Orders orders){
        return ordersService.postOrders(orders);
    }

}
