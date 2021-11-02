package design_patterns.structural_model.proxy;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 11:20
 * @desc:
 */
//建造者模式
public class ChickenFood extends Food {

    private Integer chicken;

    private ChickenFood(){}

    private ChickenFood(Integer salt, Integer spicy, Integer chicken){
        super();
        this.setSalt(salt);
        this.setSpicy(spicy);
        this.chicken = chicken;
    }

    public static ChickenFoodBuilder builder(){
        return new ChickenFoodBuilder();
    }


    public static class ChickenFoodBuilder{
        private Integer chicken;
        private Integer salt;
        private Integer spicy;

        public Integer getSalt() {
            return salt;
        }

        public ChickenFoodBuilder setSalt(Integer salt) {
            this.salt = salt;
            return this;
        }

        public Integer getSpicy() {
            return spicy;
        }

        public ChickenFoodBuilder setSpicy(Integer spicy) {
            this.spicy = spicy;
            return this;
        }

        private ChickenFoodBuilder(){}

        public Integer getChicken() {
            return chicken;
        }

        public ChickenFoodBuilder setChicken(Integer chicken) {
            this.chicken = chicken;
            return this;
        }

        public ChickenFood build(){
            return new ChickenFood(getSalt(),getSpicy(),getChicken());
        }
    }
}
