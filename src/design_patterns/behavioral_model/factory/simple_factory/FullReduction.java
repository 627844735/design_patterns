package design_patterns.behavioral_model.factory.simple_factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */

/**
 * @author:zqy
 * @date:2021/10/26 11:21
 * @desc:
 */
//满减
public class FullReduction implements PublicInterface {


    @Override
    public int pay(int payMoney) {
        if(payMoney >= 500 && payMoney < 1000)
            payMoney = payMoney - 300;
        return payMoney;
    }

    @Override
    public String giveAway(int payMoney) {
        if(payMoney >= 500 && payMoney < 1000)
            return "赠送1张优惠券.";
        else
            return "";
    }
}
