package org.mozilla.javascript.xmlimpl;

import da0.v1;
import org.junit.jupiter.api.j2;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xmlimpl.XmlNode;

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
    private XmlNode.QName delegate;
    private XMLLibImpl lib;
    private QName prototype;

    private QName() {
    }

    public static QName create(XMLLibImpl xMLLibImpl, Scriptable scriptable, QName qName, XmlNode.QName qName2) {
        QName qName3 = new QName();
        qName3.lib = xMLLibImpl;
        qName3.setParentScope(scriptable);
        qName3.prototype = qName;
        qName3.setPrototype(qName);
        qName3.delegate = qName2;
        return qName3;
    }

    private Object jsConstructor(Context context, boolean z11, Object[] objArr) {
        return (z11 || objArr.length != 1) ? objArr.length == 0 ? constructQName(this.lib, context, Undefined.instance) : objArr.length == 1 ? constructQName(this.lib, context, objArr[0]) : constructQName(this.lib, context, objArr[0], objArr[1]) : castToQName(this.lib, context, objArr[0]);
    }

    private String js_toSource() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        toSourceImpl(uri(), localName(), prefix(), stringBuffer);
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

    public QName castToQName(XMLLibImpl xMLLibImpl, Context context, Object obj) {
        return obj instanceof QName ? (QName) obj : constructQName(xMLLibImpl, context, obj);
    }

    public QName constructQName(XMLLibImpl xMLLibImpl, Context context, Object obj, Object obj2) {
        String prefix;
        if (obj2 instanceof QName) {
            if (obj == Undefined.instance) {
                return (QName) obj2;
            }
            ((QName) obj2).localName();
        }
        Object obj3 = Undefined.instance;
        String scriptRuntime = obj2 == obj3 ? "" : ScriptRuntime.toString(obj2);
        String str = null;
        if (obj == obj3) {
            obj = "*".equals(scriptRuntime) ? null : xMLLibImpl.getDefaultNamespace(context);
        }
        Namespace newNamespace = obj == null ? null : obj instanceof Namespace ? (Namespace) obj : xMLLibImpl.newNamespace(ScriptRuntime.toString(obj));
        if (obj == null) {
            prefix = null;
        } else {
            str = newNamespace.uri();
            prefix = newNamespace.prefix();
        }
        return newQName(xMLLibImpl, str, scriptRuntime, prefix);
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
        exportAsJSClass(3, getParentScope(), z11);
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
    public Object getDefaultValue(Class<?> cls) {
        return toString();
    }

    public final XmlNode.QName getDelegate() {
        return this.delegate;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i11) {
        int maxInstanceId = i11 - super.getMaxInstanceId();
        return maxInstanceId != 1 ? maxInstanceId != 2 ? super.getInstanceIdName(i11) : v1.a.f47590a : "localName";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i11) {
        int maxInstanceId = i11 - super.getMaxInstanceId();
        return maxInstanceId != 1 ? maxInstanceId != 2 ? super.getInstanceIdValue(i11) : uri() : localName();
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return super.getMaxInstanceId() + 2;
    }

    public int hashCode() {
        return this.delegate.hashCode();
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
        return this.delegate.getLocalName() == null ? "*" : this.delegate.getLocalName();
    }

    public QName newQName(XMLLibImpl xMLLibImpl, String str, String str2, String str3) {
        QName qName = this.prototype;
        if (qName == null) {
            qName = this;
        }
        XmlNode.Namespace create = str3 != null ? XmlNode.Namespace.create(str3, str) : str != null ? XmlNode.Namespace.create(str) : null;
        if (str2 != null && str2.equals("*")) {
            str2 = null;
        }
        return create(xMLLibImpl, getParentScope(), qName, XmlNode.QName.create(create, str2));
    }

    public String prefix() {
        if (this.delegate.getNamespace() == null) {
            return null;
        }
        return this.delegate.getNamespace().getPrefix();
    }

    public final XmlNode.QName toNodeQname() {
        return this.delegate;
    }

    public String toString() {
        if (this.delegate.getNamespace() == null) {
            return "*::" + localName();
        }
        if (this.delegate.getNamespace().isGlobal()) {
            return localName();
        }
        return uri() + "::" + localName();
    }

    public String uri() {
        if (this.delegate.getNamespace() == null) {
            return null;
        }
        return this.delegate.getNamespace().getUri();
    }

    private boolean equals(QName qName) {
        return this.delegate.equals(qName.delegate);
    }

    public QName constructQName(XMLLibImpl xMLLibImpl, Context context, Object obj) {
        return constructQName(xMLLibImpl, context, Undefined.instance, obj);
    }
}
