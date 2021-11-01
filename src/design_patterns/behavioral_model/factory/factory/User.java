package design_patterns.behavioral_model.factory.factory;/**
 * Created by Enzo Cotter on 2021/10/26.
 */

/**
 * @author:zqy
 * @date:2021/10/26 15:15
 * @desc:
 */
//用户信息
public class User {

    private String vipLevel;

    private Integer vipNumbers;

    private Integer consumption;

    public User() {}

    public User(String vipLevel, Integer vipNumbers, Integer consumption) {
        this.vipLevel = vipLevel;
        this.vipNumbers = vipNumbers;
        this.consumption = consumption;
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel;
    }

    public Integer getVipNumbers() {
        return vipNumbers;
    }

    public void setVipNumbers(Integer vipNumbers) {
        this.vipNumbers = vipNumbers;
    }

    public Integer getConsumption() {
        return consumption;
    }

    public void setConsumption(Integer consumption) {
        this.consumption = consumption;
    }

}
