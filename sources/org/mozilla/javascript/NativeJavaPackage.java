package org.mozilla.javascript;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NativeJavaPackage extends ScriptableObject {
    static final long serialVersionUID = 7445054382212031523L;
    private transient ClassLoader classLoader;
    private Set<String> negativeCache;
    private String packageName;

    public NativeJavaPackage(boolean z11, String str, ClassLoader classLoader) {
        this.negativeCache = null;
        this.packageName = str;
        this.classLoader = classLoader;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.classLoader = Context.getCurrentContext().getApplicationClassLoader();
    }

    public boolean equals(Object obj) {
        if (obj instanceof NativeJavaPackage) {
            NativeJavaPackage nativeJavaPackage = (NativeJavaPackage) obj;
            if (this.packageName.equals(nativeJavaPackage.packageName) && this.classLoader == nativeJavaPackage.classLoader) {
                return true;
            }
        }
        return false;
    }

    public NativeJavaPackage forcePackage(String str, Scriptable scriptable) {
        String str2;
        Object obj = super.get(str, this);
        if (obj != null && (obj instanceof NativeJavaPackage)) {
            return (NativeJavaPackage) obj;
        }
        if (this.packageName.length() == 0) {
            str2 = str;
        } else {
            str2 = this.packageName + "." + str;
        }
        NativeJavaPackage nativeJavaPackage = new NativeJavaPackage(true, str2, this.classLoader);
        ScriptRuntime.setObjectProtoAndParent(nativeJavaPackage, scriptable);
        super.put(str, this, nativeJavaPackage);
        return nativeJavaPackage;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(String str, Scriptable scriptable) {
        return getPkgProperty(str, scriptable, true);
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public String getClassName() {
        return "JavaPackage";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object getDefaultValue(Class<?> cls) {
        return toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [org.mozilla.javascript.Scriptable] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [org.mozilla.javascript.NativeJavaPackage, org.mozilla.javascript.ScriptableObject] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.mozilla.javascript.NativeJavaPackage, org.mozilla.javascript.Scriptable, org.mozilla.javascript.ScriptableObject] */
    public synchronized Object getPkgProperty(String str, Scriptable scriptable, boolean z11) {
        String str2;
        Object obj = super.get(str, scriptable);
        if (obj != Scriptable.NOT_FOUND) {
            return obj;
        }
        Set<String> set = this.negativeCache;
        ?? r12 = 0;
        r12 = 0;
        if (set != null && set.contains(str)) {
            return null;
        }
        if (this.packageName.length() == 0) {
            str2 = str;
        } else {
            str2 = this.packageName + '.' + str;
        }
        Context context = Context.getContext();
        ClassShutter classShutter = context.getClassShutter();
        if (classShutter == null || classShutter.visibleToScripts(str2)) {
            ClassLoader classLoader = this.classLoader;
            Class<?> classOrNull = classLoader != null ? Kit.classOrNull(classLoader, str2) : Kit.classOrNull(str2);
            if (classOrNull != null) {
                r12 = context.getWrapFactory().wrapJavaClass(context, ScriptableObject.getTopLevelScope(this), classOrNull);
                r12.setPrototype(getPrototype());
            }
        }
        if (r12 == 0) {
            if (z11) {
                r12 = new NativeJavaPackage(true, str2, this.classLoader);
                ScriptRuntime.setObjectProtoAndParent(r12, getParentScope());
            } else {
                if (this.negativeCache == null) {
                    this.negativeCache = new HashSet();
                }
                this.negativeCache.add(str);
            }
        }
        if (r12 != 0) {
            super.put(str, scriptable, r12);
        }
        return r12;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(int i11, Scriptable scriptable) {
        return false;
    }

    public int hashCode() {
        int hashCode = this.packageName.hashCode();
        ClassLoader classLoader = this.classLoader;
        return hashCode ^ (classLoader == null ? 0 : classLoader.hashCode());
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(String str, Scriptable scriptable, Object obj) {
    }

    public String toString() {
        return "[JavaPackage " + this.packageName + "]";
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public Object get(int i11, Scriptable scriptable) {
        return Scriptable.NOT_FOUND;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public boolean has(String str, Scriptable scriptable) {
        return true;
    }

    @Override // org.mozilla.javascript.ScriptableObject, org.mozilla.javascript.Scriptable
    public void put(int i11, Scriptable scriptable, Object obj) {
        throw Context.reportRuntimeError0("msg.pkg.int");
    }

    public NativeJavaPackage(String str, ClassLoader classLoader) {
        this(false, str, classLoader);
    }

    public NativeJavaPackage(String str) {
        this(false, str, Context.getCurrentContext().getApplicationClassLoader());
    }
}
