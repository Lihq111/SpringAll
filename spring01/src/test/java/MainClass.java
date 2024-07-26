public class MainClass {
    public static long count = 0;
    public static void main(String[] args) {
        int number = 10;
        doTowers(number, 'A', 'B', 'C');
        System.out.println(count);
        //System.out.println(( 10000F)/(60F*60F*24F)/365F);
    }
    public static void doTowers(int number, char a, char b, char c) {
        if (number == 1){
            //System.out.println("Disk 1 from " + a + " to " + c);
        }else {
            doTowers(number - 1, a, c, b);
            //System.out.println("Disk " + number + " from " + a + " to " + c);
            doTowers(number - 1, b, a, c);
        }
        count++;
    }
}