public class MineSweeper {

    private MineField minefield;
    private Player player1;
    private Player player2;

    public MineSweeper(MineField minefield,Player player1,Player player2){
        this.minefield = minefield;
        this.player1 = player1;
        this.player2 = player2;
    }
    public void play(){
        int mine_number =minefield.getMineNumber();
        int mines_found =0;
        this.minefield.print();
        boolean player1_turn=true;
        while(mines_found<mine_number){
            if(player1_turn){
                System.out.println(this.player1.getName()+" turn");
                if(this.player1.play(this.minefield)){
                    mines_found+=1;
                }
                this.minefield.print();
                player1_turn = false;
            }
            else{
                System.out.println(this.player2.getName()+" turn");
                if(this.player2.play(this.minefield)){
                    mines_found+=1;
                }
                this.minefield.print();
                player1_turn = true;
            }
            if(mines_found == mine_number){
                if(player1.getScore()>player2.getScore()){
                    System.out.println(this.player1.getName()+" has won");
                }
                else if(player1.getScore()<player2.getScore()){
                    System.out.println(this.player2.getName()+" has won");
                }
                else{
                    System.out.println("TIE");
                }
            }
            player1.printStatus();
            player2.printStatus();
        }
    }

}
