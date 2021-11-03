package design_patterns.structural_model.decorator;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 16:33
 * @desc:
 */
public class Main {

    public static void main(String[] args) {
        //红茶 + 芒果-珍珠-双份柠檬
        ComponentBeverage component = new BlackTea();

        component = new DecoratorMango(new DecoratorPearl(new DecoratorLemon( new DecoratorLemon( component))));
        System.out.println(component.getDesc() + ", 一共 = " + component.cost());
    }
}
