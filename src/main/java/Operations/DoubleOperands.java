package Operations;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Stream;

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
    ImplementingOps obj;
    public  BiFunction <Integer, Integer, Integer> bfobj = Integer::sum;

    public int sum(int a, int b) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<>(2);
        twoList.add(a);
        twoList.add(b);
        return a+b;
//int a =5;
//int b=10;
    }
    public int sub(int a, int b) {

        ArrayList<Integer> twoList = new ArrayList<>(2);
        twoList.add(a);
        twoList.add(b);
        return a-b;
        //obj.output = twoList.stream().reduce((x, y) -> x - y).map(z -> z * -1);
    }

    public void mul(int a, int b) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<>(2);
        twoList.add(a);
        twoList.add(b);
        obj.output =  twoList.stream().reduce((x, y) -> x * y).map(Objects::toString);
    }

    public void div(int a, int b) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<>(2);
        twoList.add(a);
        twoList.add(b);
        obj.output = twoList.stream().reduce((x, y) -> x / y).map(Objects::toString);
    }

    public Optional<Float> rem(int a, int b) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<>(2);
        twoList.add(a);
        twoList.add(b);
        return twoList.stream().reduce((x, y) -> x % y).map(Float::new);
    }

    public Stream<?> squr(int a) {

        ArrayList<Integer> twoList;
        twoList = new ArrayList<>(2);
        twoList.add(a);
        return twoList.stream().map(z -> z * z);
    }


}
