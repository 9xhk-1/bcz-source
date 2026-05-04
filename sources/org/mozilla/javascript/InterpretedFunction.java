package org.mozilla.javascript;

import org.mozilla.javascript.debug.DebuggableScript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class InterpretedFunction extends NativeFunction implements Script {
    static final long serialVersionUID = 541475680333911468L;
    InterpreterData idata;
    SecurityController securityController;
    Object securityDomain;

    private InterpretedFunction(InterpreterData interpreterData, Object obj) {
        Object obj2;
        this.idata = interpreterData;
        SecurityController securityController = Context.getContext().getSecurityController();
        if (securityController != null) {
            obj2 = securityController.getDynamicSecurityDomain(obj);
        } else {
            if (obj != null) {
                throw new IllegalArgumentException();
            }
            obj2 = null;
        }
        this.securityController = securityController;
        this.securityDomain = obj2;
    }

    public static InterpretedFunction createFunction(Context context, Scriptable scriptable, InterpreterData interpreterData, Object obj) {
        InterpretedFunction interpretedFunction = new InterpretedFunction(interpreterData, obj);
        interpretedFunction.initScriptFunction(context, scriptable);
        return interpretedFunction;
    }

    public static InterpretedFunction createScript(InterpreterData interpreterData, Object obj) {
        return new InterpretedFunction(interpreterData, obj);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return !ScriptRuntime.hasTopCall(context) ? ScriptRuntime.doTopCall(this, context, scriptable, scriptable2, objArr) : Interpreter.interpret(this, context, scriptable, scriptable2, objArr);
    }

    @Override // org.mozilla.javascript.Script
    public Object exec(Context context, Scriptable scriptable) {
        if (isScript()) {
            return !ScriptRuntime.hasTopCall(context) ? ScriptRuntime.doTopCall(this, context, scriptable, scriptable, ScriptRuntime.emptyArgs) : Interpreter.interpret(this, context, scriptable, scriptable, ScriptRuntime.emptyArgs);
        }
        throw new IllegalStateException();
    }

    @Override // org.mozilla.javascript.NativeFunction
    public DebuggableScript getDebuggableView() {
        return this.idata;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public String getEncodedSource() {
        return Interpreter.getEncodedSource(this.idata);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String getFunctionName() {
        String str = this.idata.itsName;
        return str == null ? "" : str;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public int getLanguageVersion() {
        return this.idata.languageVersion;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public int getParamAndVarCount() {
        return this.idata.argNames.length;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public int getParamCount() {
        return this.idata.argCount;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public boolean getParamOrVarConst(int i11) {
        return this.idata.argIsConst[i11];
    }

    @Override // org.mozilla.javascript.NativeFunction
    public String getParamOrVarName(int i11) {
        return this.idata.argNames[i11];
    }

    public boolean isScript() {
        return this.idata.itsFunctionType == 0;
    }

    @Override // org.mozilla.javascript.NativeFunction
    public Object resumeGenerator(Context context, Scriptable scriptable, int i11, Object obj, Object obj2) {
        return Interpreter.resumeGenerator(context, scriptable, i11, obj, obj2);
    }

    public static InterpretedFunction createFunction(Context context, Scriptable scriptable, InterpretedFunction interpretedFunction, int i11) {
        InterpretedFunction interpretedFunction2 = new InterpretedFunction(interpretedFunction, i11);
        interpretedFunction2.initScriptFunction(context, scriptable);
        return interpretedFunction2;
    }

    private InterpretedFunction(InterpretedFunction interpretedFunction, int i11) {
        this.idata = interpretedFunction.idata.itsNestedFunctions[i11];
        this.securityController = interpretedFunction.securityController;
        this.securityDomain = interpretedFunction.securityDomain;
    }
}
