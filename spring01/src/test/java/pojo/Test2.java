package pojo;

import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        final Test1 test1 = new Test1();
//        LocalDateTime localDateTime = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String format = localDateTime.format(dateTimeFormatter);
//        String format1 = "2024-06-24 22:36:51";
//        System.out.println(format);
//        System.out.println(format1.equals("2024-06-24 22:36:51"));
        final int seconds = 3;
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            int seconds2 = seconds;

            @Override
            public void run() {
                LocalDateTime localDateTime = LocalDateTime.now();
                DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String format = localDateTime.format(dateTimeFormatter);
                if (format.equals("2024-06-24 22:47:31")) {
//                    seconds2--;
//                }else {
                    System.out.println("时间到！");
                    timer.cancel();
                    System.out.println("执行其他操作：");
                    test1.stop();
                }
            }
        }, 0, 100);
        test1.run();
    }


    @Test
    public void date() throws ParseException {
        // 初始化 Date 对象
        Date date = new Date();
        System.out.printf("%tY-%tm-%td %tH:%tM:%tS", date, date, date, date, date, date);
        System.out.println();
        LocalDateTime localDateTime = LocalDateTime.now();
        //System.out.println(localDateTime);
        //System.out.println(date);
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String string = dateTimeFormatter.format(localDateTime);
        String str1 = "2024-06-25 11:11:11";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Date parse = simpleDateFormat.parse(str1);
        TemporalAccessor parse = dateTimeFormatter.parse(str1);
        System.out.println("日期类型：" + parse);
        //System.out.println(string);
        //System.out.println(format);
        // 使用 toString() 函数显示日期时间
        //System.out.println(date.toString());
    }

    @Test
    public void patternMatch() {
        String string = "abcd";
        //System.out.println(Pattern.matches(".*d.*", string));
        String s = new String("2222");
        System.out.println();
        System.out.println(1 + 1);
        for (int i = 0; i >= 0; i++) {
            System.out.println(i);
        }

    }

    @Test
    public void io() throws IOException {
        //char c;
        //String input;
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);
        // 读取字符
        do {
            //c = (char) br.read();
            input = br.readLine();
            if (!input.isEmpty()) {
                char c = input.charAt(0); // 取输入行的第一个字符
                System.out.println(c);
            }
        } while (!input.equals('q'));
    }

    @Test
    public void scanner() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个整数：");

        try {
            int number = scanner.nextInt();
            System.out.println("你输入的整数是：" + number);
        } catch (InputMismatchException e) {
            System.out.println("输入不是有效的整数，请重新输入。");
        }

        scanner.close();
    }
}
