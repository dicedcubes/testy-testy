/**
 * 1 to 10 Board
 */

//test comment

public class Board{
    private int size, pos;
    
    public Board(){
        size = 10;
        pos = 0;
    }
    
    public Board(int size){
        this.size = size;
        pos = 0;
    }
    
    public boolean setPosition(int p){
        if(p <= pos || p > size){
            return false;
        }
        pos = p;
        return true;
    }
    
    public String toString(){
        String result = "";
        for(int i = 1; i <= size; i++){
            if(i == pos){
                result += "X ";
            }else{
                result += "_ ";
            }
        }
        return result;
    }
    
    public int getPosition(){
        return pos;
    }
}