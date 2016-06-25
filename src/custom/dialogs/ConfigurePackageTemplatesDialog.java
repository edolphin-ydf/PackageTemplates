package custom.dialogs;

import com.intellij.ide.fileTemplates.ui.ConfigureTemplatesDialog;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.ui.JBSplitter;
import com.intellij.ui.SeparatorComponent;
import com.intellij.ui.components.JBScrollPane;
import custom.components.TemplateView;
import custom.components.VariableView;
import models.PackageTemplate;
import models.TemplateContainer;
import models.TemplateElement;
import utils.StringTools;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by CeH9 on 22.06.2016.
 */
public abstract class ConfigurePackageTemplatesDialog extends ConfigureTemplatesDialog {

    private TemplateContainer templateContainer;

    public abstract void onSuccess(PackageTemplate packageTemplate);
    public abstract void onCancel();

    public ConfigurePackageTemplatesDialog(AnActionEvent event) {
        super(event.getProject());
    }

    @Override
    public void show() {
        super.show();

        switch (getExitCode()) {
            case NewPackageDialog.OK_EXIT_CODE:
                templateContainer.collectDataFromFields();
                onSuccess(getResultAsPackageTemplate());
                break;
            case NewPackageDialog.CANCEL_EXIT_CODE:
                onCancel();
                break;
        }
    }

    private PackageTemplate getResultAsPackageTemplate() {
        return new PackageTemplate(
                templateContainer.getName(),
                templateContainer.getTemplateView().getTemplateName(),
                templateContainer.getDescription(),
                templateContainer.getTemplateView().toTemplateElement(null)
        );
    }

    @Override
    public JComponent getContentPanel() {
        return super.getContentPanel();
    }

    @Override
    protected JComponent createCenterPanel() {
        initContainer();

        JBSplitter panel = new JBSplitter();

        panel.setFirstComponent(getPackageBuilderComponent());
        super.createCenterPanel();
//        panel.setSecondComponent(super.createCenterPanel());
        return panel;
    }

    private void initContainer() {
        TemplateView main = new TemplateView("IvanClass", null);
        templateContainer = new TemplateContainer("", "", main);

        templateContainer.addVariable(new VariableView(StringTools.PACKAGE_TEMPLATE_NAME, ""));
//        for (int i = 0; i < 5; i++) {
//            templateContainer.addVariable(new VariableView("key_"+i, ""));
//        }

//        main.getListTemplateView().add(new TemplateView("IvanClass", "Prost", "java", main));
    }

    private JComponent getPackageBuilderComponent() {
        JPanel root = new JPanel();
        JBScrollPane scrollPane = new JBScrollPane(root);
        root.setLayout(new BoxLayout(root, BoxLayout.Y_AXIS));
        root.setAlignmentY(JPanel.TOP_ALIGNMENT);

        SeparatorComponent separator = new SeparatorComponent(10);

        root.add(templateContainer.buildView());
        root.add(separator);
//        root.add(Box.createRigidArea(new Dimension(0,10)));
        root.add(templateContainer.getTemplateView().buildView(getProject()));

        root.setBorder(new EmptyBorder(8,8,8,8));
        scrollPane.setMinimumSize(new Dimension(400,300));
        return scrollPane;
    }

}
