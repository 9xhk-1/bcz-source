package q7;

import j.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import l.c;
import l.e;
import l.g;
import l00.d;
import m80.k;
import p7.c;
import p7.l0;
import p7.n;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a extends p implements c {

    /* renamed from: h, reason: collision with root package name */
    @k
    public final n f81826h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final l0 f81827i;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: q7.a$a, reason: collision with other inner class name */
    public static final class C1006a implements g<c.a<g2>> {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1006a f81828a = new C1006a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "com.baicizhan.app.biz.userbook.biz.UserBookDbImpl$Schema$create$1", f = "UserBookDbImpl.kt", i = {}, l = {42, 55}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: q7.a$a$a, reason: collision with other inner class name */
        public static final class C1007a extends SuspendLambda implements l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f81829a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f81830b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1007a(e eVar, j00.c<? super C1007a> cVar) {
                super(1, cVar);
                this.f81830b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(j00.c<?> cVar) {
                return new C1007a(this.f81830b, cVar);
            }

            @Override // x00.l
            public final Object invoke(j00.c<? super g2> cVar) {
                return ((C1007a) create(cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
            
                if (r12.i(r11) == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
            
                if (r12.i(r11) == r0) goto L15;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r11.f81829a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r12)
                    goto L4f
                L12:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L1a:
                    kotlin.e.n(r12)
                    goto L38
                L1e:
                    kotlin.e.n(r12)
                    l.e r4 = r11.f81830b
                    r9 = 8
                    r10 = 0
                    r5 = 0
                    java.lang.String r6 = "CREATE TABLE IF NOT EXISTS UserBookRecord (\n    userBookId INTEGER PRIMARY KEY NOT NULL,\n    bookName TEXT NOT NULL,\n    wordNum INTEGER NOT NULL DEFAULT 0,\n    cover TEXT,\n    remoteVersion INTEGER NOT NULL DEFAULT 0,\n    localVersion INTEGER NOT NULL DEFAULT 0\n)"
                    r7 = 0
                    r8 = 0
                    l.c r12 = l.e.a.a(r4, r5, r6, r7, r8, r9, r10)
                    r11.f81829a = r3
                    java.lang.Object r12 = r12.i(r11)
                    if (r12 != r0) goto L38
                    goto L4e
                L38:
                    l.e r3 = r11.f81830b
                    r8 = 8
                    r9 = 0
                    r4 = 0
                    java.lang.String r5 = "CREATE TABLE IF NOT EXISTS UserBookWordRecord (\n    topicId INTEGER NOT NULL,\n    userBookId INTEGER NOT NULL,\n    bookId INTEGER NOT NULL,\n    createdAt INTEGER NOT NULL,\n    word TEXT NOT NULL,\n    mean TEXT NOT NULL,\n    audioUs TEXT NOT NULL,\n    audioUk TEXT NOT NULL,\n    PRIMARY KEY (topicId, userBookId)\n)"
                    r6 = 0
                    r7 = 0
                    l.c r12 = l.e.a.a(r3, r4, r5, r6, r7, r8, r9)
                    r11.f81829a = r2
                    java.lang.Object r12 = r12.i(r11)
                    if (r12 != r0) goto L4f
                L4e:
                    return r0
                L4f:
                    yz.g2 r12 = yz.g2.f100423a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: q7.a.C1006a.C1007a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @d(c = "com.baicizhan.app.biz.userbook.biz.UserBookDbImpl$Schema$migrate$1", f = "UserBookDbImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: q7.a$a$b */
        public static final class b extends SuspendLambda implements l<j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f81831a;

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
                if (this.f81831a != 0) {
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
            return c.a.c(new C1007a(driver, null));
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
        this.f81826h = new n(driver);
        this.f81827i = new l0(driver);
    }

    @Override // p7.c
    @k
    public l0 f() {
        return this.f81827i;
    }

    @Override // p7.c
    @k
    public n w() {
        return this.f81826h;
    }
}
