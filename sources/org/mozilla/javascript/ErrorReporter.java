package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface ErrorReporter {
    void error(String str, String str2, int i11, String str3, int i12);

    EvaluatorException runtimeError(String str, String str2, int i11, String str3, int i12);

    void warning(String str, String str2, int i11, String str3, int i12);
}
