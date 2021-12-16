package Operations;

public class FirstProgram {
    int maxMarks = 300;
    int obtainedScore = 0;


    public int calculateSum() {
        int math = 80;
        int english = 70;
        int science = 60;
        return obtainedScore = (math + english + science);
    }

    public float percentage_cal() {
        float percentage;
        percentage = (float) ((obtainedScore * 100) / maxMarks);
        return percentage;

    }

    public static void main(String[] args) {
        System.out.println("Program to print Percentage and marks");
        FirstProgram obj = new FirstProgram();
        System.out.println(obj.calculateSum());
        System.out.println(obj.percentage_cal());
    }
}
