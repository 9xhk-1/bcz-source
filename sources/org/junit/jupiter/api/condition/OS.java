package org.junit.jupiter.api.condition;

import ba0.e4;
import java.util.Locale;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.jupiter.api.condition.OS;
import y90.e;
import y90.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.1", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public enum OS {
    AIX,
    FREEBSD,
    LINUX,
    MAC,
    OPENBSD,
    SOLARIS,
    WINDOWS,
    OTHER;

    private static final e logger = g.c(OS.class);
    private static final OS CURRENT_OS = determineCurrentOs();

    public static /* synthetic */ String a() {
        return "JVM system property 'os.name' is undefined. It is therefore not possible to detect the current OS.";
    }

    @API(since = "5.10", status = API.Status.STABLE)
    public static OS current() {
        return CURRENT_OS;
    }

    private static OS determineCurrentOs() {
        return parse(System.getProperty("os.name"));
    }

    public static OS parse(String osName) {
        if (e4.g(osName)) {
            logger.h(new Supplier() { // from class: o80.t1
                @Override // java.util.function.Supplier
                public final Object get() {
                    return OS.a();
                }
            });
            return null;
        }
        String lowerCase = osName.toLowerCase(Locale.ENGLISH);
        return lowerCase.contains("aix") ? AIX : lowerCase.contains("freebsd") ? FREEBSD : lowerCase.contains("linux") ? LINUX : lowerCase.contains("mac") ? MAC : lowerCase.contains("openbsd") ? OPENBSD : (lowerCase.contains("sunos") || lowerCase.contains("solaris")) ? SOLARIS : lowerCase.contains("win") ? WINDOWS : OTHER;
    }

    public boolean isCurrentOs() {
        return this == CURRENT_OS;
    }
}
