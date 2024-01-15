import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilhaArranjo p = new PilhaArranjo();
        Processo proc = new Processo();

        try {
            p.push(new Processo(1, "Wile Coyote", "Acme"));
            p.push(new Processo(2, "Pezão", "Samsung"));
            p.push(new Processo(3, "Gloria Allred", "Samsung"));
            p.push(new Processo(4, "Gloria Allred", "Lenovo"));
            p.push(new Processo(5, "Wile Coyote", "Hyundai"));
            p.push(new Processo(6, "Wile Coyote", "KIA"));
        } catch (Exception ex) {
            ex.getMessage();
        }

        System.out.println("Qual o código do processo que deseja encontrar?");

        int cod = sc.nextInt();
        
        try{
            System.out.println(p.busca(cod));
        } catch(Exception ex) {
            ex.getMessage();
        }

        System.out.println("Lista de Processos a Serem Executados:");
        while(!p.isVazia()) {
            try {
                proc = p.pop();
            } catch (Exception ex) {
                ex.getMessage();
            }
            System.out.println("Código: " + proc.codigo + " Responsável: " + proc.responsavel + " Cliente: " + proc.cliente);
        }
        sc.close();
    }
}
