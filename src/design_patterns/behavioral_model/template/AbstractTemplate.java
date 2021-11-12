package design_patterns.behavioral_model.template;/**
 * Created by Enzo Cotter on 2021/11/10.
 */

/**
 * @author:zqy
 * @date:2021/11/10 15:31
 * @desc:
 */
//抽象模版类.
public abstract class AbstractTemplate {

    //只定义方法的执行顺序,不需要实现方法的方法体.
    public void templateMethod(){
        init();
        apply();
        end();
    }

    protected abstract void init();
    protected abstract void apply();
    protected abstract void end();
}
