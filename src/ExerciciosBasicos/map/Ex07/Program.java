package ExerciciosBasicos.map.Ex07;

import java.util.HashMap;
import java.util.Map;

public class Program {

    void main(){

        Map<String, Double> product = new HashMap<>();
        product.put("Notebook", 3500.0);
        product.put("Celular", 2000.0);
        product.put("Monitor", 1200.0);

        Product prod = new Product();
        for(String key : product.keySet()){
            if(product.get(key) > prod.getPrice()){
                prod.setName(key);
                prod.setPrice(product.get(key));
            }
        }

        IO.println(String.format("%s custa %.2f", prod.getName(), prod.getPrice()));

    }
}

class Product{

    private String name;
    private Double price = 0.0;

    public Product(){}

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
