package org.mozilla.javascript.tools;

import java.io.PrintStream;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.EvaluatorException;
import org.mozilla.javascript.JavaScriptException;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.SecurityUtilities;
import org.mozilla.javascript.WrappedException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ToolErrorReporter implements ErrorReporter {
    private static final String messagePrefix = "js: ";
    private PrintStream err;
    private boolean hasReportedErrorFlag;
    private boolean reportWarnings;

    public ToolErrorReporter(boolean z11) {
        this(z11, System.err);
    }

    private String buildIndicator(int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < i11 - 1; i12++) {
            stringBuffer.append(".");
        }
        stringBuffer.append("^");
        return stringBuffer.toString();
    }

    private static String getExceptionMessage(RhinoException rhinoException) {
        return rhinoException instanceof JavaScriptException ? getMessage("msg.uncaughtJSException", rhinoException.details()) : rhinoException instanceof EcmaError ? getMessage("msg.uncaughtEcmaError", rhinoException.details()) : rhinoException instanceof EvaluatorException ? rhinoException.details() : rhinoException.toString();
    }

    public static String getMessage(String str) {
        return getMessage(str, (Object[]) null);
    }

    private void reportErrorMessage(String str, String str2, int i11, String str3, int i12, boolean z11) {
        String message;
        if (i11 > 0) {
            String valueOf = String.valueOf(i11);
            message = str2 != null ? getMessage("msg.format3", new Object[]{str2, valueOf, str}) : getMessage("msg.format2", new Object[]{valueOf, str});
        } else {
            message = getMessage("msg.format1", new Object[]{str});
        }
        if (z11) {
            message = getMessage("msg.warning", message);
        }
        this.err.println(messagePrefix + message);
        if (str3 != null) {
            this.err.println(messagePrefix + str3);
            this.err.println(messagePrefix + buildIndicator(i12));
        }
    }

    public static void reportException(ErrorReporter errorReporter, RhinoException rhinoException) {
        if (errorReporter instanceof ToolErrorReporter) {
            ((ToolErrorReporter) errorReporter).reportException(rhinoException);
        } else {
            errorReporter.error(getExceptionMessage(rhinoException), rhinoException.sourceName(), rhinoException.lineNumber(), rhinoException.lineSource(), rhinoException.columnNumber());
        }
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public void error(String str, String str2, int i11, String str3, int i12) {
        this.hasReportedErrorFlag = true;
        reportErrorMessage(str, str2, i11, str3, i12, false);
    }

    public boolean hasReportedError() {
        return this.hasReportedErrorFlag;
    }

    public boolean isReportingWarnings() {
        return this.reportWarnings;
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public EvaluatorException runtimeError(String str, String str2, int i11, String str3, int i12) {
        return new EvaluatorException(str, str2, i11, str3, i12);
    }

    public void setIsReportingWarnings(boolean z11) {
        this.reportWarnings = z11;
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public void warning(String str, String str2, int i11, String str3, int i12) {
        if (this.reportWarnings) {
            reportErrorMessage(str, str2, i11, str3, i12, true);
        }
    }

    public ToolErrorReporter(boolean z11, PrintStream printStream) {
        this.reportWarnings = z11;
        this.err = printStream;
    }

    public static String getMessage(String str, String str2) {
        return getMessage(str, new Object[]{str2});
    }

    public static String getMessage(String str, Object obj, Object obj2) {
        return getMessage(str, new Object[]{obj, obj2});
    }

    public void reportException(RhinoException rhinoException) {
        if (rhinoException instanceof WrappedException) {
            ((WrappedException) rhinoException).printStackTrace(this.err);
            return;
        }
        reportErrorMessage(getExceptionMessage(rhinoException) + SecurityUtilities.getSystemProperty("line.separator") + rhinoException.getScriptStackTrace(), rhinoException.sourceName(), rhinoException.lineNumber(), rhinoException.lineSource(), rhinoException.columnNumber(), false);
    }

    public static String getMessage(String str, Object[] objArr) {
        Context currentContext = Context.getCurrentContext();
        try {
            String string = ResourceBundle.getBundle("org.mozilla.javascript.tools.resources.Messages", currentContext == null ? Locale.getDefault() : currentContext.getLocale()).getString(str);
            return objArr == null ? string : new MessageFormat(string).format(objArr);
        } catch (MissingResourceException unused) {
            throw new RuntimeException("no message resource found for message property " + str);
        }
    }
}
