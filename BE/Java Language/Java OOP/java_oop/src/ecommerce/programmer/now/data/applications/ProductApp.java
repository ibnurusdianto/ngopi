package ecommerce.programmer.now.data;

import ecommerce.programmer.now.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro 13", 30000000, 10, "Laptop The Best");
        System.out.println(product.nama_product);
        System.out.println(product.harga);
        System.out.println(product.nominal);
        System.out.println(product.deskripsi);
    }
}
