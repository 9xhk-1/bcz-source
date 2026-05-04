package org.junit.jupiter.api.condition;

import ba0.e4;
import java.util.EnumSet;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.jupiter.api.condition.JRE;
import org.junit.platform.commons.util.ReflectionUtils;
import y90.e;
import y90.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.1", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public enum JRE {
    JAVA_8,
    JAVA_9,
    JAVA_10,
    JAVA_11,
    JAVA_12,
    JAVA_13,
    JAVA_14,
    JAVA_15,
    JAVA_16,
    JAVA_17,
    JAVA_18,
    JAVA_19,
    JAVA_20,
    JAVA_21,
    JAVA_22,
    JAVA_23,
    JAVA_24,
    OTHER;

    private static final e logger = g.c(JRE.class);
    private static final JRE CURRENT_VERSION = determineCurrentVersion();

    public static /* synthetic */ String a() {
        return "JVM system property 'java.version' is undefined. It is therefore not possible to detect Java 8.";
    }

    public static /* synthetic */ String b() {
        return "Failed to determine the current JRE version via java.lang.Runtime.Version.";
    }

    @API(since = "5.7", status = API.Status.STABLE)
    public static JRE currentVersion() {
        return CURRENT_VERSION;
    }

    private static JRE determineCurrentVersion() {
        String property = System.getProperty("java.version");
        boolean g11 = e4.g(property);
        if (g11) {
            logger.h(new Supplier() { // from class: o80.h1
                @Override // java.util.function.Supplier
                public final Object get() {
                    return JRE.a();
                }
            });
        }
        if (!g11 && property.startsWith("1.8")) {
            return JAVA_8;
        }
        try {
            Object L0 = ReflectionUtils.L0(Runtime.class.getMethod("version", null), null, new Object[0]);
            switch (((Integer) ReflectionUtils.L0(L0.getClass().getMethod("major", null), L0, new Object[0])).intValue()) {
                case 9:
                    return JAVA_9;
                case 10:
                    return JAVA_10;
                case 11:
                    return JAVA_11;
                case 12:
                    return JAVA_12;
                case 13:
                    return JAVA_13;
                case 14:
                    return JAVA_14;
                case 15:
                    return JAVA_15;
                case 16:
                    return JAVA_16;
                case 17:
                    return JAVA_17;
                case 18:
                    return JAVA_18;
                case 19:
                    return JAVA_19;
                case 20:
                    return JAVA_20;
                case 21:
                    return JAVA_21;
                case 22:
                    return JAVA_22;
                case 23:
                    return JAVA_23;
                case 24:
                    return JAVA_24;
                default:
                    return OTHER;
            }
        } catch (Exception e11) {
            logger.a(e11, new Supplier() { // from class: o80.i1
                @Override // java.util.function.Supplier
                public final Object get() {
                    return JRE.b();
                }
            });
            return null;
        }
    }

    public static boolean isCurrentVersionWithinRange(JRE min, JRE max) {
        return EnumSet.range(min, max).contains(CURRENT_VERSION);
    }

    public boolean isCurrentVersion() {
        return this == CURRENT_VERSION;
    }
}
