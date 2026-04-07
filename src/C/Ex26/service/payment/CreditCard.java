package C.Ex26.service.payment;

public class CreditCard implements PaymentMethod {

    private Integer letterNumber;
    private Integer installments;

    public CreditCard(Integer letterNumber, Integer installments) {
        this.letterNumber = letterNumber;
        this.installments = installments;
    }

    public Integer getLetterNumber() {
        return letterNumber;
    }

    public void setLetterNumber(Integer letterNumber) {
        this.letterNumber = letterNumber;
    }

    public Integer getInstallments() {
        return installments;
    }

    public void setInstallments(Integer installments) {
        this.installments = installments;
    }


}
