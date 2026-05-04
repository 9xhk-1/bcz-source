package org.slf4j;

import org.slf4j.event.Level;
import org.slf4j.helpers.CheckReturnValue;
import org.slf4j.spi.DefaultLoggingEventBuilder;
import org.slf4j.spi.LoggingEventBuilder;
import org.slf4j.spi.NOPLoggingEventBuilder;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface Logger {
    public static final String ROOT_LOGGER_NAME = "ROOT";

    @CheckReturnValue
    default LoggingEventBuilder atDebug() {
        return isDebugEnabled() ? makeLoggingEventBuilder(Level.DEBUG) : NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    default LoggingEventBuilder atError() {
        return isErrorEnabled() ? makeLoggingEventBuilder(Level.ERROR) : NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    default LoggingEventBuilder atInfo() {
        return isInfoEnabled() ? makeLoggingEventBuilder(Level.INFO) : NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    default LoggingEventBuilder atLevel(Level level) {
        return isEnabledForLevel(level) ? makeLoggingEventBuilder(level) : NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    default LoggingEventBuilder atTrace() {
        return isTraceEnabled() ? makeLoggingEventBuilder(Level.TRACE) : NOPLoggingEventBuilder.singleton();
    }

    @CheckReturnValue
    default LoggingEventBuilder atWarn() {
        return isWarnEnabled() ? makeLoggingEventBuilder(Level.WARN) : NOPLoggingEventBuilder.singleton();
    }

    void debug(String str);

    void debug(String str, Object obj);

    void debug(String str, Object obj, Object obj2);

    void debug(String str, Throwable th2);

    void debug(String str, Object... objArr);

    void debug(Marker marker, String str);

    void debug(Marker marker, String str, Object obj);

    void debug(Marker marker, String str, Object obj, Object obj2);

    void debug(Marker marker, String str, Throwable th2);

    void debug(Marker marker, String str, Object... objArr);

    void error(String str);

    void error(String str, Object obj);

    void error(String str, Object obj, Object obj2);

    void error(String str, Throwable th2);

    void error(String str, Object... objArr);

    void error(Marker marker, String str);

    void error(Marker marker, String str, Object obj);

    void error(Marker marker, String str, Object obj, Object obj2);

    void error(Marker marker, String str, Throwable th2);

    void error(Marker marker, String str, Object... objArr);

    String getName();

    void info(String str);

    void info(String str, Object obj);

    void info(String str, Object obj, Object obj2);

    void info(String str, Throwable th2);

    void info(String str, Object... objArr);

    void info(Marker marker, String str);

    void info(Marker marker, String str, Object obj);

    void info(Marker marker, String str, Object obj, Object obj2);

    void info(Marker marker, String str, Throwable th2);

    void info(Marker marker, String str, Object... objArr);

    boolean isDebugEnabled();

    boolean isDebugEnabled(Marker marker);

    default boolean isEnabledForLevel(Level level) {
        int i11 = level.toInt();
        if (i11 == 0) {
            return isTraceEnabled();
        }
        if (i11 == 10) {
            return isDebugEnabled();
        }
        if (i11 == 20) {
            return isInfoEnabled();
        }
        if (i11 == 30) {
            return isWarnEnabled();
        }
        if (i11 == 40) {
            return isErrorEnabled();
        }
        throw new IllegalArgumentException("Level [" + level + "] not recognized.");
    }

    boolean isErrorEnabled();

    boolean isErrorEnabled(Marker marker);

    boolean isInfoEnabled();

    boolean isInfoEnabled(Marker marker);

    boolean isTraceEnabled();

    boolean isTraceEnabled(Marker marker);

    boolean isWarnEnabled();

    boolean isWarnEnabled(Marker marker);

    default LoggingEventBuilder makeLoggingEventBuilder(Level level) {
        return new DefaultLoggingEventBuilder(this, level);
    }

    void trace(String str);

    void trace(String str, Object obj);

    void trace(String str, Object obj, Object obj2);

    void trace(String str, Throwable th2);

    void trace(String str, Object... objArr);

    void trace(Marker marker, String str);

    void trace(Marker marker, String str, Object obj);

    void trace(Marker marker, String str, Object obj, Object obj2);

    void trace(Marker marker, String str, Throwable th2);

    void trace(Marker marker, String str, Object... objArr);

    void warn(String str);

    void warn(String str, Object obj);

    void warn(String str, Object obj, Object obj2);

    void warn(String str, Throwable th2);

    void warn(String str, Object... objArr);

    void warn(Marker marker, String str);

    void warn(Marker marker, String str, Object obj);

    void warn(Marker marker, String str, Object obj, Object obj2);

    void warn(Marker marker, String str, Throwable th2);

    void warn(Marker marker, String str, Object... objArr);
}
