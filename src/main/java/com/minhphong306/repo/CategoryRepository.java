/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhphong306.repo;

import com.minhphong306.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author phongdm
 */
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
