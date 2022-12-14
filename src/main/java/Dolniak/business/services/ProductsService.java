package Dolniak.business.services;

import Dolniak.business.models.Product;
import Dolniak.business.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    ProductsRepository productsRepository;

    // create
    public Product createProduct(Product product) { return productsRepository.save(product); }

    // read
    public List<Product> getProducts() { return productsRepository.findAll(); }

    // update
    public Product updateProduct(Long productId, Product productDetails) {
        Product product = productsRepository.findById(productId).get();
        product.setName(productDetails.getName());
        product.setDescription(productDetails.getDescription());
        product.setInventory(productDetails.getInventory());
        product.setCost(productDetails.getCost());

        return productsRepository.save(product);
    }

    // delete
    public void deleteProduct(Long empId) { productsRepository.deleteById(empId); }
}















