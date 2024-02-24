package com.development.sivamsweets.service;

import com.development.sivamsweets.entity.Orders;
import com.development.sivamsweets.repository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    @Autowired
    private OrdersRepo ordersRepo;

    public Orders postOrders(Orders orders){
        return ordersRepo.save(orders);
    }


}
