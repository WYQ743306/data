package SimpleFactoryModel;
/**
 * �����㹤����
 * @author κ��ǿ
 *
 */
public class OperationFactory {
	public static Operation oper = null;
 
	public static Operation createOperation(String operator) {
		//���ݴ������������������Ӧ���������
		switch (operator) {
		case "+":
			oper=new OperationAdd();
			break;
		case "-":
			oper=new OperationSub();
			break;
		case "*":
			oper=new OperationMul();
			break;
		case "/":
			oper=new OperationDiv();
			break;
		default:
			break;
		}
		return oper;
	}
}

