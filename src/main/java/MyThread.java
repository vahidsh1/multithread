public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("my Thread "+Thread.currentThread().getName());
           }
}
