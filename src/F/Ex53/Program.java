package F.Ex53;

import F.Ex53.enums.CategoryProduct;
import F.Ex53.enums.FilterProduct;
import F.Ex53.model.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Program {

    void main(){

        Set<Product> products = new TreeSet<>();
        addProducts(products);

        Map<FilterProduct, Predicate<Product>> filterProduct = new HashMap<>();
        addFilterProducts(filterProduct, CategoryProduct.COMPUTER_AND_LAPTOPS, CategoryProduct.HARDWARE_AND_COMPONENTS);

        Set<Product> productFilter = filterProducts(filterProduct.get(FilterProduct.CATEGORY_PRODUCT), products);
        Function<Product, String> formattedFilterProducts = p -> String.format("Name: %s | Price: %.2f | Category: %s", p.getName(), p.getPrice(), p.getCategory());
        productFilter.stream().map(formattedFilterProducts).forEach(System.out::println);

    }

    private void addProducts(Set<Product> p){

        p.add(new Product(CategoryProduct.COMPUTER_AND_LAPTOPS, 4500.0, "Dell Inspiron Laptop"));
        p.add(new Product(CategoryProduct.COMPUTER_AND_LAPTOPS, 5200.0, "HP Pavilion Laptop"));
        p.add(new Product(CategoryProduct.COMPUTER_AND_LAPTOPS, 7000.0, "MacBook Air"));

        p.add(new Product(CategoryProduct.SMARTPHONES_AND_TABLETS, 3200.0, "Samsung Galaxy S23"));
        p.add(new Product(CategoryProduct.SMARTPHONES_AND_TABLETS, 4800.0, "iPhone 14"));
        p.add(new Product(CategoryProduct.SMARTPHONES_AND_TABLETS, 2100.0, "Xiaomi Redmi Note 12"));

        p.add(new Product(CategoryProduct.PERIPHERALS_AND_ACCESSORIES, 150.0, "Logitech Wireless Mouse"));
        p.add(new Product(CategoryProduct.PERIPHERALS_AND_ACCESSORIES, 350.0, "Mechanical Keyboard"));
        p.add(new Product(CategoryProduct.PERIPHERALS_AND_ACCESSORIES, 500.0, "Gaming Headset"));

        p.add(new Product(CategoryProduct.HARDWARE_AND_COMPONENTS, 1200.0, "NVIDIA RTX 4060"));
        p.add(new Product(CategoryProduct.HARDWARE_AND_COMPONENTS, 600.0, "16GB DDR4 RAM"));
        p.add(new Product(CategoryProduct.HARDWARE_AND_COMPONENTS, 450.0, "1TB SSD"));

        p.add(new Product(CategoryProduct.NETWORKING_AND_CONNECTIVITY, 300.0, "TP-Link WiFi Router"));
        p.add(new Product(CategoryProduct.NETWORKING_AND_CONNECTIVITY, 220.0, "WiFi Range Extender"));
        p.add(new Product(CategoryProduct.NETWORKING_AND_CONNECTIVITY, 180.0, "Gigabit Network Switch"));

    }

    private void addFilterProducts(Map<FilterProduct, Predicate<Product>> f, CategoryProduct... fCategory){

        Predicate<Product> fPredicateCategory = product -> {
              for(CategoryProduct ctgProduct : fCategory){
                  if(ctgProduct.equals(product.getCategory())){
                      return true;
                  }
              }
              return false;
        };

        f.put(FilterProduct.EXPENSIVE, product -> product.getPrice() >= 3000.0);
        f.put(FilterProduct.CHEAP, product -> product.getPrice() <= 500.0);
        f.put(FilterProduct.CATEGORY_PRODUCT, fPredicateCategory);
        f.put(FilterProduct.LONG_NAME, product -> product.getName().length() > 20);

    }

    private Set<Product> filterProducts(Predicate<Product> f, Set<Product> p){
        return p.stream().filter(f).collect(Collectors.toCollection(TreeSet::new));
    }
}
