package design_patterns.structural_model.adapter.default_adapter;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

import java.io.File;

/**
 * @author:zqy
 * @date:2021/11/2 15:16
 * @desc:
 */
public class FileAlterationListenerAdapter implements FileAlterationListener {
    @Override
    public void onStart() {

    }

    @Override
    public void onDirectoryCreate(File directory) {

    }

    @Override
    public void onDirectoryChange(File directory) {

    }

    @Override
    public void onDirectoryDelete(File directory) {

    }

    @Override
    public void onFileCreate(File file) {

    }

    @Override
    public void onFileChange(File file) {

    }

    @Override
    public void onFileDelete(File file) {

    }

    @Override
    public void onStop() {

    }
}
