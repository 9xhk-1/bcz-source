package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@uo.f("Create an AbstractIdleService")
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public interface Service {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        NEW,
        STARTING,
        RUNNING,
        STOPPING,
        TERMINATED,
        FAILED
    }

    void a(a listener, Executor executor);

    void b(long timeout, TimeUnit unit) throws TimeoutException;

    void c(long timeout, TimeUnit unit) throws TimeoutException;

    void d();

    Throwable e();

    void f();

    @uo.a
    Service g();

    State h();

    @uo.a
    Service i();

    boolean isRunning();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class a {
        public void b() {
        }

        public void c() {
        }

        public void d(State from) {
        }

        public void e(State from) {
        }

        public void a(State from, Throwable failure) {
        }
    }
}
