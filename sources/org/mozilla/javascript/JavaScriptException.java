package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class JavaScriptException extends RhinoException {
    static final long serialVersionUID = -7666130513694669293L;
    private Object value;

    public JavaScriptException(Object obj) {
        this(obj, "", 0);
    }

    @Override // org.mozilla.javascript.RhinoException
    public String details() {
        Object obj = this.value;
        if (obj == null) {
            return "null";
        }
        if (obj instanceof NativeError) {
            return obj.toString();
        }
        try {
            return ScriptRuntime.toString(obj);
        } catch (RuntimeException unused) {
            Object obj2 = this.value;
            return obj2 instanceof Scriptable ? ScriptRuntime.defaultObjectToString((Scriptable) obj2) : obj2.toString();
        }
    }

    public int getLineNumber() {
        return lineNumber();
    }

    public String getSourceName() {
        return sourceName();
    }

    public Object getValue() {
        return this.value;
    }

    public JavaScriptException(Object obj, String str, int i11) {
        recordErrorOrigin(str, i11, null, 0);
        this.value = obj;
        if ((obj instanceof NativeError) && Context.getContext().hasFeature(10)) {
            NativeError nativeError = (NativeError) obj;
            if (!nativeError.has("fileName", nativeError)) {
                nativeError.put("fileName", nativeError, str);
            }
            if (!nativeError.has("lineNumber", nativeError)) {
                nativeError.put("lineNumber", nativeError, Integer.valueOf(i11));
            }
            nativeError.setStackProvider(this);
        }
    }
}
