package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public class k1<V> implements p1<V> {

    /* renamed from: b, reason: collision with root package name */
    public static final p1<?> f34697b = new k1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final o1 f34698c = new o1(k1.class);

    /* renamed from: a, reason: collision with root package name */
    @z1
    public final V f34699a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<V> extends f.j<V> {

        /* renamed from: i, reason: collision with root package name */
        @CheckForNull
        public static final a<Object> f34700i;

        static {
            f34700i = f.f34532d ? null : new a<>();
        }

        public a() {
            cancel(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<V> extends f.j<V> {
        public b(Throwable thrown) {
            C(thrown);
        }
    }

    public k1(@z1 V value) {
        this.f34699a = value;
    }

    @Override // com.google.common.util.concurrent.p1
    public void addListener(Runnable listener, Executor executor) {
        Preconditions.checkNotNull(listener, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(listener);
        } catch (Exception e11) {
            f34698c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + listener + " with executor " + executor, (Throwable) e11);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean mayInterruptIfRunning) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @z1
    public V get() {
        return this.f34699a;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f34699a + "]]";
    }

    @Override // java.util.concurrent.Future
    @z1
    public V get(long timeout, TimeUnit unit) throws ExecutionException {
        Preconditions.checkNotNull(unit);
        return get();
    }
}
