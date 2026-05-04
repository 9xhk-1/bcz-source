package org.apache.commons.logging.impl;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.util.Hashtable;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogConfigurationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e extends org.apache.commons.logging.g {
    public static final String F = "org.apache.commons.logging.impl.";
    public static final int G = 32;
    public static final String H = "org.apache.commons.logging.Log";
    public static final String I = "org.apache.commons.logging.log";
    public static final String J = "org.apache.commons.logging.Log.allowFlawedContext";
    public static final String K = "org.apache.commons.logging.Log.allowFlawedDiscovery";
    public static final String L = "org.apache.commons.logging.Log.allowFlawedHierarchy";
    public static /* synthetic */ Class N;
    public static /* synthetic */ Class O;
    public static /* synthetic */ Class P;
    public static /* synthetic */ Class Q;
    public boolean A;

    /* renamed from: q, reason: collision with root package name */
    public String f77688q;

    /* renamed from: t, reason: collision with root package name */
    public String f77691t;

    /* renamed from: v, reason: collision with root package name */
    public Class[] f77693v;

    /* renamed from: w, reason: collision with root package name */
    public Method f77694w;

    /* renamed from: x, reason: collision with root package name */
    public Class[] f77695x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f77696y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f77697z;
    public static final String B = "org.apache.commons.logging.impl.Log4JLogger";
    public static final String C = "org.apache.commons.logging.impl.Jdk14Logger";
    public static final String D = "org.apache.commons.logging.impl.Jdk13LumberjackLogger";
    public static final String E = "org.apache.commons.logging.impl.SimpleLog";
    public static final String[] M = {B, C, D, E};

    /* renamed from: p, reason: collision with root package name */
    public boolean f77687p = true;

    /* renamed from: r, reason: collision with root package name */
    public Hashtable f77689r = new Hashtable();

    /* renamed from: s, reason: collision with root package name */
    public Hashtable f77690s = new Hashtable();

    /* renamed from: u, reason: collision with root package name */
    public Constructor f77692u = null;

    public e() {
        Class cls = N;
        if (cls == null) {
            cls = c("java.lang.String");
            N = cls;
        }
        this.f77693v = new Class[]{cls};
        this.f77694w = null;
        Class cls2 = O;
        if (cls2 == null) {
            cls2 = c(org.apache.commons.logging.g.f77659c);
            O = cls2;
        }
        this.f77695x = new Class[]{cls2};
        c0();
        if (z()) {
            B("Instance created.");
        }
    }

    public static /* synthetic */ Class c(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e11) {
            throw new NoClassDefFoundError(e11.getMessage());
        }
    }

    public static ClassLoader j(Class cls) {
        return org.apache.commons.logging.g.j(cls);
    }

    public static ClassLoader l() throws LogConfigurationException {
        return org.apache.commons.logging.g.l();
    }

    public static ClassLoader m() throws LogConfigurationException {
        return (ClassLoader) AccessController.doPrivileged(new b());
    }

    public static String v(String str, String str2) throws SecurityException {
        return (String) AccessController.doPrivileged(new c(str, str2));
    }

    public static boolean z() {
        return org.apache.commons.logging.g.z();
    }

    public void B(String str) {
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f77688q);
            stringBuffer.append(str);
            org.apache.commons.logging.g.D(stringBuffer.toString());
        }
    }

    @Override // org.apache.commons.logging.g
    public void H() {
        B("Releasing all known loggers");
        this.f77690s.clear();
    }

    @Override // org.apache.commons.logging.g
    public void K(String str) {
        this.f77689r.remove(str);
    }

    @Override // org.apache.commons.logging.g
    public void L(String str, Object obj) {
        if (this.f77692u != null) {
            B("setAttribute: call too late; configuration already performed.");
        }
        if (obj == null) {
            this.f77689r.remove(str);
        } else {
            this.f77689r.put(str, obj);
        }
        if (str.equals(org.apache.commons.logging.g.f77658b)) {
            this.f77687p = obj != null && Boolean.valueOf(obj.toString()).booleanValue();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x015e A[LOOP:0: B:5:0x0031->B:25:0x015e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0153 A[EDGE_INSN: B:26:0x0153->B:27:0x0153 BREAK  A[LOOP:0: B:5:0x0031->B:25:0x015e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c1 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.apache.commons.logging.Log O(java.lang.String r14, java.lang.String r15, boolean r16) throws org.apache.commons.logging.LogConfigurationException {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.logging.impl.e.O(java.lang.String, java.lang.String, boolean):org.apache.commons.logging.Log");
    }

    public final Log P(String str) throws LogConfigurationException {
        if (z()) {
            B("Discovering a Log implementation...");
        }
        b0();
        String Q2 = Q();
        if (Q2 == null) {
            if (z()) {
                B("No user-specified Log implementation; performing discovery using the standard supported logging implementations...");
            }
            Log log = null;
            int i11 = 0;
            while (true) {
                String[] strArr = M;
                if (i11 >= strArr.length || log != null) {
                    break;
                }
                log = O(strArr[i11], str, true);
                i11++;
            }
            if (log != null) {
                return log;
            }
            throw new LogConfigurationException("No suitable Log implementation");
        }
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Attempting to load user-specified log class '");
            stringBuffer.append(Q2);
            stringBuffer.append("'...");
            B(stringBuffer.toString());
        }
        Log O2 = O(Q2, str, true);
        if (O2 != null) {
            return O2;
        }
        StringBuffer stringBuffer2 = new StringBuffer("User-specified log class '");
        stringBuffer2.append(Q2);
        stringBuffer2.append("' cannot be found or is not useable.");
        a0(stringBuffer2, Q2, B);
        a0(stringBuffer2, Q2, C);
        a0(stringBuffer2, Q2, D);
        a0(stringBuffer2, Q2, E);
        throw new LogConfigurationException(stringBuffer2.toString());
    }

    public final String Q() {
        if (z()) {
            B("Trying to get log class from attribute 'org.apache.commons.logging.Log'");
        }
        String str = (String) g(H);
        if (str == null) {
            if (z()) {
                B("Trying to get log class from attribute 'org.apache.commons.logging.log'");
            }
            str = (String) g(I);
        }
        if (str == null) {
            if (z()) {
                B("Trying to get log class from system property 'org.apache.commons.logging.Log'");
            }
            try {
                str = v(H, null);
            } catch (SecurityException e11) {
                if (z()) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("No access allowed to system property 'org.apache.commons.logging.Log' - ");
                    stringBuffer.append(e11.getMessage());
                    B(stringBuffer.toString());
                }
            }
        }
        if (str == null) {
            if (z()) {
                B("Trying to get log class from system property 'org.apache.commons.logging.log'");
            }
            try {
                str = v(I, null);
            } catch (SecurityException e12) {
                if (z()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("No access allowed to system property 'org.apache.commons.logging.log' - ");
                    stringBuffer2.append(e12.getMessage());
                    B(stringBuffer2.toString());
                }
            }
        }
        return str != null ? str.trim() : str;
    }

    public final ClassLoader R() throws LogConfigurationException {
        Class cls = P;
        if (cls == null) {
            cls = c(org.apache.commons.logging.g.f77660d);
            P = cls;
        }
        ClassLoader j11 = j(cls);
        if (!this.f77687p) {
            return j11;
        }
        ClassLoader m11 = m();
        ClassLoader W = W(m11, j11);
        if (W == null) {
            if (!this.f77696y) {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (z()) {
                B("[WARNING] the context classloader is not part of a parent-child relationship with the classloader that loaded LogFactoryImpl.");
            }
            return m11;
        }
        if (W != m11) {
            if (!this.f77696y) {
                throw new LogConfigurationException("Bad classloader hierarchy; LogFactoryImpl was loaded via a classloader that is not related to the current context classloader.");
            }
            if (z()) {
                B("Warning: the context classloader is an ancestor of the classloader that loaded LogFactoryImpl; it should be the same or a descendant. The application using commons-logging should ensure the context classloader is used correctly.");
                return W;
            }
        }
        return W;
    }

    public final boolean S(String str, boolean z11) {
        String T = T(str);
        return T == null ? z11 : Boolean.valueOf(T).booleanValue();
    }

    public final String T(String str) {
        String v11;
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[ENV] Trying to get configuration for item ");
            stringBuffer.append(str);
            B(stringBuffer.toString());
        }
        Object g11 = g(str);
        if (g11 != null) {
            if (z()) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Found LogFactory attribute [");
                stringBuffer2.append(g11);
                stringBuffer2.append("] for ");
                stringBuffer2.append(str);
                B(stringBuffer2.toString());
            }
            return g11.toString();
        }
        if (z()) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("[ENV] No LogFactory attribute found for ");
            stringBuffer3.append(str);
            B(stringBuffer3.toString());
        }
        try {
            v11 = v(str, null);
        } catch (SecurityException unused) {
            if (z()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Security prevented reading system property ");
                stringBuffer4.append(str);
                B(stringBuffer4.toString());
            }
        }
        if (v11 != null) {
            if (z()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Found system property [");
                stringBuffer5.append(v11);
                stringBuffer5.append("] for ");
                stringBuffer5.append(str);
                B(stringBuffer5.toString());
            }
            return v11;
        }
        if (z()) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("[ENV] No system property found for property ");
            stringBuffer6.append(str);
            B(stringBuffer6.toString());
        }
        if (z()) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append("[ENV] No configuration defined for item ");
            stringBuffer7.append(str);
            B(stringBuffer7.toString());
        }
        return null;
    }

    public String U() {
        if (this.f77691t == null) {
            P(getClass().getName());
        }
        return this.f77691t;
    }

    public Constructor V() throws LogConfigurationException {
        if (this.f77692u == null) {
            P(getClass().getName());
        }
        return this.f77692u;
    }

    public final ClassLoader W(ClassLoader classLoader, ClassLoader classLoader2) {
        if (classLoader == null) {
            return classLoader2;
        }
        if (classLoader2 != null) {
            ClassLoader classLoader3 = classLoader;
            while (classLoader3 != null) {
                if (classLoader3 != classLoader2) {
                    classLoader3 = X(classLoader3);
                }
            }
            ClassLoader classLoader4 = classLoader2;
            while (classLoader4 != null) {
                if (classLoader4 == classLoader) {
                    return classLoader2;
                }
                classLoader4 = X(classLoader4);
            }
            return null;
        }
        return classLoader;
    }

    public final ClassLoader X(ClassLoader classLoader) {
        try {
            return (ClassLoader) AccessController.doPrivileged(new d(this, classLoader));
        } catch (SecurityException unused) {
            B("[SECURITY] Unable to obtain parent classloader");
            return null;
        }
    }

    public final void Y(String str, ClassLoader classLoader, Throwable th2) {
        Throwable targetException;
        Throwable exception;
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Could not instantiate Log '");
            stringBuffer.append(str);
            stringBuffer.append("' -- ");
            stringBuffer.append(th2.getClass().getName());
            stringBuffer.append(": ");
            stringBuffer.append(th2.getLocalizedMessage());
            B(stringBuffer.toString());
            if ((th2 instanceof InvocationTargetException) && (targetException = ((InvocationTargetException) th2).getTargetException()) != null) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("... InvocationTargetException: ");
                stringBuffer2.append(targetException.getClass().getName());
                stringBuffer2.append(": ");
                stringBuffer2.append(targetException.getLocalizedMessage());
                B(stringBuffer2.toString());
                if ((targetException instanceof ExceptionInInitializerError) && (exception = ((ExceptionInInitializerError) targetException).getException()) != null) {
                    StringWriter stringWriter = new StringWriter();
                    exception.printStackTrace(new PrintWriter((Writer) stringWriter, true));
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("... ExceptionInInitializerError: ");
                    stringBuffer3.append(stringWriter.toString());
                    B(stringBuffer3.toString());
                }
            }
        }
        if (!this.f77697z) {
            throw new LogConfigurationException(th2);
        }
    }

    public final void Z(ClassLoader classLoader, Class cls) throws LogConfigurationException {
        Class cls2 = Q;
        if (cls2 == null) {
            cls2 = c(H);
            Q = cls2;
        }
        String name = cls2.getName();
        for (Class<?> cls3 : cls.getInterfaces()) {
            if (name.equals(cls3.getName())) {
                if (z()) {
                    try {
                        Class cls4 = Q;
                        if (cls4 == null) {
                            cls4 = c(H);
                            Q = cls4;
                        }
                        ClassLoader j11 = j(cls4);
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("Class '");
                        stringBuffer.append(cls.getName());
                        stringBuffer.append("' was found in classloader ");
                        stringBuffer.append(org.apache.commons.logging.g.G(classLoader));
                        stringBuffer.append(". It is bound to a Log interface which is not");
                        stringBuffer.append(" the one loaded from classloader ");
                        stringBuffer.append(org.apache.commons.logging.g.G(j11));
                        B(stringBuffer.toString());
                    } catch (Throwable th2) {
                        org.apache.commons.logging.g.w(th2);
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("Error while trying to output diagnostics about bad class '");
                        stringBuffer2.append(cls);
                        stringBuffer2.append("'");
                        B(stringBuffer2.toString());
                    }
                }
                if (this.A) {
                    if (z()) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("Warning: bad log hierarchy. ");
                        stringBuffer3.append("You have more than one version of '");
                        Class cls5 = Q;
                        if (cls5 == null) {
                            cls5 = c(H);
                            Q = cls5;
                        }
                        stringBuffer3.append(cls5.getName());
                        stringBuffer3.append("' visible.");
                        B(stringBuffer3.toString());
                        return;
                    }
                    return;
                }
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Terminating logging for this context ");
                stringBuffer4.append("due to bad log hierarchy. ");
                stringBuffer4.append("You have more than one version of '");
                Class cls6 = Q;
                if (cls6 == null) {
                    cls6 = c(H);
                    Q = cls6;
                }
                stringBuffer4.append(cls6.getName());
                stringBuffer4.append("' visible.");
                if (z()) {
                    B(stringBuffer4.toString());
                }
                throw new LogConfigurationException(stringBuffer4.toString());
            }
        }
        if (this.f77697z) {
            if (z()) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[WARNING] Log class '");
                stringBuffer5.append(cls.getName());
                stringBuffer5.append("' does not implement the Log interface.");
                B(stringBuffer5.toString());
                return;
            }
            return;
        }
        StringBuffer stringBuffer6 = new StringBuffer();
        stringBuffer6.append("Terminating logging for this context. ");
        stringBuffer6.append("Log class '");
        stringBuffer6.append(cls.getName());
        stringBuffer6.append("' does not implement the Log interface.");
        if (z()) {
            B(stringBuffer6.toString());
        }
        throw new LogConfigurationException(stringBuffer6.toString());
    }

    public final void a0(StringBuffer stringBuffer, String str, String str2) {
        if (!str.equals(str2) && str.regionMatches(true, 0, str2, 0, G + 5)) {
            stringBuffer.append(" Did you mean '");
            stringBuffer.append(str2);
            stringBuffer.append("'?");
        }
    }

    public final void b0() {
        this.f77696y = S(J, true);
        this.f77697z = S(K, true);
        this.A = S(L, true);
    }

    public final void c0() {
        String str;
        ClassLoader j11 = j(getClass());
        if (j11 == null) {
            str = "BOOTLOADER";
        } else {
            try {
                str = org.apache.commons.logging.g.G(j11);
            } catch (SecurityException unused) {
                str = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactoryImpl@");
        stringBuffer.append(System.identityHashCode(this));
        stringBuffer.append(" from ");
        stringBuffer.append(str);
        stringBuffer.append("] ");
        this.f77688q = stringBuffer.toString();
    }

    public boolean d0() {
        return g0("Jdk13Lumberjack", D);
    }

    public boolean e0() {
        return g0("Jdk14", C);
    }

    public boolean f0() {
        return g0("Log4J", B);
    }

    @Override // org.apache.commons.logging.g
    public Object g(String str) {
        return this.f77689r.get(str);
    }

    public final boolean g0(String str, String str2) {
        if (z()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Checking for '");
            stringBuffer.append(str);
            stringBuffer.append("'.");
            B(stringBuffer.toString());
        }
        try {
            if (O(str2, getClass().getName(), false) == null) {
                if (z()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("Did not find '");
                    stringBuffer2.append(str);
                    stringBuffer2.append("'.");
                    B(stringBuffer2.toString());
                }
                return false;
            }
            if (!z()) {
                return true;
            }
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append("Found '");
            stringBuffer3.append(str);
            stringBuffer3.append("'.");
            B(stringBuffer3.toString());
            return true;
        } catch (LogConfigurationException unused) {
            if (z()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("Logging system '");
                stringBuffer4.append(str);
                stringBuffer4.append("' is available but not useable.");
                B(stringBuffer4.toString());
            }
            return false;
        }
    }

    @Override // org.apache.commons.logging.g
    public String[] h() {
        return (String[]) this.f77689r.keySet().toArray(new String[this.f77689r.size()]);
    }

    public Log h0(String str) throws LogConfigurationException {
        try {
            Constructor constructor = this.f77692u;
            Log P2 = constructor == null ? P(str) : (Log) constructor.newInstance(str);
            Method method = this.f77694w;
            if (method != null) {
                method.invoke(P2, this);
            }
            return P2;
        } catch (InvocationTargetException e11) {
            e = e11;
            Throwable targetException = e.getTargetException();
            if (targetException != null) {
                e = targetException;
            }
            throw new LogConfigurationException(e);
        } catch (LogConfigurationException e12) {
            throw e12;
        } catch (Throwable th2) {
            org.apache.commons.logging.g.w(th2);
            throw new LogConfigurationException(th2);
        }
    }

    @Override // org.apache.commons.logging.g
    public Log o(Class cls) throws LogConfigurationException {
        return p(cls.getName());
    }

    @Override // org.apache.commons.logging.g
    public Log p(String str) throws LogConfigurationException {
        Log log = (Log) this.f77690s.get(str);
        if (log != null) {
            return log;
        }
        Log h02 = h0(str);
        this.f77690s.put(str, h02);
        return h02;
    }
}
