package design_patterns.behavioral_model.factory.factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */

import design_patterns.behavioral_model.factory.factory.PublicInterface;


/**
 * @author:zqy
 * @date:2021/10/26 15:43
 * @desc:
 */
//正常
public class NormalCheckOut implements PublicInterface {
    @Override
    public int pay(int payMoney, int vipNumbers) {
        return payMoney;
    }

    @Override
    public String giveAway(int payMoney) {
        return "";
    }
}
