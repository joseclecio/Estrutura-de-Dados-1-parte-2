package ed.fila;

public class TesteDaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Mauricio");
        fila.adiciona("Guilherme");

        System.out.println(fila);

        String x1 = fila.remove();

        System.out.println(x1);
        System.out.println(fila);
    }
}
