package SimpleFactoryModel;
/**
 * 减法运算类，继承运算类
 * @author 魏彦强
 *
 */
public class OperationSub extends Operation {
	 
	@Override
	public Double getResult() {
		//super.getNumber1()+super.getNumber2();
		return getNumber1()-getNumber2();
	}
 
}
