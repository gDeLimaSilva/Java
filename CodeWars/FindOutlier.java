public class FindOutlier{
  static int find(int[] integers){
    
    for(int n : integers){
      
      if(n % 2 == 0)
      return n;
    }
  return 0;
    }
  
  public static void main(String[] args){
    int[] integers = {1, 2, 3};
    
    System.out.printf("The only even number is: %d", find(integers));
  }
}