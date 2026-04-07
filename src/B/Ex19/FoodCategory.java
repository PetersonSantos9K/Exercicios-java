package B.Ex19;

public enum FoodCategory {
    PRODUCT_PERISHABLES(1),
    PRODUCT_NON_PERISHABLES(2);

    private final int priority;

    FoodCategory(int i){
        this.priority = i;
    }

    public int getPriority() {
        return priority;
    }

}
