package design_patterns.structural_model.decorator;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 16:25
 * @desc:
 */
public class GreenTea extends ComponentBeverage {
    @Override
    public String getDesc() {
        return "绿茶";
    }

    @Override
    public double cost() {
        return 12;
    }
}
