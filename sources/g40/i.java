package g40;

import c40.k0;
import c40.l2;
import c40.o0;
import c40.p2;
import c40.r0;
import c40.t1;
import c40.x;
import c40.x0;
import c40.z;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.function.BiFunction;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFuture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,208:1\n1#2:209\n426#3,11:210\n*S KotlinDebug\n*F\n+ 1 Future.kt\nkotlinx/coroutines/future/FutureKt\n*L\n168#1:210,11\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CompletableFuture<T> f52702a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c<T> f52703b;

        public a(CompletableFuture<T> completableFuture, c<T> cVar) {
            this.f52702a = completableFuture;
            this.f52703b = cVar;
        }

        public final void a(Throwable th2) {
            this.f52702a.cancel(false);
            this.f52703b.cont = null;
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            a(th2);
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l2 f52704a;

        public b(l2 l2Var) {
            this.f52704a = l2Var;
        }

        public final void a(Object obj, Throwable th2) {
            l2 l2Var = this.f52704a;
            if (th2 != null) {
                r0 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
                if (r0 == null) {
                    r0 = t1.a("CompletableFuture was completed exceptionally", th2);
                }
            }
            l2Var.cancel(r0);
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(obj, (Throwable) obj2);
            return g2.f100423a;
        }
    }

    @k
    public static final <T> CompletableFuture<T> f(@k final x0<? extends T> x0Var) {
        final CompletableFuture<T> completableFuture = new CompletableFuture<>();
        p(x0Var, completableFuture);
        x0Var.z0(new l() { // from class: g40.d
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h11;
                h11 = i.h(completableFuture, x0Var, (Throwable) obj);
                return h11;
            }
        });
        return completableFuture;
    }

    @k
    public static final CompletableFuture<g2> g(@k l2 l2Var) {
        final CompletableFuture<g2> completableFuture = new CompletableFuture<>();
        p(l2Var, completableFuture);
        l2Var.z0(new l() { // from class: g40.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 i11;
                i11 = i.i(completableFuture, (Throwable) obj);
                return i11;
            }
        });
        return completableFuture;
    }

    public static final g2 h(CompletableFuture completableFuture, x0 x0Var, Throwable th2) {
        try {
            completableFuture.complete(x0Var.S());
        } catch (Throwable th3) {
            completableFuture.completeExceptionally(th3);
        }
        return g2.f100423a;
    }

    public static final g2 i(CompletableFuture completableFuture, Throwable th2) {
        if (th2 == null) {
            completableFuture.complete(g2.f100423a);
        } else {
            completableFuture.completeExceptionally(th2);
        }
        return g2.f100423a;
    }

    @k
    public static final <T> x0<T> j(@k CompletionStage<T> completionStage) {
        Throwable cause;
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (!completableFuture.isDone()) {
            final x c11 = z.c(null, 1, null);
            final p pVar = new p() { // from class: g40.e
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    Object k11;
                    k11 = i.k(x.this, obj, (Throwable) obj2);
                    return k11;
                }
            };
            completionStage.handle(new BiFunction() { // from class: g40.f
                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    Object l11;
                    l11 = i.l(p.this, obj, (Throwable) obj2);
                    return l11;
                }
            });
            p2.B(c11, false, new g40.a(completableFuture), 1, null);
            return c11;
        }
        try {
            return z.b(completableFuture.get());
        } catch (Throwable th2) {
            th = th2;
            ExecutionException executionException = th instanceof ExecutionException ? (ExecutionException) th : null;
            if (executionException != null && (cause = executionException.getCause()) != null) {
                th = cause;
            }
            x c12 = z.c(null, 1, null);
            c12.r(th);
            return c12;
        }
    }

    public static final Object k(x xVar, Object obj, Throwable th2) {
        boolean r11;
        Throwable cause;
        try {
            if (th2 == null) {
                r11 = xVar.c0(obj);
            } else {
                CompletionException completionException = th2 instanceof CompletionException ? (CompletionException) th2 : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th2 = cause;
                }
                r11 = xVar.r(th2);
            }
            return Boolean.valueOf(r11);
        } catch (Throwable th3) {
            o0.b(EmptyCoroutineContext.INSTANCE, th3);
            return g2.f100423a;
        }
    }

    public static final Object l(p pVar, Object obj, Throwable th2) {
        return pVar.invoke(obj, th2);
    }

    @m80.l
    public static final <T> Object m(@k CompletionStage<T> completionStage, @k j00.c<? super T> cVar) {
        CompletableFuture<T> completableFuture = completionStage.toCompletableFuture();
        if (completableFuture.isDone()) {
            try {
                return completableFuture.get();
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    throw e11;
                }
                throw cause;
            }
        }
        c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        c cVar2 = new c(pVar);
        completionStage.handle(cVar2);
        pVar.p(new a(completableFuture, cVar2));
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    @k
    public static final <T> CompletableFuture<T> n(@k r0 r0Var, @k kotlin.coroutines.d dVar, @k CoroutineStart coroutineStart, @k p<? super r0, ? super j00.c<? super T>, ? extends Object> pVar) {
        if (coroutineStart.isLazy()) {
            throw new IllegalArgumentException((coroutineStart + " start is not supported").toString());
        }
        kotlin.coroutines.d j11 = k0.j(r0Var, dVar);
        CompletableFuture<T> completableFuture = new CompletableFuture<>();
        g40.b bVar = new g40.b(j11, completableFuture);
        completableFuture.handle((BiFunction) bVar);
        bVar.d2(coroutineStart, bVar, pVar);
        return completableFuture;
    }

    public static /* synthetic */ CompletableFuture o(r0 r0Var, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i11 & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return n(r0Var, dVar, coroutineStart, pVar);
    }

    public static final void p(l2 l2Var, CompletableFuture<?> completableFuture) {
        final b bVar = new b(l2Var);
        completableFuture.handle(new BiFunction() { // from class: g40.h
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                g2 q11;
                q11 = i.q(p.this, obj, (Throwable) obj2);
                return q11;
            }
        });
    }

    public static final g2 q(p pVar, Object obj, Throwable th2) {
        return (g2) pVar.invoke(obj, th2);
    }
}
