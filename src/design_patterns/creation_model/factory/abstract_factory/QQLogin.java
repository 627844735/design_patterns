package design_patterns.creation_model.factory.abstract_factory;/**
 * Created by Enzo Cotter on 2021/11/1.
 */

/**
 * @author:zqy
 * @date:2021/11/1 9:56
 * @desc:
 */
public class QQLogin implements PublicInterface {
    @Override
    public boolean login() {
        return true;
    }

    @Override
    public String register() {
        return "注册QQ登录成功";
    }

    @Override
    public boolean loginout() {
        return true;
    }
}
