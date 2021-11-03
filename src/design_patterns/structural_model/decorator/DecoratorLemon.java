package design_patterns.structural_model.decorator;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 16:26
 * @desc:
 */
//具体的装饰类.
public class DecoratorLemon extends DecoratorComponentBeverage {

    public DecoratorLemon(ComponentBeverage componentBeverage){
        super(componentBeverage);
    }

    @Override
    public String getDesc() {
        return this.getComponentBeverage().getDesc() + "柠檬";
    }

    @Override
    public double cost() {
        return this.getComponentBeverage().cost() + 5;
    }
}
