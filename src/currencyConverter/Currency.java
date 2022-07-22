package currencyConverter;

public class Currency {

    private String name;
    private String sigla;
    private double value;

    public Currency(String name, String sigla, double value) {
        this.name = name;
        this.sigla = sigla;
        this.value =value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
