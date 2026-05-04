package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ParseProblem {
    private int length;
    private String message;
    private int offset;
    private String sourceName;
    private Type type;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        Error,
        Warning
    }

    public ParseProblem(Type type, String str, String str2, int i11, int i12) {
        setType(type);
        setMessage(str);
        setSourceName(str2);
        setFileOffset(i11);
        setLength(i12);
    }

    public int getFileOffset() {
        return this.offset;
    }

    public int getLength() {
        return this.length;
    }

    public String getMessage() {
        return this.message;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public Type getType() {
        return this.type;
    }

    public void setFileOffset(int i11) {
        this.offset = i11;
    }

    public void setLength(int i11) {
        this.length = i11;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setSourceName(String str) {
        this.sourceName = str;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append(this.sourceName);
        sb2.append(":");
        sb2.append("offset=");
        sb2.append(this.offset);
        sb2.append(",");
        sb2.append("length=");
        sb2.append(this.length);
        sb2.append(",");
        sb2.append(this.type == Type.Error ? "error: " : "warning: ");
        sb2.append(this.message);
        return sb2.toString();
    }
}
