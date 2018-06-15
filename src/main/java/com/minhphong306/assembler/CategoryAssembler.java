/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhphong306.assembler;

import com.minhphong306.domain.Category;
import com.minhphong306.vo.CategoryVO;
import com.minhphong306.vo.CreateCategoryVO;
import com.minhphong306.vo.UpdateCategoryVO;
import org.springframework.stereotype.Component;

/**
 *
 * @author phongdm
 */
@Component
public class CategoryAssembler {
    
    public Category toCategory(CreateCategoryVO createCategoryVO){
        Category category = new Category();
        category.setName(createCategoryVO.getName());
        category.setNote(createCategoryVO.getNote());
        return category;
    }
    
    public CategoryVO toCategoryVO(Category category){
        CategoryVO categoryVO = new CategoryVO();
        categoryVO.setId(category.getId());
        categoryVO.setName(category.getName());
        categoryVO.setNote(category.getNote());
        return categoryVO;
    }
    
    public Category toCategory(UpdateCategoryVO updateCategoryVO){
        Category category = new  Category();
        category.setId(updateCategoryVO.getId());
        category.setName(updateCategoryVO.getName());
        category.setNote(updateCategoryVO.getNote());
        
        return category;
    }
}
