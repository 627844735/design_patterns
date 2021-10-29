package design_patterns.behavioral_model.factory.operation_factory;/**
 * Created by Enzo Cotter on 2021/10/29.
 */

/**
 * @author:zqy
 * @date:2021/10/29 17:47
 * @desc:
 */
//加法
public class OperationSub extends Operation implements PublicInterface {

    public OperationSub(){ super();}

    @Override
    public Double getResult(){
        return (double) super.getNumberOne() - super.getNumberTwo();
    }
}
