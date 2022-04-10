public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener listenerner = System.out::println;
        OnTaskErrorListener errorListener = System.out::println;
        Worker worker = new Worker(listenerner, errorListener);
        worker.start();


    }
}
