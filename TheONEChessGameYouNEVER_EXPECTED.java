import java.util.Scanner;

public class TheONEChessGameYouNEVER_EXPECTED {
    // Извинявам се за това което съм направил за тази седмица. Тази седмица бях в тотален meltdown(нищо не ми идваше, нищо не вдянах).
    // Знам че казахте да питаме ако не разбираме, ама не знам кво ми стана......
    // Аз въобще не съм доволен с това. Просто пълен тотал. Ако намерите читав код или нещо въобще........Добре.




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ChessPiece;
        double moveX;
        double moveY;



        String[][] board = new String[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                board[i][j] = "   ";
            }
        }




        // Dwarfs
        board[0][0] = "wD1";
        board[5][0] = "wD2";
        board[0][5] = "bD1";
        board[5][5] = "bD2";
        // Machine-guns
        board[4][0] = "wMG";
        board[1][5] = "bMG";
        // Donkeys
        board[1][0] = "wDK";
        board[4][5] = "bDK";
        //Queens
        board[2][0] = "wQN";
        board[3][5] = "bQN";
        // Kings
        board[3][0] = "wKG";
        board[2][5] = "bKG";


        System.out.println(" ───────────────────────");
        System.out.println("│" + board[0][0] + "│" + board[1][0] + "│" + board[2][0] + "│" + board[3][0] + "│" + board[4][0] + "│" + board[5][0] + "│");
        System.out.println("-------------------------");
        System.out.println("│" + board[0][1] + "│" + board[1][1] + "│" + board[2][1] + "│" + board[3][1] + "│" + board[4][1] + "│" + board[5][1] + "│");
        System.out.println("-------------------------");
        System.out.println("│" + board[0][2] + "│" + board[1][2] + "│" + board[2][2] + "│" + board[3][2] + "│" + board[4][2] + "│" + board[5][2] + "│");
        System.out.println("-------------------------");
        System.out.println("│" + board[0][3] + "│" + board[1][3] + "│" + board[2][3] + "│" + board[3][3] + "│" + board[4][3] + "│" + board[5][3] + "│");
        System.out.println("-------------------------");
        System.out.println("│" + board[0][4] + "│" + board[1][4] + "│" + board[2][4] + "│" + board[3][4] + "│" + board[4][4] + "│" + board[5][4] + "│");
        System.out.println("-------------------------");
        System.out.println("│" + board[0][5] + "│" + board[1][5] + "│" + board[2][5] + "│" + board[3][5] + "│" + board[4][5] + "│" + board[5][5] + "│");
        System.out.println(" ───────────────────────");
        System.out.println("Whites are 1st.");
        System.out.println("What is your move?");
        ChessPiece = in.nextLine();

        if (ChessPiece.equals("wD1")) {
            System.out.println(" To ");
        } 



    }
}




