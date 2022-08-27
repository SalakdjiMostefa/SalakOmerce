package com.salakomerce.salakomerce.back.service.catalogservice;

import com.salakomerce.salakomerce.back.model.album.Album;
import com.salakomerce.salakomerce.back.model.category.Category;
import com.salakomerce.salakomerce.back.model.discount.Discount;
import com.salakomerce.salakomerce.back.model.picture.Picture;
import com.salakomerce.salakomerce.back.model.price.Price;
import com.salakomerce.salakomerce.back.model.product.Product;
import com.salakomerce.salakomerce.back.model.stock.Stock;

import java.util.List;

public interface CatalogueService {
    /**
     * Category
     */
    public List<Category> getAllCategory();

    public Category getCategoryById(int id);

    public Category createCategory(Category category);

    public boolean deleteCategory(int id);

    public Category updateCategory(Category category);

    /**
     * Product
     */

    public List<Product> getAllProduct();

    public List<Product> getAllProductByCategoryId(int idCategory);

    public Product getProductById(int id);

    public Product createProduct(Product product);

    public boolean deleteProduct(int id);

    public Product updateProduct(Product product);

    /**
     * Price
     */

    public List<Price> getPricesByProductId(int idProduct);

    public Price createPrice(Price price);

    public boolean deletePrice(int id);

    public Price updatePrice(Price price);

    /**
     * Stock
     */

    public Stock getStockByProductId(int idProduct);

    public Stock createStock(Stock stock);

    public boolean deleteStock(int id);

    public Stock updateStock(Stock stock);

    /**
     * Stock
     */

    public List<Discount> getDiscountsByPriceId(int idPrice);

    public Discount createDiscount(Discount discount);

    public boolean deleteDiscount(int id);

    public Discount updateDiscount(Discount discount);

    /**
     * Album
     */

    public Album getAlbumByProductId(int idProduct);

    public Album getAlbumByCategoryId(int idCategory);

    public Album createAlbum(Album album);

    public boolean deleteAlbum(int id);

    public Album updateAlbum(Album album);

    /**
     * Album
     */

    public Picture getPictureByAlbumId(int idAlbum);

    public Picture createPicture(Picture picture);

    public boolean deletePicture(int id);

    public Picture updatePicture(Picture picture);
}

