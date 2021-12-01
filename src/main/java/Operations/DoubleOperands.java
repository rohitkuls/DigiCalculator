package Operations;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleOperands {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();


        new DoubleOperands().sum(a, b);
        new DoubleOperands().sub(a, b);
        new DoubleOperands().mul(a, b);
        new DoubleOperands().div(a, b);
        new DoubleOperands().rem(a, b);
        System.out.println("===============");
        new DoubleOperands().squr(a);
        //new DoubleOperands().findFloor(4);
        //new  DoubleOperands() .Sum(4,7);
    }

    public void sum(int a, int b) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<Integer>(2);
        twoList.add(a);
        twoList.add(b);
        System.out.println(twoList.stream().reduce((x, y) -> x + y));
    }

    public void sub(int a, int b) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<Integer>(2);
        twoList.add(a);
        twoList.add(b);
        System.out.println(twoList.stream().reduce((x, y) -> x - y).map(z -> z * -1));
    }

    public void mul(int a, int b) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<Integer>(2);
        twoList.add(a);
        twoList.add(b);
        System.out.println(twoList.stream().reduce((x, y) -> x * y));
    }

    public void div(int a, int b) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<Integer>(2);
        twoList.add(a);
        twoList.add(b);
        System.out.println(twoList.stream().reduce((x, y) -> x / y));
    }

    public void rem(int a, int b) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<Integer>(2);
        twoList.add(a);
        twoList.add(b);
        System.out.println(twoList.stream().reduce((x, y) -> x % y));
    }

    public void squr(int a) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<Integer>(2);
        twoList.add(a);
        System.out.println(twoList.stream().map(z -> z * z));
    }
}
