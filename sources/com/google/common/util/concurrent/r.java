package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.q0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l0
@go.b
/* loaded from: classes7.dex */
public abstract class r<I, O, F, T> extends q0.a<O> implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public p1<? extends I> f34815i;

    /* renamed from: j, reason: collision with root package name */
    @CheckForNull
    @vo.b
    public F f34816j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<I, O> extends r<I, O, x<? super I, ? extends O>, p1<? extends O>> {
        public a(p1<? extends I> inputFuture, x<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.r
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public p1<? extends O> P(x<? super I, ? extends O> function, @z1 I input) throws Exception {
            p1<? extends O> apply = function.apply(input);
            Preconditions.checkNotNull(apply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", function);
            return apply;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.r
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public void Q(p1<? extends O> result) {
            D(result);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<I, O> extends r<I, O, ho.r<? super I, ? extends O>, O> {
        public b(p1<? extends I> inputFuture, ho.r<? super I, ? extends O> function) {
            super(inputFuture, function);
        }

        @Override // com.google.common.util.concurrent.r
        public void Q(@z1 O result) {
            B(result);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.r
        @z1
        /* renamed from: R, reason: merged with bridge method [inline-methods] */
        public O P(ho.r<? super I, ? extends O> function, @z1 I input) {
            return function.apply(input);
        }
    }

    public r(p1<? extends I> p1Var, F f11) {
        this.f34815i = (p1) Preconditions.checkNotNull(p1Var);
        this.f34816j = (F) Preconditions.checkNotNull(f11);
    }

    public static <I, O> p1<O> N(p1<I> input, ho.r<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(function);
        b bVar = new b(input, function);
        input.addListener(bVar, w1.p(executor, bVar));
        return bVar;
    }

    public static <I, O> p1<O> O(p1<I> input, x<? super I, ? extends O> function, Executor executor) {
        Preconditions.checkNotNull(executor);
        a aVar = new a(input, function);
        input.addListener(aVar, w1.p(executor, aVar));
        return aVar;
    }

    @uo.g
    @z1
    public abstract T P(F function, @z1 I result) throws Exception;

    @uo.g
    public abstract void Q(@z1 T result);

    @Override // com.google.common.util.concurrent.f
    public final void m() {
        x(this.f34815i);
        this.f34815i = null;
        this.f34816j = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        p1<? extends I> p1Var = this.f34815i;
        F f11 = this.f34816j;
        if ((isCancelled() | (p1Var == null)) || (f11 == null)) {
            return;
        }
        this.f34815i = null;
        if (p1Var.isCancelled()) {
            D(p1Var);
            return;
        }
        try {
            try {
                Object P = P(f11, d1.j(p1Var));
                this.f34816j = null;
                Q(P);
            } catch (Throwable th2) {
                try {
                    b2.b(th2);
                    C(th2);
                } finally {
                    this.f34816j = null;
                }
            }
        } catch (Error e11) {
            C(e11);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e12) {
            C(e12.getCause());
        } catch (Exception e13) {
            C(e13);
        }
    }

    @Override // com.google.common.util.concurrent.f
    @CheckForNull
    public String y() {
        String str;
        p1<? extends I> p1Var = this.f34815i;
        F f11 = this.f34816j;
        String y11 = super.y();
        if (p1Var != null) {
            str = "inputFuture=[" + p1Var + "], ";
        } else {
            str = "";
        }
        if (f11 != null) {
            return str + "function=[" + f11 + "]";
        }
        if (y11 == null) {
            return null;
        }
        return str + y11;
    }
}
