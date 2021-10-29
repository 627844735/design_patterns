package design_patterns.behavioral_model.factory.operation_factory;/**
 * Created by Enzo Cotter on 2021/10/29.
 */

import design_patterns.behavioral_model.factory.operation_factory.Operation;

/**
 * @author:zqy
 * @date:2021/10/29 17:47
 * @desc:
 */
//加法
public class OperationAdd extends Operation implements PublicInterface {

    public OperationAdd(){ super();}

    @Override
    public Double getResult(){
        return (double) super.getNumberOne() + super.getNumberTwo();
    }
}
