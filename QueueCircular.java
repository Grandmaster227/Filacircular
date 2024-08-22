public class QueueCircular {
    private int top;
    private int tamanho;
    private int base;
    private int [] data;

    public QueueCircular(int capacidade) {
        this.tamanho = 0;
        this.data = new int[capacidade];
        this.top = -1;
        this.base = 0;
    }

    public boolean isFull() {
        return tamanho == data.length;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }
    public void enfileirar(int elemento) {
        if (isFull()) {
            System.out.println("Fila cheia, não é possível inserir um novo valor");
            return;
        }


        top = (top+1) % data.length;
        data[top] = elemento;
        tamanho++;
    }



    public int desinfileirar() {
        if (isEmpty()) {
            System.out.println("A fila está vazia");
            return - 1;
        }

        int elemento = data[base];
        base = (base + 1) % data.length;
        tamanho--;
        return elemento;
    }
}
