import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("输入数字A：");
        Double numberA=new Scanner(System.in).nextDouble();
        System.out.println("输入操作符 如 + - * /：");
        String operator=new Scanner(System.in).nextLine();
        System.out.println("输入数字B：");
        Double numberB=new Scanner(System.in).nextDouble();
        Operation oper=Factory.createOperation(operator);
        oper.setNumberA(numberA);
        oper.setNumberB(numberB);
        System.out.println("结果是："+oper.getResult());
    }
}
