package k;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import l.c;
import l.g;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "app.cash.sqldelight.async.coroutines.DriverExtensionsKt$awaitQuery$2$1", f = "DriverExtensions.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a<R> extends SuspendLambda implements l<j00.c<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f64754a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<l.d, j00.c<? super R>, Object> f64755b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l.d f64756c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(p<? super l.d, ? super j00.c<? super R>, ? extends Object> pVar, l.d dVar, j00.c<? super a> cVar) {
            super(1, cVar);
            this.f64755b = pVar;
            this.f64756c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(j00.c<?> cVar) {
            return new a(this.f64755b, this.f64756c, cVar);
        }

        @Override // x00.l
        public final Object invoke(j00.c<? super R> cVar) {
            return ((a) create(cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f64754a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return obj;
            }
            kotlin.e.n(obj);
            p<l.d, j00.c<? super R>, Object> pVar = this.f64755b;
            l.d dVar = this.f64756c;
            this.f64754a = 1;
            Object invoke = pVar.invoke(dVar, this);
            return invoke == l11 ? l11 : invoke;
        }
    }

    @m80.l
    public static final Object b(@k l.e eVar, @m80.l Integer num, @k String str, int i11, @m80.l l<? super l.f, g2> lVar, @k j00.c<? super Long> cVar) {
        return eVar.v3(num, str, i11, lVar).i(cVar);
    }

    public static /* synthetic */ Object c(l.e eVar, Integer num, String str, int i11, l lVar, j00.c cVar, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        return b(eVar, num, str, i11, lVar, cVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.c] */
    @m80.l
    public static final Object d(@k g<?> gVar, @k l.e eVar, @k j00.c<? super g2> cVar) {
        Object i11 = gVar.a(eVar).i(cVar);
        return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [l.c] */
    @m80.l
    public static final Object e(@k g<?> gVar, @k l.e eVar, long j11, long j12, @k j00.c<? super g2> cVar) {
        Object i11 = gVar.b(eVar, j11, j12, new l.a[0]).i(cVar);
        return i11 == kotlin.coroutines.intrinsics.b.l() ? i11 : g2.f100423a;
    }

    @m80.l
    public static final <R> Object f(@k l.e eVar, @m80.l Integer num, @k String str, @k final p<? super l.d, ? super j00.c<? super R>, ? extends Object> pVar, int i11, @m80.l l<? super l.f, g2> lVar, @k j00.c<? super R> cVar) {
        return eVar.c5(num, str, new l() { // from class: k.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                l.c h11;
                h11 = b.h(p.this, (l.d) obj);
                return h11;
            }
        }, i11, lVar).i(cVar);
    }

    public static /* synthetic */ Object g(l.e eVar, Integer num, String str, p pVar, int i11, l lVar, j00.c cVar, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            lVar = null;
        }
        return f(eVar, num, str, pVar, i11, lVar, cVar);
    }

    public static final l.c h(p pVar, l.d it) {
        g0.p(it, "it");
        return c.a.b(c.a.c(new a(pVar, it, null)));
    }
}
