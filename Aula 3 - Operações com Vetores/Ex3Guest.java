import java.util.Scanner;

public class Ex3Guest {

    private static final int tam = 10;
    private static String vet[] = new String[tam];
    private static int restantes = tam;

    private static void cadastro(Scanner sc) {
        if (restantes == 0) {
            System.out.println("Cheio");
        } else {
            System.out.println("Qual o nome do cara?");
            String nome = sc.nextLine();

            vet[tam - restantes] = nome;
            restantes--;
        }
    }
    private static void listar() {
        if (restantes == 10) {
            System.out.println("Não tem nada aqui, zé.");
        } else {
            for (int i = 0; i < tam - restantes; ++i) {
                System.out.println(vet[i]);
            }
        }
    }
    private static void excluir(Scanner sc) {
        if(restantes == 10) {
            System.out.println("Tem nada aqui.");
        } else {

            System.out.println("Qual cabra tu quer tirar?");
            String nome = sc.nextLine();

            for (int i = 0; i < tam - restantes; ++i) {
                if (vet[i].equals(nome)) {
                    for (int j = i; j < tam - restantes; ++j) {
                        vet[j] = vet[j + 1];
                    }
                    restantes++;
                    System.out.println("Pronto, meu patrão.");
                    break;
                }
            }
        }
    }
    private static void restante() {
        System.out.println("Tem " + restantes + " vagas restantes no vetor.");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op;

        do {
            System.out.println("1 - Cadastrar convidado;");
            System.out.println("2 - Listar convidados;");
            System.out.println("3 - Excluir convidado;");
            System.out.println("4 - Vagas restantes;");
            System.out.println("0 - Sair;");

            op = sc.nextInt();

            sc.nextLine();

            switch(op) {
                //Cadastrar convidado
                case 1:
                    cadastro(sc);
                    break;
                //Listar convidados
                case 2:
                    listar();
                    break;
                //Excluir convidado
                case 3:
                excluir(sc);
                    break;
                //Vagas restantes
                case 4:
                    restante();
                    break;
                default:
                    System.out.println("Esse número não é válido, seu animal.");
            }
        } while(op != 0);

        sc.close();

    }
}