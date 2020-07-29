public class TesteGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumeroDaContaCorrente(1234);
        System.out.println(conta.getNumeroDaContaCorrente());

        Cliente gabriel = new Cliente();
        gabriel.setNome("Gabriel");
        conta.setTitular(gabriel);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setProfissao("Programador");

    }
}
