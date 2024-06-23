public class Multiples {

    public int solution(int x){
        int sum = 0;

        if(x < 0)
        return 0;
        else{
            for(int i = 0; i < x; i++){
                if(i % 3 == 0 || i % 5 == 0){
                    sum += i;
                }
            }

            return sum;
        }
    }
}
