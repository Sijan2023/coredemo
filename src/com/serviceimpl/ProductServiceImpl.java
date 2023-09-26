package com.serviceimpl;

import com.model.Product;
import com.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

    static List<Product> plist = new ArrayList<>();
    @Override
    public void addProduct(Product p) {
        plist.add(p);
        System.out.println("--------added success-----size = "+plist.size());
    }

    @Override
    public void deleteProduct(int index) {

    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

}
