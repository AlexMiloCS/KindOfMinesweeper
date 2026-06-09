import java.util.List;
import java.util.ArrayList;

public class Cell {
    private int row;
    private int column;
    private boolean has_mine=false;
    private boolean open=false;
    private int mine_count = 0;
    private List<Cell> neighbors = new ArrayList<Cell>();

    public Cell(int column,int row){
        this.row =row;
        this.column = column;
    }
    public void addNeighbor(Cell cell){
        if(neighbors.contains(cell))
            return;
        neighbors.add(cell);
    }

    public void addMine(){
        has_mine=true;
        for(int i=0;i<neighbors.size();i++) {
            Cell neighbor = neighbors.get(i);
            neighbor.mine_count +=1;
        }
    }
    public void open(){
        this.open=true;
    }
    public boolean is_Open(){
        if(this.open==true){
            return true;
        }
        return false;
    }

    public String toString() {
        if (!this.open) {
            return "-";
        } else if (this.has_mine) {
            return "*";
        } else {
            return Integer.toString(this.mine_count);
        }
    }
    public int getRow(){
        return row;
    }
    public int getColumn(){
        return column;
    }

    public List getNeighbours(){
        return neighbors;
    }

    public boolean has_mine() {
        return has_mine;
    }
}
