import java.util.Scanner;

public class Maskify {
    public static void maskify(char[] C){
      
      for(int i = 0; i < C.length - 4; i++)
        C[i] = '#';

        return ;
    }
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Insert a text:");
    String S = sc.nextLine();
    
    char[] Schar = S.toCharArray();

    maskify(Schar);
    
    S = String.valueOf(Schar);
    
    System.out.printf("Text after the maskify: %s\n", S);
  }
}
