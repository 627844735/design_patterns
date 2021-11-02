package design_patterns.structural_model.adapter.class_adapter;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 19:30
 * @desc:
 */
public class SomeThingAdapter extends SomeThing implements Target {

    @Override
    public void methodOne() {
        System.out.println("新类中的方法1");
    }
}
