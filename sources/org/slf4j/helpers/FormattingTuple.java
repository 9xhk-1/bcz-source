package org.slf4j.helpers;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class FormattingTuple {
    public static FormattingTuple NULL = new FormattingTuple(null);
    private final Object[] argArray;
    private final String message;
    private final Throwable throwable;

    public FormattingTuple(String str) {
        this(str, null, null);
    }

    public Object[] getArgArray() {
        return this.argArray;
    }

    public String getMessage() {
        return this.message;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    public FormattingTuple(String str, Object[] objArr, Throwable th2) {
        this.message = str;
        this.throwable = th2;
        this.argArray = objArr;
    }
}
