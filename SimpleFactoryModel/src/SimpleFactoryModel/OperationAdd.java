package SimpleFactoryModel;
 
/**
 * �ӷ������࣬�̳�������
 * @author κ��ǿ
 *
 */
public class OperationAdd extends Operation {
 
	@Override
	public Double getResult() {
		//super.getNumber1()+super.getNumber2();
		return getNumber1()+getNumber2();
	}
 
}


