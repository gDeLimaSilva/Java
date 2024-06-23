public class StringEnds {
    public static boolean solution(String str, String ending) {
        String getStr;

        getStr = str.substring(str.length() - 2);
        System.out.println(getStr);

        if(getStr.equals(ending))
        return true;
        else {
            getStr = str.substring(str.length() - 1);
            if(getStr.equals(ending))
            return true;
            else{
            getStr = str;
            if(getStr.equals(ending))
            return true;
            else
            return false;
        }
    }
    }

    public static void main(String[] args){
        System.out.println(solution("Samurai", "ai"));
    }
}
