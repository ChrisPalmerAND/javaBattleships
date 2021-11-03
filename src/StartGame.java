import java.util.Scanner;



public class StartGame {
    public void startGame(){

        Battleship b1 = new Battleship("battle1", "A1", "A2", "A3");

        Battleship b2 = new Battleship("battle2", "D4", "E4", "F4");

        Battleship b3 = new Battleship("battle3", "C6", "C7", "C8");
        battleBoard battleBoard = new battleBoard();
        String board = battleBoard.createBoard();
        System.out.println("Welcome to Battleships! There are three ships, all with 3 squares each!");

        Scanner input = new Scanner(System.in);
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
