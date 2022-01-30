package desafiobancodigital;

import java.util.ArrayList;

class ArrayListDeContas {

    private ArrayList<Conta> array = new ArrayList<Conta>();

    public void inserir(Conta c) {
        Conta outra = pesquisar(c.getNumero());
        if (outra == null) {
            array.add(c);
        } else {
            System.out.println("Conta já existente.");
        }
    }

    public Conta pesquisar(int numConta) {
        for (Conta c : array) {
            if (c.getNumero() == numConta) {
                return c;
            }
        }
        return null;
    }
}
