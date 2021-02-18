package ed.pilha;

public class Pilha extends ListaLigada {

    ListaLigada nomes = new ListaLigada();

    public void insere(String nome) {
        nomes.adicionaNoFim(nome);
    }

    public String remove() {
        return nomes.removeDoFim();
    }

    public boolean vazia() {
        return nomes.tamanho() == 0;
    }

    @Override
    public String toString() {
        return nomes.toString();
    }
}
