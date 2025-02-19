package EserciziClassi;

public class ContoBancario {
    private String numeroConto;
    private double saldo;
    public String titolare;

    public ContoBancario(String numeroConto, double saldo, String titolare) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
        this.titolare = titolare;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo > 0 ? saldo : this.saldo;
    }

    public void deposita(double importo) {
        this.saldo += importo > 0 ? importo : this.saldo;
    }

    public void preleva(double importo) {
        this.saldo -= this.saldo - importo > 0 ? importo : 0;
    }
}
