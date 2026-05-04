package org.mozilla.javascript.xml.impl.xmlbeans;

import com.alipay.sdk.m.n.a;
import java.io.Serializable;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xml.XMLLib;
import org.mozilla.javascript.xml.XMLObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class XMLLibImpl extends XMLLib implements Serializable {
    private static final long serialVersionUID = 1;
    private Scriptable globalScope;
    boolean ignoreComments;
    boolean ignoreProcessingInstructions;
    boolean ignoreWhitespace;
    Namespace namespacePrototype;
    int prettyIndent;
    boolean prettyPrinting;
    QName qnamePrototype;
    XMLList xmlListPrototype;
    XML xmlPrototype;

    private XMLLibImpl(Scriptable scriptable) {
        this.globalScope = scriptable;
        defaultSettings();
    }

    private static RuntimeException badXMLName(Object obj) {
        String str;
        if (obj instanceof Number) {
            str = "Can not construct XML name from number: ";
        } else if (obj instanceof Boolean) {
            str = "Can not construct XML name from boolean: ";
        } else {
            if (obj != Undefined.instance && obj != null) {
                throw new IllegalArgumentException(obj.toString());
            }
            str = "Can not construct XML name from ";
        }
        return ScriptRuntime.typeError(str + ScriptRuntime.toString(obj));
    }

    private void exportToScope(boolean z11) {
        this.xmlPrototype = XML.createEmptyXML(this);
        this.xmlListPrototype = new XMLList(this);
        this.namespacePrototype = new Namespace(this, "", "");
        this.qnamePrototype = new QName(this, "", "", "");
        this.xmlPrototype.exportAsJSClass(z11);
        this.xmlListPrototype.exportAsJSClass(z11);
        this.namespacePrototype.exportAsJSClass(z11);
        this.qnamePrototype.exportAsJSClass(z11);
    }

    public static void init(Context context, Scriptable scriptable, boolean z11) {
        XMLLibImpl xMLLibImpl = new XMLLibImpl(scriptable);
        if (xMLLibImpl.bindToScope(scriptable) == xMLLibImpl) {
            xMLLibImpl.exportToScope(z11);
        }
    }

    private static boolean isNCNameChar(int i11) {
        return (i11 & a.f10855g) == 0 ? i11 >= 97 ? i11 <= 122 : i11 >= 65 ? i11 <= 90 || i11 == 95 : i11 >= 48 ? i11 <= 57 : i11 == 45 || i11 == 46 : (i11 & (-8192)) == 0 ? isNCNameStartChar(i11) || i11 == 183 || (768 <= i11 && i11 <= 879) : isNCNameStartChar(i11) || (8255 <= i11 && i11 <= 8256);
    }

    private static boolean isNCNameStartChar(int i11) {
        if ((i11 & a.f10855g) == 0) {
            if (i11 >= 97) {
                return i11 <= 122;
            }
            if (i11 >= 65) {
                return i11 <= 90 || i11 == 95;
            }
        } else if ((i11 & (-8192)) == 0) {
            return (192 <= i11 && i11 <= 214) || (216 <= i11 && i11 <= 246) || ((248 <= i11 && i11 <= 767) || ((880 <= i11 && i11 <= 893) || 895 <= i11));
        }
        return (8204 <= i11 && i11 <= 8205) || (8304 <= i11 && i11 <= 8591) || ((11264 <= i11 && i11 <= 12271) || ((12289 <= i11 && i11 <= 55295) || ((63744 <= i11 && i11 <= 64975) || ((65008 <= i11 && i11 <= 65533) || (65536 <= i11 && i11 <= 983039)))));
    }

    private Ref xmlPrimaryReference(Context context, XMLName xMLName, Scriptable scriptable) {
        XMLObjectImpl xMLObjectImpl;
        XMLObjectImpl xMLObjectImpl2 = null;
        while (true) {
            if (scriptable instanceof XMLWithScope) {
                xMLObjectImpl = (XMLObjectImpl) scriptable.getPrototype();
                if (xMLObjectImpl.hasXMLProperty(xMLName)) {
                    break;
                }
                if (xMLObjectImpl2 == null) {
                    xMLObjectImpl2 = xMLObjectImpl;
                }
            }
            scriptable = scriptable.getParentScope();
            if (scriptable == null) {
                xMLObjectImpl = xMLObjectImpl2;
                break;
            }
        }
        if (xMLObjectImpl != null) {
            xMLName.initXMLObject(xMLObjectImpl);
        }
        return xMLName;
    }

    public Object addXMLObjects(Context context, XMLObject xMLObject, XMLObject xMLObject2) {
        XMLList xMLList = new XMLList(this);
        if (xMLObject instanceof XMLList) {
            XMLList xMLList2 = (XMLList) xMLObject;
            if (xMLList2.length() == 1) {
                xMLList.addToList(xMLList2.item(0));
            } else {
                xMLList = new XMLList(this, xMLObject);
            }
        } else {
            xMLList.addToList(xMLObject);
        }
        if (xMLObject2 instanceof XMLList) {
            XMLList xMLList3 = (XMLList) xMLObject2;
            for (int i11 = 0; i11 < xMLList3.length(); i11++) {
                xMLList.addToList(xMLList3.item(i11));
            }
        } else if (xMLObject2 instanceof XML) {
            xMLList.addToList(xMLObject2);
        }
        return xMLList;
    }

    public Namespace castToNamespace(Context context, Object obj) {
        return obj instanceof Namespace ? (Namespace) obj : constructNamespace(context, obj);
    }

    public QName castToQName(Context context, Object obj) {
        return obj instanceof QName ? (QName) obj : constructQName(context, obj);
    }

    public Namespace constructNamespace(Context context, Object obj) {
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
                String prefix = qName.prefix();
                scriptRuntime = uri;
                str = prefix;
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
        return new Namespace(this, str, scriptRuntime);
    }

    public QName constructQName(Context context, Object obj) {
        if (!(obj instanceof QName)) {
            return constructQNameFromString(context, ScriptRuntime.toString(obj));
        }
        QName qName = (QName) obj;
        return new QName(this, qName.uri(), qName.localName(), qName.prefix());
    }

    public QName constructQNameFromString(Context context, String str) {
        String prefix;
        String str2;
        if (str == null) {
            throw new IllegalArgumentException();
        }
        if ("*".equals(str)) {
            str2 = null;
            prefix = null;
        } else {
            Namespace defaultNamespace = getDefaultNamespace(context);
            String uri = defaultNamespace.uri();
            prefix = defaultNamespace.prefix();
            str2 = uri;
        }
        return new QName(this, str2, str, prefix);
    }

    public void defaultSettings() {
        this.ignoreComments = true;
        this.ignoreProcessingInstructions = true;
        this.ignoreWhitespace = true;
        this.prettyPrinting = true;
        this.prettyIndent = 2;
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public String escapeAttributeValue(Object obj) {
        String scriptRuntime = ScriptRuntime.toString(obj);
        if (scriptRuntime.length() == 0) {
            return "";
        }
        XmlObject newInstance = XmlObject.Factory.newInstance();
        XmlCursor newCursor = newInstance.newCursor();
        newCursor.toNextToken();
        newCursor.beginElement("a");
        newCursor.insertAttributeWithValue("a", scriptRuntime);
        newCursor.dispose();
        String obj2 = newInstance.toString();
        return obj2.substring(obj2.indexOf(34) + 1, obj2.lastIndexOf(34));
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public String escapeTextValue(Object obj) {
        if (obj instanceof XMLObjectImpl) {
            return ((XMLObjectImpl) obj).toXMLString(0);
        }
        String scriptRuntime = ScriptRuntime.toString(obj);
        if (scriptRuntime.length() == 0) {
            return scriptRuntime;
        }
        XmlObject newInstance = XmlObject.Factory.newInstance();
        XmlCursor newCursor = newInstance.newCursor();
        newCursor.toNextToken();
        newCursor.beginElement("a");
        newCursor.insertChars(scriptRuntime);
        newCursor.dispose();
        String obj2 = newInstance.toString();
        int indexOf = obj2.indexOf(62) + 1;
        int lastIndexOf = obj2.lastIndexOf(60);
        return indexOf < lastIndexOf ? obj2.substring(indexOf, lastIndexOf) : "";
    }

    public Namespace getDefaultNamespace(Context context) {
        if (context == null && (context = Context.getCurrentContext()) == null) {
            return this.namespacePrototype;
        }
        Object searchDefaultNamespace = ScriptRuntime.searchDefaultNamespace(context);
        return searchDefaultNamespace == null ? this.namespacePrototype : searchDefaultNamespace instanceof Namespace ? (Namespace) searchDefaultNamespace : this.namespacePrototype;
    }

    public String getDefaultNamespaceURI(Context context) {
        Object searchDefaultNamespace;
        if (context == null) {
            context = Context.getCurrentContext();
        }
        return (context == null || (searchDefaultNamespace = ScriptRuntime.searchDefaultNamespace(context)) == null || !(searchDefaultNamespace instanceof Namespace)) ? "" : ((Namespace) searchDefaultNamespace).uri();
    }

    public Scriptable globalScope() {
        return this.globalScope;
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public boolean isXMLName(Context context, Object obj) {
        try {
            String scriptRuntime = ScriptRuntime.toString(obj);
            int length = scriptRuntime.length();
            if (length == 0 || !isNCNameStartChar(scriptRuntime.charAt(0))) {
                return false;
            }
            for (int i11 = 1; i11 != length; i11++) {
                if (!isNCNameChar(scriptRuntime.charAt(i11))) {
                    return false;
                }
            }
            return true;
        } catch (EcmaError e11) {
            if ("TypeError".equals(e11.getName())) {
                return false;
            }
            throw e11;
        }
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public Ref nameRef(Context context, Object obj, Scriptable scriptable, int i11) {
        if ((i11 & 2) != 0) {
            return xmlPrimaryReference(context, toAttributeName(context, obj), scriptable);
        }
        throw Kit.codeBug();
    }

    public XMLName toAttributeName(Context context, Object obj) {
        String scriptRuntime;
        String str = "";
        if (obj instanceof String) {
            scriptRuntime = (String) obj;
        } else {
            if (obj instanceof XMLName) {
                XMLName xMLName = (XMLName) obj;
                if (!xMLName.isAttributeName()) {
                    xMLName.setAttributeName();
                }
                return xMLName;
            }
            if (obj instanceof QName) {
                QName qName = (QName) obj;
                str = qName.uri();
                scriptRuntime = qName.localName();
            } else {
                if ((obj instanceof Boolean) || (obj instanceof Number) || obj == Undefined.instance || obj == null) {
                    throw badXMLName(obj);
                }
                scriptRuntime = ScriptRuntime.toString(obj);
            }
        }
        XMLName formProperty = XMLName.formProperty(str, scriptRuntime);
        formProperty.setAttributeName();
        return formProperty;
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public Object toDefaultXmlNamespace(Context context, Object obj) {
        return constructNamespace(context, obj);
    }

    public XMLName toQualifiedName(Context context, Object obj, Object obj2) {
        Namespace constructNamespace;
        String localName = obj2 instanceof QName ? ((QName) obj2).localName() : ScriptRuntime.toString(obj2);
        if (obj == Undefined.instance) {
            if (!"*".equals(localName)) {
                constructNamespace = getDefaultNamespace(context);
            }
            constructNamespace = null;
        } else {
            if (obj != null) {
                constructNamespace = obj instanceof Namespace ? (Namespace) obj : constructNamespace(context, obj);
            }
            constructNamespace = null;
        }
        return XMLName.formProperty(constructNamespace != null ? constructNamespace.uri() : null, localName);
    }

    public XMLName toXMLName(Context context, Object obj) {
        if (obj instanceof XMLName) {
            return (XMLName) obj;
        }
        if (obj instanceof QName) {
            QName qName = (QName) obj;
            return XMLName.formProperty(qName.uri(), qName.localName());
        }
        if (obj instanceof String) {
            return toXMLNameFromString(context, (String) obj);
        }
        if ((obj instanceof Boolean) || (obj instanceof Number) || obj == Undefined.instance || obj == null) {
            throw badXMLName(obj);
        }
        return toXMLNameFromString(context, ScriptRuntime.toString(obj));
    }

    public XMLName toXMLNameFromString(Context context, String str) {
        if (str == null) {
            throw new IllegalArgumentException();
        }
        int length = str.length();
        if (length != 0) {
            char charAt = str.charAt(0);
            if (charAt == '*') {
                if (length == 1) {
                    return XMLName.formStar();
                }
            } else if (charAt == '@') {
                XMLName formProperty = XMLName.formProperty("", str.substring(1));
                formProperty.setAttributeName();
                return formProperty;
            }
        }
        return XMLName.formProperty(getDefaultNamespaceURI(context), str);
    }

    public XMLName toXMLNameOrIndex(Context context, Object obj) {
        if (obj instanceof XMLName) {
            return (XMLName) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            long testUint32String = ScriptRuntime.testUint32String(str);
            if (testUint32String < 0) {
                return toXMLNameFromString(context, str);
            }
            ScriptRuntime.storeUint32Result(context, testUint32String);
            return null;
        }
        if (obj instanceof Number) {
            double doubleValue = ((Number) obj).doubleValue();
            long j11 = (long) doubleValue;
            if (j11 != doubleValue || 0 > j11 || j11 > 4294967295L) {
                throw badXMLName(obj);
            }
            ScriptRuntime.storeUint32Result(context, j11);
            return null;
        }
        if (obj instanceof QName) {
            QName qName = (QName) obj;
            String uri = qName.uri();
            if (uri != null && uri.length() == 0) {
                long testUint32String2 = ScriptRuntime.testUint32String(uri);
                if (testUint32String2 >= 0) {
                    ScriptRuntime.storeUint32Result(context, testUint32String2);
                    return null;
                }
            }
            return XMLName.formProperty(uri, qName.localName());
        }
        if ((obj instanceof Boolean) || obj == Undefined.instance || obj == null) {
            throw badXMLName(obj);
        }
        String scriptRuntime = ScriptRuntime.toString(obj);
        long testUint32String3 = ScriptRuntime.testUint32String(scriptRuntime);
        if (testUint32String3 < 0) {
            return toXMLNameFromString(context, scriptRuntime);
        }
        ScriptRuntime.storeUint32Result(context, testUint32String3);
        return null;
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public Ref nameRef(Context context, Object obj, Object obj2, Scriptable scriptable, int i11) {
        XMLName qualifiedName = toQualifiedName(context, obj, obj2);
        if ((i11 & 2) != 0 && !qualifiedName.isAttributeName()) {
            qualifiedName.setAttributeName();
        }
        return xmlPrimaryReference(context, qualifiedName, scriptable);
    }

    public QName constructQName(Context context, Object obj, Object obj2) {
        String scriptRuntime;
        Namespace constructNamespace;
        String prefix;
        if (obj2 instanceof QName) {
            scriptRuntime = ((QName) obj2).localName();
        } else {
            scriptRuntime = ScriptRuntime.toString(obj2);
        }
        String str = null;
        if (obj == Undefined.instance) {
            if (!"*".equals(scriptRuntime)) {
                constructNamespace = getDefaultNamespace(context);
            }
            constructNamespace = null;
        } else {
            if (obj != null) {
                if (obj instanceof Namespace) {
                    constructNamespace = (Namespace) obj;
                } else {
                    constructNamespace = constructNamespace(context, obj);
                }
            }
            constructNamespace = null;
        }
        if (constructNamespace == null) {
            prefix = null;
        } else {
            str = constructNamespace.uri();
            prefix = constructNamespace.prefix();
        }
        return new QName(this, str, scriptRuntime, prefix);
    }

    public Namespace constructNamespace(Context context) {
        return new Namespace(this, "", "");
    }

    public Namespace constructNamespace(Context context, Object obj, Object obj2) {
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
        } else if (obj != Undefined.instance && isXMLName(context, obj)) {
            str = ScriptRuntime.toString(obj);
        }
        return new Namespace(this, str, scriptRuntime);
    }
}
