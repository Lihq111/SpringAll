package demo;

import java.util.Arrays;

public class FindRepeat {
    public static void main(String[] args)
    {
        int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2, 9, 2};
        findRepeat(my_array);

    }

    public static void findRepeat(int[] a) {
        int count=0;
        for(int j=0;j<a.length;j++) {
            for(int k =j+1;k<a.length;k++) {
                if(a[j]==a[k]) {
                    count++;
//                    System.out.println( "重复元素 : " +  a[j] );
                }
            }
            if(count==1)
                System.out.println( "重复元素 : " +  a[j] );
            count = 0;
        }
    }
}