package design_patterns.behavioral_model.observer;/**
 * Created by Enzo Cotter on 2021/11/10.
 */

import java.util.Objects;

/**
 * @author:zqy
 * @date:2021/11/10 11:03
 * @desc:
 */
//一个具体的单例主题.
public class Subject extends AbstractSubject {
    public volatile static Subject INSTANCE = null;

    private Integer state;

    private Subject(){}

    public static AbstractSubject getInstance(){
        if(Objects.isNull(INSTANCE)){

            synchronized (Subject.class){
                if(Objects.isNull(INSTANCE)){
                    INSTANCE = new Subject();
                }
            }
        }
        return INSTANCE;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
        //通知观察者.
        notifyAllOBServer();
    }
}
