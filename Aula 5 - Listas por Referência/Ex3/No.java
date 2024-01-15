public class No {
    public No proximo;
    public No anterior;
    public Veiculo elemento;
    public No (Veiculo elemento, No proximo, No anterior){
        this.elemento = elemento;
        this.proximo = proximo;
        this.anterior = anterior;
    }
    public No(){
        this.elemento = null;
        this.proximo = null;
        this.anterior = null;
    }
    
}
