import java.util.ArrayList;
import java.util.List;

public class battleBoard {
    List<String> topRow = new ArrayList<>();
    List<String> rowA = new ArrayList<>();
    List<String> rowB = new ArrayList<>();
    List<String> rowC = new ArrayList<>();
    List<String> rowD = new ArrayList<>();
    List<String> rowE = new ArrayList<>();
    List<String> rowF = new ArrayList<>();
    List<String> rowG = new ArrayList<>();
    List<String> rowH = new ArrayList<>();

    public battleBoard(){
        this.topRow.add("-");
        for(int i=0; i < 8; i++){
            this.topRow.add(String.valueOf(i + 1));
        }
        this.rowA.add("A");
        for(int i=0; i < 8; i++){
            this.rowA.add("-");
        }
        this.rowB.add("B");
        for(int i=0; i < 8; i++){
            this.rowB.add("-");
        }
        this.rowC.add("C");
        for(int i=0; i < 8; i++){
            this.rowC.add("-");
        }
        this.rowD.add("D");
        for(int i=0; i < 8; i++){
            this.rowD.add("-");
        }
        this.rowE.add("E");
        for(int i=0; i < 8; i++){
            this.rowE.add("-");
        }
        this.rowF.add("F");
        for(int i=0; i < 8; i++){
            this.rowF.add("-");
        }
        this.rowG.add("G");
        for(int i=0; i < 8; i++){
            this.rowG.add("-");
        }
        this.rowH.add("H");
        for(int i=0; i < 8; i++){
            this.rowH.add("-");
        }
    }

    public String createBoard(){
        String topRowJoined = String.join(" ", this.topRow);
        String rowAjoined = String.join(" ", this.rowA);
        String rowBjoined = String.join(" ", this.rowB);
        String rowCjoined = String.join(" ", this.rowC);
        String rowDjoined = String.join(" ", this.rowD);
        String rowEjoined = String.join(" ", this.rowE);
        String rowFjoined = String.join(" ", this.rowF);
        String rowGjoined = String.join(" ", this.rowG);
        String rowHjoined = String.join(" ", this.rowH);
        String board = topRowJoined + " \n"  + rowAjoined + " \n"  + rowBjoined + " \n"  + rowCjoined + " \n"  + rowDjoined + " \n"  + rowEjoined + " \n"  + rowFjoined + " \n"  + rowGjoined + " \n"  + rowHjoined;
        return board;
    }

    public void setBoardCorrect(String guess){
        String[] parts = guess.split("");
        if(this.rowA.contains(parts[0])){
            this.rowA.set(Integer.parseInt(parts[1]), "*");
        }
        if(this.rowB.contains(parts[0])){
            this.rowB.set(Integer.parseInt(parts[1]), "*");
        }
        if(this.rowC.contains(parts[0])){
            this.rowC.set(Integer.parseInt(parts[1]), "*");
        }
        if(this.rowD.contains(parts[0])){
            this.rowD.set(Integer.parseInt(parts[1]), "*");
        }
        if(this.rowE.contains(parts[0])){
            this.rowE.set(Integer.parseInt(parts[1]), "*");
        }
        if(this.rowF.contains(parts[0])){
            this.rowF.set(Integer.parseInt(parts[1]), "*");
        }
        if(this.rowG.contains(parts[0])){
            this.rowG.set(Integer.parseInt(parts[1]), "*");
        }
        if(this.rowH.contains(parts[0])){
            this.rowH.set(Integer.parseInt(parts[1]), "*");
        }
    }

    public void setBoardIncorrect(String guess){
        String[] parts = guess.split("");
        if(this.rowA.contains(parts[0])){
            this.rowA.set(Integer.parseInt(parts[1]), "x");
        }
        if(this.rowB.contains(parts[0])){
            this.rowB.set(Integer.parseInt(parts[1]), "x");
        }
        if(this.rowC.contains(parts[0])){
            this.rowC.set(Integer.parseInt(parts[1]), "x");
        }
        if(this.rowD.contains(parts[0])){
            this.rowD.set(Integer.parseInt(parts[1]), "x");
        }
        if(this.rowE.contains(parts[0])){
            this.rowE.set(Integer.parseInt(parts[1]), "x");
        }
        if(this.rowF.contains(parts[0])){
            this.rowF.set(Integer.parseInt(parts[1]), "x");
        }
        if(this.rowG.contains(parts[0])){
            this.rowG.set(Integer.parseInt(parts[1]), "x");
        }
        if(this.rowH.contains(parts[0])){
            this.rowH.set(Integer.parseInt(parts[1]), "x");
        }
    }
}
