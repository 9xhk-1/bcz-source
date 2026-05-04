package k;

import c40.j;
import c40.r0;
import java.util.Arrays;
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
public final class f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements g<c.d<g2>> {

        /* renamed from: a, reason: collision with root package name */
        public final long f64772a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g<c.a<g2>> f64773b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "app.cash.sqldelight.async.coroutines.SynchronousKt$synchronous$1$create$1", f = "Synchronous.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: k.f$a$a, reason: collision with other inner class name */
        public static final class C0745a extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f64774a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g<c.a<g2>> f64775b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l.e f64776c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0745a(g<c.a<g2>> gVar, l.e eVar, j00.c<? super C0745a> cVar) {
                super(2, cVar);
                this.f64775b = gVar;
                this.f64776c = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0745a(this.f64775b, this.f64776c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0745a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f64774a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    l j11 = this.f64775b.a(this.f64776c).j();
                    this.f64774a = 1;
                    if (c.a.a(j11, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "app.cash.sqldelight.async.coroutines.SynchronousKt$synchronous$1$migrate$1", f = "Synchronous.kt", i = {}, l = {24}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class b extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f64777a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g<c.a<g2>> f64778b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ l.e f64779c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ long f64780d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f64781e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ l.a[] f64782f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(g<c.a<g2>> gVar, l.e eVar, long j11, long j12, l.a[] aVarArr, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f64778b = gVar;
                this.f64779c = eVar;
                this.f64780d = j11;
                this.f64781e = j12;
                this.f64782f = aVarArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new b(this.f64778b, this.f64779c, this.f64780d, this.f64781e, this.f64782f, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f64777a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    g<c.a<g2>> gVar = this.f64778b;
                    l.e eVar = this.f64779c;
                    long j11 = this.f64780d;
                    long j12 = this.f64781e;
                    l.a[] aVarArr = this.f64782f;
                    l j13 = gVar.b(eVar, j11, j12, (l.a[]) Arrays.copyOf(aVarArr, aVarArr.length)).j();
                    this.f64777a = 1;
                    if (c.a.a(j13, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        public a(g<c.a<g2>> gVar) {
            this.f64773b = gVar;
            this.f64772a = gVar.getVersion();
        }

        @Override // l.g
        public /* bridge */ /* synthetic */ c.d<g2> a(l.e eVar) {
            return c.d.b(c(eVar));
        }

        @Override // l.g
        public /* bridge */ /* synthetic */ c.d<g2> b(l.e eVar, long j11, long j12, l.a[] aVarArr) {
            return c.d.b(d(eVar, j11, j12, aVarArr));
        }

        public Object c(l.e driver) {
            Object b11;
            g0.p(driver, "driver");
            b11 = j.b(null, new C0745a(this.f64773b, driver, null), 1, null);
            return c.d.c(b11);
        }

        public Object d(l.e driver, long j11, long j12, l.a... callbacks) {
            Object b11;
            g0.p(driver, "driver");
            g0.p(callbacks, "callbacks");
            b11 = j.b(null, new b(this.f64773b, driver, j11, j12, callbacks, null), 1, null);
            return c.d.c(b11);
        }

        @Override // l.g
        public long getVersion() {
            return this.f64772a;
        }
    }

    @k
    public static final g<c.d<g2>> a(@k g<c.a<g2>> gVar) {
        g0.p(gVar, "<this>");
        return new a(gVar);
    }
}
