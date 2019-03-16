package WilsonPrime;

public class WilsonPrime {

    public  double calculateFactorial(double number){
        double factorial = 1;
        for(double i = 2; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }

    public boolean amIWilson(double number){
        double wilson = (calculateFactorial(number-1) +1)/(number * number);
        long wholeWilson = (long) wilson;
        double fraction = wilson - wholeWilson;
        if(number > 1){
            if (fraction == 0)
                return true;
        }
        return false;
    }
}
