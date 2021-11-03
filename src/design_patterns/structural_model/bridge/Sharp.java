package design_patterns.structural_model.bridge;/**
 * Created by Enzo Cotter on 2021/11/3.
 */

/**
 * @author:zqy
 * @date:2021/11/3 10:43
 * @desc:
 */
public abstract class Sharp {

    private DrawAPI drawAPI;

    protected Sharp(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public DrawAPI getDrawAPI() {
        return drawAPI;
    }

    public void setDrawAPI(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
