package pojo;

import java.io.*;

public class Test4 {
    public static void main(String[] args) {
        try {
            //byte bWrite[] = {1,21,23,1,12,1};
            //String stringWrite[] = {"11","1111","1233","323424","13423"};
            OutputStream os = new FileOutputStream("D:/A/A.txt");
            OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
            osw.append("厉害");
            osw.append("厉害2");
            osw.append("厉害3");

//            for (int x = 0; x < bWrite.length; x++) {
//                //os.write(bWrite[x]); // writes the bytes
//                //os.write(Integer.parseInt(stringWrite[x]));
//                osw.write(bWrite[x]);
//            }
            osw.close();
            os.close();

            InputStream is = new FileInputStream("D:/A/A.txt");
            InputStreamReader isr = new InputStreamReader(is, "UTF-8");
            StringBuilder stringBuilder = new StringBuilder();
            while (isr.ready()) {
                stringBuilder.append(isr.read());
                stringBuilder.append("\r\n");
            }
            System.out.println(stringBuilder.toString());
//            int size = is.available();
//
//            for (int i = 0; i < size; i++) {
//                System.out.print((char) is.read() + "  ");
//            }
//            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}