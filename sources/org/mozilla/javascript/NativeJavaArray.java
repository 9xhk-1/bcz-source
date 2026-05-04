package org.mozilla.javascript;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NativeJavaArray extends NativeJavaObject {
    static final long serialVersionUID = -924022554283675333L;
    Object array;
    Class<?> cls;
    int length;

    public NativeJavaArray(Scriptable scriptable, Object obj) {
        super(scriptable, null, ScriptRuntime.ObjectClass);
        Class<?> cls = obj.getClass();
        if (!cls.isArray()) {
            throw new RuntimeException("Array expected");
        }
        this.array = obj;
        this.length = Array.getLength(obj);
        this.cls = cls.getComponentType();
    }

    public static NativeJavaArray wrap(Scriptable scriptable, Object obj) {
        return new NativeJavaArray(scriptable, obj);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        if (str.equals("length")) {
            return Integer.valueOf(this.length);
        }
        Object obj = super.get(str, scriptable);
        if (obj != Scriptable.NOT_FOUND || ScriptableObject.hasProperty(getPrototype(), str)) {
            return obj;
        }
        throw Context.reportRuntimeError2("msg.java.member.not.found", this.array.getClass().getName(), str);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "JavaArray";
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        return (cls == null || cls == ScriptRuntime.StringClass) ? this.array.toString() : cls == ScriptRuntime.BooleanClass ? Boolean.TRUE : cls == ScriptRuntime.NumberClass ? ScriptRuntime.NaNobj : this;
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        int i11 = this.length;
        Object[] objArr = new Object[i11];
        while (true) {
            i11--;
            if (i11 < 0) {
                return objArr;
            }
            objArr[i11] = Integer.valueOf(i11);
        }
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Scriptable getPrototype() {
        if (this.prototype == null) {
            this.prototype = ScriptableObject.getArrayPrototype(getParentScope());
        }
        return this.prototype;
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        return str.equals("length") || super.has(str, scriptable);
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public boolean hasInstance(Scriptable scriptable) {
        if (!(scriptable instanceof Wrapper)) {
            return false;
        }
        return this.cls.isInstance(((Wrapper) scriptable).unwrap());
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        if (!str.equals("length")) {
            throw Context.reportRuntimeError1("msg.java.array.member.not.found", str);
        }
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Wrapper
    public Object unwrap() {
        return this.array;
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public boolean has(int i11, Scriptable scriptable) {
        return i11 >= 0 && i11 < this.length;
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public void put(int i11, Scriptable scriptable, Object obj) {
        if (i11 >= 0 && i11 < this.length) {
            Array.set(this.array, i11, Context.jsToJava(obj, this.cls));
            return;
        }
        throw Context.reportRuntimeError2("msg.java.array.index.out.of.bounds", String.valueOf(i11), String.valueOf(this.length - 1));
    }

    @Override // org.mozilla.javascript.NativeJavaObject, org.mozilla.javascript.Scriptable
    public Object get(int i11, Scriptable scriptable) {
        if (i11 >= 0 && i11 < this.length) {
            Context context = Context.getContext();
            return context.getWrapFactory().wrap(context, this, Array.get(this.array, i11), this.cls);
        }
        return Undefined.instance;
    }
}
