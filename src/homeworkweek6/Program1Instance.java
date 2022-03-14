package homeworkweek6;

public class Program1Instance {
    int a = 10;//instance variable
    int b = 20;//instance variable

    //main method
    public static void main(String[] args) {

        Program1Instance program1Instance = new Program1Instance();//object

        program1Instance.test1();

    }

    //instance method
    public void test1() {

        System.out.println(a+b);

    }

}
