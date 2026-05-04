package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class DefiningClassLoader extends ClassLoader implements GeneratedClassLoader {
    private final ClassLoader parentLoader;

    public DefiningClassLoader() {
        this.parentLoader = getClass().getClassLoader();
    }

    @Override // org.mozilla.javascript.GeneratedClassLoader
    public Class<?> defineClass(String str, byte[] bArr) {
        return super.defineClass(str, bArr, 0, bArr.length, SecurityUtilities.getProtectionDomain(getClass()));
    }

    @Override // org.mozilla.javascript.GeneratedClassLoader
    public void linkClass(Class<?> cls) {
        resolveClass(cls);
    }

    @Override // java.lang.ClassLoader
    public Class<?> loadClass(String str, boolean z11) throws ClassNotFoundException {
        Class<?> findLoadedClass = findLoadedClass(str);
        if (findLoadedClass == null) {
            ClassLoader classLoader = this.parentLoader;
            findLoadedClass = classLoader != null ? classLoader.loadClass(str) : findSystemClass(str);
        }
        if (z11) {
            resolveClass(findLoadedClass);
        }
        return findLoadedClass;
    }

    public DefiningClassLoader(ClassLoader classLoader) {
        this.parentLoader = classLoader;
    }
}
