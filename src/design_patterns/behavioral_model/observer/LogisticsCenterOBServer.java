package design_patterns.behavioral_model.observer;/**
 * Created by Enzo Cotter on 2021/11/10.
 */

/**
 * @author:zqy
 * @date:2021/11/10 11:19
 * @desc:
 */
public class LogisticsCenterOBServer extends AbstractOBServer {

    public LogisticsCenterOBServer(AbstractSubject subject){
        super(subject);
    }

    @Override
    public boolean update() {
        System.out.println("已通知物流中心发货");
        return true;
    }
}
