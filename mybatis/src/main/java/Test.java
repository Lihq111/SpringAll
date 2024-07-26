import java.io.File;

public class Test {

    /**
     * 判断指定路径下的Java文件是否存在
     *
     * @param filePath 文件路径
     * @return 如果文件存在返回true，否则返回false
     */
    public static boolean isJavaFileExists(String filePath) {
        File file = new File(filePath);
        return file.exists() && file.isFile();
    }

    public static void main(String[] args) {
        String filePath = "src/main/java/Test.java";
        if (isJavaFileExists(filePath)) {
            System.out.println("File exists!");
        } else {
            System.out.println("File does not exist!");
        }

        String absolutePath = "D:\\IDEA\\springAll\\src\\main\\java\\Test.java";
        if (isJavaFileExists(absolutePath)) {
            System.out.println("File exists!");
        } else {
            System.out.println("File does not exist!");
        }
    }
}

