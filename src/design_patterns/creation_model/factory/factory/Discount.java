package design_patterns.creation_model.factory.factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */


/**
 * @author:zqy
 * @date:2021/10/26 15:22
 * @desc:
 */
//打折
public class Discount implements PublicInterface {
    @Override
    public int pay(int payMoney, int vipNumbers) {
        if(vipNumbers >= 500 && vipNumbers < 1000)
            payMoney = (int) (payMoney * 0.8);
        else if(vipNumbers >= 1000)
            payMoney = (int) (payMoney * 0.7);

        return payMoney;
    }

    @Override
    public String giveAway(int payMoney) {
        return "";
    }
}
