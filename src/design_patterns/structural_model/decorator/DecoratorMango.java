package design_patterns.structural_model.decorator;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 16:29
 * @desc:
 */
//芒果装饰类
public class DecoratorMango extends DecoratorComponentBeverage {

    public DecoratorMango(ComponentBeverage componentBeverage){
        super(componentBeverage);
    }

    @Override
    public String getDesc() {
        return this.getComponentBeverage().getDesc() + "芒果";
    }

    @Override
    public double cost() {
        return this.getComponentBeverage().cost() + 3;
    }
}
