package design_patterns.behavioral_model.builder;/**
 * Created by Enzo Cotter on 2021/11/1.
 */

/**
 * @author:zqy
 * @date:2021/11/1 18:43
 * @desc:
 */
public class User {

    private String name;
    private String password;
    private String nickname;
    private Integer age;

    private User(){}

    private User(String name, String password, String nickname, Integer age) {
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    private static class UserBuilder{
        private String name;
        private String password;
        private String nickname;
        private Integer age;

        private UserBuilder(){}

        public String getName() {
            return name;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getPassword() {
            return password;

        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public String getNickname() {
            return nickname;
        }

        public UserBuilder setNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Integer getAge() {
            return age;
        }

        public UserBuilder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public User build(){
            //在此验证参数.
            return new User(getName(),getPassword(),getNickname(),getAge());
        }
    }

    public static void main(String[] args) {
        User user = User.builder().setAge(23).setName("赵琦溢").setNickname("左肩上的吻").setPassword("zqy19980301").build();
        System.out.println(user);
    }
}
