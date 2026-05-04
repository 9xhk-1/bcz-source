package org.mozilla.javascript;

import dp.a;
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class NativeError extends IdScriptableObject {
    private static final Object ERROR_TAG = "Error";
    private static final int Id_constructor = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    static final long serialVersionUID = -5338413581437645187L;
    private RhinoException stackProvider;

    private static String getString(Scriptable scriptable, String str) {
        Object property = ScriptableObject.getProperty(scriptable, str);
        return property == Scriptable.NOT_FOUND ? "" : ScriptRuntime.toString(property);
    }

    public static void init(Scriptable scriptable, boolean z11) {
        NativeError nativeError = new NativeError();
        ScriptableObject.putProperty(nativeError, "name", "Error");
        ScriptableObject.putProperty(nativeError, "message", "");
        ScriptableObject.putProperty(nativeError, "fileName", "");
        ScriptableObject.putProperty((Scriptable) nativeError, "lineNumber", (Object) 0);
        nativeError.exportAsJSClass(3, scriptable, z11);
    }

    private static String js_toSource(Context context, Scriptable scriptable, Scriptable scriptable2) {
        int int32;
        Object property = ScriptableObject.getProperty(scriptable2, "name");
        Object property2 = ScriptableObject.getProperty(scriptable2, "message");
        Object property3 = ScriptableObject.getProperty(scriptable2, "fileName");
        Object property4 = ScriptableObject.getProperty(scriptable2, "lineNumber");
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(new ");
        Object obj = Scriptable.NOT_FOUND;
        if (property == obj) {
            property = Undefined.instance;
        }
        stringBuffer.append(ScriptRuntime.toString(property));
        stringBuffer.append(j.f81006c);
        if (property2 != obj || property3 != obj || property4 != obj) {
            if (property2 == obj) {
                property2 = "";
            }
            stringBuffer.append(ScriptRuntime.uneval(context, scriptable, property2));
            if (property3 != obj || property4 != obj) {
                stringBuffer.append(j2.O);
                if (property3 == obj) {
                    property3 = "";
                }
                stringBuffer.append(ScriptRuntime.uneval(context, scriptable, property3));
                if (property4 != obj && (int32 = ScriptRuntime.toInt32(property4)) != 0) {
                    stringBuffer.append(j2.O);
                    stringBuffer.append(ScriptRuntime.toString(int32));
                }
            }
        }
        stringBuffer.append(a.f48058d);
        return stringBuffer.toString();
    }

    private static Object js_toString(Scriptable scriptable) {
        Object property = ScriptableObject.getProperty(scriptable, "name");
        Object obj = Scriptable.NOT_FOUND;
        String scriptRuntime = (property == obj || property == Undefined.instance) ? "Error" : ScriptRuntime.toString(property);
        Object property2 = ScriptableObject.getProperty(scriptable, "message");
        if (property2 == obj || property2 == Undefined.instance) {
            return Undefined.instance;
        }
        return scriptRuntime + ": " + ScriptRuntime.toString(property2);
    }

    public static NativeError make(Context context, Scriptable scriptable, IdFunctionObject idFunctionObject, Object[] objArr) {
        Scriptable scriptable2 = (Scriptable) idFunctionObject.get("prototype", idFunctionObject);
        NativeError nativeError = new NativeError();
        nativeError.setPrototype(scriptable2);
        nativeError.setParentScope(scriptable);
        int length = objArr.length;
        if (length >= 1) {
            ScriptableObject.putProperty(nativeError, "message", ScriptRuntime.toString(objArr[0]));
            if (length >= 2) {
                ScriptableObject.putProperty(nativeError, "fileName", objArr[1]);
                if (length >= 3) {
                    ScriptableObject.putProperty(nativeError, "lineNumber", Integer.valueOf(ScriptRuntime.toInt32(objArr[2])));
                }
            }
        }
        return nativeError;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(ERROR_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            return make(context, scriptable, idFunctionObject, objArr);
        }
        if (methodId == 2) {
            return js_toString(scriptable2);
        }
        if (methodId == 3) {
            return js_toSource(context, scriptable, scriptable2);
        }
        throw new IllegalArgumentException(String.valueOf(methodId));
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int i11;
        int length = str.length();
        if (length == 8) {
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
        return "Error";
    }

    public Object getStack() {
        RhinoException rhinoException = this.stackProvider;
        Object scriptStackTrace = rhinoException == null ? Scriptable.NOT_FOUND : rhinoException.getScriptStackTrace();
        setStack(scriptStackTrace);
        return scriptStackTrace;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        int i12;
        String str;
        if (i11 != 1) {
            i12 = 0;
            if (i11 == 2) {
                str = "toString";
            } else {
                if (i11 != 3) {
                    throw new IllegalArgumentException(String.valueOf(i11));
                }
                str = "toSource";
            }
        } else {
            i12 = 1;
            str = "constructor";
        }
        initPrototypeMethod(ERROR_TAG, i11, str, i12);
    }

    public void setStack(Object obj) {
        if (this.stackProvider != null) {
            this.stackProvider = null;
            delete("stack");
        }
        put("stack", this, obj);
    }

    public void setStackProvider(RhinoException rhinoException) {
        if (this.stackProvider == null) {
            this.stackProvider = rhinoException;
            try {
                defineProperty("stack", null, NativeError.class.getMethod("getStack", null), NativeError.class.getMethod("setStack", Object.class), 0);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    public String toString() {
        Object js_toString = js_toString(this);
        return js_toString instanceof String ? (String) js_toString : super.toString();
    }
}
