package Ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FilaArranjo fila = new FilaArranjo();

        int op = -1;
        int x = 0;

        while(op != 3) {
            System.out.println("1 - Solicitar senha;");
            System.out.println("2 - Chamar próxima senha;");
            System.out.println("1 - Sair;");

            switch(op) {
                case 1:
                    System.out.println("Qual seu nome?");
                    String nome = sc.nextLine();
                    
                    Senha senha = new Senha(x, nome);
                    try {
                        fila.distribuir(senha);
                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                    break;
                case 2:
                    try {
                        fila.chamar();
                    } catch(Exception ex) {
                        ex.getMessage();
                    }
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
    
}
