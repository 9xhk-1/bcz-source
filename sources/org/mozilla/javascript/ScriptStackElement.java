package org.mozilla.javascript;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class ScriptStackElement implements Serializable {
    static final long serialVersionUID = -6416688260860477449L;
    public final String fileName;
    public final String functionName;
    public final int lineNumber;

    public ScriptStackElement(String str, String str2, int i11) {
        this.fileName = str;
        this.functionName = str2;
        this.lineNumber = i11;
    }

    public void renderJavaStyle(StringBuilder sb2) {
        sb2.append("\tat ");
        sb2.append(this.fileName);
        if (this.lineNumber > -1) {
            sb2.append(':');
            sb2.append(this.lineNumber);
        }
        if (this.functionName != null) {
            sb2.append(" (");
            sb2.append(this.functionName);
            sb2.append(')');
        }
    }

    public void renderMozillaStyle(StringBuilder sb2) {
        String str = this.functionName;
        if (str != null) {
            sb2.append(str);
            sb2.append("()");
        }
        sb2.append('@');
        sb2.append(this.fileName);
        if (this.lineNumber > -1) {
            sb2.append(':');
            sb2.append(this.lineNumber);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        renderMozillaStyle(sb2);
        return sb2.toString();
    }
}
