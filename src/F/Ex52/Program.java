package F.Ex52;

import java.util.*;
import java.util.stream.Collectors;

public class Program {

    void main(){

        Scanner sc = new Scanner(System.in);
        Map<String, ProductFilter> filter = new HashMap<>();
        filter.put("Expensive", x -> x.getPrice() > 1000.00);
        filter.put("Cheap", x -> x.getPrice() < 500.00);

        Set<Product> productList = new TreeSet<>();

        addProduct(productList);
        IO.println("1- Product Expensive | 2- Product Cheap");
        int option = sc.nextInt();

        switch (option){
            case 1:
                List<Product> expensive = new ArrayList<>(filterProduct(productList, filter.get("Expensive")));
                Collections.sort(expensive);
                expensive.forEach(System.out::println);

                break;
            case 2:
                List<Product> cheap = new ArrayList<>(filterProduct(productList, filter.get("Cheap")));
                Collections.sort(cheap);
                cheap.forEach(System.out::println);
                break;
            default:
                IO.println("Invalid Option");
        }


        sc.close();
    }

    private void addProduct(Set<Product> productList){
        productList.add(new Product("Teclado", 120.00));
        productList.add(new Product("Monitor", 900.00));
        productList.add(new Product("Headset", 250.00));
        productList.add(new Product("Webcam", 180.00));
        productList.add(new Product("Impressora", 650.00));
        productList.add(new Product("Cadeira Gamer", 1200.00));
        productList.add(new Product("Mesa para Computador", 700.00));
        productList.add(new Product("HD Externo", 400.00));
        productList.add(new Product("SSD 1TB", 550.00));
        productList.add(new Product("Pendrive 64GB", 80.00));
        productList.add(new Product("Roteador WiFi", 300.00));
        productList.add(new Product("Placa de Vídeo", 2500.00));
        productList.add(new Product("Memória RAM 16GB", 350.00));
        productList.add(new Product("Fonte 600W", 320.00));
        productList.add(new Product("Gabinete", 280.00));
        productList.add(new Product("Controle Gamer", 220.00));
        productList.add(new Product("Tablet", 1500.00));
        productList.add(new Product("Smartphone", 2200.00));
        productList.add(new Product("Carregador Portátil", 150.00));
        productList.add(new Product("Caixa de Som Bluetooth", 300.00));
    }

    private Set<Product> filterProduct(Set<Product> productList, ProductFilter filter){

        return productList.stream().filter(filter::filter).collect(Collectors.toSet());
    }



}

