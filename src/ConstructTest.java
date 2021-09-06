import java.util.Scanner;
public class ConstructTest {
    String userName;
    int userId;
    static String AppName;

    public ConstructTest(String userName, int userId, String appName) {
        this.userName = userName;
        this.userId = userId;
        this.AppName = appName;
        System.out.println("User Name: "+ userName);
        System.out.println("User Id: "+ userId);
        System.out.println("App Name: "+ AppName);
        System.out.println();
        ConstructTest();
    }

    public void ConstructTest(){
        String UseFull = "knowing new things!";
        System.out.println(UseFull);
    }
}

class ConstructObj{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter your name: ");
        String userName = input.next();
        System.out.print("please enter your Id: ");
        int userId = input.nextInt();
        System.out.print("please enter name: ");
        String AppName = input.next();
        ConstructTest obj = new ConstructTest(userName,userId,AppName);
        ConstructTest obj2 = new ConstructTest(userName,userId,AppName);
        ConstructTest obj3 = new ConstructTest(userName,userId,AppName);
    }
}