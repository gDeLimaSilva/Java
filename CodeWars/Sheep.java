import java.util.*;

public class Sheep {
  public static void main(String[] args){

    boolean sheep[] = {true,  true,  true,  false,
      true,  true,  true,  true ,
      true,  false, true,  false,
      true,  false, false, true ,
      true,  true,  true,  true ,
      false, false, true,  true};
    int sheepCount = 0;

      for(int i = 0; i < sheep.length; i++){
        if(sheep[i] == true)
        sheepCount++;
      }

      System.out.printf("The number of sheeps is: %d\n", sheepCount);

  }
}
