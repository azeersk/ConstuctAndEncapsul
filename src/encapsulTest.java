import java.util.Scanner;

public class encapsulTest {
    private String EName;
    private int EId;

    public void SetEmployee(String EName,int EId){
        this.EName = EName;
        this.EId = EId;
    }
    public String GetEmployee(){
        return EName;
    }
    public int GetEmployee1(){
        return EId;
    }
}

class EncapsulationOf{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("please enter Employee name: ");
        String EName = input.nextLine();
        System.out.print("please enter Employee Id: ");
        int EId = input.nextInt();
        encapsulTest obj = new encapsulTest();
        obj.SetEmployee(EName,EId);
        System.out.println("Employee name: "+obj.GetEmployee());
        System.out.println("Employee Id: "+ obj.GetEmployee1());
    }
}