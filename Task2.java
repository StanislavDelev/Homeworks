
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String MonthDays = "Wrong name!";
            String MonthName;
            System.out.println("Input the month's name.");
            MonthName = in.nextLine();
            if (MonthName.equals("January") || MonthName.equals("March") || MonthName.equals("May") || MonthName.equals("July")
                    || MonthName.equals("August") || MonthName.equals("October") || MonthName.equals("December")) {
                MonthDays = "31";
            } else if (MonthName.equals("February")) {
                MonthDays = "28(29)";
            } else if (MonthName.equals("April") || MonthName.equals("June") || MonthName.equals("September") || MonthName.equals("November")) {
                MonthDays = "30";
            }
            System.out.println("Month days = " + MonthDays);

    }
}






