/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.refiwe.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refiwe.model.Category;
import com.refiwe.repositories.CatagoryRepository;

/**
 *
 * @author User
 */
@Service
public class CategoryService{
    @Autowired
    private CatagoryRepository categoryRepository;
    
    public Object findAllCategories()
    {
        return categoryRepository.findAll();
    }
    
    public Category saveCategory(Category category)
    {
        return categoryRepository.save(category);
    }
    
    public int deleteCategory(String name)
    {
        return categoryRepository.deleteCategory(name);
    }
}
