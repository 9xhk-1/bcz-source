package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class NativeCall extends IdScriptableObject {
    private static final Object CALL_TAG = "Call";
    private static final int Id_constructor = 1;
    private static final int MAX_PROTOTYPE_ID = 1;
    static final long serialVersionUID = -7471457301304454454L;
    NativeFunction function;
    Object[] originalArgs;
    transient NativeCall parentActivationCall;

    public NativeCall() {
    }

    public static void init(Scriptable scriptable, boolean z11) {
        new NativeCall().exportAsJSClass(1, scriptable, z11);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(CALL_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId != 1) {
            throw new IllegalArgumentException(String.valueOf(methodId));
        }
        if (scriptable2 != null) {
            throw Context.reportRuntimeError1("msg.only.from.new", "Call");
        }
        ScriptRuntime.checkDeprecated(context, "Call");
        NativeCall nativeCall = new NativeCall();
        nativeCall.setPrototype(ScriptableObject.getObjectPrototype(scriptable));
        return nativeCall;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        return str.equals("constructor") ? 1 : 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Call";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        if (i11 != 1) {
            throw new IllegalArgumentException(String.valueOf(i11));
        }
        initPrototypeMethod(CALL_TAG, i11, "constructor", 1);
    }

    public NativeCall(NativeFunction nativeFunction, Scriptable scriptable, Object[] objArr) {
        this.function = nativeFunction;
        setParentScope(scriptable);
        this.originalArgs = objArr == null ? ScriptRuntime.emptyArgs : objArr;
        int paramAndVarCount = nativeFunction.getParamAndVarCount();
        int paramCount = nativeFunction.getParamCount();
        if (paramAndVarCount != 0) {
            int i11 = 0;
            while (i11 < paramCount) {
                defineProperty(nativeFunction.getParamOrVarName(i11), i11 < objArr.length ? objArr[i11] : Undefined.instance, 4);
                i11++;
            }
        }
        if (!super.has("arguments", this)) {
            defineProperty("arguments", new Arguments(this), 4);
        }
        if (paramAndVarCount != 0) {
            while (paramCount < paramAndVarCount) {
                String paramOrVarName = nativeFunction.getParamOrVarName(paramCount);
                if (!super.has(paramOrVarName, this)) {
                    if (nativeFunction.getParamOrVarConst(paramCount)) {
                        defineProperty(paramOrVarName, Undefined.instance, 13);
                    } else {
                        defineProperty(paramOrVarName, Undefined.instance, 4);
                    }
                }
                paramCount++;
            }
        }
    }
}
