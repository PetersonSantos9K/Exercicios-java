package ExerciciosBasicos.interfaceDefault.ex04;

import java.util.ArrayList;
import java.util.List;

public class Program {

    static void main(String[] args) {


        String[] prdocutsName = {"Tv led", "Smatphone", "Computer", "Tablet"};
        double[] productsPrice = {1500.0, 1000.0, 2500.0, 300.0};

        List<RegularProduct> regularProducts = new ArrayList<>();
        List<BlackFridayProduct> blackFridayProducts = new ArrayList<>();

        for(int i=0; i<4; i++){
            regularProducts.add(new RegularProduct(prdocutsName[i], productsPrice[i]));
            blackFridayProducts.add(new BlackFridayProduct(prdocutsName[i], productsPrice[i]));
        }

        for(RegularProduct product : regularProducts){
            System.out.println(product);
        }

        for(BlackFridayProduct product : blackFridayProducts){
            System.out.println(product);
        }


    }
}
