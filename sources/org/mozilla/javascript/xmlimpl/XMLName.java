package org.mozilla.javascript.xmlimpl;

import com.alipay.sdk.m.n.a;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.EcmaError;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xmlimpl.XmlNode;
import zr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class XMLName extends Ref {
    static final long serialVersionUID = 3832176310755686977L;
    private boolean isAttributeName;
    private boolean isDescendants;
    private XmlNode.QName qname;
    private XMLObjectImpl xmlObject;

    private XMLName() {
    }

    public static boolean accept(Object obj) {
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

    private void addAttributes(XMLList xMLList, XML xml) {
        addMatchingAttributes(xMLList, xml);
    }

    private void addDescendantAttributes(XMLList xMLList, XML xml) {
        if (xml.isElement()) {
            addMatchingAttributes(xMLList, xml);
            for (XML xml2 : xml.getChildren()) {
                addDescendantAttributes(xMLList, xml2);
            }
        }
    }

    private void addDescendantChildren(XMLList xMLList, XML xml) {
        if (xml.isElement()) {
            XML[] children = xml.getChildren();
            for (int i11 = 0; i11 < children.length; i11++) {
                if (matches(children[i11])) {
                    xMLList.addToList(children[i11]);
                }
                addDescendantChildren(xMLList, children[i11]);
            }
        }
    }

    public static XMLName create(String str, String str2) {
        if (str2 == null) {
            throw new IllegalArgumentException();
        }
        int length = str2.length();
        if (length != 0) {
            char charAt = str2.charAt(0);
            if (charAt == '*') {
                if (length == 1) {
                    return formStar();
                }
            } else if (charAt == '@') {
                XMLName formProperty = formProperty("", str2.substring(1));
                formProperty.setAttributeName();
                return formProperty;
            }
        }
        return formProperty(str, str2);
    }

    public static XMLName formProperty(XmlNode.Namespace namespace, String str) {
        if (str != null && str.equals("*")) {
            str = null;
        }
        XMLName xMLName = new XMLName();
        xMLName.qname = XmlNode.QName.create(namespace, str);
        return xMLName;
    }

    public static XMLName formStar() {
        XMLName xMLName = new XMLName();
        xMLName.qname = XmlNode.QName.create(null, null);
        return xMLName;
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

    public void addDescendants(XMLList xMLList, XML xml) {
        if (isAttributeName()) {
            matchDescendantAttributes(xMLList, xml);
        } else {
            matchDescendantChildren(xMLList, xml);
        }
    }

    public void addMatches(XMLList xMLList, XML xml) {
        if (isDescendants()) {
            addDescendants(xMLList, xml);
            return;
        }
        if (isAttributeName()) {
            addAttributes(xMLList, xml);
            return;
        }
        XML[] children = xml.getChildren();
        if (children != null) {
            for (int i11 = 0; i11 < children.length; i11++) {
                if (matches(children[i11])) {
                    xMLList.addToList(children[i11]);
                }
            }
        }
        xMLList.setTargets(xml, toQname());
    }

    public void addMatchingAttributes(XMLList xMLList, XML xml) {
        if (xml.isElement()) {
            XML[] attributes = xml.getAttributes();
            for (int i11 = 0; i11 < attributes.length; i11++) {
                if (matches(attributes[i11])) {
                    xMLList.addToList(attributes[i11]);
                }
            }
        }
    }

    @Override // org.mozilla.javascript.Ref
    public boolean delete(Context context) {
        XMLObjectImpl xMLObjectImpl = this.xmlObject;
        if (xMLObjectImpl == null) {
            return true;
        }
        xMLObjectImpl.deleteXMLProperty(this);
        return !this.xmlObject.hasXMLProperty(this);
    }

    @Override // org.mozilla.javascript.Ref
    public Object get(Context context) {
        XMLObjectImpl xMLObjectImpl = this.xmlObject;
        if (xMLObjectImpl != null) {
            return xMLObjectImpl.getXMLProperty(this);
        }
        throw ScriptRuntime.undefReadError(Undefined.instance, toString());
    }

    public XMLList getMyValueOn(XML xml) {
        XMLList newXMLList = xml.newXMLList();
        addMatches(newXMLList, xml);
        return newXMLList;
    }

    @Override // org.mozilla.javascript.Ref
    public boolean has(Context context) {
        XMLObjectImpl xMLObjectImpl = this.xmlObject;
        if (xMLObjectImpl == null) {
            return false;
        }
        return xMLObjectImpl.hasXMLProperty(this);
    }

    public void initXMLObject(XMLObjectImpl xMLObjectImpl) {
        if (xMLObjectImpl == null) {
            throw new IllegalArgumentException();
        }
        if (this.xmlObject != null) {
            throw new IllegalStateException();
        }
        this.xmlObject = xMLObjectImpl;
    }

    public boolean isAttributeName() {
        return this.isAttributeName;
    }

    public boolean isDescendants() {
        return this.isDescendants;
    }

    public String localName() {
        return this.qname.getLocalName() == null ? "*" : this.qname.getLocalName();
    }

    public XMLList matchDescendantAttributes(XMLList xMLList, XML xml) {
        xMLList.setTargets(xml, null);
        addDescendantAttributes(xMLList, xml);
        return xMLList;
    }

    public XMLList matchDescendantChildren(XMLList xMLList, XML xml) {
        xMLList.setTargets(xml, null);
        addDescendantChildren(xMLList, xml);
        return xMLList;
    }

    public final boolean matches(XML xml) {
        XmlNode.QName nodeQname = xml.getNodeQname();
        String uri = nodeQname.getNamespace() != null ? nodeQname.getNamespace().getUri() : null;
        if (this.isAttributeName) {
            if (xml.isAttribute()) {
                return (uri() == null || uri().equals(uri)) && (localName().equals("*") || localName().equals(nodeQname.getLocalName()));
            }
            return false;
        }
        if (uri() == null || (xml.isElement() && uri().equals(uri))) {
            if (localName().equals("*")) {
                return true;
            }
            if (xml.isElement() && localName().equals(nodeQname.getLocalName())) {
                return true;
            }
        }
        return false;
    }

    public final boolean matchesElement(XmlNode.QName qName) {
        if (uri() == null || uri().equals(qName.getNamespace().getUri())) {
            return localName().equals("*") || localName().equals(qName.getLocalName());
        }
        return false;
    }

    public final boolean matchesLocalName(String str) {
        return localName().equals("*") || localName().equals(str);
    }

    @Override // org.mozilla.javascript.Ref
    public Object set(Context context, Object obj) {
        XMLObjectImpl xMLObjectImpl = this.xmlObject;
        if (xMLObjectImpl == null) {
            throw ScriptRuntime.undefWriteError(Undefined.instance, toString(), obj);
        }
        if (this.isDescendants) {
            throw Kit.codeBug();
        }
        xMLObjectImpl.putXMLProperty(this, obj);
        return obj;
    }

    public void setAttributeName() {
        this.isAttributeName = true;
    }

    public void setIsDescendants() {
        this.isDescendants = true;
    }

    public void setMyValueOn(XML xml, Object obj) {
        XMLObjectImpl makeXmlFromString;
        if (obj == null) {
            obj = "null";
        } else if (obj instanceof Undefined) {
            obj = "undefined";
        }
        if (isAttributeName()) {
            xml.setAttribute(this, obj);
            return;
        }
        if (uri() == null && localName().equals("*")) {
            xml.setChildren(obj);
            return;
        }
        if (obj instanceof XMLObjectImpl) {
            makeXmlFromString = (XMLObjectImpl) obj;
            if ((makeXmlFromString instanceof XML) && ((XML) makeXmlFromString).isAttribute()) {
                makeXmlFromString = xml.makeXmlFromString(this, makeXmlFromString.toString());
            }
            if (makeXmlFromString instanceof XMLList) {
                for (int i11 = 0; i11 < makeXmlFromString.length(); i11++) {
                    XMLList xMLList = (XMLList) makeXmlFromString;
                    XML item = xMLList.item(i11);
                    if (item.isAttribute()) {
                        xMLList.replace(i11, xml.makeXmlFromString(this, item.toString()));
                    }
                }
            }
        } else {
            makeXmlFromString = xml.makeXmlFromString(this, ScriptRuntime.toString(obj));
        }
        XMLList propertyList = xml.getPropertyList(this);
        if (propertyList.length() == 0) {
            xml.appendChild(makeXmlFromString);
            return;
        }
        for (int i12 = 1; i12 < propertyList.length(); i12++) {
            xml.removeChild(propertyList.item(i12).childIndex());
        }
        xml.replace(propertyList.item(0).childIndex(), makeXmlFromString);
    }

    public final XmlNode.QName toQname() {
        return this.qname;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.isDescendants) {
            stringBuffer.append(m.f102856e);
        }
        if (this.isAttributeName) {
            stringBuffer.append('@');
        }
        if (uri() == null) {
            stringBuffer.append('*');
            if (localName().equals("*")) {
                return stringBuffer.toString();
            }
        } else {
            stringBuffer.append('\"');
            stringBuffer.append(uri());
            stringBuffer.append('\"');
        }
        stringBuffer.append(':');
        stringBuffer.append(localName());
        return stringBuffer.toString();
    }

    public String uri() {
        if (this.qname.getNamespace() == null) {
            return null;
        }
        return this.qname.getNamespace().getUri();
    }

    public static XMLName formProperty(String str, String str2) {
        return formProperty(XmlNode.Namespace.create(str), str2);
    }

    public static XMLName create(XmlNode.QName qName, boolean z11, boolean z12) {
        XMLName xMLName = new XMLName();
        xMLName.qname = qName;
        xMLName.isAttributeName = z11;
        xMLName.isDescendants = z12;
        return xMLName;
    }

    public static XMLName create(XmlNode.QName qName) {
        return create(qName, false, false);
    }
}
