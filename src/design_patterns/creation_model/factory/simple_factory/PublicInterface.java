package design_patterns.creation_model.factory.simple_factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */

/**
 * @author:zqy
 * @date:2021/10/26 11:19
 * @desc:
 */
public interface PublicInterface {

    //支付接口
    int pay(int payMoney);

    //赠送接口
    String giveAway(int payMoney);
}
