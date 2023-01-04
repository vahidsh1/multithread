public class Main {
    public static void main(String[] args) {
        System.out.println("main thread " +Thread.currentThread().getName());
        MyThread myThread = new MyThread();
        myThread.start();
        SecondThread secondThread = new SecondThread();
        Thread thread = new Thread(secondThread);
        thread.start();
        System.out.println("End of main thread "+Thread.currentThread().getName());


    }
}

