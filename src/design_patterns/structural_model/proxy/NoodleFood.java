package design_patterns.structural_model.proxy;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 11:38
 * @desc:
 */
//双重检索单例.
public class NoodleFood extends Food {

    private static volatile NoodleFood INSTANCE = null;

    private Integer flour;

    private NoodleFood(){}

    public static NoodleFood getInstance(){
        if(INSTANCE == null){

            synchronized (NoodleFood.class){
                if(INSTANCE == null){
                    INSTANCE = new NoodleFood();
                }
            }
        }

        return INSTANCE;
    }
}
