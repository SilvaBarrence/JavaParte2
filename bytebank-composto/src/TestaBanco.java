public class TestaBanco {
    public static void main(String[] args) {
        Cliente gabriel = new Cliente();
        gabriel.nome = "Gabriel Barrence";
        gabriel.cpf = "455.929.038-55";
        gabriel.profissao = "programador";

        Conta contaDoGabriel = new Conta();
        contaDoGabriel.deposita(100);

        contaDoGabriel.titular = gabriel;
        System.out.println(contaDoGabriel.titular.nome);
    }
}
