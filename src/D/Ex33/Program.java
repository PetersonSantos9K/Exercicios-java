package D.Ex33;

import java.util.HashMap;
import java.util.Map;

public class Program {

    void main(){
        Map<String, Double> product = new HashMap<>();
        product.put("Mouse", 59.0);
        product.put("Teclado", 120.0);
        product.put("Monitor", 899.0);

        IO.println("exist key 'Mouse': " + product.containsKey("Mouse"));
        IO.println("exist key 'Notebook': " + product.containsKey("Notebook"));


    }
}
