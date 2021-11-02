package design_patterns.creation_model.builder;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

/**
 * @author:zqy
 * @date:2021/11/2 9:49
 * @desc:
 */
public class Account {

    private String accountId;
    private String password;

    private Account(){}

    private Account(String accountId, String password){
        this.accountId = accountId;
        this.password = password;
    }

    //builder(); 返回一个内部builder类.
    public static AccountBuilder builder(){
        return new AccountBuilder();
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId='" + accountId + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    private static class AccountBuilder{
        private String accountId;
        private String password;

        private AccountBuilder(){}

        public String getAccountId() {
            return accountId;
        }

        public AccountBuilder setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public String getPassword() {
            return password;
        }

        public AccountBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Account build(){
            //可以在此验证参数.
            return new Account(accountId,password);
        }
    }

    public static void main(String[] args) {
        System.out.println(Account.builder()
                .setPassword("abc")
                .setAccountId("zhaoqiyi")
                .build());


    }
}
