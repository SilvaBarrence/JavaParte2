public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDoBeutrano = new Conta();
        System.out.println(contaDoBeutrano.saldo);

        contaDoBeutrano.titular = new Cliente();
        System.out.println(contaDoBeutrano.titular);

        contaDoBeutrano.titular.nome = "Marcela";
        System.out.println(contaDoBeutrano.titular.nome);
    }


}
