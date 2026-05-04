package org.mozilla.javascript;

import java.lang.reflect.Field;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class FieldAndMethods extends NativeJavaMethod {
    static final long serialVersionUID = -9222428244284796755L;
    Field field;
    Object javaObject;

    public FieldAndMethods(Scriptable scriptable, MemberBox[] memberBoxArr, Field field) {
        super(memberBoxArr);
        this.field = field;
        setParentScope(scriptable);
        setPrototype(ScriptableObject.getFunctionPrototype(scriptable));
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        if (cls == ScriptRuntime.FunctionClass) {
            return this;
        }
        try {
            Object obj = this.field.get(this.javaObject);
            Class<?> type = this.field.getType();
            Context context = Context.getContext();
            Object wrap = context.getWrapFactory().wrap(context, this, obj, type);
            return wrap instanceof Scriptable ? ((Scriptable) wrap).getDefaultValue(cls) : wrap;
        } catch (IllegalAccessException unused) {
            throw Context.reportRuntimeError1("msg.java.internal.private", this.field.getName());
        }
    }
}
