package com.salakomerce.salakomerce.web;

import com.google.gson.Gson;
import com.salakomerce.salakomerce.back.facade.CatalogFacadeimpl;
import com.salakomerce.salakomerce.back.model.category.Category;
import com.salakomerce.salakomerce.back.model.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class CatalogController {


    @Autowired
    CatalogFacadeimpl catalogFacadeimpl;

    @GetMapping("/getAllCat")
    public String getAllCategorie() {
        List<Category> categories = catalogFacadeimpl.getAllCategories();
        System.out.println("categories = " + categories);

        return new Gson().toJson(categories.toString());
    }

    @GetMapping("/getProductsBycatId/{id}")
    public String getAllProductByCategoryId(@PathVariable String id) {
        List<Product> products = catalogFacadeimpl.getAllProductByCategoryId(Integer.parseInt(id));
        System.out.println("categories = " + products);

        return new Gson().toJson(products.toString());
    }
}
