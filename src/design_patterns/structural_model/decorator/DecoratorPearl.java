package design_patterns.structural_model.decorator;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 16:31
 * @desc:
 */
public class DecoratorPearl extends DecoratorComponentBeverage {

    public DecoratorPearl(ComponentBeverage componentBeverage){
        super(componentBeverage);
    }

    @Override
    public String getDesc() {
        return this.getComponentBeverage().getDesc() + "珍珠";
    }

    @Override
    public double cost() {
        return this.getComponentBeverage().cost() + 7;
    }
}
