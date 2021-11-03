package design_patterns.structural_model.bridge;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

import org.w3c.dom.css.CSSImportRule;

/**
 * @author:zqy
 * @date:2021/11/3 10:48
 * @desc:
 */
public class Circle extends Sharp {

    private double radius;

    public Circle(double radius, DrawAPI drawAPI){
        super(drawAPI);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        getDrawAPI().draw(radius,0,0);
    }
}
