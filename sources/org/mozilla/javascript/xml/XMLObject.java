package org.mozilla.javascript.xml;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.IdScriptableObject;
import org.mozilla.javascript.NativeWith;
import org.mozilla.javascript.Ref;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class XMLObject extends IdScriptableObject {
    static final long serialVersionUID = 8455156490438576500L;

    public XMLObject() {
    }

    public Object addValues(Context context, boolean z11, Object obj) {
        return Scriptable.NOT_FOUND;
    }

    public abstract boolean delete(Context context, Object obj);

    public abstract NativeWith enterDotQuery(Scriptable scriptable);

    public abstract NativeWith enterWith(Scriptable scriptable);

    public abstract Object get(Context context, Object obj);

    public abstract Scriptable getExtraMethodSource(Context context);

    public abstract Object getFunctionProperty(Context context, int i11);

    public abstract Object getFunctionProperty(Context context, String str);

    @Override // org.mozilla.javascript.ScriptableObject
    public String getTypeOf() {
        return avoidObjectDetection() ? "undefined" : "xml";
    }

    public abstract boolean has(Context context, Object obj);

    public abstract Ref memberRef(Context context, Object obj, int i11);

    public abstract Ref memberRef(Context context, Object obj, Object obj2, int i11);

    public abstract void put(Context context, Object obj, Object obj2);

    public XMLObject(Scriptable scriptable, Scriptable scriptable2) {
        super(scriptable, scriptable2);
    }
}
