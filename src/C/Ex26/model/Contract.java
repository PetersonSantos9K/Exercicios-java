package C.Ex26.model;

import C.Ex26.enums.StatusContract;

public class Contract {

    private int code;
    private Double amount;
    private StatusContract statusContract;

    private Conta broadcaster;


    public Contract(int code, Double amount, StatusContract statusContract, Conta broadcaster) {
        this.code = code;
        this.amount = amount;
        this.statusContract = statusContract;
        this.broadcaster = broadcaster;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public StatusContract getStatusContract() {
        return statusContract;
    }

    public void setStatusContract(StatusContract statusContract) {
        this.statusContract = statusContract;
    }

    public Conta getBroadcaster() {
        return broadcaster;
    }

    public void setBroadcaster(Conta broadcaster) {
        this.broadcaster = broadcaster;
    }
}
