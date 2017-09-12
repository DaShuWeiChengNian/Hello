package Multithreading;

/**
 * Created by David on 2017/9/12.
 */
public class Demo2 implements Runnable {

    private String name;

    public Demo2(){
    }

    public Demo2(String name){
        this.name = name;
    }

    public void run() {
        for (int i=0; i<5; i++) {
            System.out.println(name + "---" + i);
        }
    }

    public static void main(String[] args) {
        Demo2 d1 = new Demo2("a");
        Thread t1 = new Thread(d1);
        Demo2 d2 = new Demo2("b");
        Thread t2 =new Thread(d2);

        t1.start();
        t2.start();


    }

}
