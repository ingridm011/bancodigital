package desafiobancodigital;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, int num) {
        super(cliente, num);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
