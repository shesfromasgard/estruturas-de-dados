package Ex1;

public class Deque <T> {

    private int tam;
    No<T> cabeca = new No<>();

    public void addFirst(T element) {
        No<T> no = new No<>();
        no.setInfo(element);

        if(isEmpty()) {
            cabeca.setProximo(no);
            no.setAnterior(cabeca);
        } else {
            no.setProximo(cabeca.getProximo());
            no.setAnterior(cabeca);
            cabeca.getProximo().setAnterior(no);
        }
        tam++;
    }

    public void addLast(T element) {
        if(isEmpty()) {
            addFirst(element);
        } else {
            No<T> no = new No<>();
            no.setInfo(element);
            no.setProximo(cabeca);
            no.setAnterior(cabeca.getAnterior());
            cabeca.getAnterior().setProximo(no);
            cabeca.setAnterior(no);
            tam++;
        }
    }

    public T removeFirst() throws Exception {
        if(isEmpty()) {
            throw new Exception("Deque vazio.");
        } else {
            T no = cabeca.getProximo().getInfo();
            cabeca.setProximo(cabeca.getProximo().getProximo());
            cabeca.getProximo().setAnterior(cabeca);
            tam--;
            return no;
        }
    }

    public T removeLast() throws Exception {
        if(isEmpty()) {
            throw new Exception("Deque vazio.");
        } else {
            T no = cabeca.getAnterior().getInfo();
            cabeca.setAnterior(cabeca.getAnterior().getAnterior());
            cabeca.getAnterior().setProximo(cabeca);
            tam--;
            return no;
        }
    }

    public void print() throws Exception {
        No<T> no = new No<>();
        if(isEmpty()) {
            throw new Exception("Deque vazio.");
        } else {
            no = cabeca.getProximo();
            while (no != cabeca) {
                System.out.println(no.getInfo());
                no = no.getProximo();
            }
        }
    }

    public boolean isEmpty() {
        return this.tam == 0;
    }

    public int size() {
        return this.tam;
    }
    
}
