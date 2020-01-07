import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class MyThreadPool {
    private static class Worker extends Thread {
        private BlockingQueue<Runnable> queue = null;
        Worker(BlockingQueue<Runnable> queue) {
            super("劳动人民");
            this.queue = queue;
        }

        @Override
        public void run() {
            try {
                while (!Thread.interrupted()) {
                    Runnable command = queue.take();
                    command.run();
                }
            } catch (InterruptedException e) {

            }
        }
    }
    private int corePoolSize = 10;
    private int currentPoolSize = 0;
    private List<Worker> workerList = new ArrayList<>();
    private BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();

    public void execute(Runnable command) {
        if (currentPoolSize < corePoolSize) {
            Worker worker = new Worker(queue);
            worker.start();
            workerList.add(worker);
            currentPoolSize++;
        }
        queue.add(command);
    }
    public void shutdown() throws InterruptedException {
        for (Worker worker : workerList) {
            worker.interrupt();
        }
        for (Worker worker : workerList) {
            worker.join();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThreadPool pool = new MyThreadPool();
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("eat");
            }
        });
        Thread.sleep(10);
        pool.shutdown();
    }
}
