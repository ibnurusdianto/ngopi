package ecommerce.programmer.now.data;
// membuat class product
public class Product {
    protected String nama_product;
    protected int harga;
    protected int nominal;
    protected String deskripsi;

    // membuat constructor product
    public Product(String nama_product, int harga, int nominal, String deskripsi){
        this.nama_product = nama_product;
        this.harga = harga;
        this.nominal = nominal;
        this.deskripsi = deskripsi;
    }
}
