package design_patterns.structural_model.bridge;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 10:53
 * @desc:
 */
public class Main {

    public static void main(String[] args) {
        Sharp sharp = new Circle(3.14, new BlackDrawAPI());
        sharp.draw();
    }
}
