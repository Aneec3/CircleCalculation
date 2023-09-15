import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Circle Calculator\n");
        Scanner in = new Scanner(System.in);
        System.out.print("What is the radius of your circle?   ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a radius!");
            return;
        }
        double r = in.nextDouble();
        System.out.println("\nThe diameter is " + r * 2);
        System.out.println("The area is " + r * r * Math.PI + " units squared");
        System.out.println("The circumference is" + r * Math.PI * 2);
    }}