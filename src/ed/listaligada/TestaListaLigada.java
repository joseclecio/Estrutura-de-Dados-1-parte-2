package ed.listaligada;

public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.adicionaNoComeco(1);
        lista.adicionaNoComeco(2);
        lista.adicionaNoComeco(3);
        //lista.adicionaNoFim("Paullo");
        //lista.adicionaNoMeio(2,"Gabriel");

        System.out.println(lista);
    }
}
