package B.Ex19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    static void main(String[] args) {
        List<Product> products = new ArrayList<>();


        products.add(new Product("Leite", LocalDate.of(2026, 5, 10), FoodCategory.PRODUCT_PERISHABLES));
        products.add(new Product("Arroz", LocalDate.of(2026, 12, 20), FoodCategory.PRODUCT_NON_PERISHABLES));
        products.add(new Product("Iogurte", LocalDate.of(2026, 5, 10), FoodCategory.PRODUCT_PERISHABLES));
        products.add(new Product("Feijão", LocalDate.of(2026, 5, 10), FoodCategory.PRODUCT_NON_PERISHABLES));

        Collections.sort(products);

        for(Product p : products){
            System.out.println(p);
        }

    }
}
