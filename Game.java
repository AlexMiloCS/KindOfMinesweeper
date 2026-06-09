import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter board size");
        int array_size = scanner.nextInt();
        System.out.println("Enter mine number");
        int mine_number = scanner.nextInt();
        System.out.println("Enter player1 Name");
        String player1_name = scanner.next();
        System.out.println("Enter player2 Name");
        String player2_name = scanner.next();
        Player player1 = new Player(player1_name);
        Player player2 = new Player(player2_name);
        MineField mineField = new MineField(array_size,mine_number);
        MineSweeper mineSweeper = new MineSweeper(mineField,player1,player2);
        mineSweeper.play();
    }
}
