package org.mozilla.javascript.xml.impl.xmlbeans;

import com.badlogic.gdx.scenes.scene2d.ui.q;
import org.apache.xmlbeans.XmlObject;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdFunctionObject;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.Undefined;
import org.mozilla.javascript.xml.XMLLib;
import org.mozilla.javascript.xml.XMLObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
abstract class XMLObjectImpl extends XMLObject {
    private static final int Id_addNamespace = 2;
    private static final int Id_appendChild = 3;
    private static final int Id_attribute = 4;
    private static final int Id_attributes = 5;
    private static final int Id_child = 6;
    private static final int Id_childIndex = 7;
    private static final int Id_children = 8;
    private static final int Id_comments = 9;
    private static final int Id_constructor = 1;
    private static final int Id_contains = 10;
    private static final int Id_copy = 11;
    private static final int Id_descendants = 12;
    private static final int Id_getXmlObject = 41;
    private static final int Id_hasComplexContent = 17;
    private static final int Id_hasOwnProperty = 16;
    private static final int Id_hasSimpleContent = 18;
    private static final int Id_inScopeNamespaces = 13;
    private static final int Id_insertChildAfter = 14;
    private static final int Id_insertChildBefore = 15;
    private static final int Id_length = 19;
    private static final int Id_localName = 20;
    private static final int Id_name = 21;
    private static final int Id_namespace = 22;
    private static final int Id_namespaceDeclarations = 23;
    private static final int Id_nodeKind = 24;
    private static final int Id_normalize = 25;
    private static final int Id_parent = 26;
    private static final int Id_prependChild = 27;
    private static final int Id_processingInstructions = 28;
    private static final int Id_propertyIsEnumerable = 29;
    private static final int Id_removeNamespace = 30;
    private static final int Id_replace = 31;
    private static final int Id_setChildren = 32;
    private static final int Id_setLocalName = 33;
    private static final int Id_setName = 34;
    private static final int Id_setNamespace = 35;
    private static final int Id_text = 36;
    private static final int Id_toSource = 38;
    private static final int Id_toString = 37;
    private static final int Id_toXMLString = 39;
    private static final int Id_valueOf = 40;
    private static final int MAX_PROTOTYPE_ID = 41;
    private static final Object XMLOBJECT_TAG = "XMLObject";
    protected final XMLLibImpl lib;
    protected boolean prototypeFlag;

    public XMLObjectImpl(XMLLibImpl xMLLibImpl, XMLObject xMLObject) {
        super(xMLLibImpl.globalScope(), xMLObject);
        this.lib = xMLLibImpl;
    }

    private static Object arg(Object[] objArr, int i11) {
        return i11 < objArr.length ? objArr[i11] : Undefined.instance;
    }

    public abstract XML addNamespace(Namespace namespace);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [org.mozilla.javascript.xml.XMLObject] */
    @Override // org.mozilla.javascript.xml.XMLObject
    public final Object addValues(Context context, boolean z11, Object obj) {
        XMLObject xMLObject;
        XMLObjectImpl xMLObjectImpl;
        if (!(obj instanceof XMLObject)) {
            return obj == Undefined.instance ? ScriptRuntime.toString(this) : super.addValues(context, z11, obj);
        }
        if (z11) {
            xMLObjectImpl = (XMLObject) obj;
            xMLObject = this;
        } else {
            xMLObject = (XMLObject) obj;
            xMLObjectImpl = this;
        }
        return this.lib.addXMLObjects(context, xMLObject, xMLObjectImpl);
    }

    public abstract XML appendChild(Object obj);

    public abstract XMLList attribute(XMLName xMLName);

    public abstract XMLList attributes();

    public abstract XMLList child(long j11);

    public abstract XMLList child(XMLName xMLName);

    public abstract int childIndex();

    public abstract XMLList children();

    public abstract XMLList comments();

    public abstract boolean contains(Object obj);

    public abstract Object copy();

    @Override // org.mozilla.javascript.xml.XMLObject
    public final boolean delete(Context context, Object obj) {
        if (context == null) {
            context = Context.getCurrentContext();
        }
        XMLName xMLNameOrIndex = this.lib.toXMLNameOrIndex(context, obj);
        if (xMLNameOrIndex == null) {
            delete((int) ScriptRuntime.lastUint32Result(context));
            return true;
        }
        deleteXMLProperty(xMLNameOrIndex);
        return true;
    }

    public abstract void deleteXMLProperty(XMLName xMLName);

    public abstract XMLList descendants(XMLName xMLName);

    @Override // org.mozilla.javascript.xml.XMLObject
    public NativeWith enterDotQuery(Scriptable scriptable) {
        XMLWithScope xMLWithScope = new XMLWithScope(this.lib, scriptable, this);
        xMLWithScope.initAsDotQuery();
        return xMLWithScope;
    }

    @Override // org.mozilla.javascript.xml.XMLObject
    public NativeWith enterWith(Scriptable scriptable) {
        return new XMLWithScope(this.lib, scriptable, this);
    }

    @Override // org.mozilla.javascript.ScriptableObject
    public final Object equivalentValues(Object obj) {
        return equivalentXml(obj) ? Boolean.TRUE : Boolean.FALSE;
    }

    public abstract boolean equivalentXml(Object obj);

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.IdFunctionCall
    public Object execIdCall(IdFunctionObject idFunctionObject, Context context, Scriptable scriptable, Scriptable scriptable2, Object[] objArr) {
        QName constructQName;
        if (!idFunctionObject.hasTag(XMLOBJECT_TAG)) {
            return super.execIdCall(idFunctionObject, context, scriptable, scriptable2, objArr);
        }
        int methodId = idFunctionObject.methodId();
        if (methodId == 1) {
            return jsConstructor(context, scriptable2 == null, objArr);
        }
        if (!(scriptable2 instanceof XMLObjectImpl)) {
            throw IdScriptableObject.incompatibleCallError(idFunctionObject);
        }
        XMLObjectImpl xMLObjectImpl = (XMLObjectImpl) scriptable2;
        switch (methodId) {
            case 2:
                return xMLObjectImpl.addNamespace(this.lib.castToNamespace(context, arg(objArr, 0)));
            case 3:
                return xMLObjectImpl.appendChild(arg(objArr, 0));
            case 4:
                return xMLObjectImpl.attribute(this.lib.toAttributeName(context, arg(objArr, 0)));
            case 5:
                return xMLObjectImpl.attributes();
            case 6:
                XMLName xMLNameOrIndex = this.lib.toXMLNameOrIndex(context, arg(objArr, 0));
                return xMLNameOrIndex == null ? xMLObjectImpl.child(ScriptRuntime.lastUint32Result(context)) : xMLObjectImpl.child(xMLNameOrIndex);
            case 7:
                return ScriptRuntime.wrapInt(xMLObjectImpl.childIndex());
            case 8:
                return xMLObjectImpl.children();
            case 9:
                return xMLObjectImpl.comments();
            case 10:
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.contains(arg(objArr, 0)));
            case 11:
                return xMLObjectImpl.copy();
            case 12:
                return xMLObjectImpl.descendants(objArr.length == 0 ? XMLName.formStar() : this.lib.toXMLName(context, objArr[0]));
            case 13:
                return context.newArray(scriptable, xMLObjectImpl.inScopeNamespaces());
            case 14:
                return xMLObjectImpl.insertChildAfter(arg(objArr, 0), arg(objArr, 1));
            case 15:
                return xMLObjectImpl.insertChildBefore(arg(objArr, 0), arg(objArr, 1));
            case 16:
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.hasOwnProperty(this.lib.toXMLName(context, arg(objArr, 0))));
            case 17:
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.hasComplexContent());
            case 18:
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.hasSimpleContent());
            case 19:
                return ScriptRuntime.wrapInt(xMLObjectImpl.length());
            case 20:
                return xMLObjectImpl.localName();
            case 21:
                return xMLObjectImpl.name();
            case 22:
                return xMLObjectImpl.namespace(objArr.length > 0 ? ScriptRuntime.toString(objArr[0]) : null);
            case 23:
                return context.newArray(scriptable, xMLObjectImpl.namespaceDeclarations());
            case 24:
                return xMLObjectImpl.nodeKind();
            case 25:
                xMLObjectImpl.normalize();
                return Undefined.instance;
            case 26:
                return xMLObjectImpl.parent();
            case 27:
                return xMLObjectImpl.prependChild(arg(objArr, 0));
            case 28:
                return xMLObjectImpl.processingInstructions(objArr.length > 0 ? this.lib.toXMLName(context, objArr[0]) : XMLName.formStar());
            case 29:
                return ScriptRuntime.wrapBoolean(xMLObjectImpl.propertyIsEnumerable(arg(objArr, 0)));
            case 30:
                return xMLObjectImpl.removeNamespace(this.lib.castToNamespace(context, arg(objArr, 0)));
            case 31:
                XMLName xMLNameOrIndex2 = this.lib.toXMLNameOrIndex(context, arg(objArr, 0));
                Object arg = arg(objArr, 1);
                return xMLNameOrIndex2 == null ? xMLObjectImpl.replace(ScriptRuntime.lastUint32Result(context), arg) : xMLObjectImpl.replace(xMLNameOrIndex2, arg);
            case 32:
                return xMLObjectImpl.setChildren(arg(objArr, 0));
            case 33:
                Object arg2 = arg(objArr, 0);
                xMLObjectImpl.setLocalName(arg2 instanceof QName ? ((QName) arg2).localName() : ScriptRuntime.toString(arg2));
                return Undefined.instance;
            case 34:
                Object obj = objArr.length != 0 ? objArr[0] : Undefined.instance;
                if (obj instanceof QName) {
                    QName qName = (QName) obj;
                    constructQName = qName.uri() == null ? this.lib.constructQNameFromString(context, qName.localName()) : this.lib.constructQName(context, qName);
                } else {
                    constructQName = this.lib.constructQName(context, obj);
                }
                xMLObjectImpl.setName(constructQName);
                return Undefined.instance;
            case 35:
                xMLObjectImpl.setNamespace(this.lib.castToNamespace(context, arg(objArr, 0)));
                return Undefined.instance;
            case 36:
                return xMLObjectImpl.text();
            case 37:
                return xMLObjectImpl.toString();
            case 38:
                return xMLObjectImpl.toSource(ScriptRuntime.toInt32(objArr, 0));
            case 39:
                return xMLObjectImpl.toXMLString(ScriptRuntime.toInt32(objArr, 0));
            case 40:
                return xMLObjectImpl.valueOf();
            case 41:
                return Context.javaToJS(xMLObjectImpl.getXmlObject(), scriptable);
            default:
                throw new IllegalArgumentException(String.valueOf(methodId));
        }
    }

    public final void exportAsJSClass(boolean z11) {
        this.prototypeFlag = true;
        exportAsJSClass(41, this.lib.globalScope(), z11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // org.mozilla.javascript.IdScriptableObject
    public int findPrototypeId(String str) {
        String str2;
        int i11 = 4;
        switch (str.length()) {
            case 4:
                char charAt = str.charAt(0);
                if (charAt != 'c') {
                    if (charAt != 'n') {
                        if (charAt == 't') {
                            str2 = "text";
                            i11 = 36;
                            break;
                        }
                        str2 = null;
                        i11 = 0;
                        break;
                    } else {
                        str2 = "name";
                        i11 = 21;
                        break;
                    }
                } else {
                    str2 = "copy";
                    i11 = 11;
                    break;
                }
            case 5:
                str2 = "child";
                i11 = 6;
                break;
            case 6:
                char charAt2 = str.charAt(0);
                if (charAt2 != 'l') {
                    if (charAt2 == 'p') {
                        str2 = q.a.f13044u;
                        i11 = 26;
                        break;
                    }
                    str2 = null;
                    i11 = 0;
                    break;
                } else {
                    str2 = "length";
                    i11 = 19;
                    break;
                }
            case 7:
                char charAt3 = str.charAt(0);
                if (charAt3 != 'r') {
                    if (charAt3 != 's') {
                        if (charAt3 == 'v') {
                            str2 = "valueOf";
                            i11 = 40;
                            break;
                        }
                        str2 = null;
                        i11 = 0;
                        break;
                    } else {
                        str2 = "setName";
                        i11 = 34;
                        break;
                    }
                } else {
                    str2 = "replace";
                    i11 = 31;
                    break;
                }
            case 8:
                char charAt4 = str.charAt(4);
                if (charAt4 == 'K') {
                    str2 = "nodeKind";
                    i11 = 24;
                    break;
                } else if (charAt4 == 'a') {
                    str2 = "contains";
                    i11 = 10;
                    break;
                } else if (charAt4 == 'r') {
                    str2 = "toString";
                    i11 = 37;
                    break;
                } else if (charAt4 == 'u') {
                    str2 = "toSource";
                    i11 = 38;
                    break;
                } else if (charAt4 == 'd') {
                    str2 = "children";
                    i11 = 8;
                    break;
                } else {
                    if (charAt4 == 'e') {
                        str2 = "comments";
                        i11 = 9;
                        break;
                    }
                    str2 = null;
                    i11 = 0;
                    break;
                }
            case 9:
                char charAt5 = str.charAt(2);
                if (charAt5 == 'c') {
                    str2 = "localName";
                    i11 = 20;
                    break;
                } else if (charAt5 == 'm') {
                    str2 = "namespace";
                    i11 = 22;
                    break;
                } else if (charAt5 == 'r') {
                    str2 = "normalize";
                    i11 = 25;
                    break;
                } else {
                    if (charAt5 == 't') {
                        str2 = "attribute";
                        break;
                    }
                    str2 = null;
                    i11 = 0;
                    break;
                }
            case 10:
                char charAt6 = str.charAt(0);
                if (charAt6 != 'a') {
                    if (charAt6 == 'c') {
                        str2 = "childIndex";
                        i11 = 7;
                        break;
                    }
                    str2 = null;
                    i11 = 0;
                    break;
                } else {
                    str2 = "attributes";
                    i11 = 5;
                    break;
                }
            case 11:
                char charAt7 = str.charAt(0);
                if (charAt7 == 'a') {
                    str2 = "appendChild";
                    i11 = 3;
                    break;
                } else if (charAt7 == 'c') {
                    str2 = "constructor";
                    i11 = 1;
                    break;
                } else if (charAt7 == 'd') {
                    str2 = "descendants";
                    i11 = 12;
                    break;
                } else if (charAt7 == 's') {
                    str2 = "setChildren";
                    i11 = 32;
                    break;
                } else {
                    if (charAt7 == 't') {
                        str2 = "toXMLString";
                        i11 = 39;
                        break;
                    }
                    str2 = null;
                    i11 = 0;
                    break;
                }
            case 12:
                char charAt8 = str.charAt(0);
                if (charAt8 == 'a') {
                    str2 = "addNamespace";
                    i11 = 2;
                    break;
                } else if (charAt8 == 'g') {
                    str2 = "getXmlObject";
                    i11 = 41;
                    break;
                } else if (charAt8 == 'p') {
                    str2 = "prependChild";
                    i11 = 27;
                    break;
                } else {
                    if (charAt8 == 's') {
                        char charAt9 = str.charAt(3);
                        if (charAt9 != 'L') {
                            if (charAt9 == 'N') {
                                str2 = "setNamespace";
                                i11 = 35;
                                break;
                            }
                        } else {
                            str2 = "setLocalName";
                            i11 = 33;
                            break;
                        }
                    }
                    str2 = null;
                    i11 = 0;
                    break;
                }
            case 13:
            case 18:
            case 19:
            default:
                str2 = null;
                i11 = 0;
                break;
            case 14:
                str2 = "hasOwnProperty";
                i11 = 16;
                break;
            case 15:
                str2 = "removeNamespace";
                i11 = 30;
                break;
            case 16:
                char charAt10 = str.charAt(0);
                if (charAt10 != 'h') {
                    if (charAt10 == 'i') {
                        str2 = "insertChildAfter";
                        i11 = 14;
                        break;
                    }
                    str2 = null;
                    i11 = 0;
                    break;
                } else {
                    str2 = "hasSimpleContent";
                    i11 = 18;
                    break;
                }
            case 17:
                char charAt11 = str.charAt(3);
                if (charAt11 != 'C') {
                    if (charAt11 != 'c') {
                        if (charAt11 == 'e') {
                            str2 = "insertChildBefore";
                            i11 = 15;
                            break;
                        }
                        str2 = null;
                        i11 = 0;
                        break;
                    } else {
                        str2 = "inScopeNamespaces";
                        i11 = 13;
                        break;
                    }
                } else {
                    str2 = "hasComplexContent";
                    i11 = 17;
                    break;
                }
            case 20:
                str2 = "propertyIsEnumerable";
                i11 = 29;
                break;
            case 21:
                str2 = "namespaceDeclarations";
                i11 = 23;
                break;
            case 22:
                str2 = "processingInstructions";
                i11 = 28;
                break;
        }
        if (str2 == null || str2 == str || str2.equals(str)) {
            return i11;
        }
        return 0;
    }

    @Override // org.mozilla.javascript.xml.XMLObject
    public final Object get(Context context, Object obj) {
        if (context == null) {
            context = Context.getCurrentContext();
        }
        XMLName xMLNameOrIndex = this.lib.toXMLNameOrIndex(context, obj);
        if (xMLNameOrIndex != null) {
            return getXMLProperty(xMLNameOrIndex);
        }
        Object obj2 = get((int) ScriptRuntime.lastUint32Result(context), this);
        return obj2 == Scriptable.NOT_FOUND ? Undefined.instance : obj2;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public final Object getDefaultValue(Class cls) {
        return toString();
    }

    @Override // org.mozilla.javascript.xml.XMLObject
    public Object getFunctionProperty(Context context, int i11) {
        if (this.prototypeFlag) {
            return super.get(i11, this);
        }
        Scriptable prototype = getPrototype();
        return prototype instanceof XMLObject ? ((XMLObject) prototype).getFunctionProperty(context, i11) : Scriptable.NOT_FOUND;
    }

    public abstract Object getXMLProperty(XMLName xMLName);

    public abstract XmlObject getXmlObject();

    @Override // org.mozilla.javascript.xml.XMLObject
    public final boolean has(Context context, Object obj) {
        if (context == null) {
            context = Context.getCurrentContext();
        }
        XMLName xMLNameOrIndex = this.lib.toXMLNameOrIndex(context, obj);
        return xMLNameOrIndex == null ? has((int) ScriptRuntime.lastUint32Result(context), this) : hasXMLProperty(xMLNameOrIndex);
    }

    public abstract boolean hasComplexContent();

    public abstract boolean hasOwnProperty(XMLName xMLName);

    public abstract boolean hasSimpleContent();

    public abstract boolean hasXMLProperty(XMLName xMLName);

    public abstract Object[] inScopeNamespaces();

    @Override // org.mozilla.javascript.IdScriptableObject
    public void initPrototypeId(int i11) {
        String str;
        String str2;
        int i12 = 0;
        switch (i11) {
            case 1:
                initPrototypeConstructor(this instanceof XML ? new XMLCtor((XML) this, XMLOBJECT_TAG, i11, 1) : new IdFunctionObject(this, XMLOBJECT_TAG, i11, 1));
                return;
            case 2:
                str = "addNamespace";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 3:
                str = "appendChild";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 4:
                str = "attribute";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 5:
                str = "attributes";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 6:
                str = "child";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 7:
                str = "childIndex";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 8:
                str = "children";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 9:
                str = "comments";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 10:
                str = "contains";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 11:
                str = "copy";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 12:
                str = "descendants";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 13:
                str = "inScopeNamespaces";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 14:
                str2 = "insertChildAfter";
                String str3 = str2;
                i12 = 2;
                str = str3;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 15:
                str2 = "insertChildBefore";
                String str32 = str2;
                i12 = 2;
                str = str32;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 16:
                str = "hasOwnProperty";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 17:
                str = "hasComplexContent";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 18:
                str = "hasSimpleContent";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 19:
                str = "length";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 20:
                str = "localName";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 21:
                str = "name";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 22:
                str = "namespace";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 23:
                str = "namespaceDeclarations";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 24:
                str = "nodeKind";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 25:
                str = "normalize";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 26:
                str = q.a.f13044u;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 27:
                str = "prependChild";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 28:
                str = "processingInstructions";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 29:
                str = "propertyIsEnumerable";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 30:
                str = "removeNamespace";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 31:
                str2 = "replace";
                String str322 = str2;
                i12 = 2;
                str = str322;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 32:
                str = "setChildren";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 33:
                str = "setLocalName";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 34:
                str = "setName";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 35:
                str = "setNamespace";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 36:
                str = "text";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 37:
                str = "toString";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 38:
                str = "toSource";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 39:
                str = "toXMLString";
                i12 = 1;
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 40:
                str = "valueOf";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            case 41:
                str = "getXmlObject";
                initPrototypeMethod(XMLOBJECT_TAG, i11, str, i12);
                return;
            default:
                throw new IllegalArgumentException(String.valueOf(i11));
        }
    }

    public abstract XML insertChildAfter(Object obj, Object obj2);

    public abstract XML insertChildBefore(Object obj, Object obj2);

    public abstract Object jsConstructor(Context context, boolean z11, Object[] objArr);

    public abstract int length();

    public final XMLLib lib() {
        return this.lib;
    }

    public abstract String localName();

    @Override // org.mozilla.javascript.xml.XMLObject
    public Ref memberRef(Context context, Object obj, int i11) {
        XMLName xMLName;
        if ((i11 & 2) != 0) {
            xMLName = this.lib.toAttributeName(context, obj);
        } else {
            if ((i11 & 4) == 0) {
                throw Kit.codeBug();
            }
            xMLName = this.lib.toXMLName(context, obj);
        }
        if ((i11 & 4) != 0) {
            xMLName.setIsDescendants();
        }
        xMLName.initXMLObject(this);
        return xMLName;
    }

    public abstract QName name();

    public abstract Object namespace(String str);

    public abstract Object[] namespaceDeclarations();

    public abstract Object nodeKind();

    public abstract void normalize();

    public abstract Object parent();

    public abstract XML prependChild(Object obj);

    public abstract Object processingInstructions(XMLName xMLName);

    public abstract boolean propertyIsEnumerable(Object obj);

    @Override // org.mozilla.javascript.xml.XMLObject
    public final void put(Context context, Object obj, Object obj2) {
        if (context == null) {
            context = Context.getCurrentContext();
        }
        XMLName xMLNameOrIndex = this.lib.toXMLNameOrIndex(context, obj);
        if (xMLNameOrIndex == null) {
            put((int) ScriptRuntime.lastUint32Result(context), this, obj2);
        } else {
            putXMLProperty(xMLNameOrIndex, obj2);
        }
    }

    public abstract void putXMLProperty(XMLName xMLName, Object obj);

    public abstract XML removeNamespace(Namespace namespace);

    public abstract XML replace(long j11, Object obj);

    public abstract XML replace(XMLName xMLName, Object obj);

    public abstract XML setChildren(Object obj);

    public abstract void setLocalName(String str);

    public abstract void setName(QName qName);

    public abstract void setNamespace(Namespace namespace);

    public abstract XMLList text();

    public abstract String toSource(int i11);

    public abstract String toString();

    public abstract String toXMLString(int i11);

    public abstract Object valueOf();

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void delete(String str) {
        deleteXMLProperty(this.lib.toXMLNameFromString(Context.getCurrentContext(), str));
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        return hasXMLProperty(this.lib.toXMLNameFromString(Context.getCurrentContext(), str));
    }

    @Override // org.mozilla.javascript.xml.XMLObject
    public Ref memberRef(Context context, Object obj, Object obj2, int i11) {
        XMLName qualifiedName = this.lib.toQualifiedName(context, obj, obj2);
        if ((i11 & 2) != 0 && !qualifiedName.isAttributeName()) {
            qualifiedName.setAttributeName();
        }
        if ((i11 & 4) != 0) {
            qualifiedName.setIsDescendants();
        }
        qualifiedName.initXMLObject(this);
        return qualifiedName;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
        putXMLProperty(this.lib.toXMLNameFromString(Context.getCurrentContext(), str), obj);
    }

    @Override // org.mozilla.javascript.xml.XMLObject
    public Object getFunctionProperty(Context context, String str) {
        if (this.prototypeFlag) {
            return super.get(str, this);
        }
        Scriptable prototype = getPrototype();
        if (prototype instanceof XMLObject) {
            return ((XMLObject) prototype).getFunctionProperty(context, str);
        }
        return Scriptable.NOT_FOUND;
    }

    @Override // org.mozilla.javascript.IdScriptableObject, org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        return getXMLProperty(this.lib.toXMLNameFromString(Context.getCurrentContext(), str));
    }
}
