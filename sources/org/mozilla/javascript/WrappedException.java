package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class WrappedException extends EvaluatorException {
    static final long serialVersionUID = -1551979216966520648L;
    private Throwable exception;

    public WrappedException(Throwable th2) {
        super("Wrapped " + th2.toString());
        this.exception = th2;
        Kit.initCause(this, th2);
        int[] iArr = {0};
        String sourcePositionFromStack = Context.getSourcePositionFromStack(iArr);
        int i11 = iArr[0];
        if (sourcePositionFromStack != null) {
            initSourceName(sourcePositionFromStack);
        }
        if (i11 != 0) {
            initLineNumber(i11);
        }
    }

    public Throwable getWrappedException() {
        return this.exception;
    }

    public Object unwrap() {
        return getWrappedException();
    }
}
