package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService{
    private static final Map<Integer,Product> listProduct = new HashMap<>();
    static {
        listProduct.put(1,new Product(1,"Iphone X",1500000,5));
        listProduct.put(2,new Product(1,"Iphone XSMax",1700000,15));
        listProduct.put(3,new Product(1,"Iphone 11",2000000,7));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(listProduct.values());
    }

    @Override
    public Product findById(int id) {
        return listProduct.get(id);
    }

    @Override
    public Product save(Product product) {
        return listProduct.put(product.getId(), product);
    }

    @Override
    public void update(int id, Product product) {
        listProduct.put(id,product);
    }

    @Override
    public void remove(int id) {
        listProduct.remove(id);
    }
}
