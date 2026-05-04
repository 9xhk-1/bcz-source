package org.mozilla.javascript.xml.impl.xmlbeans;

import da0.v1;
import org.junit.jupiter.api.j2;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class QName extends IdScriptableObject {
    private static final int Id_constructor = 1;
    private static final int Id_localName = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_uri = 2;
    private static final int MAX_INSTANCE_ID = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final Object QNAME_TAG = "QName";
    static final long serialVersionUID = 416745167693026750L;
    XMLLibImpl lib;
    private String localName;
    private String prefix;
    private String uri;

    public QName(XMLLibImpl xMLLibImpl, String str, String str2, String str3) {
        super(xMLLibImpl.globalScope(), xMLLibImpl.qnamePrototype);
        if (str2 == null) {
            throw new IllegalArgumentException();
        }
        this.lib = xMLLibImpl;
        this.uri = str;
        this.prefix = str3;
        this.localName = str2;
    }

    private Object jsConstructor(Context context, boolean z11, Object[] objArr) {
        return (z11 || objArr.length != 1) ? objArr.length == 0 ? this.lib.constructQName(context, Undefined.instance) : objArr.length == 1 ? this.lib.constructQName(context, objArr[0]) : this.lib.constructQName(context, objArr[0], objArr[1]) : this.lib.castToQName(context, objArr[0]);
    }

    private String js_toSource() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        toSourceImpl(this.uri, this.localName, this.prefix, stringBuffer);
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    private QName realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        if (scriptable instanceof QName) {
            return (QName) scriptable;
        }
        throw IdScriptableObject.incompatibleCallError(idFunctionObject);
    }

    private static void toSourceImpl(String str, String str2, String str3, StringBuffer stringBuffer) {
        stringBuffer.append("new QName(");
        if (str != null || str3 != null) {
            Namespace.toSourceImpl(str3, str, stringBuffer);
            stringBuffer.append(j2.O);
        } else if (!"*".equals(str2)) {
            stringBuffer.append("null, ");
        }
        stringBuffer.append('\'');
        stringBuffer.append(ScriptRuntime.escapeString(str2, '\''));
        stringBuffer.append("')");
    }

    public boolean equals(Object obj) {
        if (obj instanceof QName) {
            return equals((QName) obj);
        }
        return false;
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public Object equivalentValues(Object obj) {
        return !(obj instanceof QName) ? Scriptable.NOT_FOUND : equals((QName) obj) ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(QNAME_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            return jsConstructor(context, scriptable2 == null, objArr);
        }
        if (methodId == 2) {
            return realThis(scriptable2, idFunctionObject).toString();
        }
        if (methodId == 3) {
            return realThis(scriptable2, idFunctionObject).js_toSource();
        }
        throw new IllegalArgumentException(String.valueOf(methodId));
    }

    public void exportAsJSClass(boolean z11) {
        exportAsJSClass(3, this.lib.globalScope(), z11);
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int findInstanceIdInfo(String str) {
        String str2;
        int i11;
        int length = str.length();
        if (length == 3) {
            str2 = v1.a.f47590a;
            i11 = 2;
        } else if (length == 9) {
            str2 = "localName";
            i11 = 1;
        } else {
            str2 = null;
            i11 = 0;
        }
        int i12 = (str2 == null || str2 == str || str2.equals(str)) ? i11 : 0;
        if (i12 == 0) {
            return super.findInstanceIdInfo(str);
        }
        if (i12 == 1 || i12 == 2) {
            return IdScriptableObject.instanceIdInfo(5, super.getMaxInstanceId() + i12);
        }
        throw new IllegalStateException();
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
        return "QName";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class cls) {
        return toString();
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i11) {
        int maxInstanceId = i11 - super.getMaxInstanceId();
        return maxInstanceId != 1 ? maxInstanceId != 2 ? super.getInstanceIdName(i11) : v1.a.f47590a : "localName";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i11) {
        int maxInstanceId = i11 - super.getMaxInstanceId();
        return maxInstanceId != 1 ? maxInstanceId != 2 ? super.getInstanceIdValue(i11) : this.uri : this.localName;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return super.getMaxInstanceId() + 2;
    }

    public int hashCode() {
        int hashCode = this.localName.hashCode();
        String str = this.uri;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        int i12;
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
            str = "constructor";
            i12 = 2;
        }
        initPrototypeMethod(QNAME_TAG, i11, str, i12);
    }

    public String localName() {
        return this.localName;
    }

    public String prefix() {
        String str = this.prefix;
        return str == null ? str : "";
    }

    public String toString() {
        String str = this.uri;
        if (str == null) {
            return "*::".concat(this.localName);
        }
        if (str.length() == 0) {
            return this.localName;
        }
        return this.uri + "::" + this.localName;
    }

    public String uri() {
        return this.uri;
    }

    private boolean equals(QName qName) {
        String str = this.uri;
        return str == null ? qName.uri == null && this.localName.equals(qName.localName) : str.equals(qName.uri) && this.localName.equals(qName.localName);
    }
}
