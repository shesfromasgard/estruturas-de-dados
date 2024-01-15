package Ex1;

public class No<T> {

    private No<T> proximo;
    private No<T> anterior;
    private T info;

    public No(T info) {
        this.info = info;
        proximo = null;
        anterior = null;
    }
    public No() {
        this(null);
    }
    public No<T> getProximo() {
        return proximo;
    }
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }
    public No<T> getAnterior() {
        return anterior;
    }
    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }
    public T getInfo() {
        return info;
    }
    public void setInfo(T info) {
        this.info = info;
    }

}