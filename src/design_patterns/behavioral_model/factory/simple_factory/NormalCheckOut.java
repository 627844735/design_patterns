package design_patterns.behavioral_model.factory.simple_factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */

/**
 * @author:zqy
 * @date:2021/10/26 11:36
 * @desc:
 */
//正常的结账  无满减无打折
public class NormalCheckOut implements PublicInterface {
    @Override
    public int pay(int payMoney) {
        return payMoney;
    }

    @Override
    public String giveAway(int payMoney) {
        return "";
    }
}
