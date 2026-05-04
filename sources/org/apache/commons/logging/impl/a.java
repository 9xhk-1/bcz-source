package org.apache.commons.logging.impl;

import org.apache.avalon.framework.logger.Logger;
import org.apache.commons.logging.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements Log {

    /* renamed from: b, reason: collision with root package name */
    public static volatile Logger f77681b;

    /* renamed from: a, reason: collision with root package name */
    public final transient Logger f77682a;

    public a(Logger logger) {
        this.f77682a = logger;
    }

    public static void b(Logger logger) {
        f77681b = logger;
    }

    public Logger a() {
        return this.f77682a;
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th2) {
        if (a().isDebugEnabled()) {
            a().debug(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th2) {
        if (a().isErrorEnabled()) {
            a().error(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th2) {
        if (a().isFatalErrorEnabled()) {
            a().fatalError(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th2) {
        if (a().isInfoEnabled()) {
            a().info(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return a().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return a().isErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return a().isFatalErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return a().isInfoEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return a().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return a().isWarnEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th2) {
        if (a().isDebugEnabled()) {
            a().debug(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th2) {
        if (a().isWarnEnabled()) {
            a().warn(String.valueOf(obj), th2);
        }
    }

    public a(String str) {
        if (f77681b != null) {
            this.f77682a = f77681b.getChildLogger(str);
            return;
        }
        throw new NullPointerException("default logger has to be specified if this constructor is used!");
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        if (a().isDebugEnabled()) {
            a().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        if (a().isErrorEnabled()) {
            a().error(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        if (a().isFatalErrorEnabled()) {
            a().fatalError(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        if (a().isInfoEnabled()) {
            a().info(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        if (a().isDebugEnabled()) {
            a().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        if (a().isWarnEnabled()) {
            a().warn(String.valueOf(obj));
        }
    }
}
