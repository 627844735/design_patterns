package design_patterns.structural_model.proxy;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 11:50
 * @desc:
 */
public class Main {

    public static void main(String[] args) {
        MakeFood makeFood = new MakeFoodImplProxy();
        makeFood.makeChicken();
        makeFood.makeNoodle();
    }

}
