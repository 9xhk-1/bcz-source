package org.mozilla.javascript.xml.impl.xmlbeans;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.ScriptRuntime;
import org.mozilla.javascript.Undefined;
import zr.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class XMLName extends Ref {
    static final long serialVersionUID = 3832176310755686977L;
    private boolean isAttributeName;
    private boolean isDescendants;
    private String localName;
    private String uri;
    private XMLObjectImpl xmlObject;

    private XMLName(String str, String str2) {
        this.uri = str;
        this.localName = str2;
    }

    public static XMLName formProperty(String str, String str2) {
        return new XMLName(str, str2);
    }

    public static XMLName formStar() {
        return new XMLName(null, "*");
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
        return this.localName;
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
        if (this.isAttributeName) {
            throw new IllegalStateException();
        }
        this.isAttributeName = true;
    }

    public void setIsDescendants() {
        if (this.isDescendants) {
            throw new IllegalStateException();
        }
        this.isDescendants = true;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        if (this.isDescendants) {
            stringBuffer.append(m.f102856e);
        }
        if (this.isAttributeName) {
            stringBuffer.append('@');
        }
        if (this.uri == null) {
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
        return this.uri;
    }
}
