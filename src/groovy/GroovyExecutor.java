package groovy;

import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.ui.EditorTextField;
import groovy.lang.Binding;
import groovy.lang.GroovyShell;
import utils.Localizer;
import utils.TemplateValidator;

/**
 * Created by CeH9 on 19.07.2016.
 */
public class GroovyExecutor {

    private static GroovyShell shell;

    public static GroovyShell getShell() {
        if (shell == null) {
            shell = new GroovyShell(new Binding());
        }
        return shell;
    }

    private static final String GROOVY_CODE_PATTERN = "%s\n return getModifiedName(\"%s\");";

    public static String runGroovy(String code, String variable) {
        try {
            return ((String) getShell().evaluate(String.format(GROOVY_CODE_PATTERN, code, variable)));
        } catch (Exception e) {
            return Localizer.get("GroovyScriptError");
        }
    }

    public static ValidationInfo ValidateGroovyCode(EditorTextField etfCode, String variable) {
        try {
            return TemplateValidator.validateText(
                    etfCode,
                    (String) getShell().evaluate(String.format(GROOVY_CODE_PATTERN, etfCode.getText(), variable)),
                    TemplateValidator.FieldType.CLASS_NAME
            );
        } catch (Exception e) {
            return new ValidationInfo(e.getMessage());
        }
    }

}
