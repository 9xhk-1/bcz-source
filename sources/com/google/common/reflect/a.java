package com.google.common.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d
/* loaded from: classes7.dex */
public abstract class a implements InvocationHandler {

    /* renamed from: a, reason: collision with root package name */
    public static final Object[] f34392a = new Object[0];

    public static boolean b(Object arg, Class<?> proxyClass) {
        if (proxyClass.isInstance(arg)) {
            return true;
        }
        return Proxy.isProxyClass(arg.getClass()) && Arrays.equals(arg.getClass().getInterfaces(), proxyClass.getInterfaces());
    }

    @CheckForNull
    public abstract Object a(Object proxy, Method method, Object[] args) throws Throwable;

    public boolean equals(@CheckForNull Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    @CheckForNull
    public final Object invoke(Object proxy, Method method, @CheckForNull Object[] args) throws Throwable {
        if (args == null) {
            args = f34392a;
        }
        if (args.length == 0 && method.getName().equals("hashCode")) {
            return Integer.valueOf(hashCode());
        }
        if (args.length != 1 || !method.getName().equals("equals") || method.getParameterTypes()[0] != Object.class) {
            return (args.length == 0 && method.getName().equals("toString")) ? toString() : a(proxy, method, args);
        }
        Object obj = args[0];
        if (obj == null) {
            return Boolean.FALSE;
        }
        if (proxy == obj) {
            return Boolean.TRUE;
        }
        return Boolean.valueOf(b(obj, proxy.getClass()) && equals(Proxy.getInvocationHandler(obj)));
    }

    public String toString() {
        return super.toString();
    }
}
