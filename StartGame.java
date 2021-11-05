package javaBattleships;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class StartGame {
    public void startGame(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please input the three coordinates of your battleship. Choose from A-H, 1-8. Eg: A1, A2, A3 ");
//        Make this a class then you can re use it.
        List <String>battle1Co = new ArrayList<>();
        List <String>battle2Co = new ArrayList<>();
        List <String>battle3Co = new ArrayList<>();
        System.out.println("Battleship 1");
        while (battle1Co.size() < 3){
            String coordinate = input.next();
            battle1Co.add(coordinate);
        }
        System.out.println("Battleship 2");
        while (battle2Co.size() < 3){
            String coordinate = input.next();
            battle2Co.add(coordinate);
        }
        System.out.println("Battleship 3");
        while (battle3Co.size() < 3){
            String coordinate = input.next();
            battle3Co.add(coordinate);
        }


        Battleship b1 = new Battleship("battle1", battle1Co.get(0), battle1Co.get(1), battle1Co.get(2));

        Battleship b2 = new Battleship("battle2", battle2Co.get(0), battle2Co.get(1), battle2Co.get(2));

        Battleship b3 = new Battleship("battle3", battle3Co.get(0), battle3Co.get(1), battle3Co.get(2));

        BattleBoard battleBoard = new BattleBoard();
        String board = battleBoard.createBoard();
        System.out.println("Welcome to Battleships! There are three ships, all with 3 squares each!");


        System.out.println("Please take your first guess");

        while(b1.coordinates.size() > 0 || b2.coordinates.size() > 0  || b3.coordinates.size() > 0 ) {

            System.out.println(board);
            String guess = input.next();
            guess = guess.toUpperCase();
            CheckGuess checkGuess = new CheckGuess();
            boolean missCheck = checkGuess.checkGuess(guess, b1, b2, b3);
            if (!missCheck){
                System.out.println("Miss - try again:");
                battleBoard.setBoardIncorrect(guess);
            } else {
                battleBoard.setBoardCorrect(guess);

            }
            board = battleBoard.createBoard();
        }
        System.out.println("You have won!");
    }
}
