package org.mozilla.javascript.xmlimpl;

import java.io.Serializable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.Wrapper;
import org.mozilla.javascript.xml.XMLLib;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.XmlNode;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class XMLLibImpl extends XMLLib implements Serializable {
    private static final long serialVersionUID = 1;
    private Scriptable globalScope;
    private Namespace namespacePrototype;
    private XmlProcessor options = new XmlProcessor();
    private QName qnamePrototype;
    private XMLList xmlListPrototype;
    private XML xmlPrototype;

    private XMLLibImpl(Scriptable scriptable) {
        this.globalScope = scriptable;
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
        this.xmlPrototype = newXML(XmlNode.createText(this.options, ""));
        this.xmlListPrototype = newXMLList();
        this.namespacePrototype = Namespace.create(this.globalScope, null, XmlNode.Namespace.GLOBAL);
        this.qnamePrototype = QName.create(this, this.globalScope, null, XmlNode.QName.create(XmlNode.Namespace.create(""), ""));
        this.xmlPrototype.exportAsJSClass(z11);
        this.xmlListPrototype.exportAsJSClass(z11);
        this.namespacePrototype.exportAsJSClass(z11);
        this.qnamePrototype.exportAsJSClass(z11);
    }

    private String getDefaultNamespaceURI(Context context) {
        return getDefaultNamespace(context).uri();
    }

    public static void init(Context context, Scriptable scriptable, boolean z11) {
        XMLLibImpl xMLLibImpl = new XMLLibImpl(scriptable);
        if (xMLLibImpl.bindToScope(scriptable) == xMLLibImpl) {
            xMLLibImpl.exportToScope(z11);
        }
    }

    private XML parse(String str) {
        try {
            return newXML(XmlNode.createElement(this.options, getDefaultNamespaceURI(Context.getCurrentContext()), str));
        } catch (SAXException e11) {
            throw ScriptRuntime.typeError("Cannot parse XML: " + e11.getMessage());
        }
    }

    public static Node toDomNode(Object obj) {
        if (obj instanceof XML) {
            return ((XML) obj).toDomNode();
        }
        throw new IllegalArgumentException("xmlObject is not an XML object in JavaScript.");
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
        XMLList newXMLList = newXMLList();
        if (xMLObject instanceof XMLList) {
            XMLList xMLList = (XMLList) xMLObject;
            if (xMLList.length() == 1) {
                newXMLList.addToList(xMLList.item(0));
            } else {
                newXMLList = newXMLListFrom(xMLObject);
            }
        } else {
            newXMLList.addToList(xMLObject);
        }
        if (xMLObject2 instanceof XMLList) {
            XMLList xMLList2 = (XMLList) xMLObject2;
            for (int i11 = 0; i11 < xMLList2.length(); i11++) {
                newXMLList.addToList(xMLList2.item(i11));
            }
        } else if (xMLObject2 instanceof XML) {
            newXMLList.addToList(xMLObject2);
        }
        return newXMLList;
    }

    public Namespace castToNamespace(Context context, Object obj) {
        return this.namespacePrototype.castToNamespace(obj);
    }

    public QName castToQName(Context context, Object obj) {
        return this.qnamePrototype.castToQName(this, context, obj);
    }

    public QName constructQName(Context context, Object obj, Object obj2) {
        return this.qnamePrototype.constructQName(this, context, obj, obj2);
    }

    public Namespace[] createNamespaces(XmlNode.Namespace[] namespaceArr) {
        Namespace[] namespaceArr2 = new Namespace[namespaceArr.length];
        for (int i11 = 0; i11 < namespaceArr.length; i11++) {
            namespaceArr2[i11] = this.namespacePrototype.newNamespace(namespaceArr[i11].getPrefix(), namespaceArr[i11].getUri());
        }
        return namespaceArr2;
    }

    public final XML ecmaToXml(Object obj) {
        if (obj == null || obj == Undefined.instance) {
            throw ScriptRuntime.typeError("Cannot convert " + obj + " to XML");
        }
        if (obj instanceof XML) {
            return (XML) obj;
        }
        if (obj instanceof XMLList) {
            XMLList xMLList = (XMLList) obj;
            if (xMLList.getXML() != null) {
                return xMLList.getXML();
            }
            throw ScriptRuntime.typeError("Cannot convert list of >1 element to XML");
        }
        if (obj instanceof Wrapper) {
            obj = ((Wrapper) obj).unwrap();
        }
        if (obj instanceof Node) {
            return newXML(XmlNode.createElementFromNode((Node) obj));
        }
        String scriptRuntime = ScriptRuntime.toString(obj);
        return (scriptRuntime.length() <= 0 || scriptRuntime.charAt(0) != '<') ? newXML(XmlNode.createText(this.options, scriptRuntime)) : parse(scriptRuntime);
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public String escapeAttributeValue(Object obj) {
        return this.options.escapeAttributeValue(obj);
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public String escapeTextValue(Object obj) {
        return this.options.escapeTextValue(obj);
    }

    public Namespace getDefaultNamespace(Context context) {
        if (context == null && (context = Context.getCurrentContext()) == null) {
            return this.namespacePrototype;
        }
        Object searchDefaultNamespace = ScriptRuntime.searchDefaultNamespace(context);
        return searchDefaultNamespace == null ? this.namespacePrototype : searchDefaultNamespace instanceof Namespace ? (Namespace) searchDefaultNamespace : this.namespacePrototype;
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public int getPrettyIndent() {
        return this.options.getPrettyIndent();
    }

    public XmlProcessor getProcessor() {
        return this.options;
    }

    public Scriptable globalScope() {
        return this.globalScope;
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public boolean isIgnoreComments() {
        return this.options.isIgnoreComments();
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public boolean isIgnoreProcessingInstructions() {
        return this.options.isIgnoreProcessingInstructions();
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public boolean isIgnoreWhitespace() {
        return this.options.isIgnoreWhitespace();
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public boolean isPrettyPrinting() {
        return this.options.isPrettyPrinting();
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public boolean isXMLName(Context context, Object obj) {
        return XMLName.accept(obj);
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public Ref nameRef(Context context, Object obj, Scriptable scriptable, int i11) {
        if ((i11 & 2) != 0) {
            return xmlPrimaryReference(context, toAttributeName(context, obj), scriptable);
        }
        throw Kit.codeBug();
    }

    public Namespace newNamespace(String str) {
        return this.namespacePrototype.newNamespace(str);
    }

    public QName newQName(String str, String str2, String str3) {
        return this.qnamePrototype.newQName(this, str, str2, str3);
    }

    public final XML newTextElementXML(XmlNode xmlNode, XmlNode.QName qName, String str) {
        return newXML(XmlNode.newElementWithText(this.options, xmlNode, qName, str));
    }

    public XML newXML(XmlNode xmlNode) {
        return new XML(this, this.globalScope, this.xmlPrototype, xmlNode);
    }

    public final XML newXMLFromJs(Object obj) {
        String xMLString = (obj == null || obj == Undefined.instance) ? "" : obj instanceof XMLObjectImpl ? ((XMLObjectImpl) obj).toXMLString() : ScriptRuntime.toString(obj);
        if (xMLString.trim().startsWith("<>")) {
            throw ScriptRuntime.typeError("Invalid use of XML object anonymous tags <></>.");
        }
        return xMLString.indexOf("<") == -1 ? newXML(XmlNode.createText(this.options, xMLString)) : parse(xMLString);
    }

    public XMLList newXMLList() {
        return new XMLList(this, this.globalScope, this.xmlListPrototype);
    }

    public final XMLList newXMLListFrom(Object obj) {
        XMLList newXMLList = newXMLList();
        if (obj != null) {
            if (obj instanceof Undefined) {
                return newXMLList;
            }
            if (obj instanceof XML) {
                newXMLList.getNodeList().add((XML) obj);
                return newXMLList;
            }
            if (obj instanceof XMLList) {
                newXMLList.getNodeList().add(((XMLList) obj).getNodeList());
                return newXMLList;
            }
            String trim = ScriptRuntime.toString(obj).trim();
            if (!trim.startsWith("<>")) {
                trim = "<>" + trim + "</>";
            }
            String str = "<fragment>" + trim.substring(2);
            if (!str.endsWith("</>")) {
                throw ScriptRuntime.typeError("XML with anonymous tag missing end anonymous tag");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.substring(0, str.length() - 3));
            sb2.append("</fragment>");
            XMLList children = newXMLFromJs(sb2.toString()).children();
            for (int i11 = 0; i11 < children.getNodeList().length(); i11++) {
                newXMLList.getNodeList().add((XML) children.item(i11).copy());
            }
        }
        return newXMLList;
    }

    public QName qnamePrototype() {
        return this.qnamePrototype;
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public void setIgnoreComments(boolean z11) {
        this.options.setIgnoreComments(z11);
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public void setIgnoreProcessingInstructions(boolean z11) {
        this.options.setIgnoreProcessingInstructions(z11);
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public void setIgnoreWhitespace(boolean z11) {
        this.options.setIgnoreWhitespace(z11);
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public void setPrettyIndent(int i11) {
        this.options.setPrettyIndent(i11);
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public void setPrettyPrinting(boolean z11) {
        this.options.setPrettyPrinting(z11);
    }

    public XMLName toAttributeName(Context context, Object obj) {
        if (obj instanceof XMLName) {
            return (XMLName) obj;
        }
        if (obj instanceof QName) {
            return XMLName.create(((QName) obj).getDelegate(), true, false);
        }
        if ((obj instanceof Boolean) || (obj instanceof Number) || obj == Undefined.instance || obj == null) {
            throw badXMLName(obj);
        }
        String scriptRuntime = obj instanceof String ? (String) obj : ScriptRuntime.toString(obj);
        if (scriptRuntime != null && scriptRuntime.equals("*")) {
            scriptRuntime = null;
        }
        return XMLName.create(XmlNode.QName.create(XmlNode.Namespace.create(""), scriptRuntime), true, false);
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public Object toDefaultXmlNamespace(Context context, Object obj) {
        return this.namespacePrototype.constructNamespace(obj);
    }

    public XmlNode.QName toNodeQName(Context context, Object obj, Object obj2) {
        XmlNode.Namespace delegate;
        String localName = obj2 instanceof QName ? ((QName) obj2).localName() : ScriptRuntime.toString(obj2);
        if (obj == Undefined.instance) {
            if (!"*".equals(localName)) {
                delegate = getDefaultNamespace(context).getDelegate();
            }
            delegate = null;
        } else {
            if (obj != null) {
                delegate = obj instanceof Namespace ? ((Namespace) obj).getDelegate() : this.namespacePrototype.constructNamespace(obj).getDelegate();
            }
            delegate = null;
        }
        if (localName != null && localName.equals("*")) {
            localName = null;
        }
        return XmlNode.QName.create(delegate, localName);
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
        return XMLName.create(getDefaultNamespaceURI(context), str);
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

    public QName constructQName(Context context, Object obj) {
        return this.qnamePrototype.constructQName(this, context, obj);
    }

    public QName newQName(XmlNode.QName qName) {
        return QName.create(this, this.globalScope, this.qnamePrototype, qName);
    }

    @Override // org.mozilla.javascript.xml.XMLLib
    public Ref nameRef(Context context, Object obj, Object obj2, Scriptable scriptable, int i11) {
        XMLName create = XMLName.create(toNodeQName(context, obj, obj2), false, false);
        if ((i11 & 2) != 0 && !create.isAttributeName()) {
            create.setAttributeName();
        }
        return xmlPrimaryReference(context, create, scriptable);
    }

    public XmlNode.QName toNodeQName(Context context, String str, boolean z11) {
        XmlNode.Namespace delegate = getDefaultNamespace(context).getDelegate();
        if (str != null && str.equals("*")) {
            return XmlNode.QName.create(null, null);
        }
        if (z11) {
            return XmlNode.QName.create(XmlNode.Namespace.GLOBAL, str);
        }
        return XmlNode.QName.create(delegate, str);
    }

    public XmlNode.QName toNodeQName(Context context, Object obj, boolean z11) {
        String scriptRuntime;
        if (obj instanceof XMLName) {
            return ((XMLName) obj).toQname();
        }
        if (obj instanceof QName) {
            return ((QName) obj).getDelegate();
        }
        if (!(obj instanceof Boolean) && !(obj instanceof Number) && obj != Undefined.instance && obj != null) {
            if (obj instanceof String) {
                scriptRuntime = (String) obj;
            } else {
                scriptRuntime = ScriptRuntime.toString(obj);
            }
            return toNodeQName(context, scriptRuntime, z11);
        }
        throw badXMLName(obj);
    }
}
