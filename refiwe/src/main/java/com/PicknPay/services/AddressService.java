/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.PicknPay.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PicknPay.model.Address;
import com.PicknPay.repositories.AddressRepository;

/**
 *
 * @author User
 */
@Service
public class AddressService {
  
    @Autowired
    private AddressRepository addressRepository;
    
     public Address saveAddress(Address address)
    {
        return addressRepository.save(address);
    }  
    
    public ArrayList<Address> findAddressByOrderNo(int orderNo)
    {
        return addressRepository.findAddressByOrderNo(orderNo);
    }
    
    public int deleteDelivary(int orderNo)
    {
        return addressRepository.deleteAddress(orderNo);
    }
}
