package design_patterns.behavioral_model.factory.factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */

/**
 * @author:zqy
 * @date:2021/10/26 12:09
 * @desc:
 */
public class PayFactory {

    public static void main(String[] args) {
        User testUser = new User("A", 500, 300);
        PublicInterface publicInterface = null;

        switch (testUser.getVipLevel()){
            case "A":
                publicInterface = new Discount();
                break;
            case "B":
                publicInterface = new FullReduction();
                break;
            default:
                publicInterface = new NormalCheckOut();
        }

        int pay = publicInterface.pay(testUser.getConsumption(), testUser.getVipNumbers());
        System.out.println(pay);
    }
}
