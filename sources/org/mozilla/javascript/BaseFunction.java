package org.mozilla.javascript;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class BaseFunction extends IdScriptableObject implements Function {
    private static final Object FUNCTION_TAG = "Function";
    private static final int Id_apply = 4;
    private static final int Id_arguments = 5;
    private static final int Id_arity = 2;
    private static final int Id_bind = 6;
    private static final int Id_call = 5;
    private static final int Id_constructor = 1;
    private static final int Id_length = 1;
    private static final int Id_name = 3;
    private static final int Id_prototype = 4;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int MAX_INSTANCE_ID = 5;
    private static final int MAX_PROTOTYPE_ID = 6;
    static final long serialVersionUID = 5311394446546053859L;
    private Object prototypeProperty;
    private int prototypePropertyAttributes;

    public BaseFunction() {
        this.prototypePropertyAttributes = 6;
    }

    private Object getArguments() {
        Object defaultGet = defaultGet("arguments");
        if (defaultGet != Scriptable.NOT_FOUND) {
            return defaultGet;
        }
        Scriptable findFunctionActivation = ScriptRuntime.findFunctionActivation(Context.getContext(), this);
        if (findFunctionActivation == null) {
            return null;
        }
        return findFunctionActivation.get("arguments", findFunctionActivation);
    }

    public static void init(Scriptable scriptable, boolean z11) {
        BaseFunction baseFunction = new BaseFunction();
        baseFunction.prototypePropertyAttributes = 7;
        baseFunction.exportAsJSClass(6, scriptable, z11);
    }

    public static boolean isApply(IdFunctionObject idFunctionObject) {
        return idFunctionObject.hasTag(FUNCTION_TAG) && idFunctionObject.methodId() == 4;
    }

    public static boolean isApplyOrCall(IdFunctionObject idFunctionObject) {
        if (!idFunctionObject.hasTag(FUNCTION_TAG)) {
            return false;
        }
        int methodId = idFunctionObject.methodId();
        return methodId == 4 || methodId == 5;
    }

    private static Object jsConstructor(Context context, Scriptable scriptable, Object[] objArr) {
        int i11;
        int length = objArr.length;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("function ");
        if (context.getLanguageVersion() != 120) {
            stringBuffer.append(com.baicizhan.client.business.webview.args.Arguments.ARG_ANONYMOUS);
        }
        stringBuffer.append('(');
        int i12 = 0;
        while (true) {
            i11 = length - 1;
            if (i12 >= i11) {
                break;
            }
            if (i12 > 0) {
                stringBuffer.append(',');
            }
            stringBuffer.append(ScriptRuntime.toString(objArr[i12]));
            i12++;
        }
        stringBuffer.append(") {");
        if (length != 0) {
            stringBuffer.append(ScriptRuntime.toString(objArr[i11]));
        }
        stringBuffer.append("\n}");
        String stringBuffer2 = stringBuffer.toString();
        int[] iArr = new int[1];
        String sourcePositionFromStack = Context.getSourcePositionFromStack(iArr);
        if (sourcePositionFromStack == null) {
            iArr[0] = 1;
            sourcePositionFromStack = "<eval'ed string>";
        }
        String makeUrlForGeneratedScript = ScriptRuntime.makeUrlForGeneratedScript(false, sourcePositionFromStack, iArr[0]);
        Scriptable topLevelScope = ScriptableObject.getTopLevelScope(scriptable);
        ErrorReporter forEval = DefaultErrorReporter.forEval(context.getErrorReporter());
        Evaluator createInterpreter = Context.createInterpreter();
        if (createInterpreter != null) {
            return context.compileFunction(topLevelScope, stringBuffer2, createInterpreter, forEval, makeUrlForGeneratedScript, 1, null);
        }
        throw new JavaScriptException("Interpreter not present", sourcePositionFromStack, iArr[0]);
    }

    private BaseFunction realFunction(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        Object defaultValue = scriptable.getDefaultValue(ScriptRuntime.FunctionClass);
        if (defaultValue instanceof BaseFunction) {
            return (BaseFunction) defaultValue;
        }
        throw ScriptRuntime.typeError1("msg.incompat.call", idFunctionObject.getFunctionName());
    }

    private synchronized Object setupDefaultPrototype() {
        Object obj = this.prototypeProperty;
        if (obj != null) {
            return obj;
        }
        NativeObject nativeObject = new NativeObject();
        nativeObject.defineProperty("constructor", this, 2);
        this.prototypeProperty = nativeObject;
        Scriptable objectPrototype = ScriptableObject.getObjectPrototype(this);
        if (objectPrototype != nativeObject) {
            nativeObject.setPrototype(objectPrototype);
        }
        return nativeObject;
    }

    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return Undefined.instance;
    }

    @Override // org.mozilla.javascript.Function
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        Scriptable parentScope;
        Scriptable classPrototype;
        Scriptable createObject = createObject(context, scriptable);
        if (createObject != null) {
            Object call = call(context, scriptable, createObject, objArr);
            return call instanceof Scriptable ? (Scriptable) call : createObject;
        }
        Object call2 = call(context, scriptable, null, objArr);
        if (!(call2 instanceof Scriptable)) {
            throw new IllegalStateException("Bad implementaion of call as constructor, name=" + getFunctionName() + " in " + getClass().getName());
        }
        Scriptable scriptable2 = (Scriptable) call2;
        if (scriptable2.getPrototype() == null && scriptable2 != (classPrototype = getClassPrototype())) {
            scriptable2.setPrototype(classPrototype);
        }
        if (scriptable2.getParentScope() == null && scriptable2 != (parentScope = getParentScope())) {
            scriptable2.setParentScope(parentScope);
        }
        return scriptable2;
    }

    public Scriptable createObject(Context context, Scriptable scriptable) {
        NativeObject nativeObject = new NativeObject();
        nativeObject.setPrototype(getClassPrototype());
        nativeObject.setParentScope(getParentScope());
        return nativeObject;
    }

    public String decompile(int i11, int i12) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = (i12 & 1) != 0;
        if (!z11) {
            stringBuffer.append("function ");
            stringBuffer.append(getFunctionName());
            stringBuffer.append("() {\n\t");
        }
        stringBuffer.append("[native code, arity=");
        stringBuffer.append(getArity());
        stringBuffer.append("]\n");
        if (!z11) {
            stringBuffer.append("}\n");
        }
        return stringBuffer.toString();
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        int int32;
        Object[] objArr2;
        Scriptable scriptable3;
        if (!idFunctionObject.hasTag(FUNCTION_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        int i11 = 0;
        switch (methodId) {
            case 1:
                return jsConstructor(context, scriptable, objArr);
            case 2:
                return realFunction(scriptable2, idFunctionObject).decompile(ScriptRuntime.toInt32(objArr, 0), 0);
            case 3:
                BaseFunction realFunction = realFunction(scriptable2, idFunctionObject);
                int i12 = 2;
                if (objArr.length != 0 && (int32 = ScriptRuntime.toInt32(objArr[0])) >= 0) {
                    i12 = 0;
                    i11 = int32;
                }
                return realFunction.decompile(i11, i12);
            case 4:
            case 5:
                return ScriptRuntime.applyOrCall(methodId == 4, context, scriptable, scriptable2, objArr);
            case 6:
                if (!(scriptable2 instanceof Callable)) {
                    throw ScriptRuntime.notFunctionError(scriptable2);
                }
                Callable callable = (Callable) scriptable2;
                int length = objArr.length;
                if (length > 0) {
                    scriptable3 = ScriptRuntime.toObjectOrNull(context, objArr[0], scriptable);
                    int i13 = length - 1;
                    objArr2 = new Object[i13];
                    System.arraycopy(objArr, 1, objArr2, 0, i13);
                } else {
                    objArr2 = ScriptRuntime.emptyArgs;
                    scriptable3 = null;
                }
                return new BoundFunction(context, scriptable, callable, scriptable3, objArr2);
            default:
                throw new IllegalArgumentException(String.valueOf(methodId));
        }
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void fillConstructorProperties(IdFunctionObject idFunctionObject) {
        idFunctionObject.setPrototype(this);
        super.fillConstructorProperties(idFunctionObject);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        String str2;
        int i11;
        int length = str.length();
        int i12 = 6;
        if (length == 4) {
            str2 = "name";
            i11 = 3;
        } else if (length == 5) {
            str2 = "arity";
            i11 = 2;
        } else if (length != 6) {
            if (length == 9) {
                char charAt = str.charAt(0);
                if (charAt == 'a') {
                    str2 = "arguments";
                    i11 = 5;
                } else if (charAt == 'p') {
                    str2 = "prototype";
                    i11 = 4;
                }
            }
            str2 = null;
            i11 = 0;
        } else {
            str2 = "length";
            i11 = 1;
        }
        if (str2 != null && str2 != str && !str2.equals(str)) {
            i11 = 0;
        }
        if (i11 == 0) {
            return super.findInstanceIdInfo(str);
        }
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            i12 = 7;
        } else if (i11 != 4) {
            if (i11 != 5) {
                throw new IllegalStateException();
            }
        } else {
            if (!hasPrototypeProperty()) {
                return 0;
            }
            i12 = this.prototypePropertyAttributes;
        }
        return IdScriptableObject.instanceIdInfo(i12, i11);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int length = str.length();
        int i11 = 5;
        if (length == 4) {
            char charAt = str.charAt(0);
            if (charAt == 'b') {
                str2 = "bind";
                i11 = 6;
            } else {
                if (charAt == 'c') {
                    str2 = NotificationCompat.CATEGORY_CALL;
                }
                str2 = null;
                i11 = 0;
            }
        } else if (length == 5) {
            str2 = "apply";
            i11 = 4;
        } else if (length != 8) {
            if (length == 11) {
                str2 = "constructor";
                i11 = 1;
            }
            str2 = null;
            i11 = 0;
        } else {
            i11 = 3;
            char charAt2 = str.charAt(3);
            if (charAt2 == 'o') {
                str2 = "toSource";
            } else {
                if (charAt2 == 't') {
                    str2 = "toString";
                    i11 = 2;
                }
                str2 = null;
                i11 = 0;
            }
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    public int getArity() {
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Function";
    }

    public Scriptable getClassPrototype() {
        Object prototypeProperty = getPrototypeProperty();
        return prototypeProperty instanceof Scriptable ? (Scriptable) prototypeProperty : ScriptableObject.getObjectPrototype(this);
    }

    public String getFunctionName() {
        return "";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? super.getInstanceIdName(i11) : "arguments" : "prototype" : "name" : "arity" : "length";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? super.getInstanceIdValue(i11) : getArguments() : getPrototypeProperty() : getFunctionName() : ScriptRuntime.wrapInt(getArity()) : ScriptRuntime.wrapInt(getLength());
    }

    public int getLength() {
        return 0;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return 5;
    }

    public Object getPrototypeProperty() {
        Object obj = this.prototypeProperty;
        if (obj == null) {
            return this instanceof NativeFunction ? setupDefaultPrototype() : Undefined.instance;
        }
        if (obj == UniqueTag.NULL_VALUE) {
            return null;
        }
        return obj;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public String getTypeOf() {
        return avoidObjectDetection() ? "undefined" : "function";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        Object property = ScriptableObject.getProperty(this, "prototype");
        if (property instanceof Scriptable) {
            return ScriptRuntime.jsDelegatesTo(scriptable, (Scriptable) property);
        }
        throw ScriptRuntime.typeError1("msg.instanceof.bad.prototype", getFunctionName());
    }

    public boolean hasPrototypeProperty() {
        return this.prototypeProperty != null || (this instanceof NativeFunction);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        int i12 = 1;
        switch (i11) {
            case 1:
                str = "constructor";
                break;
            case 2:
                str = "toString";
                break;
            case 3:
                str = "toSource";
                break;
            case 4:
                i12 = 2;
                str = "apply";
                break;
            case 5:
                str = NotificationCompat.CATEGORY_CALL;
                break;
            case 6:
                str = "bind";
                break;
            default:
                throw new IllegalArgumentException(String.valueOf(i11));
        }
        initPrototypeMethod(FUNCTION_TAG, i11, str, i12);
    }

    public void setImmunePrototypeProperty(Object obj) {
        if ((this.prototypePropertyAttributes & 1) != 0) {
            throw new IllegalStateException();
        }
        if (obj == null) {
            obj = UniqueTag.NULL_VALUE;
        }
        this.prototypeProperty = obj;
        this.prototypePropertyAttributes = 7;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void setInstanceIdValue(int i11, Object obj) {
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return;
        }
        if (i11 == 4) {
            if ((this.prototypePropertyAttributes & 1) == 0) {
                if (obj == null) {
                    obj = UniqueTag.NULL_VALUE;
                }
                this.prototypeProperty = obj;
                return;
            }
            return;
        }
        if (i11 != 5) {
            super.setInstanceIdValue(i11, obj);
            return;
        }
        if (obj == Scriptable.NOT_FOUND) {
            Kit.codeBug();
        }
        defaultPut("arguments", obj);
    }

    public BaseFunction(Scriptable scriptable, Scriptable scriptable2) {
        super(scriptable, scriptable2);
        this.prototypePropertyAttributes = 6;
    }
}
