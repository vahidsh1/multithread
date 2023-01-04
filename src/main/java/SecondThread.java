public class SecondThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Second Thread "+Thread.currentThread().getName());
    }
}
