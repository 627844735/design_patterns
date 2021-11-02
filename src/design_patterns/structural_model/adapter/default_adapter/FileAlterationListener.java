package design_patterns.structural_model.adapter.default_adapter;/**
 * Created by Enzo Cotter on 2021/11/2.
 */

import java.io.File;

/**
 * @author:zqy
 * @date:2021/11/2 15:15
 * @desc:
 */
public interface FileAlterationListener {
    void onStart();
    void onDirectoryCreate(final File directory);
    void onDirectoryChange(final File directory);
    void onDirectoryDelete(final File directory);
    void onFileCreate(final File file);
    void onFileChange(final File file);
    void onFileDelete(final File file);
    void onStop();
}
