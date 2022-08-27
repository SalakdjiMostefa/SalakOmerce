package com.salakomerce.salakomerce.back.facade;

import com.salakomerce.salakomerce.back.model.category.Category;
import com.salakomerce.salakomerce.back.model.product.Product;
import com.salakomerce.salakomerce.back.service.catalogservice.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CatalogFacadeimpl implements CatalogFacade{

    @Autowired
    CatalogueService catalogueService;

    public List<Category> getAllCategories(){
        return catalogueService.getAllCategory();
    }

    @Override
    public List<Product> getAllProductByCategoryId(int categoryId) {
        return catalogueService.getAllProductByCategoryId(categoryId);
    }
}
