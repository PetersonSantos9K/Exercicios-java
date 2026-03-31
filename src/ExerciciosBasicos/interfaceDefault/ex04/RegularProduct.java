package ExerciciosBasicos.interfaceDefault.ex04;

public record RegularProduct(String name, Double price) implements PromotionalItem{

    @Override
    public double getBasePrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("Product: %s | Price: %.2f", name, calculateFinalPrice());
    }
}
