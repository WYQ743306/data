package StrategyPattern;
/**
 * 策略与简单工厂结合
 * @author 魏彦强
 *
 */
public class CashContext {
	private CashSuper cs; //声明一个CashSuper对象
	
	//通过构造方法，传入收费策略再生产具体的收费策略类
	public CashContext(String rates) {
		switch (rates) {
		case "正常收费":
			cs = new CashNormal();
			break;
			
		case "满1000减100":
			cs = new CashReturn("1000", "100");
			break;
			
		case "打8折":
			cs = new CashRebate("0.8");
			break;
 
		default:
			break;
		}
	}
	//根据收费策略的不同，获得计算结果
	public double getResult(double money) {
		return cs.acceptCash(money);
	}
	
}

