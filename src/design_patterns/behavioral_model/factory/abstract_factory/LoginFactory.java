package design_patterns.behavioral_model.factory.abstract_factory;/**
 * Created by Enzo Cotter on 2021/11/1.
 */

/**
 * @author:zqy
 * @date:2021/11/1 9:58
 * @desc:
 */
public class LoginFactory {

    public static PublicInterface getResult(String loginName){
        PublicInterface publicInterface = null;

        switch(loginName){
            case "QQ":
                publicInterface = new QQLogin();
                break;
            case "WeChat":
                publicInterface = new WeChatLogin();
                break;
            default:
                publicInterface = null;
        }

        return publicInterface;
    }


}
