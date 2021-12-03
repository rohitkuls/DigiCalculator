package Operations;

import java.util.Optional;
import java.util.Scanner;

interface Abc {
    <E> void Display(E[] output);

}

public class ImplementingOps implements Abc {

    ImplementingOps Objkjhh = new ImplementingOps();
    Optional<Object> output  ;
    public static void main(String[] args) {
        System.out.println("one or two");
        

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


    public <E> void Display(E[] output) {
        for (E i : output)
            System.out.printf("%s ", i);
    }
}
//    int count=0;
//
//    List <Integer> list = new ArrayList<Integer>(3);
//    List<Integer> mainOperands = list.stream().map(A-> count++).filter(A -> count== 0).collect(Collectors.toList()); {
//
