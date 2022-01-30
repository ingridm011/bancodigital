package desafiobancodigital;

class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, int num) {
        super(cliente, num);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }
}
