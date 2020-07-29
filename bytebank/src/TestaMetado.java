public class TestaMetado {
    public static void main(String[] args) {
        Conta contaDoGabriel = new Conta();
        contaDoGabriel.saldo = 100;
        contaDoGabriel.deposita(50);
        System.out.println(contaDoGabriel.saldo);

        System.out.println("==================");

        boolean ConseguiuRetirar = contaDoGabriel.saca(20);
        System.out.println(contaDoGabriel.saldo);
        System.out.println(ConseguiuRetirar);

        System.out.println("==================");

        Conta contaDoFulano = new Conta();
        contaDoFulano.deposita(1000);
        if(contaDoFulano.transfere(3000, contaDoGabriel)){
            System.out.println("Transferencia realizada com sucesso!");
        }else{
            System.out.println("Faltou dinheiro!");
        }
        System.out.println(contaDoFulano.saldo);
        System.out.println(contaDoGabriel.saldo);

        System.out.println("==================");

        contaDoGabriel.titular = "Gabriel de S. Silva Barrence";
        System.out.println(contaDoGabriel.titular);

    }
}
