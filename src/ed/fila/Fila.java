package ed.fila;

public class Fila extends ListaLigada{

    ListaLigada alunos = new ListaLigada();

    public void adiciona(String aluno){
        alunos.adicionaNoFim(aluno);
    }

    public String remove(){
        return alunos.removeDoComeco();
    }

    public boolean vazia() {
        return alunos.tamanho() == 0;
    }

    @Override
    public String toString() {
        return alunos.toString();
    }
}
