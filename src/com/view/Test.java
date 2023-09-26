package com.view;

import com.model.Product;
import com.service.ProductService;
import com.serviceimpl.ProductServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        addBtn();
        getAll();
        deleteBtn();

    }

    //--------add product--------
    static void addBtn() {
        ProductService ps = new ProductServiceImpl();
        Scanner sc = new Scanner(System.in);
        char flag = 'y';
        do {
            Product p = new Product();
            System.out.println("Enter Id");

            p.setId(sc.nextInt());
            System.out.println("Enter name");
            p.setName(sc.next());
            System.out.println("Enter price");
            p.setPrice(sc.nextInt());
            System.out.println("Enter category");
            p.setCategory(sc.next());
            ps.addProduct(p);
        } while (flag=='y');

}
//------------get product----------------
static  void getAll() {
    ProductService ps = new ProductServiceImpl();
    List<Product> plist = ps.getAllProducts();
    System.out.println(plist);
}
 //-------------delete product------------
 static void deleteBtn(){
        ProductService ps = new ProductServiceImpl();
        ps.deleteProduct(0);
 }
}