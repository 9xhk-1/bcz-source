package org.mozilla.javascript.debug;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface DebuggableScript {
    DebuggableScript getFunction(int i11);

    int getFunctionCount();

    String getFunctionName();

    int[] getLineNumbers();

    int getParamAndVarCount();

    int getParamCount();

    String getParamOrVarName(int i11);

    DebuggableScript getParent();

    String getSourceName();

    boolean isFunction();

    boolean isGeneratedScript();

    boolean isTopLevel();
}
