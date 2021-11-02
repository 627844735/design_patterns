package design_patterns.structural_model.adapter.class_adapter;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 19:31
 * @desc:
 */
public class Main {

    public static void main(String[] args) {
        Target target = new SomeThingAdapter();
        target.methodThree();
    }

}
