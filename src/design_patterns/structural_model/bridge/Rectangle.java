package design_patterns.structural_model.bridge;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 10:52
 * @desc:
 */
public class Rectangle extends Sharp {

    private int x;
    private int y;

    public Rectangle(int x, int y, DrawAPI drawAPI){
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        this.getDrawAPI().draw(0,x,y);
    }
}
