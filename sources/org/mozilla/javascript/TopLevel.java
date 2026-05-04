package org.mozilla.javascript;

import java.util.EnumMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TopLevel extends IdScriptableObject {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final long serialVersionUID = -4648046356662472260L;
    private EnumMap<Builtins, BaseFunction> ctors;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Builtins {
        Object,
        Array,
        Function,
        String,
        Number,
        Boolean,
        RegExp,
        Error
    }

    public static Function getBuiltinCtor(Context context, Scriptable scriptable, Builtins builtins) {
        BaseFunction builtinCtor;
        return (!(scriptable instanceof TopLevel) || (builtinCtor = ((TopLevel) scriptable).getBuiltinCtor(builtins)) == null) ? ScriptRuntime.getExistingCtor(context, scriptable, builtins.name()) : builtinCtor;
    }

    public static Scriptable getBuiltinPrototype(Scriptable scriptable, Builtins builtins) {
        Scriptable builtinPrototype;
        return (!(scriptable instanceof TopLevel) || (builtinPrototype = ((TopLevel) scriptable).getBuiltinPrototype(builtins)) == null) ? ScriptableObject.getClassPrototype(scriptable, builtins.name()) : builtinPrototype;
    }

    public void cacheBuiltins() {
        this.ctors = new EnumMap<>(Builtins.class);
        for (Builtins builtins : Builtins.values()) {
            Object property = ScriptableObject.getProperty(this, builtins.name());
            if (property instanceof BaseFunction) {
                this.ctors.put((EnumMap<Builtins, BaseFunction>) builtins, (Builtins) property);
            }
        }
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "global";
    }

    public BaseFunction getBuiltinCtor(Builtins builtins) {
        EnumMap<Builtins, BaseFunction> enumMap = this.ctors;
        if (enumMap != null) {
            return enumMap.get(builtins);
        }
        return null;
    }

    public Scriptable getBuiltinPrototype(Builtins builtins) {
        BaseFunction builtinCtor = getBuiltinCtor(builtins);
        Object prototypeProperty = builtinCtor != null ? builtinCtor.getPrototypeProperty() : null;
        if (prototypeProperty instanceof Scriptable) {
            return (Scriptable) prototypeProperty;
        }
        return null;
    }
}
