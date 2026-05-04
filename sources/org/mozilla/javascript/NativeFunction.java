package org.mozilla.javascript;

import org.mozilla.javascript.debug.DebuggableScript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class NativeFunction extends BaseFunction {
    static final long serialVersionUID = 8713897114082216401L;

    @Override // org.mozilla.javascript.BaseFunction
    public final String decompile(int i11, int i12) {
        String encodedSource = getEncodedSource();
        if (encodedSource == null) {
            return super.decompile(i11, i12);
        }
        UintMap uintMap = new UintMap(1);
        uintMap.put(1, i11);
        return Decompiler.decompile(encodedSource, i12, uintMap);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getArity() {
        return getParamCount();
    }

    public DebuggableScript getDebuggableView() {
        return null;
    }

    public String getEncodedSource() {
        return null;
    }

    public abstract int getLanguageVersion();

    @Override // org.mozilla.javascript.BaseFunction
    public int getLength() {
        NativeCall findFunctionActivation;
        return (getLanguageVersion() == 120 && (findFunctionActivation = ScriptRuntime.findFunctionActivation(Context.getContext(), this)) != null) ? findFunctionActivation.originalArgs.length : getParamCount();
    }

    public abstract int getParamAndVarCount();

    public abstract int getParamCount();

    public boolean getParamOrVarConst(int i11) {
        return false;
    }

    public abstract String getParamOrVarName(int i11);

    public final void initScriptFunction(Context context, Scriptable scriptable) {
        ScriptRuntime.setFunctionProtoAndParent(this, scriptable);
    }

    public String jsGet_name() {
        return getFunctionName();
    }

    public Object resumeGenerator(Context context, Scriptable scriptable, int i11, Object obj, Object obj2) {
        throw new EvaluatorException("resumeGenerator() not implemented");
    }
}
