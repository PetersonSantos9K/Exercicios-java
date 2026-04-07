package A.Ex03.model;

public class IngressoVip extends Ingresso{

    private Double valorAdicional;

    public IngressoVip(final double valor, final double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public Double getValorAdicional() {
        return getValor() + valorAdicional;
    }

}
