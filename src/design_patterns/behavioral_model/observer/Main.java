package design_patterns.behavioral_model.observer;/**
 * Created by Enzo Cotter on 2021/11/10.
 */

/**
 * @author:zqy
 * @date:2021/11/10 11:20
 * @desc:
 */
public class Main {

    public static void main(String[] args) {
        //创建主题.
        AbstractSubject subject = Subject.getInstance();

        //注册观察者.
        subject.registerOBServer("sendmail",new SendMailOBServer(subject));
        subject.registerOBServer("logisticscenter",new LogisticsCenterOBServer(subject));

        subject = (Subject) subject;
        ((Subject) subject).setState(1);
    }
}
