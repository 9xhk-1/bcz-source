package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class IdFunctionObject extends BaseFunction {
    static final long serialVersionUID = -5332312783643935019L;
    private int arity;
    private String functionName;
    private final IdFunctionCall idcall;
    private final int methodId;
    private final Object tag;
    private boolean useCallAsConstructor;

    public IdFunctionObject(IdFunctionCall idFunctionCall, Object obj, int i11, int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException();
        }
        this.idcall = idFunctionCall;
        this.tag = obj;
        this.methodId = i11;
        this.arity = i12;
        if (i12 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public final void addAsProperty(Scriptable scriptable) {
        ScriptableObject.defineProperty(scriptable, this.functionName, this, 2);
    }

    @Override // org.mozilla.javascript.BaseFunction, org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        return this.idcall.execIdCall(this, context, scriptable, scriptable2, objArr);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public Scriptable createObject(Context context, Scriptable scriptable) {
        if (this.useCallAsConstructor) {
            return null;
        }
        throw ScriptRuntime.typeError1("msg.not.ctor", this.functionName);
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String decompile(int i11, int i12) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z11 = (i12 & 1) != 0;
        if (!z11) {
            stringBuffer.append("function ");
            stringBuffer.append(getFunctionName());
            stringBuffer.append("() { ");
        }
        stringBuffer.append("[native code for ");
        IdFunctionCall idFunctionCall = this.idcall;
        if (idFunctionCall instanceof Scriptable) {
            stringBuffer.append(((Scriptable) idFunctionCall).getClassName());
            stringBuffer.append('.');
        }
        stringBuffer.append(getFunctionName());
        stringBuffer.append(", arity=");
        stringBuffer.append(getArity());
        stringBuffer.append(z11 ? "]\n" : "] }\n");
        return stringBuffer.toString();
    }

    public void exportAsScopeProperty() {
        addAsProperty(getParentScope());
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getArity() {
        return this.arity;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public String getFunctionName() {
        String str = this.functionName;
        return str == null ? "" : str;
    }

    @Override // org.mozilla.javascript.BaseFunction
    public int getLength() {
        return getArity();
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Scriptable getPrototype() {
        Scriptable prototype = super.getPrototype();
        if (prototype != null) {
            return prototype;
        }
        Scriptable functionPrototype = ScriptableObject.getFunctionPrototype(getParentScope());
        setPrototype(functionPrototype);
        return functionPrototype;
    }

    public final boolean hasTag(Object obj) {
        return obj == null ? this.tag == null : obj.equals(this.tag);
    }

    public void initFunction(String str, Scriptable scriptable) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if (scriptable == null) {
            throw new IllegalArgumentException();
        }
        this.functionName = str;
        setParentScope(scriptable);
    }

    public final void markAsConstructor(Scriptable scriptable) {
        this.useCallAsConstructor = true;
        setImmunePrototypeProperty(scriptable);
    }

    public final int methodId() {
        return this.methodId;
    }

    public final RuntimeException unknown() {
        return new IllegalArgumentException("BAD FUNCTION ID=" + this.methodId + " MASTER=" + this.idcall);
    }

    public IdFunctionObject(IdFunctionCall idFunctionCall, Object obj, int i11, String str, int i12, Scriptable scriptable) {
        super(scriptable, null);
        if (i12 < 0) {
            throw new IllegalArgumentException();
        }
        if (str != null) {
            this.idcall = idFunctionCall;
            this.tag = obj;
            this.methodId = i11;
            this.arity = i12;
            this.functionName = str;
            return;
        }
        throw new IllegalArgumentException();
    }
}
