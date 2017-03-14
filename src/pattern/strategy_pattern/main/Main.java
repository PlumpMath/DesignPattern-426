package pattern.strategy_pattern.main;

import pattern.strategy_pattern.base.Duck;

/**
 * Created by vincent on 2017/3/14.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("-------- God made a model duck with mud --------");

        Duck duck = new ModelDuck();

        duck.display();
        duck.performFly();
        duck.performQuack();

        System.out.println("-------- God gives the  model duck the ability to fly and quack --------");

        duck.setFlyBehavior(new FlyRecketPower());
        duck.setQuackBehavior(new GuaguaQuack());
        duck.performFly();
        duck.performQuack();
    }
}
