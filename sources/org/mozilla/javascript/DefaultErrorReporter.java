package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class DefaultErrorReporter implements ErrorReporter {
    static final DefaultErrorReporter instance = new DefaultErrorReporter();
    private ErrorReporter chainedReporter;
    private boolean forEval;

    private DefaultErrorReporter() {
    }

    public static ErrorReporter forEval(ErrorReporter errorReporter) {
        DefaultErrorReporter defaultErrorReporter = new DefaultErrorReporter();
        defaultErrorReporter.forEval = true;
        defaultErrorReporter.chainedReporter = errorReporter;
        return defaultErrorReporter;
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public void error(String str, String str2, int i11, String str3, int i12) {
        String str4;
        if (this.forEval) {
            if (str.startsWith("TypeError: ")) {
                str = str.substring(11);
                str4 = "TypeError";
            } else {
                str4 = "SyntaxError";
            }
            throw ScriptRuntime.constructError(str4, str, str2, i11, str3, i12);
        }
        ErrorReporter errorReporter = this.chainedReporter;
        if (errorReporter == null) {
            throw runtimeError(str, str2, i11, str3, i12);
        }
        errorReporter.error(str, str2, i11, str3, i12);
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public EvaluatorException runtimeError(String str, String str2, int i11, String str3, int i12) {
        ErrorReporter errorReporter = this.chainedReporter;
        return errorReporter != null ? errorReporter.runtimeError(str, str2, i11, str3, i12) : new EvaluatorException(str, str2, i11, str3, i12);
    }

    @Override // org.mozilla.javascript.ErrorReporter
    public void warning(String str, String str2, int i11, String str3, int i12) {
        ErrorReporter errorReporter = this.chainedReporter;
        if (errorReporter != null) {
            errorReporter.warning(str, str2, i11, str3, i12);
        }
    }
}
