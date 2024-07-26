/**
 * @author LHQ
 * @description :
 */
/*public class MyThread extends Thread {
    public void run() {
        System.out.println("Throwing in " + "MyThread");
        throw new RuntimeException();
    }
}

class Main {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        try {
            Thread.sleep(1000);
        } catch (Exception x) {
            System.out.println("Caught it" + x);
        }
        System.out.println("Exiting main");
    }
}*/

class ExceptionTool extends Exception {
    ExceptionTool(String message) {
        super(message);
    }
}

class Usage {
    void use() throws ExceptionTool {
        throw new ExceptionTool("this is ExceptionTool");
    }
}

class Test {
    public static void main(String[] args) {
        try {
            new Usage().use();
        } catch (ExceptionTool e) {
            System.out.println(e.getMessage());
        }
    }
}