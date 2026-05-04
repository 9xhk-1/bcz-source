package yw;

import io.ktor.utils.io.c0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@c0
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public p<? super ex.c, ? super j00.c<? super g2>, ? extends Object> f100348a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public x00.l<? super mw.a, Boolean> f100349b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.observer.ResponseObserverConfig$responseHandler$1", f = "ResponseObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<ex.c, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100350a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(cVar);
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ex.c cVar, j00.c<? super g2> cVar2) {
            return ((a) create(cVar, cVar2)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f100350a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return g2.f100423a;
        }
    }

    public final void a(@m80.k x00.l<? super mw.a, Boolean> block) {
        g0.p(block, "block");
        this.f100349b = block;
    }

    @m80.l
    public final x00.l<mw.a, Boolean> b() {
        return this.f100349b;
    }

    @m80.k
    public final p<ex.c, j00.c<? super g2>, Object> c() {
        return this.f100348a;
    }

    public final void d(@m80.k p<? super ex.c, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(block, "block");
        this.f100348a = block;
    }

    public final void e(@m80.l x00.l<? super mw.a, Boolean> lVar) {
        this.f100349b = lVar;
    }

    public final void f(@m80.k p<? super ex.c, ? super j00.c<? super g2>, ? extends Object> pVar) {
        g0.p(pVar, "<set-?>");
        this.f100348a = pVar;
    }
}
