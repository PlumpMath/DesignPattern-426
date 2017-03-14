package pattern.strategy_pattern.main;

import pattern.strategy_pattern.base.QuackBehavior;

/**
 * Created by vincent on 2017/3/14.
 */
public class GuaguaQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Gua ~~~ Gua ~~~");
    }
}
