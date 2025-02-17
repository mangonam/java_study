package chapter12_inheritance.products;

public class Product extends Item{
    private int price;
    private int stock;


    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setCategory(String category) {
        super.setCategory(category);
    }

    @Override
    public String getCategory() {
        return super.getCategory();
    }

    public void displayInfo() {
        System.out.println("제품명 : "+this.getName());
        System.out.println("카테고리 : "+this.getCategory());
        System.out.println("가격 : "+this.getPrice());
        System.out.println("재고 : "+this.getStock());
    }
}
