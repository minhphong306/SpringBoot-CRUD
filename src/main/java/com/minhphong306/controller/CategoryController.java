/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhphong306.controller;

import com.minhphong306.assembler.CategoryAssembler;
import com.minhphong306.domain.Category;
import com.minhphong306.repo.CategoryRepository;
import com.minhphong306.service.CategoryService;
import com.minhphong306.vo.CategoryVO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author phongdm
 */
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private CategoryAssembler categoryAssembler;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public CategoryVO getCategory(@PathVariable("id") Long id) {
        return categoryAssembler.toCategoryVO(categoryService.getCategoryById(id));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Category> getAllCategory() {
        List<Category> categories = categoryService.getListCategory();
        return categories;
    }
}
