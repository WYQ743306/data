package StrategyPattern;

public class CashReturn extends CashSuper {
    private double moneyCondition = 0; //返利条件
    private double moneyReturn = 0; //返利值
    //返利收费，初始化时必须要输入返利条件和返利值，比如满300返100
    public CashReturn(String moneyCondition, String  moneyReturn) {
        this.moneyCondition = Double.valueOf(moneyCondition);
        this.moneyReturn = Double.valueOf(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        if (money>=moneyCondition) {
            //若大于返利条件，则需要减去返利值
            return money-Math.floor(money/moneyCondition)*moneyReturn;
        }
        return money;
    }


}
