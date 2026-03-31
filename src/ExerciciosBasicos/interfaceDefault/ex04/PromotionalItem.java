package ExerciciosBasicos.interfaceDefault.ex04;

public interface PromotionalItem {

    double getBasePrice();

    default double getDiscountRate(){

        return getBasePrice() * 0.10;
    }

    default double calculateFinalPrice(){

        return getBasePrice() + getDiscountRate();
    }

}
