package y3;

import j.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import l.c;
import l.e;
import l.g;
import m80.k;
import x00.l;
import x3.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a extends p implements d {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final x3.k f99224h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y3.a$a, reason: collision with other inner class name */
    public static final class C1341a implements g<c.a<g2>> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1341a f99225a = new C1341a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.app.biz.books.biz.BooksDbImpl$Schema$create$1", f = "BooksDbImpl.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: y3.a$a$a, reason: collision with other inner class name */
        public static final class C1342a extends SuspendLambda implements l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f99226a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f99227b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1342a(e eVar, j00.c<? super C1342a> cVar) {
                super(1, cVar);
                this.f99227b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new C1342a(this.f99227b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((C1342a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f99226a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    c a11 = e.a.a(this.f99227b, null, "CREATE TABLE IF NOT EXISTS AllBooksRecord (\n    id INTEGER PRIMARY KEY NOT NULL ,\n    payload BLOB NOT NULL,\n    localVersion INTEGER NOT NULL DEFAULT 0\n)", 0, null, 8, null);
                    this.f99226a = 1;
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
        @l00.d(c = "com.baicizhan.app.biz.books.biz.BooksDbImpl$Schema$migrate$1", f = "BooksDbImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: y3.a$a$b */
        public static final class b extends SuspendLambda implements l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f99228a;

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
                if (this.f99228a != 0) {
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
            return c.a.c(new C1342a(driver, null));
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
        this.f99224h = new x3.k(driver);
    }

    @Override // x3.d
    @k
    public x3.k r() {
        return this.f99224h;
    }
}
