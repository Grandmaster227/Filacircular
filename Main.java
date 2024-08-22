public class Main {
    public static void main(String[] args) {

        QueueCircular qc = new QueueCircular(8);

        qc.enfileirar(1);
        qc.enfileirar(1);

        qc.enfileirar(2);

        qc.enfileirar(4);

        qc.enfileirar(6);

        qc.enfileirar(9);

        qc.enfileirar(11);



        System.out.println("Desinfileirando: " + qc.desinfileirar());
        System.out.println("Desinfileirando: " + qc.desinfileirar());
        System.out.println("Desinfileirando: " + qc.desinfileirar());
        System.out.println("Desinfileirando: " + qc.desinfileirar());
        System.out.println("Desinfileirando: " + qc.desinfileirar());
        System.out.println("Desinfileirando: " + qc.desinfileirar());


        System.out.println("Verficando se a fila está cheia: " + qc.isFull());
        System.out.println("Verficando se a fila está vazia: " + qc.isEmpty());


    }
}