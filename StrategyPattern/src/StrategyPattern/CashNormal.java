package StrategyPattern;
/**
 * 正常收费子类，继承现金收费抽象类
 * @author 魏彦强
 *
 */
public class CashNormal extends CashSuper {
	 
	@Override
	public double acceptCash(double money) {
		//正常收费，返回原价
		return money;
	}
 
}
