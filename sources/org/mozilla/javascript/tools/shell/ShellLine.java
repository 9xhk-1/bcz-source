package org.mozilla.javascript.tools.shell;

import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Scriptable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ShellLine {
    public static InputStream getStream(Scriptable scriptable) {
        Class<?> classOrNull;
        ClassLoader classLoader = ShellLine.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        if (classLoader == null || (classOrNull = Kit.classOrNull(classLoader, "jline.ConsoleReader")) == null) {
            return null;
        }
        try {
            Object newInstance = classOrNull.getConstructor(null).newInstance(null);
            classOrNull.getMethod("setBellEnabled", Boolean.TYPE).invoke(newInstance, Boolean.FALSE);
            Class<?> classOrNull2 = Kit.classOrNull(classLoader, "jline.Completor");
            classOrNull.getMethod("addCompletor", classOrNull2).invoke(newInstance, Proxy.newProxyInstance(classLoader, new Class[]{classOrNull2}, new FlexibleCompletor(classOrNull2, scriptable)));
            return (InputStream) Kit.classOrNull(classLoader, "jline.ConsoleReaderInputStream").getConstructor(classOrNull).newInstance(newInstance);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
