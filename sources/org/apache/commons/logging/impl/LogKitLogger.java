package org.apache.commons.logging.impl;

import java.io.Serializable;
import org.apache.commons.logging.Log;
import org.apache.log.Hierarchy;
import org.apache.log.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class LogKitLogger implements Log, Serializable {
    private static final long serialVersionUID = 3768538055836059519L;
    protected volatile transient Logger logger;
    protected String name;

    public LogKitLogger(String str) {
        this.logger = null;
        this.name = str;
        this.logger = getLogger();
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj) {
        if (obj != null) {
            getLogger().debug(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj) {
        if (obj != null) {
            getLogger().error(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj) {
        if (obj != null) {
            getLogger().fatalError(String.valueOf(obj));
        }
    }

    public Logger getLogger() {
        Logger logger;
        Logger logger2 = this.logger;
        if (logger2 != null) {
            return logger2;
        }
        synchronized (this) {
            try {
                logger = this.logger;
                if (logger == null) {
                    logger = Hierarchy.getDefaultHierarchy().getLoggerFor(this.name);
                    this.logger = logger;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return logger;
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj) {
        if (obj != null) {
            getLogger().info(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public boolean isDebugEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isErrorEnabled() {
        return getLogger().isErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isFatalEnabled() {
        return getLogger().isFatalErrorEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isInfoEnabled() {
        return getLogger().isInfoEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isTraceEnabled() {
        return getLogger().isDebugEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public boolean isWarnEnabled() {
        return getLogger().isWarnEnabled();
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj) {
        debug(obj);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj) {
        if (obj != null) {
            getLogger().warn(String.valueOf(obj));
        }
    }

    @Override // org.apache.commons.logging.Log
    public void debug(Object obj, Throwable th2) {
        if (obj != null) {
            getLogger().debug(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void error(Object obj, Throwable th2) {
        if (obj != null) {
            getLogger().error(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void fatal(Object obj, Throwable th2) {
        if (obj != null) {
            getLogger().fatalError(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void info(Object obj, Throwable th2) {
        if (obj != null) {
            getLogger().info(String.valueOf(obj), th2);
        }
    }

    @Override // org.apache.commons.logging.Log
    public void trace(Object obj, Throwable th2) {
        debug(obj, th2);
    }

    @Override // org.apache.commons.logging.Log
    public void warn(Object obj, Throwable th2) {
        if (obj != null) {
            getLogger().warn(String.valueOf(obj), th2);
        }
    }
}
