package design_patterns.structural_model.proxy;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 11:52
 * @desc:
 */
//代理类
public class MakeFoodImplProxy implements MakeFood {

    //要注入一个被代理类.
    private MakeFoodImpl makeFood = new MakeFoodImpl();

    //代理方法
    @Override
    public void makeChicken() {
        System.out.println("起锅,烧油...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        makeFood.makeChicken();
    }

    @Override
    public void makeNoodle() {
        System.out.println("起锅,烧油...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        makeFood.makeNoodle();
    }
}
