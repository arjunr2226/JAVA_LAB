import java.util.LinkedList;
import java.util.Queue;

class ProducerConsumer {
    private final Queue<Integer> buffer = new LinkedList<>();
    private final int capacity = 5;

    public void produce() throws InterruptedException {
        int value = 0;
        while (true) {
            synchronized (this) {
                while (buffer.size() == capacity) {
                    // Buffer is full, wait for the consumer to consume items
                    wait();
                }

                System.out.println("Producer produced: " + value);
                buffer.add(value++);

                // Notify the consumer that an item is available
                notify();

                // Sleep for some time before producing the next item
                Thread.sleep(1000);
            }
        }
    }

    public void consume() throws InterruptedException {
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    // Buffer is empty, wait for the producer to produce items
                    wait();
                }

                int consumedValue = buffer.poll();
                System.out.println("Consumer consumed: " + consumedValue);

                // Notify the producer that space is available in the buffer
                notify();

                // Sleep for some time before consuming the next item
                Thread.sleep(1000);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        // Create producer and consumer threads
        Thread producerThread = new Thread(() -> {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumerThread = new Thread(() -> {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}
