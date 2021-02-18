package ed.fila;

public class Celula {
    private Object elemento;

    private Celula anterior;
    private Celula proximo;


    public Celula(Object elemento){
        this(elemento,null);
    }

    public Celula(Object elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Celula getProximo() {
        return proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public Celula getAnterior() {
        return anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }
}

