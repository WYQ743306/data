package SimpleFactoryModel;
/**
 * ���������࣬�̳�������
 * @author κ��ǿ
 *
 */
public class OperationDiv extends Operation {
	 
	@Override
	public Double getResult() throws Exception {
		if (getNumber2()==0) {
			throw new ArithmeticException("��������Ϊ'0'!");
		}
		//super.getNumber1()+super.getNumber2();
		return getNumber1()/getNumber2();
	}
 
}
 

