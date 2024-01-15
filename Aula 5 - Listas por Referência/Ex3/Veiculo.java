package Ex3;

public class Veiculo {

    public String placa;
    public String marca;
    public String modelo; 
    public int valor;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public Veiculo(String placa, String modelo, String marca, int valor) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.valor = valor;
    }
    
}
