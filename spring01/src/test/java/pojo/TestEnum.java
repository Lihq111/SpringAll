package pojo;

public enum TestEnum {
    RED, BLUE, GREEN;
}

class GetEnum {
    public static void main(String[] args) {
        System.out.println(TestEnum.RED);
        for (TestEnum value : TestEnum.values()) {
            System.out.println(value);
        }
        switch (TestEnum.RED) {
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                return;
            case GREEN:
                System.out.println("绿色");
                break;
        }
        TestEnum[] enums = TestEnum.values();
        for (TestEnum anEnum : enums) {
            System.out.println(anEnum+"的下标为："+anEnum.ordinal());
            if (anEnum.equals(TestEnum.RED)){
                System.out.println("有红色");
            }else {
                System.out.println("没有红色");
            }
        }

    }

}
