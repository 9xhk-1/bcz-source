package org.apache.commons.logging;

import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f77657a = "priority";

    /* renamed from: b, reason: collision with root package name */
    public static final String f77658b = "use_tccl";

    /* renamed from: c, reason: collision with root package name */
    public static final String f77659c = "org.apache.commons.logging.LogFactory";

    /* renamed from: d, reason: collision with root package name */
    public static final String f77660d = "org.apache.commons.logging.impl.LogFactoryImpl";

    /* renamed from: e, reason: collision with root package name */
    public static final String f77661e = "commons-logging.properties";

    /* renamed from: f, reason: collision with root package name */
    public static final String f77662f = "META-INF/services/org.apache.commons.logging.LogFactory";

    /* renamed from: g, reason: collision with root package name */
    public static final String f77663g = "org.apache.commons.logging.diagnostics.dest";

    /* renamed from: h, reason: collision with root package name */
    public static PrintStream f77664h = null;

    /* renamed from: i, reason: collision with root package name */
    public static final String f77665i;

    /* renamed from: j, reason: collision with root package name */
    public static final String f77666j = "org.apache.commons.logging.LogFactory.HashtableImpl";

    /* renamed from: k, reason: collision with root package name */
    public static final String f77667k = "org.apache.commons.logging.impl.WeakHashtable";

    /* renamed from: l, reason: collision with root package name */
    public static final ClassLoader f77668l;

    /* renamed from: m, reason: collision with root package name */
    public static Hashtable f77669m;

    /* renamed from: n, reason: collision with root package name */
    public static volatile g f77670n;

    /* renamed from: o, reason: collision with root package name */
    public static /* synthetic */ Class f77671o;

    static {
        String str;
        Class cls = f77671o;
        if (cls == null) {
            cls = c(f77659c);
            f77671o = cls;
        }
        ClassLoader j11 = j(cls);
        f77668l = j11;
        if (j11 == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = G(j11);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactory from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        f77665i = stringBuffer.toString();
        f77664h = y();
        Class cls2 = f77671o;
        if (cls2 == null) {
            cls2 = c(f77659c);
            f77671o = cls2;
        }
        A(cls2);
        f77669m = e();
        if (z()) {
            B("BOOTSTRAP COMPLETED");
        }
    }

    public static void A(Class cls) {
        if (z()) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(System.getProperty("java.ext.dir"));
                B(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(System.getProperty("java.class.path"));
                B(stringBuffer2.toString());
            } catch (SecurityException unused) {
                B("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader j11 = j(cls);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(G(j11));
                B(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                C(stringBuffer4.toString(), j11);
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                B(stringBuffer5.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(String str) {
        PrintStream printStream = f77664h;
        if (printStream != null) {
            printStream.print(f77665i);
            f77664h.println(str);
            f77664h.flush();
        }
    }

    public static void C(String str, ClassLoader classLoader) {
        if (z()) {
            if (classLoader != null) {
                String obj = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(G(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(obj);
                stringBuffer.append("'");
                B(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(G(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    B(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                B(stringBuffer4.toString());
            }
        }
    }

    public static final void D(String str) {
        PrintStream printStream = f77664h;
        if (printStream != null) {
            printStream.println(str);
            f77664h.flush();
        }
    }

    public static g E(String str, ClassLoader classLoader) {
        return F(str, classLoader, null);
    }

    public static g F(String str, ClassLoader classLoader, ClassLoader classLoader2) throws LogConfigurationException {
        Object doPrivileged = AccessController.doPrivileged(new b(str, classLoader));
        if (doPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) doPrivileged;
            if (!z()) {
                throw logConfigurationException;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("An error occurred while loading the factory class:");
            stringBuffer.append(logConfigurationException.getMessage());
            B(stringBuffer.toString());
            throw logConfigurationException;
        }
        if (z()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(G(doPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(G(classLoader2));
            B(stringBuffer2.toString());
        }
        return (g) doPrivileged;
    }

    public static String G(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append(EmailAutoCompleteEditText.f17091d);
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    public static void I(ClassLoader classLoader) {
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Releasing factory for classloader ");
            stringBuffer.append(G(classLoader));
            B(stringBuffer.toString());
        }
        Hashtable hashtable = f77669m;
        synchronized (hashtable) {
            try {
                if (classLoader != null) {
                    g gVar = (g) hashtable.get(classLoader);
                    if (gVar != null) {
                        gVar.H();
                        hashtable.remove(classLoader);
                    }
                } else if (f77670n != null) {
                    f77670n.H();
                    f77670n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void J() {
        if (z()) {
            B("Releasing factory for all classloaders.");
        }
        Hashtable hashtable = f77669m;
        synchronized (hashtable) {
            try {
                Enumeration elements = hashtable.elements();
                while (elements.hasMoreElements()) {
                    ((g) elements.nextElement()).H();
                }
                hashtable.clear();
                if (f77670n != null) {
                    f77670n.H();
                    f77670n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String M(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static void b(ClassLoader classLoader, g gVar) {
        if (gVar != null) {
            if (classLoader == null) {
                f77670n = gVar;
            } else {
                f77669m.put(classLoader, gVar);
            }
        }
    }

    public static /* synthetic */ Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError(e11.getMessage());
        }
    }

    public static Object d(String str, ClassLoader classLoader) {
        Class<?> cls = null;
        try {
            if (classLoader != null) {
                try {
                    try {
                        cls = classLoader.loadClass(str);
                        Class cls2 = f77671o;
                        if (cls2 == null) {
                            cls2 = c(f77659c);
                            f77671o = cls2;
                        }
                        if (cls2.isAssignableFrom(cls)) {
                            if (z()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Loaded class ");
                                stringBuffer.append(cls.getName());
                                stringBuffer.append(" from classloader ");
                                stringBuffer.append(G(classLoader));
                                B(stringBuffer.toString());
                            }
                        } else if (z()) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Factory class ");
                            stringBuffer2.append(cls.getName());
                            stringBuffer2.append(" loaded from classloader ");
                            stringBuffer2.append(G(cls.getClassLoader()));
                            stringBuffer2.append(" does not extend '");
                            Class cls3 = f77671o;
                            if (cls3 == null) {
                                cls3 = c(f77659c);
                                f77671o = cls3;
                            }
                            stringBuffer2.append(cls3.getName());
                            stringBuffer2.append("' as loaded by this classloader.");
                            B(stringBuffer2.toString());
                            C("[BAD CL TREE] ", classLoader);
                        }
                        return (g) cls.newInstance();
                    } catch (NoClassDefFoundError e11) {
                        if (classLoader == f77668l) {
                            if (z()) {
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("Class '");
                                stringBuffer3.append(str);
                                stringBuffer3.append("' cannot be loaded");
                                stringBuffer3.append(" via classloader ");
                                stringBuffer3.append(G(classLoader));
                                stringBuffer3.append(" - it depends on some other class that cannot be found.");
                                B(stringBuffer3.toString());
                            }
                            throw e11;
                        }
                    }
                } catch (ClassCastException unused) {
                    if (classLoader == f77668l) {
                        boolean x11 = x(cls);
                        StringBuffer stringBuffer4 = new StringBuffer();
                        stringBuffer4.append("The application has specified that a custom LogFactory implementation ");
                        stringBuffer4.append("should be used but Class '");
                        stringBuffer4.append(str);
                        stringBuffer4.append("' cannot be converted to '");
                        Class cls4 = f77671o;
                        if (cls4 == null) {
                            cls4 = c(f77659c);
                            f77671o = cls4;
                        }
                        stringBuffer4.append(cls4.getName());
                        stringBuffer4.append("'. ");
                        if (x11) {
                            stringBuffer4.append("The conflict is caused by the presence of multiple LogFactory classes ");
                            stringBuffer4.append("in incompatible classloaders. ");
                            stringBuffer4.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                            stringBuffer4.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                            stringBuffer4.append("that the container has set one without your knowledge. ");
                            stringBuffer4.append("In this case, consider using the commons-logging-adapters.jar file or ");
                            stringBuffer4.append("specifying the standard LogFactory from the command line. ");
                        } else {
                            stringBuffer4.append("Please check the custom implementation. ");
                        }
                        stringBuffer4.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                        if (z()) {
                            B(stringBuffer4.toString());
                        }
                        throw new ClassCastException(stringBuffer4.toString());
                    }
                } catch (ClassNotFoundException e12) {
                    if (classLoader == f77668l) {
                        if (z()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("Unable to locate any class called '");
                            stringBuffer5.append(str);
                            stringBuffer5.append("' via classloader ");
                            stringBuffer5.append(G(classLoader));
                            B(stringBuffer5.toString());
                        }
                        throw e12;
                    }
                }
            }
            if (z()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("Unable to load factory class via classloader ");
                stringBuffer6.append(G(classLoader));
                stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                B(stringBuffer6.toString());
            }
            return (g) Class.forName(str).newInstance();
        } catch (Exception e13) {
            if (z()) {
                B("Unable to create LogFactory instance.");
            }
            if (cls != null) {
                Class cls5 = f77671o;
                if (cls5 == null) {
                    cls5 = c(f77659c);
                    f77671o = cls5;
                }
                if (!cls5.isAssignableFrom(cls)) {
                    return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e13);
                }
            }
            return new LogConfigurationException(e13);
        }
    }

    public static final Hashtable e() {
        String str;
        Hashtable hashtable = null;
        try {
            str = v(f77666j, null);
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = f77667k;
        }
        try {
            hashtable = (Hashtable) Class.forName(str).newInstance();
        } catch (Throwable th2) {
            w(th2);
            if (!f77667k.equals(str)) {
                if (z()) {
                    B("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    public static ClassLoader f() throws LogConfigurationException {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static g i(ClassLoader classLoader) {
        return classLoader == null ? f77670n : (g) f77669m.get(classLoader);
    }

    public static ClassLoader j(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e11) {
            if (z()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e11.getMessage());
                B(stringBuffer.toString());
            }
            throw e11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.Properties k(java.lang.ClassLoader r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.g.k(java.lang.ClassLoader, java.lang.String):java.util.Properties");
    }

    public static ClassLoader l() throws LogConfigurationException {
        return f();
    }

    private static ClassLoader m() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new a());
    }

    public static g n() throws LogConfigurationException {
        BufferedReader bufferedReader;
        String property;
        ClassLoader m11 = m();
        if (m11 == null && z()) {
            B("Context classloader is null.");
        }
        g i11 = i(m11);
        if (i11 != null) {
            return i11;
        }
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[LOOKUP] LogFactory implementation requested for the first time for context classloader ");
            stringBuffer.append(G(m11));
            B(stringBuffer.toString());
            C("[LOOKUP] ", m11);
        }
        Properties k11 = k(m11, f77661e);
        ClassLoader classLoader = (k11 == null || (property = k11.getProperty(f77658b)) == null || Boolean.valueOf(property).booleanValue()) ? m11 : f77668l;
        if (z()) {
            B("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String v11 = v(f77659c, null);
            if (v11 != null) {
                if (z()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("[LOOKUP] Creating an instance of LogFactory class '");
                    stringBuffer2.append(v11);
                    stringBuffer2.append("' as specified by system property ");
                    stringBuffer2.append(f77659c);
                    B(stringBuffer2.toString());
                }
                i11 = F(v11, classLoader, m11);
            } else if (z()) {
                B("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e11) {
            if (z()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer3.append(M(e11.getMessage()));
                stringBuffer3.append("]. Trying alternative implementations...");
                B(stringBuffer3.toString());
            }
        } catch (RuntimeException e12) {
            if (z()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer4.append(M(e12.getMessage()));
                stringBuffer4.append("] as specified by a system property.");
                B(stringBuffer4.toString());
            }
            throw e12;
        }
        if (i11 == null) {
            if (z()) {
                B("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
            }
            try {
                InputStream t11 = t(m11, f77662f);
                if (t11 != null) {
                    try {
                        bufferedReader = new BufferedReader(new InputStreamReader(t11, "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        bufferedReader = new BufferedReader(new InputStreamReader(t11));
                    }
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    if (readLine != null && !"".equals(readLine)) {
                        if (z()) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("[LOOKUP]  Creating an instance of LogFactory class ");
                            stringBuffer5.append(readLine);
                            stringBuffer5.append(" as specified by file '");
                            stringBuffer5.append(f77662f);
                            stringBuffer5.append("' which was present in the path of the context classloader.");
                            B(stringBuffer5.toString());
                        }
                        i11 = F(readLine, classLoader, m11);
                    }
                } else if (z()) {
                    B("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
                }
            } catch (Exception e13) {
                if (z()) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                    stringBuffer6.append(M(e13.getMessage()));
                    stringBuffer6.append("]. Trying alternative implementations...");
                    B(stringBuffer6.toString());
                }
            }
        }
        if (i11 == null) {
            if (k11 != null) {
                if (z()) {
                    B("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
                }
                String property2 = k11.getProperty(f77659c);
                if (property2 != null) {
                    if (z()) {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("[LOOKUP] Properties file specifies LogFactory subclass '");
                        stringBuffer7.append(property2);
                        stringBuffer7.append("'");
                        B(stringBuffer7.toString());
                    }
                    i11 = F(property2, classLoader, m11);
                } else if (z()) {
                    B("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
                }
            } else if (z()) {
                B("[LOOKUP] No properties file available to determine LogFactory subclass from..");
            }
        }
        if (i11 == null) {
            if (z()) {
                B("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
            }
            i11 = F(f77660d, f77668l, m11);
        }
        if (i11 != null) {
            b(m11, i11);
            if (k11 != null) {
                Enumeration<?> propertyNames = k11.propertyNames();
                while (propertyNames.hasMoreElements()) {
                    String str = (String) propertyNames.nextElement();
                    i11.L(str, k11.getProperty(str));
                }
            }
        }
        return i11;
    }

    public static Log q(Class cls) throws LogConfigurationException {
        return n().o(cls);
    }

    public static Log r(String str) throws LogConfigurationException {
        return n().p(str);
    }

    public static Properties s(URL url) {
        return (Properties) AccessController.doPrivileged(new e(url));
    }

    public static InputStream t(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new c(classLoader, str));
    }

    public static Enumeration u(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new d(classLoader, str));
    }

    private static String v(String str, String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new f(str, str2));
    }

    public static void w(Throwable th2) {
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
    }

    public static boolean x(Class cls) {
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    B("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                    return false;
                }
                C("[CUSTOM LOG FACTORY] ", classLoader);
                boolean isAssignableFrom = Class.forName("org.apache.commons.logging.g", false, classLoader).isAssignableFrom(cls);
                if (isAssignableFrom) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("[CUSTOM LOG FACTORY] ");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                    B(stringBuffer.toString());
                    return isAssignableFrom;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                stringBuffer2.append(cls.getName());
                stringBuffer2.append(" does not implement LogFactory.");
                B(stringBuffer2.toString());
                return isAssignableFrom;
            } catch (ClassNotFoundException unused) {
                B("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e11) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e11.getMessage());
                B(stringBuffer3.toString());
            } catch (SecurityException e12) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e12.getMessage());
                B(stringBuffer4.toString());
            }
        }
        return false;
    }

    public static PrintStream y() {
        try {
            String v11 = v(f77663g, null);
            if (v11 == null) {
                return null;
            }
            return v11.equals("STDOUT") ? System.out : v11.equals("STDERR") ? System.err : new PrintStream(new FileOutputStream(v11, true));
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    public static boolean z() {
        return f77664h != null;
    }

    public abstract void H();

    public abstract void K(String str);

    public abstract void L(String str, Object obj);

    public abstract Object g(String str);

    public abstract String[] h();

    public abstract Log o(Class cls) throws LogConfigurationException;

    public abstract Log p(String str) throws LogConfigurationException;
}
