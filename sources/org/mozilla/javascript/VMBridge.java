package org.mozilla.javascript;

import java.lang.reflect.Member;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class VMBridge {
    static final VMBridge instance = makeInstance();

    private static VMBridge makeInstance() {
        VMBridge vMBridge;
        String[] strArr = {"org.mozilla.javascript.VMBridge_custom", "org.mozilla.javascript.jdk15.VMBridge_jdk15", "org.mozilla.javascript.jdk13.VMBridge_jdk13", "org.mozilla.javascript.jdk11.VMBridge_jdk11"};
        for (int i11 = 0; i11 != 4; i11++) {
            Class<?> classOrNull = Kit.classOrNull(strArr[i11]);
            if (classOrNull != null && (vMBridge = (VMBridge) Kit.newInstanceOrNull(classOrNull)) != null) {
                return vMBridge;
            }
        }
        throw new IllegalStateException("Failed to create VMBridge instance");
    }

    public abstract Context getContext(Object obj);

    public abstract ClassLoader getCurrentThreadClassLoader();

    public Object getInterfaceProxyHelper(ContextFactory contextFactory, Class<?>[] clsArr) {
        throw Context.reportRuntimeError("VMBridge.getInterfaceProxyHelper is not supported");
    }

    public Iterator<?> getJavaIterator(Context context, Scriptable scriptable, Object obj) {
        if (obj instanceof Wrapper) {
            Object unwrap = ((Wrapper) obj).unwrap();
            if (unwrap instanceof Iterator) {
                return (Iterator) unwrap;
            }
        }
        return null;
    }

    public abstract Object getThreadContextHelper();

    public abstract boolean isVarArgs(Member member);

    public Object newInterfaceProxy(Object obj, ContextFactory contextFactory, InterfaceAdapter interfaceAdapter, Object obj2, Scriptable scriptable) {
        throw Context.reportRuntimeError("VMBridge.newInterfaceProxy is not supported");
    }

    public abstract void setContext(Object obj, Context context);

    public abstract boolean tryToMakeAccessible(Object obj);
}
