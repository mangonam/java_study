package chapter08_classes.products;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.productNum = 123456;
        product1.productName = "LG엘패드";


        Product product2 = new Product();
        product2.productNum = 987654;
        product2.productName = "다이소충전기";

        Product product3 = new Product();
        product3.productNum = 159357;
        product3.productName = "USB-C 케이블";

        Product product4 = new Product();
        product4.productNum = 951753;
        product4.productName = "GFlip6";

        product1.showInfo();
        product2.showInfo();
        product3.showInfo();
        product4.showInfo();

    }

}
