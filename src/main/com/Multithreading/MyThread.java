package Multithreading;

/**
 * Created by David on 2017/9/12.
 */
public class MyThread implements Runnable {

    private int ticket = 5;  //5张票

    public void run() {
        for (int i = 0; i <= 20; i++) {
            if (this.ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖票" + this.ticket--);
            }
        }
    }

    public static void main(String[] args) {
        MyThread my = new MyThread();
        new Thread(my, "1号窗口").start();
        new Thread(my, "2号窗口").start();
        new Thread(my, "3号窗口").start();
    }

}
