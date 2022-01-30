package desafiobancodigital;

import java.util.List;

public class Banco {

    private String nome;
    private ArrayListDeContas contas = new ArrayListDeContas();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void inserir(Conta c) {
        contas.inserir(c);
    }

    public Conta pesquisar(int numConta) {
        return contas.pesquisar(numConta);
    }

}
