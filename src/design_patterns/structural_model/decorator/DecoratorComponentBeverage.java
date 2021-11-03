package design_patterns.structural_model.decorator;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 12:17
 * @desc:
 */
// Decorator --> 装饰抽象基类
public abstract class DecoratorComponentBeverage extends ComponentBeverage {

    private ComponentBeverage componentBeverage;

    public DecoratorComponentBeverage(ComponentBeverage componentBeverage){
        this.componentBeverage = componentBeverage;
    }

    public ComponentBeverage getComponentBeverage() {
        return componentBeverage;
    }

    public void setComponentBeverage(ComponentBeverage componentBeverage) {
        this.componentBeverage = componentBeverage;
    }

    //描述
    public abstract String getDesc();

    //价格
    public abstract double cost();
}
