/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.refiwe.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refiwe.model.Orders;
import com.refiwe.repositories.OrdersRepository;

/**
 *
 * @author User
 */
@Service
public class OrdersService {
    
    @Autowired
    private OrdersRepository orderRepository;
    
    public Orders saveOrders(Orders orders)
    {
   
        return orderRepository.save(orders);
    }
    
    public Object findAllOrders()
    {
        return orderRepository.findAll();
    }
    
    public int updateOrdersStatus(int orderID, String statusStatus)
    {
        return orderRepository.updateOrderStatus(orderID, statusStatus);
    }
    
   public int deleteOrders(int orderNo)
   {
       return orderRepository.deleteOrder(orderNo);
   }
     
   public ArrayList<Orders> findOrdersByOrderNo(int orderNo)
   {
       return orderRepository.findOrderByOrderNo(orderNo);
   }
}
