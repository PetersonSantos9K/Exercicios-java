package C.Ex29;

public record BlackFridayProduct(String name, Double price) implements PromotionalItem{
    @Override
    public double getBasePrice() {
        return price;
    }
    @Override
    public double getDiscountRate() {
        return price * 0.50;
    }

    @Override
    public String toString() {
        return String.format("Product: %s | Price: %.2f", name, calculateFinalPrice());
    }
}
