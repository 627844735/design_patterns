package design_patterns.structural_model.bridge;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 10:41
 * @desc:
 */
public class BlackDrawAPI implements DrawAPI {
    @Override
    public void draw(double radius, int x, int y) {
        System.out.print("使用了黑笔 radius = " + radius +", x = " + x + ", y = " + y);
    }
}
