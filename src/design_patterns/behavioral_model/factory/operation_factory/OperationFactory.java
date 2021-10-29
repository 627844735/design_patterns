package design_patterns.behavioral_model.factory.operation_factory;/**
 * Created by Enzo Cotter on 2021/10/29.
 */

/**
 * @author:zqy
 * @date:2021/10/29 17:58
 * @desc:
 */
public class OperationFactory {

    //返回操作类[加法、减法]
    public static Operation getOperationType(String operator){
        Operation operation = null;

        switch (operator){
            case "+":
                return operation = new OperationAdd();
            case "-":
                return operation =  new OperationSub();
            default:
                operation = null;
        }

        return operation;
    }

    public static void main(String[] args) {
        double numberOne = 6.0;
        double numberTwo = 3.0;
        String operator = "+";

        Operation operationType = OperationFactory.getOperationType(operator);  //根据 operator 来选择具体实例化哪个类.

        //强行转换类型  --> 这里可能出现 类型转换异常[ClassCastException]
        if(operationType instanceof OperationAdd){
            operationType = (OperationAdd) operationType;
        }else{
            operationType = (OperationSub) operationType;
        }

        operationType.setNumberOne(numberOne);      //设置操作数1的值.
        operationType.setNumberTwo(numberTwo);      //设置操作数2的值.
        System.out.println(((PublicInterface) operationType).getResult());      //返回计算结果;
    }
}
