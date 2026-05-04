package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f34742c = new o1(m0.class);

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    @vo.a("this")
    public a f34743a;

    /* renamed from: b, reason: collision with root package name */
    @vo.a("this")
    public boolean f34744b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f34745a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f34746b;

        /* renamed from: c, reason: collision with root package name */
        @CheckForNull
        public a f34747c;

        public a(Runnable runnable, Executor executor, @CheckForNull a next) {
            this.f34745a = runnable;
            this.f34746b = executor;
            this.f34747c = next;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e11) {
            f34742c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e11);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        synchronized (this) {
            try {
                if (this.f34744b) {
                    c(runnable, executor);
                } else {
                    this.f34743a = new a(runnable, executor, this.f34743a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (this) {
            try {
                if (this.f34744b) {
                    return;
                }
                this.f34744b = true;
                a aVar = this.f34743a;
                a aVar2 = null;
                this.f34743a = null;
                while (aVar != null) {
                    a aVar3 = aVar.f34747c;
                    aVar.f34747c = aVar2;
                    aVar2 = aVar;
                    aVar = aVar3;
                }
                while (aVar2 != null) {
                    c(aVar2.f34745a, aVar2.f34746b);
                    aVar2 = aVar2.f34747c;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
