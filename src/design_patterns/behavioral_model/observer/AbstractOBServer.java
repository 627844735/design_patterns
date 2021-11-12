package design_patterns.behavioral_model.observer;/**
 * Created by Enzo Cotter on 2021/11/10.
 */

import java.util.List;

/**
 * @author:zqy
 * @date:2021/11/10 10:25
 * @desc:
 */
//抽象观察者.
public abstract class AbstractOBServer {

    //观察者的所关注的主题列表.
    private AbstractSubject subject;

    private AbstractOBServer(){}

    public AbstractOBServer(AbstractSubject subject){
        this.subject = subject;
    }

    public AbstractSubject getSubject() {
        return subject;
    }

    public void setSubject(AbstractSubject subject) {
        this.subject = subject;
    }

    //主题有变化之后所需要执行的方法.
    public abstract boolean update();
}
