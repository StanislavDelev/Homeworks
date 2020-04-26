import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TheMIceKiller9000 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String Obstacle;
        String Command = "Error 404";
        int Pixels = 0;
        int Battery = 4;
        int ChanceOfDestruction = 10;
        int RandomNumber1 = 1000;
        int RandomNumber2 = 1000;
        int Random1;
        int Random2;


       do {

        System.out.println("What is the obstacle?");
        Obstacle = in.nextLine();
        if (Obstacle.equals("Wall")) {
            Command = ("Go Sideways");
        } else if (Obstacle.equals("Chair")) {
            Command = ("Jump");
        } else if (Obstacle.equals("Nothing")) {
            Command = ("Forward");
        }
        System.out.println(Command);
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.print("Scanning");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.print(".");
        TimeUnit.MILLISECONDS.sleep(1000);
        System.out.println(".");

        System.out.println("How many pixels do I see?");
        Pixels = in.nextInt();
            int int_random = rand.nextInt(ChanceOfDestruction) + 1;
        if ((Pixels % 2) > 0) {
            System.out.println("No threats detected.");
        } else {
            System.out.println("TheMiceKiller9000: Omae wa mou shindeiru!");
            TimeUnit.MILLISECONDS.sleep(1000);
            System.out.println("Mouse: NANI?!!");
            TimeUnit.MILLISECONDS.sleep(1000);
            if (Battery > 0) {
                System.out.println("TheMiceKiller9000: KAPOW!");
                Battery = Battery -1;
                if (int_random == 5) {
                    System.out.println("TheMiceKiller9000: *Destroys furniture*");
                    System.out.println("TheMiceKiller9000: Wrong target.");
                } else {
                    System.out.println("TheMiceKiller9000: Target Annihilated!");

                }
            }
        }


       } while (Battery>0);
        System.out.println("TheMiceKiller9000: Low Battery Power.");
        System.out.println("TheMiceKiller9000: Searching for a power source.");
        do {
            Random1 = rand.nextInt(RandomNumber1)+1;
            Random2 = rand.nextInt(RandomNumber2)+1;
            if (Random1 > Random2) {
                System.out.println("TheMiceKiller9000: I am recharging.");
            } else if (Random2 > Random1) {
                System.out.println("TheMiceKiller9000: No electricity detected.");
            }
        } while (Random1==Random2);













    }
}



