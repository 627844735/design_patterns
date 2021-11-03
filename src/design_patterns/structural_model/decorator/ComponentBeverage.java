package design_patterns.structural_model.decorator;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 12:15
 * @desc:
 */
//Component --> 抽象基类
public abstract class ComponentBeverage {

    //描述
    public abstract String getDesc();

    //价格
    public abstract double cost();
}
