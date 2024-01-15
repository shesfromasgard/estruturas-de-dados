public class App {
    public static void main(String[] args) {
        PilhaArranjo p = new PilhaArranjo();
        Processo proc = new Processo();
        Processo Wile[] = new Processo[100];
        int topoWile = -1;
        Processo Gloria[] = new Processo[100];
        int topoGloria = -1;
        Processo Pezao[] = new Processo[100];
        int topoPezao = -1;

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

        System.out.println("Lista de Processos a Serem Executados:");
        while(!p.isVazia()) {
            try {
                proc = p.pop();
                if (proc.responsavel == "Wile Coyote") {
                    Wile[topoWile + 1] = proc;
                    topoWile += 1;
                } else if (proc.responsavel == "Gloria Allred") {
                    Gloria[topoGloria + 1] = proc;
                    topoGloria += 1;
                } else if (proc.responsavel == "Pezão") {
                    Pezao[topoPezao + 1] = proc;
                    topoPezao += 1;
                }

            } catch (Exception ex) {
                ex.getMessage();
            }
            System.out.println("Código: " + proc.codigo + " Responsável: " + proc.responsavel + " Cliente: " + "proc.cliente");
        }
    }
}
