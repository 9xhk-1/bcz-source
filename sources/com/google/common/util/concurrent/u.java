package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.aa;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public abstract class u<InputT, OutputT> extends v<OutputT> {

    /* renamed from: p, reason: collision with root package name */
    public static final o1 f34863p = new o1(u.class);

    /* renamed from: m, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public ImmutableCollection<? extends p1<? extends InputT>> f34864m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f34865n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f34866o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        OUTPUT_FUTURE_DONE,
        ALL_INPUT_FUTURES_PROCESSED
    }

    public u(ImmutableCollection<? extends p1<? extends InputT>> futures, boolean allMustSucceed, boolean collectsValues) {
        super(futures.size());
        this.f34864m = (ImmutableCollection) Preconditions.checkNotNull(futures);
        this.f34865n = allMustSucceed;
        this.f34866o = collectsValues;
    }

    public static boolean O(Set<Throwable> seen, Throwable param) {
        while (param != null) {
            if (!seen.add(param)) {
                return false;
            }
            param = param.getCause();
        }
        return true;
    }

    public static void V(Throwable throwable) {
        f34863p.a().log(Level.SEVERE, throwable instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", throwable);
    }

    @Override // com.google.common.util.concurrent.v
    public final void I(Set<Throwable> seen) {
        Preconditions.checkNotNull(seen);
        if (isCancelled()) {
            return;
        }
        Throwable a11 = a();
        Objects.requireNonNull(a11);
        O(seen, a11);
    }

    public abstract void P(int index, @z1 InputT returnValue);

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(int index, Future<? extends InputT> future) {
        try {
            P(index, y2.f(future));
        } catch (ExecutionException e11) {
            T(e11.getCause());
        } catch (Throwable th2) {
            T(th2);
        }
    }

    public final void R(@CheckForNull ImmutableCollection<? extends Future<? extends InputT>> futuresIfNeedToCollectAtCompletion) {
        int K = K();
        Preconditions.checkState(K >= 0, "Less than 0 remaining futures");
        if (K == 0) {
            X(futuresIfNeedToCollectAtCompletion);
        }
    }

    public abstract void S();

    public final void T(Throwable throwable) {
        Preconditions.checkNotNull(throwable);
        if (this.f34865n && !C(throwable) && O(L(), throwable)) {
            V(throwable);
        } else if (throwable instanceof Error) {
            V(throwable);
        }
    }

    public final void U() {
        Objects.requireNonNull(this.f34864m);
        if (this.f34864m.isEmpty()) {
            S();
            return;
        }
        if (!this.f34865n) {
            final ImmutableCollection<? extends p1<? extends InputT>> immutableCollection = this.f34866o ? this.f34864m : null;
            Runnable runnable = new Runnable() { // from class: com.google.common.util.concurrent.t
                @Override // java.lang.Runnable
                public final void run() {
                    u.this.R(immutableCollection);
                }
            };
            aa<? extends p1<? extends InputT>> it = this.f34864m.iterator();
            while (it.hasNext()) {
                p1<? extends InputT> next = it.next();
                if (next.isDone()) {
                    R(immutableCollection);
                } else {
                    next.addListener(runnable, w1.c());
                }
            }
            return;
        }
        aa<? extends p1<? extends InputT>> it2 = this.f34864m.iterator();
        final int i11 = 0;
        while (it2.hasNext()) {
            final p1<? extends InputT> next2 = it2.next();
            int i12 = i11 + 1;
            if (next2.isDone()) {
                W(i11, next2);
            } else {
                next2.addListener(new Runnable() { // from class: com.google.common.util.concurrent.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        u.this.W(i11, next2);
                    }
                }, w1.c());
            }
            i11 = i12;
        }
    }

    public final void W(int index, p1<? extends InputT> future) {
        try {
            if (future.isCancelled()) {
                this.f34864m = null;
                cancel(false);
            } else {
                Q(index, future);
            }
            R(null);
        } catch (Throwable th2) {
            R(null);
            throw th2;
        }
    }

    public final void X(@CheckForNull ImmutableCollection<? extends Future<? extends InputT>> futuresIfNeedToCollectAtCompletion) {
        if (futuresIfNeedToCollectAtCompletion != null) {
            aa<? extends Future<? extends InputT>> it = futuresIfNeedToCollectAtCompletion.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Future<? extends InputT> next = it.next();
                if (!next.isCancelled()) {
                    Q(i11, next);
                }
                i11++;
            }
        }
        J();
        S();
        Y(a.ALL_INPUT_FUTURES_PROCESSED);
    }

    @uo.g
    @uo.q
    public void Y(a reason) {
        Preconditions.checkNotNull(reason);
        this.f34864m = null;
    }

    @Override // com.google.common.util.concurrent.f
    public final void m() {
        super.m();
        ImmutableCollection<? extends p1<? extends InputT>> immutableCollection = this.f34864m;
        Y(a.OUTPUT_FUTURE_DONE);
        if (isCancelled() && (immutableCollection != null)) {
            boolean E = E();
            aa<? extends p1<? extends InputT>> it = immutableCollection.iterator();
            while (it.hasNext()) {
                it.next().cancel(E);
            }
        }
    }

    @Override // com.google.common.util.concurrent.f
    @CheckForNull
    public final String y() {
        ImmutableCollection<? extends p1<? extends InputT>> immutableCollection = this.f34864m;
        if (immutableCollection == null) {
            return super.y();
        }
        return "futures=" + immutableCollection;
    }
}
