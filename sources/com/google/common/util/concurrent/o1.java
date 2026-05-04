package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f34781a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final String f34782b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Logger f34783c;

    public o1(Class<?> ownerOfLogger) {
        this.f34782b = ownerOfLogger.getName();
    }

    public Logger a() {
        Logger logger = this.f34783c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f34781a) {
            try {
                Logger logger2 = this.f34783c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f34782b);
                this.f34783c = logger3;
                return logger3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
