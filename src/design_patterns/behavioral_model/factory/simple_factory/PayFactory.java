package design_patterns.behavioral_model.factory.simple_factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */

/**
 * @author:zqy
 * @date:2021/10/26 11:38
 * @desc:
 */
//工厂类,根据支付金额来选择不同的优惠
public class PayFactory {

    public static PublicInterface getResult(int payMoney){
        PublicInterface publicInterface = null;

        if(payMoney >= 500 && payMoney < 1000)
            publicInterface = new FullReduction();
        else if(payMoney >= 1000)
            publicInterface = new Discount();
        else
            publicInterface = new NormalCheckOut();

        return publicInterface;
    }

    public static void main(String[] args) {
        PublicInterface result = PayFactory.getResult(500);
        int pay = result.pay(500);
        String s = result.giveAway(500);
        System.out.println("支付" + pay + "RMB" + "," + s );
    }
}
