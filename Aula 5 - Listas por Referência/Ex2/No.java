public class No {

    public No proximo;
    public No anterior;
    public Cliente elemento;
    public No(Cliente elemento, No proximo, No anterior) {
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    public No() {
        this.elemento = null;
        this.proximo = null;
        this.anterior = null;
    }
    
}
