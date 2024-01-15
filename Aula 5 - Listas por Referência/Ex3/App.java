import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        ListaVeiculo lista = new ListaVeiculo();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. Inserir Veículo");
            System.out.println("2. Imprimir Veículos");
            System.out.println("3. Sair");

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Informe a placa do veículo: ");
                    String placa = sc.next();
                    System.out.print("Informe a marca do veículo: ");
                    String marca = sc.next();
                    System.out.print("Informe o modelo do veículo: ");
                    String modelo = sc.next();
                    System.out.print("Informe o valor do veículo: ");
                    int valor = sc.nextInt();

                    Veiculo novo = new Veiculo(placa, marca, modelo, valor);
                    lista.inserir(novo);
                    System.out.println("Veículo inserido com sucesso.");
                    break;
                case 2:
                    lista.print();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
