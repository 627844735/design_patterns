package design_patterns.creation_model.factory.operation_factory;/**
 * Created by Enzo Cotter on 2021/10/29.
 */

/**
 * @author:zqy
 * @date:2021/10/29 17:43
 * @desc:
 */
public  class Operation {

    private Double numberOne;       //操作数1

    private Double numberTwo;       //操作数2

    private String operator;        //操作符


    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
