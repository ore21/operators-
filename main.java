public class main {
    public static void main(String[] args){

        int intNum = 5;
        int intNum2 = 10;
        int intNum3 = 15;
        int intNum4 = 20;
        int intNum5 = 25;

        int result1 = intNum + intNum5;
        System.out.println(" Addition: " + (intNum) + " + " +  (intNum5) + " = " + result1 );

        int result2 = intNum2 - intNum3;
        System.out.println(" Substraction: " + (intNum2) + " - " +  (intNum3) + " = " + result2 );

        int result3 = intNum * intNum4;
        System.out.println(" Multiplication: " + (intNum) + " * " +  (intNum4) + " = " + result3 );

        int result4 = intNum5 / intNum2;
        System.out.println(" Division: " + (intNum5) + " / " +  (intNum2) + " = " + result4 );

        double result5 = (double) intNum4 % intNum3;
        System.out.println(" Remainder: " + (intNum4) + " % " +  (intNum3) + " = " + result5 );
    }

}
