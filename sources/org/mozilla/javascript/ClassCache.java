package org.mozilla.javascript;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.mozilla.javascript.JavaAdapter;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ClassCache implements Serializable {
    private static final Object AKEY = "ClassCache";
    private static final long serialVersionUID = -8866246036237312215L;
    private Scriptable associatedScope;
    private volatile boolean cachingIsEnabled = true;
    private transient HashMap<JavaAdapter.JavaAdapterSignature, Class<?>> classAdapterCache;
    private transient HashMap<Class<?>, JavaMembers> classTable;
    private int generatedClassSerial;
    private transient HashMap<Class<?>, Object> interfaceAdapterCache;

    public static ClassCache get(Scriptable scriptable) {
        ClassCache classCache = (ClassCache) ScriptableObject.getTopScopeValue(scriptable, AKEY);
        if (classCache != null) {
            return classCache;
        }
        throw new RuntimeException("Can't find top level scope for ClassCache.get");
    }

    public boolean associate(ScriptableObject scriptableObject) {
        if (scriptableObject.getParentScope() != null) {
            throw new IllegalArgumentException();
        }
        if (this != scriptableObject.associateValue(AKEY, this)) {
            return false;
        }
        this.associatedScope = scriptableObject;
        return true;
    }

    public synchronized void cacheInterfaceAdapter(Class<?> cls, Object obj) {
        try {
            if (this.cachingIsEnabled) {
                if (this.interfaceAdapterCache == null) {
                    this.interfaceAdapterCache = new HashMap<>();
                }
                this.interfaceAdapterCache.put(cls, obj);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void clearCaches() {
        this.classTable = null;
        this.classAdapterCache = null;
        this.interfaceAdapterCache = null;
    }

    public Scriptable getAssociatedScope() {
        return this.associatedScope;
    }

    public Map<Class<?>, JavaMembers> getClassCacheMap() {
        if (this.classTable == null) {
            this.classTable = new HashMap<>();
        }
        return this.classTable;
    }

    public Object getInterfaceAdapter(Class<?> cls) {
        HashMap<Class<?>, Object> hashMap = this.interfaceAdapterCache;
        if (hashMap == null) {
            return null;
        }
        return hashMap.get(cls);
    }

    public Map<JavaAdapter.JavaAdapterSignature, Class<?>> getInterfaceAdapterCacheMap() {
        if (this.classAdapterCache == null) {
            this.classAdapterCache = new HashMap<>();
        }
        return this.classAdapterCache;
    }

    public final boolean isCachingEnabled() {
        return this.cachingIsEnabled;
    }

    public boolean isInvokerOptimizationEnabled() {
        return false;
    }

    public final synchronized int newClassSerialNumber() {
        int i11;
        i11 = this.generatedClassSerial + 1;
        this.generatedClassSerial = i11;
        return i11;
    }

    public synchronized void setCachingEnabled(boolean z11) {
        try {
            if (z11 == this.cachingIsEnabled) {
                return;
            }
            if (!z11) {
                clearCaches();
            }
            this.cachingIsEnabled = z11;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void setInvokerOptimizationEnabled(boolean z11) {
    }
}
