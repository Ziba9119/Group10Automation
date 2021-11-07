package murodil_assingnments;

public class BaseClass {


    public static int calculate(int numberOne, int numberTwo, char operator){
        int result = 0;

        if(operator == '+'){
            result = numberOne + numberTwo;
        } else if(operator == '–'){
            result = numberOne - numberTwo;
        } else if(operator == '×'){
            result = numberOne * numberTwo;
        }

        return result;
    }

}
