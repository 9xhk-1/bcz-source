package org.apache.commons.logging.impl;

import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class f implements ServletContextListener {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f77698a;

    /* renamed from: b, reason: collision with root package name */
    public static /* synthetic */ Class f77699b;

    static {
        Class cls = f77699b;
        if (cls == null) {
            cls = a("java.lang.ClassLoader");
            f77699b = cls;
        }
        f77698a = new Class[]{cls};
    }

    public static /* synthetic */ Class a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError(e11.getMessage());
        }
    }

    public void b(ServletContextEvent servletContextEvent) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Object[] objArr = {contextClassLoader};
        ClassLoader classLoader = contextClassLoader;
        while (classLoader != null) {
            try {
                Class<?> loadClass = classLoader.loadClass(org.apache.commons.logging.g.f77659c);
                loadClass.getMethod("release", f77698a).invoke(null, objArr);
                classLoader = loadClass.getClassLoader().getParent();
            } catch (ClassNotFoundException unused) {
                classLoader = null;
            } catch (IllegalAccessException unused2) {
                System.err.println("LogFactory instance found which is not accessable!");
                classLoader = null;
            } catch (NoSuchMethodException unused3) {
                System.err.println("LogFactory instance found which does not support release method!");
                classLoader = null;
            } catch (InvocationTargetException unused4) {
                System.err.println("LogFactory instance release method failed!");
                classLoader = null;
            }
        }
        org.apache.commons.logging.g.I(contextClassLoader);
    }

    public void c(ServletContextEvent servletContextEvent) {
    }
}
