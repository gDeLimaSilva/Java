public class NumbersFear {
    static public boolean AmIAfraid(final String day, final int num) {

        if(day.equals("Monday") && num == 12)
        return true;
        else if(day.equals("Tuesday") && num > 95)
        return true;
        else if(day.equals("Wednesday") && num == 34)
        return true;
        else if(day.equals("Thursday") && num == 0)
        return true;
        else if(day.equals("Friday") && num % 2 == 0)
        return true;
        else if(day.equals("Saturday") && num == 56)
        return true;
        else if(day.equals("Sunday") && num == 666)
        return true;
        else if(day.equals("Sunday") && num == -666)
        return true;
        else
        //Help me...
        return false;
    }
}
