package design_patterns.creation_model.factory.factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */

/**
 * @author:zqy
 * @date:2021/10/26 15:18
 * @desc:
 */
//满减优惠
public class FullReduction implements PublicInterface {

    /**
     * 满500 - 300，满1000 - 500.
     * @param payMoney
     * @return
     */
    @Override
    public int pay(int payMoney, int vipNumbers) {
        if(vipNumbers >= 500 && vipNumbers < 1000)
            payMoney = payMoney - 300;
        else if(vipNumbers > 1000) {
            payMoney = payMoney - 500;
        }

        return payMoney;
    }


    @Override
    public String giveAway(int payMoney) {
        return "";
    }
}
