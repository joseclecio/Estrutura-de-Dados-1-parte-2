package Vetores;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");
        Aluno a3 = new Aluno("Maria");
        Aluno a4 = new Aluno("Carlos");
        Aluno a5 = new Aluno("Joana");


        Vetor lista = new Vetor();

        //Adiciona
        lista.adiciona(a1);//0
        lista.adiciona(a2);//1
        lista.adiciona(a3);//2
        lista.adiciona(a4);//3
        System.out.println(lista);

        //Remove
        lista.remove(2);
        System.out.println(lista);

        //Adiciona em uma determinada posição
        lista.adiciona(2,a5);
        System.out.println(lista);

        //Mostrar um determinado Aluno
        Aluno mostra = lista.pega(0);
        System.out.println(mostra);

        //Mostra o tamanho das posições ocupadas no vetor
        int tamanho = lista.tamanho();
        System.out.println(tamanho);

        //Mostra se existe um determinado aluno em uma posição
        boolean contem = lista.contem(a5);
        System.out.println(contem);



/*
        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        System.out.println(lista);
        System.out.println(lista.contem(a1));

        Aluno a3 = new Aluno("Danilo");
        System.out.println(lista.contem(a3));

        lista.adiciona(1, a3);
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        for (int i =0;i<300;i++){
            Aluno y = new Aluno("Joao"+i);
            lista.adiciona(y);
        }
        System.out.println(lista);
*/
    }
}
// parou no 13:56