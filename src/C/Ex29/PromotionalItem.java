package C.Ex29;

public interface PromotionalItem {

    double getBasePrice();

    default double getDiscountRate(){

        return getBasePrice() * 0.10;
    }

    default double calculateFinalPrice(){

        return getBasePrice() + getDiscountRate();
    }

}
