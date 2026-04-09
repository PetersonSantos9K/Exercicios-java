package F.Ex53.model;

import F.Ex53.enums.CategoryProduct;

import java.util.Objects;

public class Product implements Comparable<Product>{

    private final String name;
    private double price = 0.0;
    private final CategoryProduct category;

    public Product(CategoryProduct category, Double price, String name) {
        this.category = category;
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public CategoryProduct getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price) && category == product.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(price, o.price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
