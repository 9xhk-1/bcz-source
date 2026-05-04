package z3;

import c40.l3;
import c40.r0;
import c40.s0;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import l.e;
import m80.k;
import m80.l;
import oa0.r;
import x00.p;
import x3.o;
import yz.g2;
import z8.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r(binds = {z3.c.class})
/* loaded from: classes3.dex */
public final class a implements z3.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final v3.b f100765a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final r0 f100766b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public h1 f100767c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.data.BooksStoreImpl", f = "IBooksSource.kt", i = {}, l = {41, 44}, m = "getBooks", n = {}, s = {}, v = 1)
    /* renamed from: z3.a$a, reason: collision with other inner class name */
    public static final class C1379a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f100768a;

        /* renamed from: c, reason: collision with root package name */
        public int f100770c;

        public C1379a(j00.c<? super C1379a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f100768a = obj;
            this.f100770c |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.data.BooksStoreImpl$getOrCreateDb$2", f = "IBooksSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements p<e, j00.c<? super x3.d>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f100771a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f100772b;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(cVar);
            bVar.f100772b = obj;
            return bVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e eVar, j00.c<? super x3.d> cVar) {
            return ((b) create(eVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            e eVar = (e) this.f100772b;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f100771a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return x3.d.f97181f.b(eVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.data.BooksStoreImpl", f = "IBooksSource.kt", i = {}, l = {66, 66}, m = "getVersion", n = {}, s = {}, v = 1)
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f100773a;

        /* renamed from: c, reason: collision with root package name */
        public int f100775c;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f100773a = obj;
            this.f100775c |= Integer.MIN_VALUE;
            return a.this.getVersion(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.app.biz.books.data.BooksStoreImpl$saveBooks$2", f = "IBooksSource.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {54, 55}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-BooksStoreImpl$saveBooks$2$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "$this$invokeSuspend_u24lambda_u240_u240", "$i$a$-runCatching-BooksStoreImpl$saveBooks$2$1", "$i$a$-apply-BooksStoreImpl$saveBooks$2$1$1"}, s = {"L$0", "L$2", "I$0", "L$0", "L$1", "L$3", "I$0", "I$1"}, v = 1)
    public static final class d extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f100776a;

        /* renamed from: b, reason: collision with root package name */
        public Object f100777b;

        /* renamed from: c, reason: collision with root package name */
        public Object f100778c;

        /* renamed from: d, reason: collision with root package name */
        public long f100779d;

        /* renamed from: e, reason: collision with root package name */
        public int f100780e;

        /* renamed from: f, reason: collision with root package name */
        public int f100781f;

        /* renamed from: g, reason: collision with root package name */
        public int f100782g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f100783h;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ h1 f100785j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f100786k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(h1 h1Var, long j11, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f100785j = h1Var;
            this.f100786k = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = a.this.new d(this.f100785j, this.f100786k, cVar);
            dVar.f100783h = obj;
            return dVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            h1 h1Var;
            r0 r0Var;
            int i11;
            long j11;
            x3.k kVar;
            r0 r0Var2 = (r0) this.f100783h;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f100782g;
            try {
            } catch (Throwable th2) {
                Result.a aVar = Result.Companion;
                m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
            }
            if (i12 == 0) {
                kotlin.e.n(obj);
                a aVar2 = a.this;
                h1Var = this.f100785j;
                long j12 = this.f100786k;
                Result.a aVar3 = Result.Companion;
                this.f100783h = l00.k.a(r0Var2);
                this.f100776a = h1Var;
                this.f100777b = l00.k.a(r0Var2);
                this.f100779d = j12;
                this.f100780e = 0;
                this.f100782g = 1;
                obj = aVar2.c(this);
                if (obj == l11) {
                    return l11;
                }
                r0Var = r0Var2;
                i11 = 0;
                j11 = j12;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = (x3.k) this.f100777b;
                    kotlin.e.n(obj);
                    m6308constructorimpl = Result.m6308constructorimpl(kVar);
                    long j13 = this.f100786k;
                    z6.b.j(z6.b.f101032b, o.f97378a, "saveBooks " + j13 + ' ' + Result.m6315isSuccessimpl(m6308constructorimpl), null, 4, null);
                    return g2.f100423a;
                }
                i11 = this.f100780e;
                long j14 = this.f100779d;
                r0 r0Var3 = (r0) this.f100777b;
                h1Var = (h1) this.f100776a;
                kotlin.e.n(obj);
                j11 = j14;
                r0Var = r0Var3;
            }
            x3.k r11 = ((x3.d) obj).r();
            x3.a aVar4 = new x3.a(123L, l7.d.a(h1Var, h1.f101576f), j11);
            this.f100783h = l00.k.a(r0Var2);
            this.f100776a = l00.k.a(r0Var);
            this.f100777b = r11;
            this.f100778c = l00.k.a(r11);
            this.f100780e = i11;
            this.f100781f = 0;
            this.f100782g = 2;
            if (r11.Q(aVar4, this) != l11) {
                kVar = r11;
                m6308constructorimpl = Result.m6308constructorimpl(kVar);
                long j132 = this.f100786k;
                z6.b.j(z6.b.f101032b, o.f97378a, "saveBooks " + j132 + ' ' + Result.m6315isSuccessimpl(m6308constructorimpl), null, 4, null);
                return g2.f100423a;
            }
            return l11;
        }
    }

    public a(@k v3.b dbPoll) {
        g0.p(dbPoll, "dbPoll");
        this.f100765a = dbPoll;
        this.f100766b = s0.a(c4.o.b().plus(l3.c(null, 1, null)));
    }

    @Override // z3.c
    @l
    public Object a(@k h1 h1Var, long j11, @k j00.c<? super g2> cVar) {
        this.f100767c = h1Var;
        c40.k.f(this.f100766b, null, null, new d(h1Var, j11, null), 3, null);
        return g2.f100423a;
    }

    public final Object c(j00.c<? super x3.d> cVar) {
        return v3.b.b(this.f100765a, x3.d.f97181f.a(), z3.b.f100788b, false, new b(null), cVar, 4, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005a, code lost:
    
        if (r7 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // z3.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(@m80.k j00.c<? super z8.h1> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof z3.a.C1379a
            if (r0 == 0) goto L13
            r0 = r7
            z3.a$a r0 = (z3.a.C1379a) r0
            int r1 = r0.f100770c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100770c = r1
            goto L18
        L13:
            z3.a$a r0 = new z3.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f100768a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f100770c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            goto L5d
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.e.n(r7)
            goto L48
        L38:
            kotlin.e.n(r7)
            z8.h1 r7 = r6.f100767c
            if (r7 != 0) goto L73
            r0.f100770c = r4
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L48
            goto L5c
        L48:
            x3.d r7 = (x3.d) r7
            x3.k r7 = r7.r()
            r4 = 123(0x7b, double:6.1E-322)
            j.j r7 = r7.T(r4)
            r0.f100770c = r3
            java.lang.Object r7 = k.e.f(r7, r0)
            if (r7 != r1) goto L5d
        L5c:
            return r1
        L5d:
            x3.a r7 = (x3.a) r7
            if (r7 == 0) goto L70
            byte[] r7 = r7.h()
            if (r7 == 0) goto L70
            ts.a<z8.h1, z8.h1$a> r0 = z8.h1.f101576f
            java.lang.Object r7 = l7.d.c(r7, r0)
            z8.h1 r7 = (z8.h1) r7
            goto L71
        L70:
            r7 = 0
        L71:
            r6.f100767c = r7
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.d(j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0056, code lost:
    
        if (r7 != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // z3.c
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getVersion(@m80.k j00.c<? super java.lang.Long> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof z3.a.c
            if (r0 == 0) goto L13
            r0 = r7
            z3.a$c r0 = (z3.a.c) r0
            int r1 = r0.f100775c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f100775c = r1
            goto L18
        L13:
            z3.a$c r0 = new z3.a$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f100773a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f100775c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            goto L59
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            kotlin.e.n(r7)
            goto L44
        L38:
            kotlin.e.n(r7)
            r0.f100775c = r4
            java.lang.Object r7 = r6.c(r0)
            if (r7 != r1) goto L44
            goto L58
        L44:
            x3.d r7 = (x3.d) r7
            x3.k r7 = r7.r()
            r4 = 123(0x7b, double:6.1E-322)
            j.j r7 = r7.W(r4)
            r0.f100775c = r3
            java.lang.Object r7 = k.e.f(r7, r0)
            if (r7 != r1) goto L59
        L58:
            return r1
        L59:
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 == 0) goto L62
            long r0 = r7.longValue()
            goto L64
        L62:
            r0 = -1
        L64:
            java.lang.Long r7 = l00.a.g(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.a.getVersion(j00.c):java.lang.Object");
    }
}
