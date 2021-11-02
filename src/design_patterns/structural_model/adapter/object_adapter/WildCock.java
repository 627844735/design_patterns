package design_patterns.structural_model.adapter.object_adapter;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 17:41
 * @desc:
 */
//老街口实现类.
public class WildCock implements Cock {
    @Override
    public void gobble() {
        System.out.println("老接口中的方法1");
    }

    @Override
    public void fly() {
        System.out.println("老接口中的方法2");
    }
}
