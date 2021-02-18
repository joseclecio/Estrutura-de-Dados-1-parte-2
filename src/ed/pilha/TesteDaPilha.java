package ed.pilha;

public class TesteDaPilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Pilha q = new Pilha();

        p.insere("J");
        System.out.println(p);

        p.insere("O");
        System.out.println(p);

        p.insere("A");
        System.out.println(p);

        p.insere("O");
        System.out.println(p);



        String r1 = p.remove();
        System.out.println(r1);

        String r2 = p.remove();
        System.out.println(r2);

        String r3 = p.remove();
        System.out.println(r3);

/*
        System.out.println(p.vazia());
        p.insere("Marcelo");
        System.out.println(p.vazia());

        System.out.println(p);
*/
    }
}
