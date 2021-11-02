package design_patterns.creation_model.factory.factory;

/**
 * Created by Enzo Cotter on 2021/10/26.
 */
public interface PublicInterface {

    //支付接口
    int pay(int payMoney, int vipNumbers);

    //赠送接口
    String giveAway(int payMoney);
}
