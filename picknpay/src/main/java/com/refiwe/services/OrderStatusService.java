/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.refiwe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refiwe.repositories.OrderStatusRepository;

/**
 *
 * @author User
 */
@Service
public class OrderStatusService {
    @Autowired
    private OrderStatusRepository orderStatusRepository;
    
    public Object findAllOrderStatus()
    {
        return orderStatusRepository.findAll();
    }
  
}
