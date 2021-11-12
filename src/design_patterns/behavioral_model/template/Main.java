package design_patterns.behavioral_model.template;/**
 * Created by Enzo Cotter on 2021/11/10.
 */

/**
 * @author:zqy
 * @date:2021/11/10 15:34
 * @desc:
 */
public class Main {

    public static void main(String[] args) {
        AbstractTemplate template = new TemplateSubject();
        template.templateMethod();
    }
}
