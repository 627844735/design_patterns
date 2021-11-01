package design_patterns.behavioral_model.singleton.lazy;/**
 * Created by Enzo Cotter on 2021/11/1.
 */

/**
 * @author:zqy
 * @date:2021/11/1 11:59
 * @desc:
 */
//双重检索懒汉式单例模式.
public class SingletonTwo {

    //volatile 字段 用于线程访问互通.
    private static volatile SingletonTwo INSTANCE = null;

    private SingletonTwo(){}

    //也可以将整个方法锁住,不过性能会下降.
    private static SingletonTwo getInstance(){
        if(INSTANCE == null){

            synchronized (SingletonTwo.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonTwo();
                }
            }
        }

        return INSTANCE;
    }
}
