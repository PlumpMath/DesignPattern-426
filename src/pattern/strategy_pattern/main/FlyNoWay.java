package pattern.strategy_pattern.main;

import pattern.strategy_pattern.base.FlyBehavior;

/**
 * Created by vincent on 2017/3/14.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("oh, i cannot fly!");
    }
}
