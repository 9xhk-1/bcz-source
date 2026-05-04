package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class EcmaError extends RhinoException {
    static final long serialVersionUID = -6261226256957286699L;
    private String errorMessage;
    private String errorName;

    public EcmaError(String str, String str2, String str3, int i11, String str4, int i12) {
        recordErrorOrigin(str3, i11, str4, i12);
        this.errorName = str;
        this.errorMessage = str2;
    }

    @Override // org.mozilla.javascript.RhinoException
    public String details() {
        return this.errorName + ": " + this.errorMessage;
    }

    public int getColumnNumber() {
        return columnNumber();
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Scriptable getErrorObject() {
        return null;
    }

    public int getLineNumber() {
        return lineNumber();
    }

    public String getLineSource() {
        return lineSource();
    }

    public String getName() {
        return this.errorName;
    }

    public String getSourceName() {
        return sourceName();
    }

    public EcmaError(Scriptable scriptable, String str, int i11, int i12, String str2) {
        this("InternalError", ScriptRuntime.toString(scriptable), str, i11, str2, i12);
    }
}
