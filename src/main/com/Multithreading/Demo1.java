package Multithreading;

/**
 * Created by David on 2017/9/12.
 */
public class Demo1 extends Thread {

    private String name;

    public Demo1(){
    }

    public Demo1(String name) {
        this.name = name;
    }

    public void run(){
        for (int i=0; i<10; i++) {
            System.out.println(name + "..." + i);
        }
    }

    public static void main(String[] args){
        Demo1 d1 = new Demo1("A");
        Demo1 d2 = new Demo1("B");
//        d1.run();
//        d2.run();
        d1.start();
        d2.start();


    }

}
