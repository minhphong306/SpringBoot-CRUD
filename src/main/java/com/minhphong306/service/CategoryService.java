package com.minhphong306.service;

import com.minhphong306.domain.Category;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author phongdm
 */
@Service
public interface CategoryService {
    Category getCategoryById(long id);
    
    Category createCategory(Category category);
    
    Category updateCategory(Category category);
    
    List<Category> getListCategory();
    
    void deleteCategory(long id);
}
