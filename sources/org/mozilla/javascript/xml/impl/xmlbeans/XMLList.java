package org.mozilla.javascript.xml.impl.xmlbeans;

import androidx.core.app.NotificationCompat;
import java.util.Vector;
import org.apache.xmlbeans.XmlCursor;
import org.apache.xmlbeans.XmlObject;
import org.mozilla.javascript.Callable;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Function;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xml.XMLObject;
import org.mozilla.javascript.xml.impl.xmlbeans.XML;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class XMLList extends XMLObjectImpl implements Function {
    static final long serialVersionUID = -4543618751670781135L;
    private AnnotationList _annos;
    private XMLObjectImpl targetObject;
    private javax.xml.namespace.QName targetProperty;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AnnotationList {

        /* renamed from: v, reason: collision with root package name */
        private Vector f78417v = new Vector();

        public void add(XML.XScriptAnnotation xScriptAnnotation) {
            this.f78417v.add(xScriptAnnotation);
        }

        public XML.XScriptAnnotation item(int i11) {
            return (XML.XScriptAnnotation) this.f78417v.get(i11);
        }

        public int length() {
            return this.f78417v.size();
        }

        public void remove(int i11) {
            this.f78417v.remove(i11);
        }
    }

    public XMLList(XMLLibImpl xMLLibImpl) {
        super(xMLLibImpl, xMLLibImpl.xmlListPrototype);
        this.targetObject = null;
        this.targetProperty = null;
        this._annos = new AnnotationList();
    }

    private Object applyOrCall(boolean z11, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        String str = z11 ? "apply" : NotificationCompat.CATEGORY_CALL;
        if (!(scriptable2 instanceof XMLList) || ((XMLList) scriptable2).targetProperty == null) {
            throw ScriptRuntime.typeError1("msg.isnt.function", str);
        }
        return ScriptRuntime.applyOrCall(z11, context, scriptable, scriptable2, objArr);
    }

    private XMLList getPropertyList(XMLName xMLName) {
        XMLList xMLList = new XMLList(this.lib);
        xMLList.setTargets(this, (xMLName.isDescendants() || xMLName.isAttributeName()) ? null : new javax.xml.namespace.QName(xMLName.uri(), xMLName.localName()));
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).getPropertyList(xMLName));
        }
        return xMLList;
    }

    private void insert(int i11, XML xml) {
        if (i11 < length()) {
            AnnotationList annotationList = new AnnotationList();
            for (int i12 = 0; i12 < i11; i12++) {
                annotationList.add(this._annos.item(i12));
            }
            annotationList.add(xml.getAnnotation());
            while (i11 < length()) {
                annotationList.add(this._annos.item(i11));
                i11++;
            }
            this._annos = annotationList;
        }
    }

    private void internalRemoveFromList(int i11) {
        this._annos.remove(i11);
    }

    private void setAttribute(XMLName xMLName, Object obj) {
        for (int i11 = 0; i11 < length(); i11++) {
            getXmlFromAnnotation(i11).setAttribute(xMLName, obj);
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML addNamespace(Namespace namespace) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).addNamespace(namespace);
        }
        throw ScriptRuntime.typeError("The addNamespace method works only on lists containing one item");
    }

    public void addToList(Object obj) {
        if (obj instanceof Undefined) {
            return;
        }
        if (obj instanceof XMLList) {
            XMLList xMLList = (XMLList) obj;
            for (int i11 = 0; i11 < xMLList.length(); i11++) {
                this._annos.add(xMLList.item(i11).getAnnotation());
            }
            return;
        }
        if (obj instanceof XML) {
            this._annos.add(((XML) obj).getAnnotation());
        } else if (obj instanceof XML.XScriptAnnotation) {
            this._annos.add((XML.XScriptAnnotation) obj);
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML appendChild(Object obj) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).appendChild(obj);
        }
        throw ScriptRuntime.typeError("The appendChild method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList attribute(XMLName xMLName) {
        XMLList xMLList = new XMLList(this.lib);
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).attribute(xMLName));
        }
        return xMLList;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList attributes() {
        XMLList xMLList = new XMLList(this.lib);
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).attributes());
        }
        return xMLList;
    }

    @Override // org.mozilla.javascript.Function, org.mozilla.javascript.Callable
    public Object call(Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        Object obj;
        Scriptable scriptable3;
        XMLObject xMLObject;
        javax.xml.namespace.QName qName = this.targetProperty;
        if (qName == null) {
            throw ScriptRuntime.notFunctionError(this);
        }
        String localPart = qName.getLocalPart();
        boolean equals = localPart.equals("apply");
        if (equals || localPart.equals(NotificationCompat.CATEGORY_CALL)) {
            return applyOrCall(equals, context, scriptable, scriptable2, objArr);
        }
        if (!(scriptable2 instanceof XMLObject)) {
            throw ScriptRuntime.typeError1("msg.incompat.call", localPart);
        }
        Object obj2 = null;
        loop0: while (true) {
            obj = obj2;
            do {
                scriptable3 = scriptable2;
                while ((scriptable2 instanceof XMLObject) && (obj = (xMLObject = (XMLObject) scriptable2).getFunctionProperty(context, localPart)) == Scriptable.NOT_FOUND) {
                    scriptable2 = xMLObject.getExtraMethodSource(context);
                    if (scriptable2 != null) {
                    }
                }
            } while (scriptable2 instanceof XMLObject);
            obj2 = ScriptableObject.getProperty(scriptable2, localPart);
        }
        if (obj instanceof Callable) {
            return ((Callable) obj).call(context, scriptable, scriptable3, objArr);
        }
        throw ScriptRuntime.notFunctionError(scriptable3, obj, localPart);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList child(long j11) {
        XMLList xMLList = new XMLList(this.lib);
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).child(j11));
        }
        return xMLList;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public int childIndex() {
        if (length() == 1) {
            return getXmlFromAnnotation(0).childIndex();
        }
        throw ScriptRuntime.typeError("The childIndex method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList children() {
        XMLList children;
        Vector vector = new Vector();
        for (int i11 = 0; i11 < length(); i11++) {
            XML xmlFromAnnotation = getXmlFromAnnotation(i11);
            if (xmlFromAnnotation != null && (children = xmlFromAnnotation.children()) != null) {
                int length = children.length();
                for (int i12 = 0; i12 < length; i12++) {
                    vector.addElement(children.item(i12));
                }
            }
        }
        XMLList xMLList = new XMLList(this.lib);
        int size = vector.size();
        for (int i13 = 0; i13 < size; i13++) {
            xMLList.addToList(vector.get(i13));
        }
        return xMLList;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList comments() {
        XMLList xMLList = new XMLList(this.lib);
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).comments());
        }
        return xMLList;
    }

    @Override // org.mozilla.javascript.Function
    public Scriptable construct(Context context, Scriptable scriptable, Object[] objArr) {
        throw ScriptRuntime.typeError1("msg.not.ctor", "XMLList");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean contains(Object obj) {
        for (int i11 = 0; i11 < length(); i11++) {
            if (getXmlFromAnnotation(i11).equivalentXml(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object copy() {
        XMLList xMLList = new XMLList(this.lib);
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).copy());
        }
        return xMLList;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(int i11) {
        if (i11 < 0 || i11 >= length()) {
            return;
        }
        getXmlFromAnnotation(i11).remove();
        internalRemoveFromList(i11);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void deleteXMLProperty(XMLName xMLName) {
        for (int i11 = 0; i11 < length(); i11++) {
            XML xmlFromAnnotation = getXmlFromAnnotation(i11);
            if (xmlFromAnnotation.tokenType() == XmlCursor.TokenType.START) {
                xmlFromAnnotation.deleteXMLProperty(xMLName);
            }
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList descendants(XMLName xMLName) {
        XMLList xMLList = new XMLList(this.lib);
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).descendants(xMLName));
        }
        return xMLList;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
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
        if (this.prototypeFlag) {
            return new Object[0];
        }
        int length = length();
        Object[] objArr = new Object[length];
        for (int i11 = 0; i11 < length; i11++) {
            objArr[i11] = new Integer(i11);
        }
        return objArr;
    }

    public Object[] getIdsForDebug() {
        return getIds();
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object getXMLProperty(XMLName xMLName) {
        return getPropertyList(xMLName);
    }

    public XML getXmlFromAnnotation(int i11) {
        if (i11 < 0 || i11 >= length()) {
            return null;
        }
        return XML.getFromAnnotation(this.lib, this._annos.item(i11));
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XmlObject getXmlObject() {
        if (length() == 1) {
            return getXmlFromAnnotation(0).getXmlObject();
        }
        throw ScriptRuntime.typeError("getXmlObject method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i11, Scriptable scriptable) {
        return i11 >= 0 && i11 < length();
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean hasComplexContent() {
        int length = length();
        if (length == 0) {
            return false;
        }
        if (length == 1) {
            return getXmlFromAnnotation(0).hasComplexContent();
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (getXmlFromAnnotation(i11).tokenType() == XmlCursor.TokenType.START) {
                return true;
            }
        }
        return false;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean hasOwnProperty(XMLName xMLName) {
        return this.prototypeFlag ? findPrototypeId(xMLName.localName()) != 0 : getPropertyList(xMLName).length() > 0;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean hasSimpleContent() {
        int length = length();
        if (length == 0) {
            return true;
        }
        if (length == 1) {
            return getXmlFromAnnotation(0).hasSimpleContent();
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (getXmlFromAnnotation(i11).tokenType() == XmlCursor.TokenType.START) {
                return false;
            }
        }
        return true;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public boolean hasXMLProperty(XMLName xMLName) {
        return getPropertyList(xMLName).length() > 0;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object[] inScopeNamespaces() {
        if (length() == 1) {
            return getXmlFromAnnotation(0).inScopeNamespaces();
        }
        throw ScriptRuntime.typeError("The inScopeNamespaces method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML insertChildAfter(Object obj, Object obj2) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).insertChildAfter(obj, obj2);
        }
        throw ScriptRuntime.typeError("The insertChildAfter method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML insertChildBefore(Object obj, Object obj2) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).insertChildAfter(obj, obj2);
        }
        throw ScriptRuntime.typeError("The insertChildBefore method works only on lists containing one item");
    }

    public XML item(int i11) {
        return this._annos != null ? getXmlFromAnnotation(i11) : XML.createEmptyXML(this.lib);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object jsConstructor(Context context, boolean z11, Object[] objArr) {
        if (objArr.length == 0) {
            return new XMLList(this.lib);
        }
        Object obj = objArr[0];
        return (z11 || !(obj instanceof XMLList)) ? new XMLList(this.lib, obj) : obj;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public int length() {
        AnnotationList annotationList = this._annos;
        if (annotationList != null) {
            return annotationList.length();
        }
        return 0;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public String localName() {
        if (length() == 1) {
            return name().localName();
        }
        throw ScriptRuntime.typeError("The localName method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public QName name() {
        if (length() == 1) {
            return getXmlFromAnnotation(0).name();
        }
        throw ScriptRuntime.typeError("The name method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object namespace(String str) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).namespace(str);
        }
        throw ScriptRuntime.typeError("The namespace method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object[] namespaceDeclarations() {
        if (length() == 1) {
            return getXmlFromAnnotation(0).namespaceDeclarations();
        }
        throw ScriptRuntime.typeError("The namespaceDeclarations method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object nodeKind() {
        if (length() == 1) {
            return getXmlFromAnnotation(0).nodeKind();
        }
        throw ScriptRuntime.typeError("The nodeKind method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void normalize() {
        for (int i11 = 0; i11 < length(); i11++) {
            getXmlFromAnnotation(i11).normalize();
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object parent() {
        XMLObjectImpl xMLObjectImpl;
        Object obj = Undefined.instance;
        if (length() == 0 && (xMLObjectImpl = this.targetObject) != null && (xMLObjectImpl instanceof XML)) {
            return xMLObjectImpl;
        }
        for (int i11 = 0; i11 < length(); i11++) {
            Object parent = getXmlFromAnnotation(i11).parent();
            if (i11 == 0) {
                obj = parent;
            } else if (obj != parent) {
                return Undefined.instance;
            }
        }
        return obj;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML prependChild(Object obj) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).prependChild(obj);
        }
        throw ScriptRuntime.typeError("The prependChild method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object processingInstructions(XMLName xMLName) {
        XMLList xMLList = new XMLList(this.lib);
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).processingInstructions(xMLName));
        }
        return xMLList;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
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
        Object createFromJS;
        Object obj2 = Undefined.instance;
        if (obj == null) {
            obj = "null";
        } else if (obj instanceof Undefined) {
            obj = "undefined";
        }
        if (obj instanceof XMLObject) {
            createFromJS = (XMLObject) obj;
        } else {
            javax.xml.namespace.QName qName = this.targetProperty;
            createFromJS = qName == null ? XML.createFromJS(this.lib, obj.toString()) : XML.createTextElement(this.lib, qName, obj.toString());
        }
        Object parent = i11 < length() ? item(i11).parent() : parent();
        if (!(parent instanceof XML)) {
            if (i11 >= length()) {
                addToList(createFromJS);
                return;
            }
            XML fromAnnotation = XML.getFromAnnotation(this.lib, this._annos.item(i11));
            if (createFromJS instanceof XML) {
                fromAnnotation.replaceAll((XML) createFromJS);
                replace(i11, fromAnnotation);
                return;
            } else {
                if (createFromJS instanceof XMLList) {
                    XMLList xMLList = (XMLList) createFromJS;
                    if (xMLList.length() > 0) {
                        fromAnnotation.replaceAll(xMLList.item(0));
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
        XML xml = (XML) parent;
        if (i11 >= length()) {
            xml.appendChild(createFromJS);
            addToList(xml.getXmlChild(i11));
            return;
        }
        XML xmlFromAnnotation = getXmlFromAnnotation(i11);
        if (createFromJS instanceof XML) {
            xmlFromAnnotation.replaceAll((XML) createFromJS);
            replace(i11, xmlFromAnnotation);
            return;
        }
        if (createFromJS instanceof XMLList) {
            XMLList xMLList2 = (XMLList) createFromJS;
            if (xMLList2.length() > 0) {
                int childIndex = xmlFromAnnotation.childIndex();
                xmlFromAnnotation.replaceAll(xMLList2.item(0));
                replace(i11, xMLList2.item(0));
                for (int i13 = 1; i13 < xMLList2.length(); i13++) {
                    xml.insertChildAfter(xml.getXmlChild(childIndex), xMLList2.item(i13));
                    childIndex++;
                    insert(i11 + i13, xMLList2.item(i13));
                }
            }
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void putXMLProperty(XMLName xMLName, Object obj) {
        javax.xml.namespace.QName qName;
        if (obj == null) {
            obj = "null";
        } else if (obj instanceof Undefined) {
            obj = "undefined";
        }
        if (length() > 1) {
            throw ScriptRuntime.typeError("Assignment to lists with more that one item is not supported");
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
        if (this.targetObject == null || (qName = this.targetProperty) == null || qName.getLocalPart().equals("*")) {
            throw ScriptRuntime.typeError("Assignment to empty XMLList without targets not supported");
        }
        addToList(XML.createTextElement(this.lib, this.targetProperty, ""));
        if (xMLName.isAttributeName()) {
            setAttribute(xMLName, obj);
        } else {
            item(0).putXMLProperty(xMLName, obj);
            replace(0, item(0));
        }
        this.targetObject.putXMLProperty(XMLName.formProperty(this.targetProperty.getNamespaceURI(), this.targetProperty.getLocalPart()), this);
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

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML removeNamespace(Namespace namespace) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).removeNamespace(namespace);
        }
        throw ScriptRuntime.typeError("The removeNamespace method works only on lists containing one item");
    }

    public void replace(int i11, XML xml) {
        if (i11 >= length()) {
            return;
        }
        AnnotationList annotationList = new AnnotationList();
        for (int i12 = 0; i12 < i11; i12++) {
            annotationList.add(this._annos.item(i12));
        }
        annotationList.add(xml.getAnnotation());
        while (true) {
            i11++;
            if (i11 >= length()) {
                this._annos = annotationList;
                return;
            }
            annotationList.add(this._annos.item(i11));
        }
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML setChildren(Object obj) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).setChildren(obj);
        }
        throw ScriptRuntime.typeError("The setChildren method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void setLocalName(String str) {
        if (length() != 1) {
            throw ScriptRuntime.typeError("The setLocalName method works only on lists containing one item");
        }
        getXmlFromAnnotation(0).setLocalName(str);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void setName(QName qName) {
        if (length() != 1) {
            throw ScriptRuntime.typeError("The setName method works only on lists containing one item");
        }
        getXmlFromAnnotation(0).setName(qName);
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public void setNamespace(Namespace namespace) {
        if (length() != 1) {
            throw ScriptRuntime.typeError("The setNamespace method works only on lists containing one item");
        }
        getXmlFromAnnotation(0).setNamespace(namespace);
    }

    public void setTargets(XMLObjectImpl xMLObjectImpl, javax.xml.namespace.QName qName) {
        this.targetObject = xMLObjectImpl;
        this.targetProperty = qName;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList text() {
        XMLList xMLList = new XMLList(this.lib);
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).text());
        }
        return xMLList;
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public String toSource(int i11) {
        return "<>" + toXMLString(0) + "</>";
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public String toString() {
        if (!hasSimpleContent()) {
            return toXMLString(0);
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < length(); i11++) {
            stringBuffer.append(getXmlFromAnnotation(i11).toString());
        }
        return stringBuffer.toString();
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public String toXMLString(int i11) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i12 = 0; i12 < length(); i12++) {
            if (i12 > 0) {
                stringBuffer.append('\n');
            }
            stringBuffer.append(getXmlFromAnnotation(i12).toXMLString(i11));
        }
        return stringBuffer.toString();
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XMLList child(XMLName xMLName) {
        XMLList xMLList = new XMLList(this.lib);
        for (int i11 = 0; i11 < length(); i11++) {
            xMLList.addToList(getXmlFromAnnotation(i11).child(xMLName));
        }
        return xMLList;
    }

    public XMLList(XMLLibImpl xMLLibImpl, Object obj) {
        super(xMLLibImpl, xMLLibImpl.xmlListPrototype);
        this.targetObject = null;
        this.targetProperty = null;
        if (obj == null || (obj instanceof Undefined)) {
            return;
        }
        if (obj instanceof XML) {
            AnnotationList annotationList = new AnnotationList();
            this._annos = annotationList;
            annotationList.add(((XML) obj).getAnnotation());
            return;
        }
        int i11 = 0;
        if (obj instanceof XMLList) {
            XMLList xMLList = (XMLList) obj;
            this._annos = new AnnotationList();
            while (i11 < xMLList._annos.length()) {
                this._annos.add(xMLList._annos.item(i11));
                i11++;
            }
            return;
        }
        String trim = ScriptRuntime.toString(obj).trim();
        if (!trim.startsWith("<>")) {
            trim = "<>" + trim + "</>";
        }
        String str = "<fragment>" + trim.substring(2);
        if (str.endsWith("</>")) {
            XMLList children = XML.createFromJS(xMLLibImpl, str.substring(0, str.length() - 3) + "</fragment>").children();
            this._annos = new AnnotationList();
            while (i11 < children._annos.length()) {
                this._annos.add(((XML) children.item(i11).copy()).getAnnotation());
                i11++;
            }
            return;
        }
        throw ScriptRuntime.typeError("XML with anonymous tag missing end anonymous tag");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML replace(long j11, Object obj) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).replace(j11, obj);
        }
        throw ScriptRuntime.typeError("The replace method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public XML replace(XMLName xMLName, Object obj) {
        if (length() == 1) {
            return getXmlFromAnnotation(0).replace(xMLName, obj);
        }
        throw ScriptRuntime.typeError("The replace method works only on lists containing one item");
    }

    @Override // org.mozilla.javascript.xml.impl.xmlbeans.XMLObjectImpl
    public Object valueOf() {
        return this;
    }
}
