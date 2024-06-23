import java.util.Scanner;

public class Beasts {
    public static boolean feats(String b, String d){

        char firstBLetter = b.charAt(0);
        char firstDLetter = d.charAt(0);

        if(firstBLetter == firstDLetter)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        String beast, dish;
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the beast name:");
        beast = sc.next();

        System.out.println("Insert the dish name:");
        dish = sc.next();

        System.out.println("The combination is " + feats(beast, dish));
    }
}
