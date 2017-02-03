package core.actions.custom;

import com.intellij.openapi.project.Project;
import core.actions.custom.base.SimpleAction;
import global.utils.file.FileWriter;

import java.io.File;

/**
 * Created by Arsen on 09.01.2017.
 */
public class DeleteDirectoryAction extends SimpleAction {

    private File fileDirToDelete;

    private String pathToRestore;
    private String contentToRestore;
    private Project project;

    public DeleteDirectoryAction(File fileDirToDelete, Project project) {
        this.fileDirToDelete = fileDirToDelete;
        this.project = project;
    }

    @Override
    public boolean run(SimpleAction parentAction) {
        // save temp data
        pathToRestore = fileDirToDelete.getPath();

        //todo save temp dir include files/subdirs
        if(!FileWriter.removeDirectory(fileDirToDelete)){
            isDone = false;
            return false;
        }

        return super.run(this);
    }


    //=================================================================
    //  Getter | Setter
    //=================================================================
    public File getFileDirToDelete() {
        return fileDirToDelete;
    }

    public String getPathToRestore() {
        return pathToRestore;
    }

    public String getContentToRestore() {
        return contentToRestore;
    }
}
