/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.refiwe.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import com.refiwe.model.Orderstatus;

/**
 *
 * @author User
 */
@RepositoryRestController
public interface OrderStatusRepository extends CrudRepository<Orderstatus, Integer>{
    
}
