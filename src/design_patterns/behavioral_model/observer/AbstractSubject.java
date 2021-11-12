package design_patterns.behavioral_model.observer;/**
 * Created by Enzo Cotter on 2021/11/10.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author:zqy
 * @date:2021/11/10 10:34
 * @desc:
 */
//抽象主题
public abstract class AbstractSubject {

    public static Map<String,AbstractOBServer> OBSERVER_LIST = null;

    static{
        OBSERVER_LIST = new HashMap<>();
    }

    //注册观察者接口.[不可重写.]
    protected final boolean registerOBServer(String OBServerName, AbstractOBServer abstractOBServer){
        if(Objects.isNull(OBServerName))
            return false;

        OBSERVER_LIST.put(OBServerName.toUpperCase(),abstractOBServer);
        return true;
    }

    //单独通知某个观察者接口.
    protected final boolean notifyOBServer(String OBServerName){
        if(Objects.isNull(OBServerName) || Objects.isNull(AbstractSubject.OBSERVER_LIST.get(OBServerName)))
            throw new RuntimeException("观察者名称异常");

        AbstractOBServer obServer = AbstractSubject.OBSERVER_LIST.get(OBServerName.toUpperCase());
        if(obServer.update())
            return true;
        return false;
    }

    //可修改为多线程通知.
    protected final boolean notifyAllOBServer(){
        if(AbstractSubject.OBSERVER_LIST.keySet().size() == 0)
            throw new RuntimeException("未注册观察者");

        for (String key : AbstractSubject.OBSERVER_LIST.keySet()) {
            AbstractSubject.OBSERVER_LIST.get(key).update();
        }
        return true;
    }
}
