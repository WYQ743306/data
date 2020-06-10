package SimpleFactoryModel;
/**
 * ����
 * @author κ��ǿ
 *
 */
public class Test {
	public static void main(String[] args) throws Exception {
		//�ӷ�
		Addpend(1,1);
		//����
		Subtract(1,1);
		//�˷�
		Multiply(1,1);
		//����
		Divide(1,1);
	}
	public static void Addpend(double number1,double number2) throws Exception {
		String add = "+";
		Operation Add = OperationFactory.createOperation(add);
		Add.setNumber1(number1);
		Add.setNumber2(number2);
		Double result = Add.getResult();
		System.out.println("�ӷ���"+result);
	}
	
	public static void Subtract(double number1,double number2) throws Exception {
		String sub = "-";
		Operation Sub = OperationFactory.createOperation(sub);
		Sub.setNumber1(number1);
		Sub.setNumber2(number2);
		Double result = Sub.getResult();
		System.out.println("������"+result);
	}
	
	public static void Multiply(double number1,double number2) throws Exception {
		String mul = "*";
		Operation Mul = OperationFactory.createOperation(mul);
		Mul.setNumber1(number1);
		Mul.setNumber2(number2);
		Double result = Mul.getResult();
		System.out.println("�˷���"+result);
	}
	
	public static void Divide(double number1,double number2) throws Exception {
		String div = "/";
		Operation Div = OperationFactory.createOperation(div);
		Div.setNumber1(number1);
		Div.setNumber2(number2);
		Double result = Div.getResult();
		System.out.println("������"+result);
	}
 
}
