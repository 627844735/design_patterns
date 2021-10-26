package design_patterns.behavioral_model.factory.simple_factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */

/**
 * @author:zqy
 * @date:2021/10/26 11:25
 * @desc:
 */
//打折
public class Discount implements PublicInterface {

    @Override
    public int pay(int payMoney) {
        if(payMoney >= 1000)
            payMoney = (int) (payMoney * 0.8);
        return payMoney;
    }

    @Override
    public String giveAway(int payMoney) {
        if(payMoney >= 1000)
            return "赠送2张优惠券.";
        else
            return "";
    }

}
