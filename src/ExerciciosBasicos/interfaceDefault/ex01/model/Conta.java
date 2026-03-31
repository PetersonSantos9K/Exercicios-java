package ExerciciosBasicos.interfaceDefault.ex01.model;

import java.util.ArrayList;
import java.util.List;

public class Conta {

    private Integer number;
    private String name;
    private Double balance = 0.0;

    private List<Contract> contracts = new ArrayList<>();

    public Conta(Integer number, String name) {
        this.number = number;
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }



    public Double getBalance() {
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public List<Contract> getContracts() {
        return contracts;
    }

}
