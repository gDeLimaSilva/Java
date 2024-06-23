import java.util.Scanner;

public class MinMax {

    static int[] minMax(int[] a){

        int[] b = new int[1];

        b[0] = a[0];
        b[1] = a[1];

        for(int i = 0; i < a.length; i++){
            if(a[i] < b[0])
                b[0] = a[i];
            if(a[i] > b[1])
                b[1] = a[i];
        }

        return b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] valores = new int[5];

        for(int i = 0; i < valores.length; i++){
            System.out.println("Insert a value for the position " + i+1);
            valores[i] = sc.nextInt();

            int[] min = minMax(valores);

            System.out.println("Max and minimum values are: " + min);
        }
    }
}
