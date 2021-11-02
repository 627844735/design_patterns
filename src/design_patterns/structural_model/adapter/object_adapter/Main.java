package design_patterns.structural_model.adapter.object_adapter;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 17:49
 * @desc:
 */
public class Main {

    public static void main(String[] args) {
        Duck duck = new DuckAdapter();
        duck.quack();
    }

}
