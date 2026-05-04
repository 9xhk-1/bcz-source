package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class NativeScript extends BaseFunction {
    private static final int Id_compile = 3;
    private static final int Id_constructor = 1;
    private static final int Id_exec = 4;
    private static final int Id_toString = 2;
    private static final int MAX_PROTOTYPE_ID = 4;
    private static final Object SCRIPT_TAG = "Script";
    static final long serialVersionUID = -6795101161980121700L;
    private Script script;

    private NativeScript(Script script) {
        this.script = script;
    }

    private static Script compile(Context context, String str) {
        int[] iArr = {0};
        String sourcePositionFromStack = Context.getSourcePositionFromStack(iArr);
        if (sourcePositionFromStack == null) {
            iArr[0] = 1;
            sourcePositionFromStack = "<Script object>";
        }
        return context.compileString(str, null, DefaultErrorReporter.forEval(context.getErrorReporter()), sourcePositionFromStack, iArr[0], null);
    }

    public static void init(Scriptable scriptable, boolean z11) {
        new NativeScript(null).exportAsJSClass(4, scriptable, z11);
    }

    private static NativeScript realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        if (scriptable instanceof NativeScript) {
            return (NativeScript) scriptable;
        }
        throw IdScriptableObject.incompatibleCallError(idFunctionObject);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Script script = this.script;
        return script != null ? script.exec(context, scriptable) : Undefined.instance;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        throw Context.reportRuntimeError0("msg.script.is.not.constructor");
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String decompile(int i11, int i12) {
        Object obj = this.script;
        return obj instanceof NativeFunction ? ((NativeFunction) obj).decompile(i11, i12) : super.decompile(i11, i12);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(SCRIPT_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            NativeScript nativeScript = new NativeScript(compile(context, objArr.length != 0 ? ScriptRuntime.toString(objArr[0]) : ""));
            ScriptRuntime.setObjectProtoAndParent(nativeScript, scriptable);
            return nativeScript;
        }
        if (methodId == 2) {
            Script script = realThis(scriptable2, idFunctionObject).script;
            return script == null ? "" : context.decompileScript(script, 0);
        }
        if (methodId != 3) {
            if (methodId != 4) {
                throw new IllegalArgumentException(String.valueOf(methodId));
            }
            throw Context.reportRuntimeError1("msg.cant.call.indirect", "exec");
        }
        NativeScript realThis = realThis(scriptable2, idFunctionObject);
        realThis.script = compile(context, ScriptRuntime.toString(objArr, 0));
        return realThis;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int length = str.length();
        int i11 = 4;
        if (length == 4) {
            str2 = "exec";
        } else if (length == 11) {
            str2 = "constructor";
            i11 = 1;
        } else if (length == 7) {
            str2 = "compile";
            i11 = 3;
        } else if (length != 8) {
            str2 = null;
            i11 = 0;
        } else {
            str2 = "toString";
            i11 = 2;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getArity() {
        return 0;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Script";
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getLength() {
        return 0;
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        int i12;
        String str2;
        if (i11 != 1) {
            i12 = 0;
            if (i11 == 2) {
                str2 = "toString";
            } else if (i11 == 3) {
                str = "compile";
            } else {
                if (i11 != 4) {
                    throw new IllegalArgumentException(String.valueOf(i11));
                }
                str2 = "exec";
            }
            initPrototypeMethod(SCRIPT_TAG, i11, str2, i12);
        }
        str = "constructor";
        i12 = 1;
        str2 = str;
        initPrototypeMethod(SCRIPT_TAG, i11, str2, i12);
    }
}
