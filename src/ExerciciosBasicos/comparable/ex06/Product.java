package ExerciciosBasicos.comparable.ex06;

import java.time.LocalDate;

public class Product implements Comparable<Product>{

    private String name;
    private LocalDate validityDate;
    private FoodCategory category;

    public Product(String name, LocalDate validityDate, FoodCategory category) {
        this.name = name;
        this.validityDate = validityDate;
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String productName) {
        this.name = productName;
    }

    public LocalDate getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(LocalDate validityDate) {
        this.validityDate = validityDate;
    }

    public FoodCategory getCategory() {
        return category;
    }

    public void setCategory(FoodCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return String.format("Name %s, Validity: %s, Category: %s", getName(), getValidityDate().toString(), getCategory().toString());
    }


    @Override
    public int compareTo(Product o) {

        int validityTime = getValidityDate().compareTo(o.getValidityDate());
        if(validityTime != 0) return validityTime;

        int categoryPriority = Integer.compare(getCategory().getPriority(), o.getCategory().getPriority());
        if(categoryPriority != 0) {

            return categoryPriority;
        }

        return getName().compareTo(o.getName());
    }
}
