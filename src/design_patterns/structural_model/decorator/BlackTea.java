package design_patterns.structural_model.decorator;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 16:23
 * @desc:
 */
public class BlackTea extends ComponentBeverage {
    @Override
    public String getDesc() {
        return "红茶";
    }

    @Override
    public double cost() {
        return 10;
    }
}
