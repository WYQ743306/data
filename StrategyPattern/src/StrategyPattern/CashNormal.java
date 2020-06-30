package StrategyPattern;

public class CashNormal extends CashSuper {

    @Override
    public double acceptCash(double money) {
        //正常收费，返回原价
        return money;
    }

}

