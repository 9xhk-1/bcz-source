package org.mozilla.javascript;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessController;
import java.security.PrivilegedAction;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class LazilyLoadedCtor implements Serializable {
    private static final int STATE_BEFORE_INIT = 0;
    private static final int STATE_INITIALIZING = 1;
    private static final int STATE_WITH_VALUE = 2;
    private static final long serialVersionUID = 1;
    private final String className;
    private Object initializedValue;
    private final boolean privileged;
    private final String propertyName;
    private final ScriptableObject scope;
    private final boolean sealed;
    private int state;

    public LazilyLoadedCtor(ScriptableObject scriptableObject, String str, String str2, boolean z11) {
        this(scriptableObject, str, str2, z11, false);
    }

    private Object buildValue() {
        return this.privileged ? AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.mozilla.javascript.LazilyLoadedCtor.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return LazilyLoadedCtor.this.buildValue0();
            }
        }) : buildValue0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object buildValue0() {
        Class<? extends Scriptable> cast = cast(Kit.classOrNull(this.className));
        if (cast != null) {
            try {
                BaseFunction buildClassCtor = ScriptableObject.buildClassCtor(this.scope, cast, this.sealed, false);
                if (buildClassCtor != null) {
                    return buildClassCtor;
                }
                Scriptable scriptable = this.scope;
                Object obj = scriptable.get(this.propertyName, scriptable);
                if (obj != Scriptable.NOT_FOUND) {
                    return obj;
                }
            } catch (IllegalAccessException | InstantiationException | SecurityException | RhinoException unused) {
            } catch (InvocationTargetException e11) {
                Throwable targetException = e11.getTargetException();
                if (targetException instanceof RuntimeException) {
                    throw ((RuntimeException) targetException);
                }
            }
        }
        return Scriptable.NOT_FOUND;
    }

    public Object getValue() {
        if (this.state == 2) {
            return this.initializedValue;
        }
        throw new IllegalStateException(this.propertyName);
    }

    public void init() {
        synchronized (this) {
            try {
                int i11 = this.state;
                if (i11 == 1) {
                    throw new IllegalStateException("Recursive initialization for " + this.propertyName);
                }
                if (i11 == 0) {
                    this.state = 1;
                    Object obj = Scriptable.NOT_FOUND;
                    try {
                        this.initializedValue = buildValue();
                        this.state = 2;
                    } catch (Throwable th2) {
                        this.initializedValue = obj;
                        this.state = 2;
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public LazilyLoadedCtor(ScriptableObject scriptableObject, String str, String str2, boolean z11, boolean z12) {
        this.scope = scriptableObject;
        this.propertyName = str;
        this.className = str2;
        this.sealed = z11;
        this.privileged = z12;
        this.state = 0;
        scriptableObject.addLazilyInitializedValue(str, 0, this, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Class<? extends Scriptable> cast(Class<?> cls) {
        return cls;
    }
}
