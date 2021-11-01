package design_patterns.behavioral_model.singleton.hungry;/**
 * Created by Enzo Cotter on 2021/11/1.
 */

/**
 * @author:zqy
 * @date:2021/11/1 10:53
 * @desc:
 */
//饿汉式单例
public class Singleton {

    private final static Singleton INSTANCE = new Singleton();

    //封死默认构造函数
    private Singleton(){}

    private static Singleton getInstance(){
        return INSTANCE;
    }

}
