package design_patterns.structural_model.adapter.default_adapter;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

import java.io.File;

/**
 * @author:zqy
 * @date:2021/11/2 15:17
 * @desc:
 */
public class FileMonitor extends FileAlterationListenerAdapter {


    @Override
    public void onFileCreate(File file) {
        System.out.println("doSomething...");
    }

    @Override
    public void onFileDelete(File file) {
        System.out.println("doSomething...");
    }
}
