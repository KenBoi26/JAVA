package WEEK2;
import java.util.Scanner;

enum Day{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    
    public static boolean isValid(String day){
        for(Day d : Day.values()){
            if(d.name().equals(day)){
                return true;
            }
        }
        
        return false;
    }
    
    public static Day next(Day day){
        return Day.values()[(day.ordinal()+1) % Day.values().length];
    }
};

public class Enums {
    // You are using Java



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String inp = sc.nextLine().toUpperCase();
        
        
        if(Day.isValid(inp)){
            Day day = Day.valueOf(inp);
            Day nextDay = Day.next(day);
            System.out.println(nextDay);
        }else{
            System.out.println("Invalid Input");
        }
        
        
        sc.close();
    }

}
