package demo;

/**
 * @author LHQ
 * @description :阶乘
 */
public class Factorial {
    public static void main(String[] args) {
        /*int number = 6;
        int factorial = number;
        for (int i = 1; i < number; i++) {
            factorial = factorial * (number - i);
        }
        System.out.println(factorial);*/
//        for (int i = 0; i <= 10; i++) {
//            System.out.printf("%d!=%d\n", i,factorial(i));
//        }
        aa(6);
        System.out.println(b(6));
    }

    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }


    public static void aa(int number) {
        int sum = number;
        if (number <= 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < number; i++) {
                sum = sum * (number - i);
                //System.out.println(sum);
            }
            System.out.println(sum);
        }
    }

    public static int b(int number){
        if (number<=1){
            return 1;
        }else {
            return number*b(number-1);
        }
    }
}
