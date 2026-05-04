package vw;

import a00.m0;
import ix.n;
import ix.t2;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import vw.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAcceptAllCookiesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AcceptAllCookiesStorage.kt\nio/ktor/client/plugins/cookies/AcceptAllCookiesStorage\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n116#2,8:72\n125#2,2:87\n116#2,11:89\n774#3:80\n865#3,2:81\n1557#3:83\n1628#3,3:84\n1797#3,2:100\n1799#3:103\n1#4:102\n*S KotlinDebug\n*F\n+ 1 AcceptAllCookiesStorage.kt\nio/ktor/client/plugins/cookies/AcceptAllCookiesStorage\n*L\n24#1:72,8\n24#1:87,2\n37#1:89,11\n28#1:80\n28#1:81,2\n28#1:83\n28#1:84,3\n61#1:100,2\n61#1:103\n*E\n"})
/* loaded from: classes8.dex */
public final class d implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x00.a<Long> f94275a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<a> f94276b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final n40.a f94277c;

    @k
    private volatile /* synthetic */ long oldestCookie;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final n f94278a;

        /* renamed from: b, reason: collision with root package name */
        public final long f94279b;

        public a(@k n cookie, long j11) {
            g0.p(cookie, "cookie");
            this.f94278a = cookie;
            this.f94279b = j11;
        }

        public static /* synthetic */ a d(a aVar, n nVar, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                nVar = aVar.f94278a;
            }
            if ((i11 & 2) != 0) {
                j11 = aVar.f94279b;
            }
            return aVar.c(nVar, j11);
        }

        @k
        public final n a() {
            return this.f94278a;
        }

        public final long b() {
            return this.f94279b;
        }

        @k
        public final a c(@k n cookie, long j11) {
            g0.p(cookie, "cookie");
            return new a(cookie, j11);
        }

        @k
        public final n e() {
            return this.f94278a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return g0.g(this.f94278a, aVar.f94278a) && this.f94279b == aVar.f94279b;
        }

        public final long f() {
            return this.f94279b;
        }

        public int hashCode() {
            return (this.f94278a.hashCode() * 31) + Long.hashCode(this.f94279b);
        }

        @k
        public String toString() {
            return "CookieWithTimestamp(cookie=" + this.f94278a + ", createdAt=" + this.f94279b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0, 0}, l = {77}, m = "addCookie", n = {"this", "requestUrl", "cookie", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94280a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94281b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94282c;

        /* renamed from: d, reason: collision with root package name */
        public Object f94283d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f94284e;

        /* renamed from: g, reason: collision with root package name */
        public int f94286g;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f94284e = obj;
            this.f94286g |= Integer.MIN_VALUE;
            return d.this.U2(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.plugins.cookies.AcceptAllCookiesStorage", f = "AcceptAllCookiesStorage.kt", i = {0, 0, 0}, l = {77}, m = ct.d.f46852f, n = {"this", "requestUrl", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f94287a;

        /* renamed from: b, reason: collision with root package name */
        public Object f94288b;

        /* renamed from: c, reason: collision with root package name */
        public Object f94289c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f94290d;

        /* renamed from: f, reason: collision with root package name */
        public int f94292f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f94290d = obj;
            this.f94292f |= Integer.MIN_VALUE;
            return d.this.e7(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final long f() {
        return io.ktor.util.date.a.d();
    }

    public static final boolean i(n nVar, t2 t2Var, a aVar) {
        g0.p(aVar, "<destruct>");
        n a11 = aVar.a();
        return g0.g(a11.t(), nVar.t()) && g.c(a11, t2Var);
    }

    public static final boolean k(d dVar, long j11, a aVar) {
        g0.p(aVar, "<destruct>");
        Long q11 = dVar.q(aVar.a(), aVar.b());
        return q11 != null && q11.longValue() < j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0092 A[Catch: all -> 0x009f, TryCatch #0 {all -> 0x009f, blocks: (B:11:0x0068, B:13:0x0092, B:15:0x009c, B:16:0x00a1), top: B:10:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // vw.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object U2(@m80.k final ix.t2 r7, @m80.k final ix.n r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof vw.d.b
            if (r0 == 0) goto L13
            r0 = r9
            vw.d$b r0 = (vw.d.b) r0
            int r1 = r0.f94286g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94286g = r1
            goto L18
        L13:
            vw.d$b r0 = new vw.d$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f94284e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94286g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L44
            if (r2 != r3) goto L3c
            java.lang.Object r7 = r0.f94283d
            n40.a r7 = (n40.a) r7
            java.lang.Object r8 = r0.f94282c
            ix.n r8 = (ix.n) r8
            java.lang.Object r1 = r0.f94281b
            ix.t2 r1 = (ix.t2) r1
            java.lang.Object r0 = r0.f94280a
            vw.d r0 = (vw.d) r0
            kotlin.e.n(r9)
            r9 = r7
            r7 = r1
            goto L68
        L3c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L44:
            kotlin.e.n(r9)
            java.lang.String r9 = r8.t()
            boolean r9 = u30.k0.O3(r9)
            if (r9 == 0) goto L54
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L54:
            n40.a r9 = r6.f94277c
            r0.f94280a = r6
            r0.f94281b = r7
            r0.f94282c = r8
            r0.f94283d = r9
            r0.f94286g = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L67
            return r1
        L67:
            r0 = r6
        L68:
            java.util.List<vw.d$a> r1 = r0.f94276b     // Catch: java.lang.Throwable -> L9f
            vw.a r2 = new vw.a     // Catch: java.lang.Throwable -> L9f
            r2.<init>()     // Catch: java.lang.Throwable -> L9f
            a00.m0.N0(r1, r2)     // Catch: java.lang.Throwable -> L9f
            x00.a<java.lang.Long> r1 = r0.f94275a     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L9f
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L9f
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L9f
            java.util.List<vw.d$a> r3 = r0.f94276b     // Catch: java.lang.Throwable -> L9f
            vw.d$a r5 = new vw.d$a     // Catch: java.lang.Throwable -> L9f
            ix.n r7 = vw.g.b(r8, r7)     // Catch: java.lang.Throwable -> L9f
            r5.<init>(r7, r1)     // Catch: java.lang.Throwable -> L9f
            r3.add(r5)     // Catch: java.lang.Throwable -> L9f
            java.lang.Long r7 = r0.q(r8, r1)     // Catch: java.lang.Throwable -> L9f
            if (r7 == 0) goto La3
            long r7 = r7.longValue()     // Catch: java.lang.Throwable -> L9f
            long r1 = r0.oldestCookie     // Catch: java.lang.Throwable -> L9f
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto La1
            r0.oldestCookie = r7     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r7 = move-exception
            goto La9
        La1:
            yz.g2 r7 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L9f
        La3:
            r9.unlock(r4)
            yz.g2 r7 = yz.g2.f100423a
            return r7
        La9:
            r9.unlock(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.d.U2(ix.t2, ix.n, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x0055, B:13:0x0067, B:14:0x006d, B:15:0x007a, B:17:0x0080, B:20:0x0091, B:25:0x0095, B:26:0x00a4, B:28:0x00aa), top: B:10:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x0055, B:13:0x0067, B:14:0x006d, B:15:0x007a, B:17:0x0080, B:20:0x0091, B:25:0x0095, B:26:0x00a4, B:28:0x00aa), top: B:10:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: all -> 0x006b, LOOP:1: B:26:0x00a4->B:28:0x00aa, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x0055, B:13:0x0067, B:14:0x006d, B:15:0x007a, B:17:0x0080, B:20:0x0091, B:25:0x0095, B:26:0x00a4, B:28:0x00aa), top: B:10:0x0055 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // vw.f
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e7(@m80.k ix.t2 r8, @m80.k j00.c<? super java.util.List<ix.n>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof vw.d.c
            if (r0 == 0) goto L13
            r0 = r9
            vw.d$c r0 = (vw.d.c) r0
            int r1 = r0.f94292f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94292f = r1
            goto L18
        L13:
            vw.d$c r0 = new vw.d$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f94290d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f94292f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.f94289c
            n40.a r8 = (n40.a) r8
            java.lang.Object r1 = r0.f94288b
            ix.t2 r1 = (ix.t2) r1
            java.lang.Object r0 = r0.f94287a
            vw.d r0 = (vw.d) r0
            kotlin.e.n(r9)
            r9 = r8
            r8 = r1
            goto L55
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            kotlin.e.n(r9)
            n40.a r9 = r7.f94277c
            r0.f94287a = r7
            r0.f94288b = r8
            r0.f94289c = r9
            r0.f94292f = r3
            java.lang.Object r0 = r9.lock(r4, r0)
            if (r0 != r1) goto L54
            return r1
        L54:
            r0 = r7
        L55:
            x00.a<java.lang.Long> r1 = r0.f94275a     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.invoke()     // Catch: java.lang.Throwable -> L6b
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> L6b
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L6b
            long r5 = r0.oldestCookie     // Catch: java.lang.Throwable -> L6b
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L6d
            r0.j(r1)     // Catch: java.lang.Throwable -> L6b
            goto L6d
        L6b:
            r8 = move-exception
            goto Lbc
        L6d:
            java.util.List<vw.d$a> r0 = r0.f94276b     // Catch: java.lang.Throwable -> L6b
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch: java.lang.Throwable -> L6b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6b
            r1.<init>()     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L6b
        L7a:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r2 == 0) goto L95
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L6b
            r3 = r2
            vw.d$a r3 = (vw.d.a) r3     // Catch: java.lang.Throwable -> L6b
            ix.n r3 = r3.e()     // Catch: java.lang.Throwable -> L6b
            boolean r3 = vw.g.c(r3, r8)     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L7a
            r1.add(r2)     // Catch: java.lang.Throwable -> L6b
            goto L7a
        L95:
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6b
            r0 = 10
            int r0 = a00.i0.d0(r1, r0)     // Catch: java.lang.Throwable -> L6b
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r0 = r1.iterator()     // Catch: java.lang.Throwable -> L6b
        La4:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto Lb8
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L6b
            vw.d$a r1 = (vw.d.a) r1     // Catch: java.lang.Throwable -> L6b
            ix.n r1 = r1.e()     // Catch: java.lang.Throwable -> L6b
            r8.add(r1)     // Catch: java.lang.Throwable -> L6b
            goto La4
        Lb8:
            r9.unlock(r4)
            return r8
        Lbc:
            r9.unlock(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.d.e7(ix.t2, j00.c):java.lang.Object");
    }

    public final void j(final long j11) {
        m0.N0(this.f94276b, new x00.l() { // from class: vw.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean k11;
                k11 = d.k(d.this, j11, (d.a) obj);
                return Boolean.valueOf(k11);
            }
        });
        long j12 = Long.MAX_VALUE;
        for (a aVar : this.f94276b) {
            Long q11 = q(aVar.a(), aVar.b());
            if (q11 != null) {
                j12 = Math.min(j12, q11.longValue());
            }
        }
        this.oldestCookie = j12;
    }

    public final Long q(n nVar, long j11) {
        if (nVar.s() != null) {
            return Long.valueOf(j11 + (r0.intValue() * 1000));
        }
        bz.b p11 = nVar.p();
        if (p11 != null) {
            return Long.valueOf(p11.z());
        }
        return null;
    }

    public d(@k x00.a<Long> clock) {
        g0.p(clock, "clock");
        this.f94275a = clock;
        this.f94276b = new ArrayList();
        this.oldestCookie = 0L;
        this.f94277c = n40.g.b(false, 1, null);
    }

    public /* synthetic */ d(x00.a aVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? new x00.a() { // from class: vw.c
            @Override // x00.a
            public final Object invoke() {
                long f11;
                f11 = d.f();
                return Long.valueOf(f11);
            }
        } : aVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
