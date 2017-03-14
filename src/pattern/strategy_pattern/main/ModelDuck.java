package pattern.strategy_pattern.main;

import pattern.strategy_pattern.base.Duck;

/**
 * Created by vincent on 2017/3/14.
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new SilentQuack());
    }
}
