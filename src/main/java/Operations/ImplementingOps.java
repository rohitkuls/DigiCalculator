package Operations;

import java.util.Optional;

interface Abc {
    <E> void Display(E[] output);

}

public class ImplementingOps implements Abc {

    ImplementingOps Obj = new ImplementingOps();
    Optional<Object> output  ;
    public static void main(String[] args) {
        int a, b, c;





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
