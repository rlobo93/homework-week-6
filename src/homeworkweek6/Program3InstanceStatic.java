package homeworkweek6;

public class Program3InstanceStatic {
    static int a = 500;//static
    int b = 2;//instance

    public static void main(String[] args) {
        Program3InstanceStatic obj = new Program3InstanceStatic();
        obj.test();
        test1();

    }

    // Static method
    public static void test1() {
        Program3InstanceStatic instanceStatic = new Program3InstanceStatic(); // object for int b

        System.out.println(instanceStatic.b * a);

    }

    //instance method
    public void test() {

        System.out.println(a * b);

    }
}
