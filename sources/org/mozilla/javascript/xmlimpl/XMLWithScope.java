package org.mozilla.javascript.xmlimpl;

import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.xml.XMLObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
final class XMLWithScope extends NativeWith {
    private static final long serialVersionUID = -696429282095170887L;
    private int _currIndex;
    private XMLObject _dqPrototype;
    private XMLList _xmlList;
    private XMLLibImpl lib;

    public XMLWithScope(XMLLibImpl xMLLibImpl, Scriptable scriptable, XMLObject xMLObject) {
        super(scriptable, xMLObject);
        this.lib = xMLLibImpl;
    }

    public void initAsDotQuery() {
        XMLObject xMLObject = (XMLObject) getPrototype();
        this._currIndex = 0;
        this._dqPrototype = xMLObject;
        if (xMLObject instanceof XMLList) {
            XMLList xMLList = (XMLList) xMLObject;
            if (xMLList.length() > 0) {
                setPrototype((Scriptable) xMLList.get(0, (Scriptable) null));
            }
        }
        this._xmlList = this.lib.newXMLList();
    }

    @Override // org.mozilla.javascript.NativeWith
    public Object updateDotQuery(boolean z11) {
        XMLObject xMLObject = this._dqPrototype;
        XMLList xMLList = this._xmlList;
        if (xMLObject instanceof XMLList) {
            XMLList xMLList2 = (XMLList) xMLObject;
            int i11 = this._currIndex;
            if (z11) {
                xMLList.addToList(xMLList2.get(i11, (Scriptable) null));
            }
            int i12 = i11 + 1;
            if (i12 < xMLList2.length()) {
                this._currIndex = i12;
                setPrototype((Scriptable) xMLList2.get(i12, (Scriptable) null));
                return null;
            }
        } else if (z11) {
            xMLList.addToList(xMLObject);
        }
        return xMLList;
    }
}
