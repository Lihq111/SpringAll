import java.util.Arrays;

public class ATest {
    public static void main(String[] args) {
        int number = 1000000;
        isPerfectNumber(number);
//        if (isPerfectNumber(number)) {
//            System.out.println(number + " 是完美数。");
//        } else {
//            System.out.println(number + " 不是完美数。");
//        }
    }

    public static boolean isPerfectNumber(int number) {
        for (int i = 0; i <= number; i++) {
            int sum = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i){
                System.out.println(sum);
            }
        }
        return true;
    }
}