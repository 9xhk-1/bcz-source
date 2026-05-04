package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class SpecialRef extends Ref {
    private static final int SPECIAL_NONE = 0;
    private static final int SPECIAL_PARENT = 2;
    private static final int SPECIAL_PROTO = 1;
    static final long serialVersionUID = -7521596632456797847L;
    private String name;
    private Scriptable target;
    private int type;

    private SpecialRef(Scriptable scriptable, int i11, String str) {
        this.target = scriptable;
        this.type = i11;
        this.name = str;
    }

    public static Ref createSpecial(Context context, Object obj, String str) {
        int i11;
        Scriptable objectOrNull = ScriptRuntime.toObjectOrNull(context, obj);
        if (objectOrNull == null) {
            throw ScriptRuntime.undefReadError(obj, str);
        }
        if (str.equals("__proto__")) {
            i11 = 1;
        } else {
            if (!str.equals("__parent__")) {
                throw new IllegalArgumentException(str);
            }
            i11 = 2;
        }
        if (!context.hasFeature(5)) {
            i11 = 0;
        }
        return new SpecialRef(objectOrNull, i11, str);
    }

    @Override // org.mozilla.javascript.Ref
    public boolean delete(Context context) {
        if (this.type == 0) {
            return ScriptRuntime.deleteObjectElem(this.target, this.name, context);
        }
        return false;
    }

    @Override // org.mozilla.javascript.Ref
    public Object get(Context context) {
        int i11 = this.type;
        if (i11 == 0) {
            return ScriptRuntime.getObjectProp(this.target, this.name, context);
        }
        if (i11 == 1) {
            return this.target.getPrototype();
        }
        if (i11 == 2) {
            return this.target.getParentScope();
        }
        throw Kit.codeBug();
    }

    @Override // org.mozilla.javascript.Ref
    public boolean has(Context context) {
        if (this.type == 0) {
            return ScriptRuntime.hasObjectElem(this.target, this.name, context);
        }
        return true;
    }

    @Override // org.mozilla.javascript.Ref
    public Object set(Context context, Object obj) {
        int i11 = this.type;
        if (i11 == 0) {
            return ScriptRuntime.setObjectProp(this.target, this.name, obj, context);
        }
        if (i11 != 1 && i11 != 2) {
            throw Kit.codeBug();
        }
        Scriptable objectOrNull = ScriptRuntime.toObjectOrNull(context, obj);
        if (objectOrNull != null) {
            Scriptable scriptable = objectOrNull;
            while (scriptable != this.target) {
                scriptable = this.type == 1 ? scriptable.getPrototype() : scriptable.getParentScope();
                if (scriptable == null) {
                }
            }
            throw Context.reportRuntimeError1("msg.cyclic.value", this.name);
        }
        if (this.type == 1) {
            this.target.setPrototype(objectOrNull);
            return objectOrNull;
        }
        this.target.setParentScope(objectOrNull);
        return objectOrNull;
    }
}
