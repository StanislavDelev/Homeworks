import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length;
        double width;
        System.out.print("length =");
        length = scanner.nextDouble();
        System.out.print("width =");
        width = scanner.nextDouble();
        double area = length*width;
        System.out.println("Area = "+area);
    }
}