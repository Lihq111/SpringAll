package pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test5 {

    public static void main(String[] args) {
        File file = new File("D:/A/A.txt");
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(file);
//            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"UTF-8");
//            outputStreamWriter.append("1234234124");
//            outputStreamWriter.close();
//            fileOutputStream.close();
//            //FileWriter fileWriter = new FileWriter(file);
//            //fileWriter.append("adfsf");
//            //fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
            StringBuilder stringBuilder = new StringBuilder();
            while (inputStreamReader.ready()) {
                Character c = (char) inputStreamReader.read();
                System.out.print(stringBuilder + c.toString());
            }
            inputStreamReader.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
