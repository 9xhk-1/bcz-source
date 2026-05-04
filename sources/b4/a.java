package b4;

import e8.g;
import j.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import l.c;
import l.e;
import l00.d;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a extends p implements a4.a {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final g f5758h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: b4.a$a, reason: collision with other inner class name */
    public static final class C0103a implements l.g<c.a<g2>> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0103a f5759a = new C0103a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "com.baicizhan.app.biz.cache.biz.CacheDbImpl$Schema$create$1", f = "CacheDbImpl.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: b4.a$a$a, reason: collision with other inner class name */
        public static final class C0104a extends SuspendLambda implements l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f5760a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f5761b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0104a(e eVar, j00.c<? super C0104a> cVar) {
                super(1, cVar);
                this.f5761b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new C0104a(this.f5761b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((C0104a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f5760a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    c a11 = e.a.a(this.f5761b, null, "CREATE TABLE IF NOT EXISTS UserCacheRecord (\n    cacheKey TEXT PRIMARY KEY NOT NULL,\n    payload BLOB\n)", 0, null, 8, null);
                    this.f5760a = 1;
                    if (a11.i(this) == l11) {
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
        @d(c = "com.baicizhan.app.biz.cache.biz.CacheDbImpl$Schema$migrate$1", f = "CacheDbImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: b4.a$a$b */
        public static final class b extends SuspendLambda implements l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f5762a;

            public b(j00.c<? super b> cVar) {
                super(1, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new b(cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((b) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                kotlin.coroutines.intrinsics.b.l();
                if (this.f5762a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                return g2.f100423a;
            }
        }

        @Override // l.g
        public /* bridge */ /* synthetic */ c.a<g2> a(e eVar) {
            return c.a.b(c(eVar));
        }

        @Override // l.g
        public /* bridge */ /* synthetic */ c.a<g2> b(e eVar, long j11, long j12, l.a[] aVarArr) {
            return c.a.b(d(eVar, j11, j12, aVarArr));
        }

        @k
        public l<j00.c<? super g2>, Object> c(@k e driver) {
            g0.p(driver, "driver");
            return c.a.c(new C0104a(driver, null));
        }

        @k
        public l<j00.c<? super g2>, Object> d(@k e driver, long j11, long j12, @k l.a... callbacks) {
            g0.p(driver, "driver");
            g0.p(callbacks, "callbacks");
            return c.a.c(new b(null));
        }

        @Override // l.g
        public long getVersion() {
            return 1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k e driver) {
        super(driver);
        g0.p(driver, "driver");
        this.f5758h = new g(driver);
    }

    @Override // a4.a
    @k
    public g o() {
        return this.f5758h;
    }
}
