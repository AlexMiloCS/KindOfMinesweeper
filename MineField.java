//Marianos Prosmitis AM:3163

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
public class MineField {
    private Cell[][] board;
    private int array_size;
    private int mine_number;
    public MineField(int array_size,int mine_number){
        this.board = new Cell[array_size][array_size];
        this.array_size=array_size;
        this.mine_number=mine_number;
        initializeCells(array_size);
        initializeMines(mine_number,array_size);

    }
    private void initializeCells(int array_size){
        for(int row=0;row<array_size;row++){
            for(int column=0;column<array_size;column++){
                this.board[row][column]= new Cell(row,column);
            }
        }
        for (int row = 0; row < array_size; row++) {
            for(int column=0;column<array_size;column++) {
                Cell cell = this.board[row][column];
                for(int i=-1;i<=1;i++){
                    for(int j=-1;j<=1;j++){
                        if(i == 0 && j==0){
                            continue;
                        }
                        if(i==-1 && row==0){
                            continue;
                        }
                        if(j==-1 && column==0) {
                            continue;
                        }
                        if(i==1 && row==array_size-1){
                            continue;
                        }
                        if(j==1 && column==array_size-1){
                            continue;
                        }
                        cell.addNeighbor(this.board[row+i][column+j]);
                    }
                }
            }
        }
    }

    private void initializeMines(int mine_number,int array_size){
        for(int mine=0;mine<mine_number;mine++){
            Random random = new Random();
            int random_x = random.nextInt(array_size);
            int random_y = random.nextInt(array_size);
            Cell cell = this.board[random_x][random_y];
            while(cell.has_mine()){
                random_x = random.nextInt(array_size);
                random_y = random.nextInt(array_size);
            }
            cell.addMine();

            }
        }
    public void print(){
        System.out.print("         ");
        for(int i=0;i<this.array_size;i++){
            System.out.print(i+ " ");
        }
        System.out.println("");
        for(int column=0;column<this.array_size;column++) {
            System.out.print(column+"       ");
            for (int row = 0; row < this.array_size; row++) {
                Cell cell = this.board[column][row];
                System.out.print(" "+cell.toString());
            }
            System.out.println();
        }
    }
    public Cell getCell(int column,int row){
        return board[column][row];
    }
    public int getMineNumber(){
        return mine_number;
    }
}

