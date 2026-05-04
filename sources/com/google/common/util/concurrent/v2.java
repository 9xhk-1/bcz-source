package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.q0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class v2<V> extends q0.a<V> {

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public p1<V> f34884i;

    /* renamed from: j, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public ScheduledFuture<?> f34885j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<V> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        @vo.b
        public v2<V> f34886a;

        public b(v2<V> timeoutFuture) {
            this.f34886a = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            p1<? extends V> p1Var;
            v2<V> v2Var = this.f34886a;
            if (v2Var == null || (p1Var = v2Var.f34884i) == null) {
                return;
            }
            this.f34886a = null;
            if (p1Var.isDone()) {
                v2Var.D(p1Var);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = v2Var.f34885j;
                v2Var.f34885j = null;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (abs > 10) {
                            str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                        }
                    } catch (Throwable th2) {
                        v2Var.C(new c(str));
                        throw th2;
                    }
                }
                v2Var.C(new c(str + ": " + p1Var));
            } finally {
                p1Var.cancel(true);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        public c(String message) {
            super(message);
        }
    }

    public v2(p1<V> delegate) {
        this.f34884i = (p1) Preconditions.checkNotNull(delegate);
    }

    public static <V> p1<V> Q(p1<V> delegate, long time, TimeUnit unit, ScheduledExecutorService scheduledExecutor) {
        v2 v2Var = new v2(delegate);
        b bVar = new b(v2Var);
        v2Var.f34885j = scheduledExecutor.schedule(bVar, time, unit);
        delegate.addListener(bVar, w1.c());
        return v2Var;
    }

    @Override // com.google.common.util.concurrent.f
    public void m() {
        x(this.f34884i);
        ScheduledFuture<?> scheduledFuture = this.f34885j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f34884i = null;
        this.f34885j = null;
    }

    @Override // com.google.common.util.concurrent.f
    @CheckForNull
    public String y() {
        p1<V> p1Var = this.f34884i;
        ScheduledFuture<?> scheduledFuture = this.f34885j;
        if (p1Var == null) {
            return null;
        }
        String str = "inputFuture=[" + p1Var + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }
}
