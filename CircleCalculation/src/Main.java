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
        double radius = in.nextDouble();
        double diameter = (radius * 2);
        double area = (radius * radius * Math.PI);
        double circumference = (radius * Math.PI * 2);
        System.out.println("\nThe diameter is " + diameter);
        System.out.println("The area is " + area + " units squared");
        System.out.println("The circumference is " + circumference);
    }}
