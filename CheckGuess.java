package javaBattleships;

public class CheckGuess {
    public boolean checkGuess(String guess, Battleship b1, Battleship b2, Battleship b3){
        boolean b1Check = b1.adjustLocationArray(guess);
        boolean b2Check = b2.adjustLocationArray(guess);
        boolean b3Check = b3.adjustLocationArray(guess);

        if (b1Check == false && b2Check == false && b3Check == false){
            return false;
        }
        return true;
    }
}
