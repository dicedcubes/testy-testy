import java.util.*;

public class Player{
    private String name;
    private Scanner kb;
    
    public Player(String n){
        name = n;
        kb = null;
    }
    
    public Player(String n, Scanner input){
        name = n;
        kb = input;
    }
    
    public String toString(){
        return name;
    }
    
    public boolean isRobot(){
        return kb == null;
    }
    
    public boolean isHuman(){
        return kb != null;
    }
    
    public int move(){
        int result = 0;
        if(isRobot()){
            if(Math.random() > .5){
                return 1;
            }else{
                return 2;
            }
        }
        
        String answer = kb.nextLine();
        while(!valid(answer)){
            System.out.print("Not valid -- choose 1 or 2");
            answer = kb.nextLine();
        }
        return Integer.parseInt(answer);
    }
    
    public boolean valid(String s){
        return s.equals("1") || s.equals("2");
    }
}