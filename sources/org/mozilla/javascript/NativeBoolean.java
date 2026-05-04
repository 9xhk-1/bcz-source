package org.mozilla.javascript;

import n6.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class NativeBoolean extends IdScriptableObject {
    private static final Object BOOLEAN_TAG = "Boolean";
    private static final int Id_constructor = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_valueOf = 4;
    private static final int MAX_PROTOTYPE_ID = 4;
    static final long serialVersionUID = -3716996899943880933L;
    private boolean booleanValue;

    public NativeBoolean(boolean z11) {
        this.booleanValue = z11;
    }

    public static void init(Scriptable scriptable, boolean z11) {
        new NativeBoolean(false).exportAsJSClass(4, scriptable, z11);
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(BOOLEAN_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            boolean z11 = false;
            if (objArr.length != 0) {
                Object obj = objArr[0];
                z11 = ((obj instanceof ScriptableObject) && ((ScriptableObject) obj).avoidObjectDetection()) ? true : ScriptRuntime.toBoolean(objArr[0]);
            }
            return scriptable2 == null ? new NativeBoolean(z11) : ScriptRuntime.wrapBoolean(z11);
        }
        if (!(scriptable2 instanceof NativeBoolean)) {
            throw IdScriptableObject.incompatibleCallError(idFunctionObject);
        }
        boolean z12 = ((NativeBoolean) scriptable2).booleanValue;
        if (methodId == 2) {
            return z12 ? m.f74525c : "false";
        }
        if (methodId == 3) {
            return z12 ? "(new Boolean(true))" : "(new Boolean(false))";
        }
        if (methodId == 4) {
            return ScriptRuntime.wrapBoolean(z12);
        }
        throw new IllegalArgumentException(String.valueOf(methodId));
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int i11;
        int length = str.length();
        if (length == 7) {
            str2 = "valueOf";
            i11 = 4;
        } else if (length == 8) {
            i11 = 3;
            char charAt = str.charAt(3);
            if (charAt == 'o') {
                str2 = "toSource";
            } else {
                if (charAt == 't') {
                    str2 = "toString";
                    i11 = 2;
                }
                str2 = null;
                i11 = 0;
            }
        } else {
            if (length == 11) {
                str2 = "constructor";
                i11 = 1;
            }
            str2 = null;
            i11 = 0;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "Boolean";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        return cls == ScriptRuntime.BooleanClass ? ScriptRuntime.wrapBoolean(this.booleanValue) : super.getDefaultValue(cls);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        int i12;
        String str;
        if (i11 != 1) {
            i12 = 0;
            if (i11 == 2) {
                str = "toString";
            } else if (i11 == 3) {
                str = "toSource";
            } else {
                if (i11 != 4) {
                    throw new IllegalArgumentException(String.valueOf(i11));
                }
                str = "valueOf";
            }
        } else {
            i12 = 1;
            str = "constructor";
        }
        initPrototypeMethod(BOOLEAN_TAG, i11, str, i12);
    }
}
