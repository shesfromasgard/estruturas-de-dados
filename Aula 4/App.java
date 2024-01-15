package Ex1Filmes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        ListaFilmes lista = new ListaFilmes();

        int op = 0;

        while(op != 5) {
            
            System.out.println("1 - Inserir filme;");
            System.out.println("2 - Excluir filme;");
            System.out.println("3 - Aumentar o tamanho da lista;");
            System.out.println("4 - Localizar filme;");
            System.out.println("5 - Sair.");
    
            op = sc.nextInt();
    
            switch(op) {
                case 1:
                    System.out.println("Informe o nome do novo filme: ");
                    String nome = sc.nextLine();
    
                    System.out.println("Informe o código do novo filme: ");
                    int codigo = sc.nextInt();
    
                    System.out.println("Informe o gênero do novo filme: ");
                    String genero = sc.nextLine();
    
                    Filme filmeNovo = new Filme(nome, genero, codigo);
                    try{
                        lista.inserir(filmeNovo);
                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                    break;
                case 2:
                    System.out.println("Qual o código do filme a excluir?");
                    int cod = sc.nextInt();

                    try {
                        lista.excluir(cod);
                    } catch(Exception ex) {
                        ex.getMessage();
                    } 
                    break;
                case 3:
                    System.out.println("Qual o novo tamanho da lista?");
                    int tam = sc.nextInt();

                    try {
                        lista.aumentarTamanho(tam);
                    } catch(Exception ex) {
                        ex.getMessage();
                    }
                    break;
                case 4:
                    System.out.println("Qual o nome do filme a ser buscado?");
                    String nomee = sc.nextLine();
                    try {
                        lista.buscar(nomee);
                    } catch(Exception ex) {
                        ex.getMessage();
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}
