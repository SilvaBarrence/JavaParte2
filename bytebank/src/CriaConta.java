public class CriaConta {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);

        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);

        Conta segundaConta = new Conta();
        segundaConta.saldo = 300;

        System.out.println("primeira conta tem " + primeiraConta.saldo);
        System.out.println("segunda conta tem " + segundaConta.saldo);

        segundaConta.numeroDaAgencia = 146;
        System.out.println(primeiraConta.numeroDaAgencia);
        System.out.println(primeiraConta.numeroDaContaCorrente);

        System.out.println(segundaConta.numeroDaAgencia);

        segundaConta.numeroDaAgencia = 146;
        System.out.println("agora a segunda conta está na agencia " + segundaConta.numeroDaAgencia);

        if (primeiraConta == segundaConta) {
            System.out.println("mesma conta");
        } else {
            System.out.println("contas diferentes");
        }

        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
}
