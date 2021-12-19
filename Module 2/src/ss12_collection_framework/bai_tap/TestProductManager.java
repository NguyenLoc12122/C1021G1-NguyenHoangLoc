package ss12_collection_framework.bai_tap;

import java.util.List;

public class TestProductManager {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        List<Product> productList = productManager.getProductList();
        Product sanPham1 = new Product("Mỳ tôm", 1, 4000);
        Product sanPham2 = new Product("Nước ngọt", 2, 10000);
        Product sanPham3 = new Product("Nước suối", 3, 5000);

        productManager.addProduct(sanPham1);
        productManager.addProduct(sanPham2);
        productManager.addProduct(sanPham3);
        productManager.displayProduct(productList);

//        // Kiểm tra sản phẩm sau khi sửa
//        productManager.editProduct(2);
//        System.out.println("\n Sau khi sửa là : ");
//        productManager.displayProduct(productList);
//
//        //Kiểm tra sản phẩm sau khi xóa
//        System.out.println("\n Sản phẩm bị xóa là: ");
//        System.out.println(productManager.deleteProduct(2));
//
//        System.out.println("\n List sản phẩm sau khi xóa : ");
//        productManager.displayProduct(productList);
//
//        //Tìm Sản phẩm
//        System.out.println("\n Sản phẩm bạn muốn tìm: ");
//        System.out.println(productManager.findProduct("Mỳ tôm"));

    }
}
