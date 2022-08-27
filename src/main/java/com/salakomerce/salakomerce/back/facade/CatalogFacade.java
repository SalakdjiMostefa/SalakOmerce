package com.salakomerce.salakomerce.back.facade;

import com.salakomerce.salakomerce.back.model.category.Category;
import com.salakomerce.salakomerce.back.model.product.Product;

import java.util.List;

public interface CatalogFacade {
    public List<Category> getAllCategories();
    public List<Product> getAllProductByCategoryId(int categoryId);
}
