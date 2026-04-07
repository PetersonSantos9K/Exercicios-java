package B.Ex14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

    static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Teclado", 120.00));
        productList.add(new Product("Monitor", 900.00));

        Collections.sort(productList);

        for (Product product : productList){
            System.out.println(product);
        }


    }
}
