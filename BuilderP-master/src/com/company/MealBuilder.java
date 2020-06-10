package com.company;

/**
 * @Description TODO
 * @Date 2020-04-20
 * @Author MaWeiJun
 * @Version 1.0
 */
public abstract class MealBuilder {
    Meal meal = new Meal();

    public abstract void BuildFood();

    public abstract void BuildDrinks();

    public Meal getMeal(){
        return meal;
    }
}
