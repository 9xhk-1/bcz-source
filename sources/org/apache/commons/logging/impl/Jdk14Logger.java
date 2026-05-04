package org.apache.commons.logging.impl;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class Jdk14Logger implements Log, Serializable {
    protected static final Level dummyLevel = Level.FINE;
    private static final long serialVersionUID = 4784713551416303804L;
    protected transient Logger logger;
    protected String name;

    public Jdk14Logger(String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        log(Level.FINE, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        log(Level.SEVERE, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        log(Level.SEVERE, String.valueOf(obj), null);
    }

    public Logger getLogger() {
        if (this.logger == null) {
            this.logger = Logger.getLogger(this.name);
        }
        return this.logger;
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        log(Level.INFO, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isLoggable(Level.FINE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isLoggable(Level.SEVERE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isLoggable(Level.SEVERE);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isLoggable(Level.INFO);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isLoggable(Level.FINEST);
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isLoggable(Level.WARNING);
    }

    public void log(Level level, String str, Throwable th2) {
        Logger logger = getLogger();
        if (logger.isLoggable(level)) {
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            String str2 = this.name;
            String methodName = (stackTrace == null || stackTrace.length <= 2) ? "unknown" : stackTrace[2].getMethodName();
            if (th2 == null) {
                logger.logp(level, str2, methodName, str);
            } else {
                logger.logp(level, str2, methodName, str, th2);
            }
        }
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        log(Level.FINEST, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        log(Level.WARNING, String.valueOf(obj), null);
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th2) {
        log(Level.FINE, String.valueOf(obj), th2);
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th2) {
        log(Level.SEVERE, String.valueOf(obj), th2);
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th2) {
        log(Level.SEVERE, String.valueOf(obj), th2);
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th2) {
        log(Level.INFO, String.valueOf(obj), th2);
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th2) {
        log(Level.FINEST, String.valueOf(obj), th2);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th2) {
        log(Level.WARNING, String.valueOf(obj), th2);
    }
}
