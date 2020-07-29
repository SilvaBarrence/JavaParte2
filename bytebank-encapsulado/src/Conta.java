public class Conta {
    private double saldo;
    private int numeroDaAgencia;
    private int numeroDaContaCorrente;
    private Cliente titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumeroDaAgencia() {
        return this.numeroDaAgencia;
    }

    public int getNumeroDaContaCorrente() {
        return this.numeroDaContaCorrente;
    }

    public void setNumeroDaContaCorrente(int numeroDaContaCorrente) {
        this.numeroDaContaCorrente = numeroDaContaCorrente;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
}
