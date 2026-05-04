package org.mozilla.javascript;

import java.util.List;
import org.mozilla.javascript.ast.ScriptNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface Evaluator {
    void captureStackInfo(RhinoException rhinoException);

    Object compile(CompilerEnvirons compilerEnvirons, ScriptNode scriptNode, String str, boolean z11);

    Function createFunctionObject(Context context, Scriptable scriptable, Object obj, Object obj2);

    Script createScriptObject(Object obj, Object obj2);

    String getPatchedStack(RhinoException rhinoException, String str);

    List<String> getScriptStack(RhinoException rhinoException);

    String getSourcePositionFromStack(Context context, int[] iArr);

    void setEvalScriptFlag(Script script);
}
