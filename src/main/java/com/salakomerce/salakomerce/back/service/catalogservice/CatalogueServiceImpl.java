package com.salakomerce.salakomerce.back.service.catalogservice;

import com.salakomerce.salakomerce.back.model.album.Album;
import com.salakomerce.salakomerce.back.model.album.AlbumRepository;
import com.salakomerce.salakomerce.back.model.category.Category;
import com.salakomerce.salakomerce.back.model.category.CategoryRepository;
import com.salakomerce.salakomerce.back.model.discount.Discount;
import com.salakomerce.salakomerce.back.model.discount.DiscountRepository;
import com.salakomerce.salakomerce.back.model.picture.Picture;
import com.salakomerce.salakomerce.back.model.picture.PictureRepository;
import com.salakomerce.salakomerce.back.model.price.Price;
import com.salakomerce.salakomerce.back.model.price.PriceRepository;
import com.salakomerce.salakomerce.back.model.product.Product;
import com.salakomerce.salakomerce.back.model.product.ProductRepository;
import com.salakomerce.salakomerce.back.model.stock.Stock;
import com.salakomerce.salakomerce.back.model.stock.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogueServiceImpl implements CatalogueService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private DiscountRepository discountRepository;
    @Autowired
    private PriceRepository priceRepository;
    @Autowired
    private AlbumRepository albumRepository;
    @Autowired
    private PictureRepository pictureRepository;
    @Autowired
    private StockRepository stockRepository;

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryById(int id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.isPresent() ? category.get() : null;
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public boolean deleteCategory(int id) {
        categoryRepository.deleteById(id);
        return categoryRepository.existsById(id);
    }

    @Override
    public Category updateCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> getAllProductByCategoryId(int idCategory) {
        return productRepository.findAllByCategoryId(idCategory);
    }

    @Override
    public Product getProductById(int id) {
        Optional<Product> product = productRepository.findById(id);
        return product.isPresent() ? product.get() : null;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public boolean deleteProduct(int id) {
        productRepository.deleteById(id);
        return productRepository.existsById(id);
    }

    @Override
    public Product updateProduct(Product product) {
        return productRepository.saveAndFlush(product);
    }

    @Override
    public List<Price> getPricesByProductId(int idProduct) {
        return priceRepository.getPricesByProduct_Id(idProduct);
    }

    @Override
    public Price createPrice(Price price) {
        return priceRepository.save(price);
    }

    @Override
    public boolean deletePrice(int id) {
        priceRepository.deleteById(id);
        return priceRepository.existsById(id);
    }

    @Override
    public Price updatePrice(Price price) {
        return priceRepository.saveAndFlush(price);
    }

    @Override
    public Stock getStockByProductId(int idProduct) {
        return stockRepository.getStockByProduct_Id(idProduct);
    }

    @Override
    public Stock createStock(Stock stock) {
        return stockRepository.save(stock);
    }

    @Override
    public boolean deleteStock(int id) {
        stockRepository.deleteById(id);
        return stockRepository.existsById(id);
    }

    @Override
    public Stock updateStock(Stock stock) {
        return stockRepository.saveAndFlush(stock);
    }

    @Override
    public List<Discount> getDiscountsByPriceId(int idPrice) {
        return discountRepository.findAllByPrice_Id(idPrice);
    }

    @Override
    public Discount createDiscount(Discount discount) {
        return discountRepository.save(discount);
    }

    @Override
    public boolean deleteDiscount(int id) {
        return false;
    }

    @Override
    public Discount updateDiscount(Discount discount) {
        return null;
    }

    @Override
    public Album getAlbumByProductId(int idProduct) {
        return null;
    }

    @Override
    public Album getAlbumByCategoryId(int idCategory) {
        return null;
    }

    @Override
    public Album createAlbum(Album album) {
        return null;
    }

    @Override
    public boolean deleteAlbum(int id) {
        return false;
    }

    @Override
    public Album updateAlbum(Album album) {
        return null;
    }

    @Override
    public Picture getPictureByAlbumId(int idAlbum) {
        return null;
    }

    @Override
    public Picture createPicture(Picture picture) {
        return null;
    }

    @Override
    public boolean deletePicture(int id) {
        return false;
    }

    @Override
    public Picture updatePicture(Picture picture) {
        return null;
    }
}
