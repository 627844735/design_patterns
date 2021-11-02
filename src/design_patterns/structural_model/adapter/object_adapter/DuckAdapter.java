package design_patterns.structural_model.adapter.object_adapter;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 17:44
 * @desc:
 */
//新接口适配器.
public class DuckAdapter implements Duck {

    //在适配器中注入一个老接口的对象.
    private Cock cock;

    public DuckAdapter(){
        cock = new WildCock();
    }

    @Override
    public void quack() {
        cock.gobble();
    }

    @Override
    public void fly() {
        cock.fly();
    }
}
