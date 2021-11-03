import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Battleship {
    int size = 3;
    String name;
    List <String> coordinates = new ArrayList<>();

    public Battleship(String name, String co1, String co2, String co3){
        this.name = name;
        this.coordinates.add(co1);
        this.coordinates.add(co2);
        this.coordinates.add(co3);
    }

    public boolean adjustLocationArray(String guess){
        if(this.coordinates.contains(guess)) {
            this.coordinates.remove(guess);
            System.out.println(this.coordinates.size());
            if (this.coordinates.size() == 0){
                System.out.println("Kill - That Battleship was sunk.");
            } else {
                System.out.println("Hit - Great, have another guess!");
            }
        } else {
            return false;
        }
        return true;
    }
}