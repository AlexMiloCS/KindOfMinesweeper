//Marianos Prosmitis AM:3163

import java.util.Scanner;
public class Player {
    String name;
    int score;
    public Player(String name){
        this.name= name;
    }
    public boolean play(MineField minefield){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row");
        int row = scanner.nextInt();
        System.out.println("Enter column");
        int col = scanner.nextInt();
        Cell cell =minefield.getCell(row,col);
        while(cell.is_Open()){
            System.out.println("Invalid input please enter a closed cell coordinates");
            System.out.println(" Enter row");
            row = scanner.nextInt();
            System.out.println("Enter column");
            col = scanner.nextInt();
            cell =minefield.getCell(row,col);
        }
        cell.open();
        if(cell.has_mine()){
            System.out.println(this.name+" has found a mine");
            this.score+=1;
            return true;
        }
        return false;
    }
    public void printStatus(){
        System.out.println(this.name+" score:"+this.score);
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
}
