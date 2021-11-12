package design_patterns.behavioral_model.template;/**
 * Created by Enzo Cotter on 2021/11/10.
 */

/**
 * @author:zqy
 * @date:2021/11/10 15:33
 * @desc:
 */
public class TemplateSubject extends AbstractTemplate {
    @Override
    public void init() {
        System.out.println("执行init()方法");
    }

    @Override
    public void apply() {
        System.out.println("执行apply()方法");
    }

    @Override
    public void end() {
        System.out.println("执行end()方法");
    }
}
