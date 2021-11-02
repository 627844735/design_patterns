package design_patterns.creation_model.singleton.lazy;/**
 * Created by Enzo Cotter on 2021/11/1.
 */

/**
 * @author:zqy
 * @date:2021/11/1 12:04
 * @desc:
 */
//嵌入类懒汉式单例模式
public class SingletonThree {

    //锁死默认构造函数.
    private SingletonThree(){}

    //嵌入类来创建外层类.
    private static class Holder{
        private static SingletonThree INSTANCE = new SingletonThree();
    }

    private static SingletonThree getInstance(){
        return Holder.INSTANCE;
    }
}
