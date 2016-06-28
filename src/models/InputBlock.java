package models;

import com.intellij.ide.fileTemplates.ui.CreateFromTemplatePanel;
import com.intellij.openapi.project.Project;
import com.intellij.ui.EditorTextField;
import utils.UIMaker;

/**
 * Created by Arsen on 15.06.2016.
 */

public class InputBlock {

    private EditorTextField tfName;
    private CreateFromTemplatePanel panelVariables;

    private TemplateElement element;
    private boolean isGlobalVariable = false;
    private String globalKey;
    private String globalValue;

    public InputBlock(TemplateElement element, String[] unsetAttributes, Project project) {
        this.element = element;
        this.tfName = UIMaker.getEditorTextField(element.getName(), project);
        //optionally add TextFields for Attributes
        if (unsetAttributes != null && unsetAttributes.length > 0){
            panelVariables = new CreateFromTemplatePanel(unsetAttributes, false, null);
        }
    }

    public String getGlobalValue() {
        return globalValue;
    }

    public void setGlobalValue(String globalValue) {
        this.globalValue = globalValue;
    }

    public String getGlobalKey() {
        return globalKey;
    }

    public void setGlobalKey(String globalKey) {
        this.globalKey = globalKey;
    }

    public boolean isGlobalVariable() {
        return isGlobalVariable;
    }

    public void setGlobalVariable(boolean globalVariable) {
        isGlobalVariable = globalVariable;
    }

    public TemplateElement getElement() {
        return element;
    }

    public void setElement(TemplateElement element) {
        this.element = element;
    }

    public EditorTextField getTfName() {
        return tfName;
    }

    public void setTfName(EditorTextField tfName) {
        this.tfName = tfName;
    }

    public CreateFromTemplatePanel getPanelVariables() {
        return panelVariables;
    }
}
