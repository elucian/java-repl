import java.util.concurrent.*;

public class RunAsync {

    private static CompletableFuture<Void> createFuture(){
        Runnable runnable = () -> {
            sleep(1000);
            System.out.println("Hello Educative");
            System.out.println("Current Execution thread where the supplier is executed - " + Thread.currentThread().getName());
        };
        return CompletableFuture.runAsync(runnable);
    }

    private static void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        createFuture().get();

        sleep(3000);

        System.out.println("Completed Processing");
    }
}