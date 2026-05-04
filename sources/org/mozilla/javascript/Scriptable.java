package org.mozilla.javascript;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface Scriptable {
    public static final Object NOT_FOUND = UniqueTag.NOT_FOUND;

    void delete(int i11);

    void delete(String str);

    Object get(int i11, Scriptable scriptable);

    Object get(String str, Scriptable scriptable);

    String getClassName();

    Object getDefaultValue(Class<?> cls);

    Object[] getIds();

    Scriptable getParentScope();

    Scriptable getPrototype();

    boolean has(int i11, Scriptable scriptable);

    boolean has(String str, Scriptable scriptable);

    boolean hasInstance(Scriptable scriptable);

    void put(int i11, Scriptable scriptable, Object obj);

    void put(String str, Scriptable scriptable, Object obj);

    void setParentScope(Scriptable scriptable);

    void setPrototype(Scriptable scriptable);
}
