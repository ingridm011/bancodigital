package desafiobancodigital;

public class Main {

    public static void main(String[] args) {
        Banco b = new Banco();
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton, 1);
        Conta poupanca = new ContaPoupanca(venilton, 2);
        Conta poupanca2 = new ContaPoupanca(venilton, 3);

        b.inserir(cc);
        b.inserir(poupanca);
        b.inserir(poupanca2);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        poupanca2.imprimirExtrato();
    }

}