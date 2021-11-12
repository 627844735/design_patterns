package design_patterns.behavioral_model.observer;/**
 * Created by Enzo Cotter on 2021/11/10.
 */

/**
 * @author:zqy
 * @date:2021/11/10 11:13
 * @desc:
 */
//发送邮件
public class SendMailOBServer extends AbstractOBServer {

    public SendMailOBServer(AbstractSubject subject){
        super(subject);
    }

    //
    @Override
    public boolean update() {
        System.out.println("已通知邮件中心发送邮件");
        return true;
    }
}
