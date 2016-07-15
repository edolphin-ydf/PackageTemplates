package custom.dialogs;

import com.intellij.openapi.project.Project;
import com.intellij.util.ui.GridBag;
import models.PackageTemplate;
import wrappers.PackageTemplateWrapper;
import utils.GridBagFactory;
import utils.WrappersFactory;

import java.awt.*;

/**
 * Created by CeH9 on 22.06.2016.
 */

public abstract class ConfigurePackageTemplatesDialog extends BaseDialog {

    private PackageTemplateWrapper ptWrapper;

    public abstract void onSuccess(PackageTemplate packageTemplate);

    public abstract void onFail();

    public ConfigurePackageTemplatesDialog(Project project) {
        super(project);
        ptWrapper = WrappersFactory.createAndWrapPackageTemplate(project, PackageTemplateWrapper.ViewMode.CREATE);
    }

    public ConfigurePackageTemplatesDialog(Project project, PackageTemplate packageTemplate) {
        super(project);
        ptWrapper = WrappersFactory.wrapPackageTemplate(project, packageTemplate, PackageTemplateWrapper.ViewMode.EDIT);
    }

    @Override
    void preShow() {
        switch (ptWrapper.getMode()){
            case CREATE: setTitle("New Package Template"); break;
            case EDIT: setTitle("Edit Package Template"); break;
        }

        panel.setLayout(new GridBagLayout());
        GridBag gridBag = GridBagFactory.getBagForConfigureDialog();

        panel.add(ptWrapper.buildView(), gridBag.nextLine().next());
    }

    @Override
    void onOKAction() {
        ptWrapper.collectDataFromFields();
        onSuccess(ptWrapper.getPackageTemplate());
    }

    @Override
    void onCancelAction() {
        onFail();
    }
}
