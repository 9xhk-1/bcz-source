package rw;

import c40.l2;
import c40.l3;
import c40.n2;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.slf4j.Logger;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final Logger f84681a = ez.a.a("io.ktor.client.plugins.HttpRequestLifecycle");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final sw.b<g2> f84682b = sw.i.c("RequestLifecycle", new x00.l() { // from class: rw.i0
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 d11;
            d11 = j0.d((sw.d) obj);
            return d11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.HttpRequestLifecycleKt$HttpRequestLifecycle$1$1", f = "HttpRequestLifecycle.kt", i = {0}, l = {27}, m = "invokeSuspend", n = {"executionContext"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements x00.q<cx.y, x00.l<? super j00.c<? super g2>, ? extends Object>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f84683a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f84684b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f84685c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sw.d<g2> f84686d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sw.d<g2> dVar, j00.c<? super a> cVar) {
            super(3, cVar);
            this.f84686d = dVar;
        }

        @Override // x00.q
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(cx.y yVar, x00.l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super g2> cVar) {
            a aVar = new a(this.f84686d, cVar);
            aVar.f84684b = yVar;
            aVar.f84685c = lVar;
            return aVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            c40.a0 a0Var;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f84683a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                cx.y yVar = (cx.y) this.f84684b;
                x00.l lVar = (x00.l) this.f84685c;
                c40.a0 a11 = l3.a(yVar.h());
                d.b bVar = this.f84686d.b().getCoroutineContext().get(l2.f7886e0);
                kotlin.jvm.internal.g0.m(bVar);
                j0.f(a11, (l2) bVar);
                try {
                    yVar.p(a11);
                    this.f84684b = a11;
                    this.f84683a = 1;
                    if (lVar.invoke(this) == l11) {
                        return l11;
                    }
                    a0Var = a11;
                } catch (Throwable th2) {
                    th = th2;
                    a0Var = a11;
                    a0Var.r(th);
                    throw th;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0Var = (c40.a0) this.f84684b;
                try {
                    kotlin.e.n(obj);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        a0Var.r(th);
                        throw th;
                    } catch (Throwable th4) {
                        a0Var.complete();
                        throw th4;
                    }
                }
            }
            a0Var.complete();
            return g2.f100423a;
        }
    }

    public static final g2 d(sw.d createClientPlugin) {
        kotlin.jvm.internal.g0.p(createClientPlugin, "$this$createClientPlugin");
        createClientPlugin.g(n1.f84731a, new a(createClientPlugin, null));
        return g2.f100423a;
    }

    public static final void f(final c40.a0 a0Var, l2 l2Var) {
        final c40.k1 z02 = l2Var.z0(new x00.l() { // from class: rw.g0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 g11;
                g11 = j0.g(c40.a0.this, (Throwable) obj);
                return g11;
            }
        });
        a0Var.z0(new x00.l() { // from class: rw.h0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h11;
                h11 = j0.h(c40.k1.this, (Throwable) obj);
                return h11;
            }
        });
    }

    public static final g2 g(c40.a0 a0Var, Throwable th2) {
        if (th2 != null) {
            f84681a.trace("Cancelling request because engine Job failed with error: " + th2);
            n2.e(a0Var, "Engine failed", th2);
        } else {
            f84681a.trace("Cancelling request because engine Job completed");
            a0Var.complete();
        }
        return g2.f100423a;
    }

    public static final g2 h(c40.k1 k1Var, Throwable th2) {
        k1Var.dispose();
        return g2.f100423a;
    }

    @m80.k
    public static final sw.b<g2> i() {
        return f84682b;
    }
}
