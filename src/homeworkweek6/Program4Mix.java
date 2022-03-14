package homeworkweek6;

public class Program4Mix {
    //Variables
    static int a = 10;//Static Variable
    static int b = 10;//Static Variable
    int c = 10;//Instant Variable
    int d = 10;//Instant Variable

    //Main Method
    public static void main(String[] args) {
        Program4Mix obj = new Program4Mix();
        obj.test1();
        test();

    }

    //Static Method
    public static void test(){
        Program4Mix M = new Program4Mix();
        System.out.println(a+b+M.c+M.d);

    }
    //Instance Variable
    public void test1(){

        System.out.println(a+b+c+d);

    }

}
