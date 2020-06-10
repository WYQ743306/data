package com.company;

public class Main {

    public static void main(String[] args) {
        // 套餐A
        SubMealBuilderA a = new SubMealBuilderA();
        //套餐A的服务员
        KFCWaiter waiter = new KFCWaiter(a);
        //获得套餐
        Meal mealA = waiter.construct();
        System.out.print("A套餐有：");
        System.out.println("食物："+mealA.getFood()+"；   "+"饮品："+mealA.getDrinks());

    }
}
