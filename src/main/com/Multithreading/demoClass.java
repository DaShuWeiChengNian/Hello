package Multithreading;

/**
 * Created by David on 2017/9/22.
 */
public class demoClass {



    public static void main(String[] args){
        String [] surname ={"欧阳","太史","端木","上官", "司马", "东方"};

        String name = "欧阳娜娜";

        for (int i=0; i<surname.length; i++) {
            if (name.substring(0, 2).equals(surname[i])) {
                System.out.println("============");
            } else {
                System.out.println("++++++++++");
            }
        }
    }

}
