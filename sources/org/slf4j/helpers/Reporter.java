package org.slf4j.helpers;

import java.io.PrintStream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Reporter {
    static final String SLF4J_DEBUG_PREFIX = "SLF4J(D): ";
    static final String SLF4J_ERROR_PREFIX = "SLF4J(E): ";
    static final String SLF4J_INFO_PREFIX = "SLF4J(I): ";
    public static final String SLF4J_INTERNAL_REPORT_STREAM_KEY = "slf4j.internal.report.stream";
    public static final String SLF4J_INTERNAL_VERBOSITY_KEY = "slf4j.internal.verbosity";
    static final String SLF4J_WARN_PREFIX = "SLF4J(W): ";
    private static final String[] SYSOUT_KEYS = {"System.out", "stdout", "sysout"};
    private static final TargetChoice TARGET_CHOICE = getTargetChoice();
    private static final Level INTERNAL_VERBOSITY = initVerbosity();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Level {
        DEBUG(0),
        INFO(1),
        WARN(2),
        ERROR(3);

        int levelInt;

        Level(int i11) {
            this.levelInt = i11;
        }

        private int getLevelInt() {
            return this.levelInt;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum TargetChoice {
        Stderr,
        Stdout
    }

    public static void debug(String str) {
        if (isEnabledFor(Level.DEBUG)) {
            getTarget().println(SLF4J_DEBUG_PREFIX + str);
        }
    }

    public static final void error(String str, Throwable th2) {
        getTarget().println(SLF4J_ERROR_PREFIX + str);
        getTarget().println("SLF4J(E): Reported exception:");
        th2.printStackTrace(getTarget());
    }

    private static PrintStream getTarget() {
        return TARGET_CHOICE.ordinal() != 1 ? System.err : System.out;
    }

    private static TargetChoice getTargetChoice() {
        String property = System.getProperty(SLF4J_INTERNAL_REPORT_STREAM_KEY);
        if (property == null || property.isEmpty()) {
            return TargetChoice.Stderr;
        }
        for (String str : SYSOUT_KEYS) {
            if (str.equalsIgnoreCase(property)) {
                return TargetChoice.Stdout;
            }
        }
        return TargetChoice.Stderr;
    }

    public static void info(String str) {
        if (isEnabledFor(Level.INFO)) {
            getTarget().println(SLF4J_INFO_PREFIX + str);
        }
    }

    private static Level initVerbosity() {
        String property = System.getProperty(SLF4J_INTERNAL_VERBOSITY_KEY);
        return (property == null || property.isEmpty()) ? Level.INFO : property.equalsIgnoreCase("DEBUG") ? Level.DEBUG : property.equalsIgnoreCase("ERROR") ? Level.ERROR : property.equalsIgnoreCase("WARN") ? Level.WARN : Level.INFO;
    }

    public static boolean isEnabledFor(Level level) {
        return level.levelInt >= INTERNAL_VERBOSITY.levelInt;
    }

    public static final void warn(String str) {
        if (isEnabledFor(Level.WARN)) {
            getTarget().println(SLF4J_WARN_PREFIX + str);
        }
    }

    public static final void error(String str) {
        getTarget().println(SLF4J_ERROR_PREFIX + str);
    }
}
