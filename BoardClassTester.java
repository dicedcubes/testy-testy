public class BoardClassTester{
    public static void main(String[] args){
        Board  board = new Board(10);
        for(int i = 0; i <= 10; i++){
            board.setPosition(i);
            System.out.println(board);
        }
    }
}