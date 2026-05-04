package org.mozilla.javascript.xmlimpl;

import da0.v1;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xmlimpl.XmlNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class Namespace extends IdScriptableObject {
    private static final int Id_constructor = 1;
    private static final int Id_prefix = 1;
    private static final int Id_toSource = 3;
    private static final int Id_toString = 2;
    private static final int Id_uri = 2;
    private static final int MAX_INSTANCE_ID = 2;
    private static final int MAX_PROTOTYPE_ID = 3;
    private static final Object NAMESPACE_TAG = "Namespace";
    static final long serialVersionUID = -5765755238131301744L;

    /* renamed from: ns, reason: collision with root package name */
    private XmlNode.Namespace f78418ns;
    private Namespace prototype;

    private Namespace() {
    }

    public static Namespace create(Scriptable scriptable, Namespace namespace, XmlNode.Namespace namespace2) {
        Namespace namespace3 = new Namespace();
        namespace3.setParentScope(scriptable);
        namespace3.prototype = namespace;
        namespace3.setPrototype(namespace);
        namespace3.f78418ns = namespace2;
        return namespace3;
    }

    private boolean equals(Namespace namespace) {
        return uri().equals(namespace.uri());
    }

    private Object jsConstructor(Context context, boolean z11, Object[] objArr) {
        return (z11 || objArr.length != 1) ? objArr.length == 0 ? constructNamespace() : objArr.length == 1 ? constructNamespace(objArr[0]) : constructNamespace(objArr[0], objArr[1]) : castToNamespace(objArr[0]);
    }

    private String js_toSource() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        toSourceImpl(this.f78418ns.getPrefix(), this.f78418ns.getUri(), stringBuffer);
        stringBuffer.append(')');
        return stringBuffer.toString();
    }

    private Namespace realThis(Scriptable scriptable, IdFunctionObject idFunctionObject) {
        if (scriptable instanceof Namespace) {
            return (Namespace) scriptable;
        }
        throw IdScriptableObject.incompatibleCallError(idFunctionObject);
    }

    public static void toSourceImpl(String str, String str2, StringBuffer stringBuffer) {
        stringBuffer.append("new Namespace(");
        if (str2.length() != 0) {
            stringBuffer.append('\'');
            if (str != null) {
                stringBuffer.append(ScriptRuntime.escapeString(str, '\''));
                stringBuffer.append("', '");
            }
            stringBuffer.append(ScriptRuntime.escapeString(str2, '\''));
            stringBuffer.append('\'');
        } else if (!"".equals(str)) {
            throw new IllegalArgumentException(str);
        }
        stringBuffer.append(')');
    }

    public Namespace castToNamespace(Object obj) {
        return obj instanceof Namespace ? (Namespace) obj : constructNamespace(obj);
    }

    public Namespace constructNamespace(Object obj) {
        String scriptRuntime;
        String str;
        if (obj instanceof Namespace) {
            Namespace namespace = (Namespace) obj;
            str = namespace.prefix();
            scriptRuntime = namespace.uri();
        } else if (obj instanceof QName) {
            QName qName = (QName) obj;
            String uri = qName.uri();
            if (uri != null) {
                str = qName.prefix();
                scriptRuntime = uri;
            } else {
                scriptRuntime = qName.toString();
                str = null;
            }
        } else {
            scriptRuntime = ScriptRuntime.toString(obj);
            if (scriptRuntime.length() == 0) {
                str = "";
            }
            str = null;
        }
        return newNamespace(str, scriptRuntime);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public Object equivalentValues(Object obj) {
        return !(obj instanceof Namespace) ? Scriptable.NOT_FOUND : equals((Namespace) obj) ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        if (!idFunctionObject.hasTag(NAMESPACE_TAG)) {
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
        } else if (length == 6) {
            str2 = "prefix";
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
        return "Namespace";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        return uri();
    }

    public final XmlNode.Namespace getDelegate() {
        return this.f78418ns;
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public String getInstanceIdName(int i11) {
        int maxInstanceId = i11 - super.getMaxInstanceId();
        return maxInstanceId != 1 ? maxInstanceId != 2 ? super.getInstanceIdName(i11) : v1.a.f47590a : "prefix";
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public Object getInstanceIdValue(int i11) {
        int maxInstanceId = i11 - super.getMaxInstanceId();
        return maxInstanceId != 1 ? maxInstanceId != 2 ? super.getInstanceIdValue(i11) : this.f78418ns.getUri() : this.f78418ns.getPrefix() == null ? Undefined.instance : this.f78418ns.getPrefix();
    }

    @Override // org.mozilla.javascript.IdScriptableObject
    public int getMaxInstanceId() {
        return super.getMaxInstanceId() + 2;
    }

    public int hashCode() {
        return uri().hashCode();
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
        initPrototypeMethod(NAMESPACE_TAG, i11, str, i12);
    }

    public Namespace newNamespace(String str) {
        Namespace namespace = this.prototype;
        if (namespace == null) {
            namespace = this;
        }
        return create(getParentScope(), namespace, XmlNode.Namespace.create(str));
    }

    public String prefix() {
        return this.f78418ns.getPrefix();
    }

    public String toLocaleString() {
        return toString();
    }

    public String toString() {
        return uri();
    }

    public String uri() {
        return this.f78418ns.getUri();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Namespace) {
            return equals((Namespace) obj);
        }
        return false;
    }

    public Namespace newNamespace(String str, String str2) {
        if (str == null) {
            return newNamespace(str2);
        }
        Namespace namespace = this.prototype;
        if (namespace == null) {
            namespace = this;
        }
        return create(getParentScope(), namespace, XmlNode.Namespace.create(str, str2));
    }

    private Namespace constructNamespace(Object obj, Object obj2) {
        String scriptRuntime;
        if (obj2 instanceof QName) {
            QName qName = (QName) obj2;
            scriptRuntime = qName.uri();
            if (scriptRuntime == null) {
                scriptRuntime = qName.toString();
            }
        } else {
            scriptRuntime = ScriptRuntime.toString(obj2);
        }
        String str = "";
        if (scriptRuntime.length() == 0) {
            if (obj != Undefined.instance) {
                str = ScriptRuntime.toString(obj);
                if (str.length() != 0) {
                    throw ScriptRuntime.typeError("Illegal prefix '" + str + "' for 'no namespace'.");
                }
            }
        } else if (obj != Undefined.instance && XMLName.accept(obj)) {
            str = ScriptRuntime.toString(obj);
        }
        return newNamespace(str, scriptRuntime);
    }

    private Namespace constructNamespace() {
        return newNamespace("", "");
    }
}
