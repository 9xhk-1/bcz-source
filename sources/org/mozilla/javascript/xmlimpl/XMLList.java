package org.mozilla.javascript.xmlimpl;

import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xmlimpl.XmlNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class XMLList extends XMLObjectImpl implements Function {
    static final long serialVersionUID = -4543618751670781135L;
    private XmlNode.InternalList _annos;
    private XMLObjectImpl targetObject;
    private XmlNode.QName targetProperty;

    public XMLList(XMLLibImpl xMLLibImpl, Scriptable scriptable, XMLObject xMLObject) {
        super(xMLLibImpl, scriptable, xMLObject);
        this.targetObject = null;
        this.targetProperty = null;
        this._annos = new XmlNode.InternalList();
    }

    private Object applyOrCall(boolean z11, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        String str = z11 ? "apply" : NotificationCompat.CATEGORY_CALL;
        if (!(scriptable2 instanceof XMLList) || ((XMLList) scriptable2).targetProperty == null) {
            throw ScriptRuntime.typeError1("msg.isnt.function", str);
        }
        return ScriptRuntime.applyOrCall(z11, context, scriptable, scriptable2, objArr);
    }

    private XMLList getPropertyList(XMLName xMLName) {
        XMLList newXMLList = newXMLList();
        newXMLList.setTargets(this, (xMLName.isDescendants() || xMLName.isAttributeName()) ? null : xMLName.toQname());
        for (int i11 = 0; i11 < length(); i11++) {
            newXMLList.addToList(getXmlFromAnnotation(i11).getPropertyList(xMLName));
        }
        return newXMLList;
    }

    private XML getXmlFromAnnotation(int i11) {
        return getXML(this._annos, i11);
    }

    private void insert(int i11, XML xml) {
        if (i11 < length()) {
            XmlNode.InternalList internalList = new XmlNode.InternalList();
            internalList.add(this._annos, 0, i11);
            internalList.add(xml);
            internalList.add(this._annos, i11, length());
            this._annos = internalList;
        }
    }

    private void internalRemoveFromList(int i11) {
        this._annos.remove(i11);
    }

    private void replaceNode(XML xml, XML xml2) {
        xml.replaceWith(xml2);
    }

    private void setAttribute(XMLName xMLName, Object obj) {
        for (int i11 = 0; i11 < length(); i11++) {
            getXmlFromAnnotation(i11).setAttribute(xMLName, obj);
        }
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public void addMatches(XMLList xMLList, XMLName xMLName) {
        for (int i11 = 0; i11 < length(); i11++) {
            getXmlFromAnnotation(i11).addMatches(xMLList, xMLName);
        }
    }

    public void addToList(Object obj) {
        this._annos.addToList(obj);
    }

    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Scriptable scriptable3;
        XMLObject xMLObject;
        XmlNode.QName qName = this.targetProperty;
        if (qName == null) {
            throw ScriptRuntime.notFunctionError(this);
        }
        String localName = qName.getLocalName();
        boolean equals = localName.equals("apply");
        if (equals || localName.equals(NotificationCompat.CATEGORY_CALL)) {
            return applyOrCall(equals, context, scriptable, scriptable2, objArr);
        }
        if (!(scriptable2 instanceof XMLObject)) {
            throw ScriptRuntime.typeError1("msg.incompat.call", localName);
        }
        Object obj2 = null;
        loop0: while (true) {
            obj = obj2;
            do {
                scriptable3 = scriptable2;
                while ((scriptable2 instanceof XMLObject) && (obj = (xMLObject = (XMLObject) scriptable2).getFunctionProperty(context, localName)) == Scriptable.NOT_FOUND) {
                    scriptable2 = xMLObject.getExtraMethodSource(context);
                    if (scriptable2 != null) {
                    }
                }
            } while (scriptable2 instanceof XMLObject);
            obj2 = ScriptableObject.getProperty(scriptable2, localName);
        }
        if (obj instanceof Callable) {
            return ((Callable) obj).call(context, scriptable, scriptable3, objArr);
        }
        throw ScriptRuntime.notFunctionError(scriptable3, obj, localName);
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public XMLList child(int i11) {
        XMLList newXMLList = newXMLList();
        for (int i12 = 0; i12 < length(); i12++) {
            newXMLList.addToList(getXmlFromAnnotation(i12).child(i11));
        }
        return newXMLList;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public XMLList children() {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < length(); i11++) {
            XML xmlFromAnnotation = getXmlFromAnnotation(i11);
            if (xmlFromAnnotation != null) {
                XMLList children = xmlFromAnnotation.children();
                int length = children.length();
                for (int i12 = 0; i12 < length; i12++) {
                    arrayList.add(children.item(i12));
                }
            }
        }
        XMLList newXMLList = newXMLList();
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            newXMLList.addToList(arrayList.get(i13));
        }
        return newXMLList;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public XMLList comments() {
        XMLList newXMLList = newXMLList();
        for (int i11 = 0; i11 < length(); i11++) {
            newXMLList.addToList(getXmlFromAnnotation(i11).comments());
        }
        return newXMLList;
    }

    @Override // org.mozilla.javascript.Function
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        throw ScriptRuntime.typeError1("msg.not.ctor", "XMLList");
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public boolean contains(Object obj) {
        for (int i11 = 0; i11 < length(); i11++) {
            if (getXmlFromAnnotation(i11).equivalentXml(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public XMLObjectImpl copy() {
        XMLList newXMLList = newXMLList();
        for (int i11 = 0; i11 < length(); i11++) {
            newXMLList.addToList(getXmlFromAnnotation(i11).copy());
        }
        return newXMLList;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(int i11) {
        if (i11 < 0 || i11 >= length()) {
            return;
        }
        getXmlFromAnnotation(i11).remove();
        internalRemoveFromList(i11);
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public void deleteXMLProperty(XMLName xMLName) {
        for (int i11 = 0; i11 < length(); i11++) {
            XML xmlFromAnnotation = getXmlFromAnnotation(i11);
            if (xmlFromAnnotation.isElement()) {
                xmlFromAnnotation.deleteXMLProperty(xMLName);
            }
        }
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public XMLList elements(XMLName xMLName) {
        XMLList newXMLList = newXMLList();
        for (int i11 = 0; i11 < length(); i11++) {
            newXMLList.addToList(getXmlFromAnnotation(i11).elements(xMLName));
        }
        return newXMLList;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public boolean equivalentXml(Object obj) {
        if ((obj instanceof Undefined) && length() == 0) {
            return true;
        }
        if (length() == 1) {
            return getXmlFromAnnotation(0).equivalentXml(obj);
        }
        if (obj instanceof XMLList) {
            XMLList xMLList = (XMLList) obj;
            if (xMLList.length() == length()) {
                for (int i11 = 0; i11 < length(); i11++) {
                    if (!getXmlFromAnnotation(i11).equivalentXml(xMLList.getXmlFromAnnotation(i11))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i11, Scriptable scriptable) {
        return (i11 < 0 || i11 >= length()) ? Scriptable.NOT_FOUND : getXmlFromAnnotation(i11);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "XMLList";
    }

    @Override // org.mozilla.javascript.xml.XMLObject
    public Scriptable getExtraMethodSource(Context context) {
        if (length() == 1) {
            return getXmlFromAnnotation(0);
        }
        return null;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object[] getIds() {
        if (isPrototype()) {
            return new Object[0];
        }
        int length = length();
        Object[] objArr = new Object[length];
        for (int i11 = 0; i11 < length; i11++) {
            objArr[i11] = Integer.valueOf(i11);
        }
        return objArr;
    }

    public Object[] getIdsForDebug() {
        return getIds();
    }

    public XmlNode.InternalList getNodeList() {
        return this._annos;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public XML getXML() {
        if (length() == 1) {
            return getXmlFromAnnotation(0);
        }
        return null;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public Object getXMLProperty(XMLName xMLName) {
        return getPropertyList(xMLName);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i11, Scriptable scriptable) {
        return i11 >= 0 && i11 < length();
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public boolean hasComplexContent() {
        int length = length();
        if (length == 0) {
            return false;
        }
        if (length == 1) {
            return getXmlFromAnnotation(0).hasComplexContent();
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (getXmlFromAnnotation(i11).isElement()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public boolean hasOwnProperty(XMLName xMLName) {
        return isPrototype() ? findPrototypeId(xMLName.localName()) != 0 : getPropertyList(xMLName).length() > 0;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public boolean hasSimpleContent() {
        if (length() == 0) {
            return true;
        }
        if (length() == 1) {
            return getXmlFromAnnotation(0).hasSimpleContent();
        }
        for (int i11 = 0; i11 < length(); i11++) {
            if (getXmlFromAnnotation(i11).isElement()) {
                return false;
            }
        }
        return true;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public boolean hasXMLProperty(XMLName xMLName) {
        return getPropertyList(xMLName).length() > 0;
    }

    public XML item(int i11) {
        return this._annos != null ? getXmlFromAnnotation(i11) : createEmptyXML();
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public Object jsConstructor(Context context, boolean z11, Object[] objArr) {
        if (objArr.length == 0) {
            return newXMLList();
        }
        Object obj = objArr[0];
        return (z11 || !(obj instanceof XMLList)) ? newXMLListFrom(obj) : obj;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public int length() {
        XmlNode.InternalList internalList = this._annos;
        if (internalList != null) {
            return internalList.length();
        }
        return 0;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public void normalize() {
        for (int i11 = 0; i11 < length(); i11++) {
            getXmlFromAnnotation(i11).normalize();
        }
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public Object parent() {
        if (length() == 0) {
            return Undefined.instance;
        }
        XML xml = null;
        for (int i11 = 0; i11 < length(); i11++) {
            Object parent = getXmlFromAnnotation(i11).parent();
            if (!(parent instanceof XML)) {
                return Undefined.instance;
            }
            XML xml2 = (XML) parent;
            if (i11 == 0) {
                xml = xml2;
            } else if (!xml.is(xml2)) {
                return Undefined.instance;
            }
        }
        return xml;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public XMLList processingInstructions(XMLName xMLName) {
        XMLList newXMLList = newXMLList();
        for (int i11 = 0; i11 < length(); i11++) {
            newXMLList.addToList(getXmlFromAnnotation(i11).processingInstructions(xMLName));
        }
        return newXMLList;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public boolean propertyIsEnumerable(Object obj) {
        long testUint32String;
        if (obj instanceof Integer) {
            testUint32String = ((Integer) obj).intValue();
        } else if (obj instanceof Number) {
            double doubleValue = ((Number) obj).doubleValue();
            long j11 = (long) doubleValue;
            if (j11 != doubleValue) {
                return false;
            }
            if (j11 == 0 && 1.0d / doubleValue < 0.0d) {
                return false;
            }
            testUint32String = j11;
        } else {
            testUint32String = ScriptRuntime.testUint32String(ScriptRuntime.toString(obj));
        }
        return 0 <= testUint32String && testUint32String < ((long) length());
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i11, Scriptable scriptable, Object obj) {
        Object obj2;
        Object parent;
        Object obj3 = Undefined.instance;
        if (obj == null) {
            obj = "null";
        } else if (obj instanceof Undefined) {
            obj = "undefined";
        }
        if (obj instanceof XMLObject) {
            obj2 = (XMLObject) obj;
        } else if (this.targetProperty == null) {
            obj2 = newXMLFromJs(obj.toString());
        } else {
            XMLObjectImpl item = item(i11);
            if (item == null) {
                XML item2 = item(0);
                item = item2 == null ? newTextElementXML(null, this.targetProperty, null) : item2.copy();
            }
            ((XML) item).setChildren(obj);
            obj2 = item;
        }
        if (i11 < length()) {
            parent = item(i11).parent();
        } else if (length() == 0) {
            XMLObjectImpl xMLObjectImpl = this.targetObject;
            parent = xMLObjectImpl != null ? xMLObjectImpl.getXML() : parent();
        } else {
            parent = parent();
        }
        if (!(parent instanceof XML)) {
            if (i11 >= length()) {
                addToList(obj2);
                return;
            }
            XML xml = getXML(this._annos, i11);
            if (obj2 instanceof XML) {
                replaceNode(xml, (XML) obj2);
                replace(i11, xml);
                return;
            } else {
                if (obj2 instanceof XMLList) {
                    XMLList xMLList = (XMLList) obj2;
                    if (xMLList.length() > 0) {
                        replaceNode(xml, xMLList.item(0));
                        replace(i11, xMLList.item(0));
                        for (int i12 = 1; i12 < xMLList.length(); i12++) {
                            insert(i11 + i12, xMLList.item(i12));
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
        XML xml2 = (XML) parent;
        if (i11 >= length()) {
            xml2.appendChild(obj2);
            addToList(xml2.getLastXmlChild());
            return;
        }
        XML xmlFromAnnotation = getXmlFromAnnotation(i11);
        if (obj2 instanceof XML) {
            replaceNode(xmlFromAnnotation, (XML) obj2);
            replace(i11, xmlFromAnnotation);
            return;
        }
        if (obj2 instanceof XMLList) {
            XMLList xMLList2 = (XMLList) obj2;
            if (xMLList2.length() > 0) {
                int childIndex = xmlFromAnnotation.childIndex();
                replaceNode(xmlFromAnnotation, xMLList2.item(0));
                replace(i11, xMLList2.item(0));
                for (int i13 = 1; i13 < xMLList2.length(); i13++) {
                    xml2.insertChildAfter(xml2.getXmlChild(childIndex), xMLList2.item(i13));
                    childIndex++;
                    insert(i11 + i13, xMLList2.item(i13));
                }
            }
        }
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public void putXMLProperty(XMLName xMLName, Object obj) {
        XmlNode.QName qName;
        if (obj == null) {
            obj = "null";
        } else if (obj instanceof Undefined) {
            obj = "undefined";
        }
        if (length() > 1) {
            throw ScriptRuntime.typeError("Assignment to lists with more than one item is not supported");
        }
        if (length() != 0) {
            if (xMLName.isAttributeName()) {
                setAttribute(xMLName, obj);
                return;
            } else {
                item(0).putXMLProperty(xMLName, obj);
                replace(0, item(0));
                return;
            }
        }
        if (this.targetObject == null || (qName = this.targetProperty) == null || qName.getLocalName() == null || this.targetProperty.getLocalName().length() <= 0) {
            throw ScriptRuntime.typeError("Assignment to empty XMLList without targets not supported");
        }
        addToList(newTextElementXML(null, this.targetProperty, null));
        if (xMLName.isAttributeName()) {
            setAttribute(xMLName, obj);
        } else {
            item(0).putXMLProperty(xMLName, obj);
            replace(0, item(0));
        }
        this.targetObject.putXMLProperty(XMLName.formProperty(this.targetProperty.getNamespace().getUri(), this.targetProperty.getLocalName()), this);
        replace(0, this.targetObject.getXML().getLastXmlChild());
    }

    public void remove() {
        for (int length = length() - 1; length >= 0; length--) {
            XML xmlFromAnnotation = getXmlFromAnnotation(length);
            if (xmlFromAnnotation != null) {
                xmlFromAnnotation.remove();
                internalRemoveFromList(length);
            }
        }
    }

    public void replace(int i11, XML xml) {
        if (i11 < length()) {
            XmlNode.InternalList internalList = new XmlNode.InternalList();
            internalList.add(this._annos, 0, i11);
            internalList.add(xml);
            internalList.add(this._annos, i11 + 1, length());
            this._annos = internalList;
        }
    }

    public void setTargets(XMLObjectImpl xMLObjectImpl, XmlNode.QName qName) {
        this.targetObject = xMLObjectImpl;
        this.targetProperty = qName;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public XMLList text() {
        XMLList newXMLList = newXMLList();
        for (int i11 = 0; i11 < length(); i11++) {
            newXMLList.addToList(getXmlFromAnnotation(i11).text());
        }
        return newXMLList;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public String toSource(int i11) {
        return toXMLString();
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public String toString() {
        if (!hasSimpleContent()) {
            return toXMLString();
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < length(); i11++) {
            XML xmlFromAnnotation = getXmlFromAnnotation(i11);
            if (!xmlFromAnnotation.isComment() && !xmlFromAnnotation.isProcessingInstruction()) {
                stringBuffer.append(xmlFromAnnotation.toString());
            }
        }
        return stringBuffer.toString();
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public String toXMLString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < length(); i11++) {
            if (getProcessor().isPrettyPrinting() && i11 != 0) {
                stringBuffer.append('\n');
            }
            stringBuffer.append(getXmlFromAnnotation(i11).toXMLString());
        }
        return stringBuffer.toString();
    }

    private XML getXML(XmlNode.InternalList internalList, int i11) {
        if (i11 < 0 || i11 >= length()) {
            return null;
        }
        return xmlFromNode(internalList.item(i11));
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public XMLList child(XMLName xMLName) {
        XMLList newXMLList = newXMLList();
        for (int i11 = 0; i11 < length(); i11++) {
            newXMLList.addToList(getXmlFromAnnotation(i11).child(xMLName));
        }
        return newXMLList;
    }

    @Override // org.mozilla.javascript.xmlimpl.XMLObjectImpl
    public Object valueOf() {
        return this;
    }
}
