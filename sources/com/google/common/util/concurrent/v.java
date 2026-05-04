package com.google.common.util.concurrent;

import com.google.common.collect.q8;
import com.google.common.util.concurrent.f;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.b(emulated = true)
@ReflectionSupport(ReflectionSupport.Level.FULL)
@l0
/* loaded from: classes7.dex */
public abstract class v<OutputT> extends f.j<OutputT> {

    /* renamed from: k, reason: collision with root package name */
    public static final b f34870k;

    /* renamed from: l, reason: collision with root package name */
    public static final o1 f34871l = new o1(v.class);

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    public volatile Set<Throwable> f34872i = null;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f34873j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class b {
        public b() {
        }

        public abstract void a(v<?> state, @CheckForNull Set<Throwable> expect, Set<Throwable> update);

        public abstract int b(v<?> state);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<? super v<?>, ? super Set<Throwable>> f34874a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicIntegerFieldUpdater<? super v<?>> f34875b;

        public c(AtomicReferenceFieldUpdater<? super v<?>, ? super Set<Throwable>> seenExceptionsUpdater, AtomicIntegerFieldUpdater<? super v<?>> remainingCountUpdater) {
            super();
            this.f34874a = seenExceptionsUpdater;
            this.f34875b = remainingCountUpdater;
        }

        @Override // com.google.common.util.concurrent.v.b
        public void a(v<?> state, @CheckForNull Set<Throwable> expect, Set<Throwable> update) {
            androidx.concurrent.futures.a.a(this.f34874a, state, expect, update);
        }

        @Override // com.google.common.util.concurrent.v.b
        public int b(v<?> state) {
            return this.f34875b.decrementAndGet(state);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends b {
        public d() {
            super();
        }

        @Override // com.google.common.util.concurrent.v.b
        public void a(v<?> state, @CheckForNull Set<Throwable> expect, Set<Throwable> update) {
            synchronized (state) {
                try {
                    if (state.f34872i == expect) {
                        state.f34872i = update;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.v.b
        public int b(v<?> state) {
            int H;
            synchronized (state) {
                H = v.H(state);
            }
            return H;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        b dVar;
        Throwable th2 = null;
        Object[] objArr = 0;
        try {
            dVar = new c(AtomicReferenceFieldUpdater.newUpdater(v.class, Set.class, "i"), AtomicIntegerFieldUpdater.newUpdater(v.class, "j"));
        } catch (Throwable th3) {
            dVar = new d();
            th2 = th3;
        }
        f34870k = dVar;
        if (th2 != null) {
            f34871l.a().log(Level.SEVERE, "SafeAtomicHelper is broken!", th2);
        }
    }

    public v(int remainingFutures) {
        this.f34873j = remainingFutures;
    }

    public static /* synthetic */ int H(v vVar) {
        int i11 = vVar.f34873j - 1;
        vVar.f34873j = i11;
        return i11;
    }

    public abstract void I(Set<Throwable> seen);

    public final void J() {
        this.f34872i = null;
    }

    public final int K() {
        return f34870k.b(this);
    }

    public final Set<Throwable> L() {
        Set<Throwable> set = this.f34872i;
        if (set != null) {
            return set;
        }
        Set<Throwable> p11 = q8.p();
        I(p11);
        f34870k.a(this, null, p11);
        Set<Throwable> set2 = this.f34872i;
        Objects.requireNonNull(set2);
        return set2;
    }
}
