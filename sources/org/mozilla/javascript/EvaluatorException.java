package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class EvaluatorException extends RhinoException {
    static final long serialVersionUID = -8743165779676009808L;

    public EvaluatorException(String str) {
        super(str);
    }

    public int getColumnNumber() {
        return columnNumber();
    }

    public int getLineNumber() {
        return lineNumber();
    }

    public String getLineSource() {
        return lineSource();
    }

    public String getSourceName() {
        return sourceName();
    }

    public EvaluatorException(String str, String str2, int i11) {
        this(str, str2, i11, null, 0);
    }

    public EvaluatorException(String str, String str2, int i11, String str3, int i12) {
        super(str);
        recordErrorOrigin(str2, i11, str3, i12);
    }
}
