import java.util.*;

public class OneToTenGame{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        Player p1, p2;
        System.out.print("Would you like to go first? (Type Y or N) ");
        String answer = kb.nextLine();
        if(answer.toUpperCase().substring(0, 1).equals("Y")){
            p1 = new Player("Human", kb);
            p2 = new Player("Computer");
        }else{
            p2 = new Player("Human", kb);
            p1 = new Player("Computer");
        }
        
        Player currentPlayer = p1;
        int move = 0;
        Board board = new Board(10);
        while(board.getPosition() < 10){
            System.out.println(board);
            System.out.print(currentPlayer + "'s turn (move 1 or 2) ");
            move = currentPlayer.move();
            if(currentPlayer.isRobot()){
                System.out.println(move);
            }
            if(board.setPosition(move + board.getPosition())){
                if(currentPlayer == p1){
                    currentPlayer = p2;
                }else{
                    currentPlayer = p1;
                }
            }
        }
        System.out.println("The winner is " + currentPlayer);
    }
}