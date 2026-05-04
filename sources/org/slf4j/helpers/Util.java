package org.slf4j.helpers;

import n6.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class Util {
    private static ClassContextSecurityManager SECURITY_MANAGER = null;
    private static boolean SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ClassContextSecurityManager extends SecurityManager {
        private ClassContextSecurityManager() {
        }

        @Override // java.lang.SecurityManager
        public Class<?>[] getClassContext() {
            return super.getClassContext();
        }
    }

    private Util() {
    }

    public static Class<?> getCallingClass() {
        int i11;
        ClassContextSecurityManager securityManager = getSecurityManager();
        if (securityManager == null) {
            return null;
        }
        Class<?>[] classContext = securityManager.getClassContext();
        String name = Util.class.getName();
        int i12 = 0;
        while (i12 < classContext.length && !name.equals(classContext[i12].getName())) {
            i12++;
        }
        if (i12 >= classContext.length || (i11 = i12 + 2) >= classContext.length) {
            throw new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
        }
        return classContext[i11];
    }

    private static ClassContextSecurityManager getSecurityManager() {
        ClassContextSecurityManager classContextSecurityManager = SECURITY_MANAGER;
        if (classContextSecurityManager != null) {
            return classContextSecurityManager;
        }
        if (SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED) {
            return null;
        }
        ClassContextSecurityManager safeCreateSecurityManager = safeCreateSecurityManager();
        SECURITY_MANAGER = safeCreateSecurityManager;
        SECURITY_MANAGER_CREATION_ALREADY_ATTEMPTED = true;
        return safeCreateSecurityManager;
    }

    public static final void report(String str, Throwable th2) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th2.printStackTrace();
    }

    private static ClassContextSecurityManager safeCreateSecurityManager() {
        try {
            return new ClassContextSecurityManager();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static boolean safeGetBooleanSystemProperty(String str) {
        String safeGetSystemProperty = safeGetSystemProperty(str);
        if (safeGetSystemProperty == null) {
            return false;
        }
        return safeGetSystemProperty.equalsIgnoreCase(m.f74525c);
    }

    public static String safeGetSystemProperty(String str) {
        if (str == null) {
            throw new IllegalArgumentException("null input");
        }
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static final void report(String str) {
        System.err.println("SLF4J: " + str);
    }
}
