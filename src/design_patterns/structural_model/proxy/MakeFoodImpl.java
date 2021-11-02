package design_patterns.structural_model.proxy;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

import java.util.concurrent.TimeUnit;

/**
 * @author:zqy
 * @date:2021/11/2 11:43
 * @desc:
 */
public class MakeFoodImpl implements MakeFood {

    @Override
    public void makeChicken() {

        ChickenFood chickenFood = ChickenFood.builder().setChicken(5).setSalt(3).setSpicy(7).build();
        System.out.println("制作中...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("制作完成");
    }

    @Override
    public void makeNoodle() {
        NoodleFood noodleFood = NoodleFood.getInstance();
        System.out.println("制作中...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("制作完成");
    }
}
