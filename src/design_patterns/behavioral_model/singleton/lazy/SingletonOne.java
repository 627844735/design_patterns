package design_patterns.behavioral_model.singleton.lazy;/**
 * Created by Enzo Cotter on 2021/11/1.
 */

/**
 * @author:zqy
 * @date:2021/11/1 10:59
 * @desc:
 */
//默认懒汉式单例.
public class SingletonOne {

    //volatile必要,如果多线程同时执行getInstace()方法,需要同步.
    private static volatile SingletonOne INSTANCE = null;

    private SingletonOne(){}

    //这段代码有线程安全问题.
    public static SingletonOne getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonOne();
        }

        return INSTANCE;
    }
}
