package com.company;

/**
 * @Description TODO
 * @Date 2020-04-20
 * @Author MaWeiJun
 * @Version 1.0
 */
public class SubMealBuilderA extends MealBuilder {
    @Override
    public void BuildFood(){
        meal.setFood("Hambagar");
    }

    @Override
    public void BuildDrinks(){
        meal.setDrinks("kole" );
    }

}
