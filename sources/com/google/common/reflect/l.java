package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public final class l {
    public static String a(Class<?> clazz) {
        return b(clazz.getName());
    }

    public static String b(String classFullName) {
        int lastIndexOf = classFullName.lastIndexOf(46);
        return lastIndexOf < 0 ? "" : classFullName.substring(0, lastIndexOf);
    }

    public static void c(Class<?>... classes) {
        for (Class<?> cls : classes) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
            } catch (ClassNotFoundException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    public static <T> T d(Class<T> interfaceType, InvocationHandler handler) {
        Preconditions.checkNotNull(handler);
        Preconditions.checkArgument(interfaceType.isInterface(), "%s is not an interface", interfaceType);
        return interfaceType.cast(Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, handler));
    }
}
