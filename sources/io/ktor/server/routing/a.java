package io.ktor.server.routing;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h0 f61568a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h0 f61569b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.routing.AndRouteSelector", f = "RouteSelector.kt", i = {0, 0, 0, 1}, l = {483, 487}, m = "evaluate", n = {"this", c90.k.f8409a, "segmentIndex", "result1"}, s = {"L$0", "L$1", "I$0", "L$0"})
    /* renamed from: io.ktor.server.routing.a$a, reason: collision with other inner class name */
    public static final class C0715a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61570a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61571b;

        /* renamed from: c, reason: collision with root package name */
        public int f61572c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f61573d;

        /* renamed from: f, reason: collision with root package name */
        public int f61575f;

        public C0715a(j00.c<? super C0715a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61573d = obj;
            this.f61575f |= Integer.MIN_VALUE;
            return a.this.a(null, 0, this);
        }
    }

    public a(@m80.k h0 first, @m80.k h0 second) {
        kotlin.jvm.internal.g0.p(first, "first");
        kotlin.jvm.internal.g0.p(second, "second");
        this.f61568a = first;
        this.f61569b = second;
    }

    public static /* synthetic */ a e(a aVar, h0 h0Var, h0 h0Var2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            h0Var = aVar.f61568a;
        }
        if ((i11 & 2) != 0) {
            h0Var2 = aVar.f61569b;
        }
        return aVar.d(h0Var, h0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.server.routing.h0
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k io.ktor.server.routing.p1 r7, int r8, @m80.k j00.c<? super io.ktor.server.routing.i0> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof io.ktor.server.routing.a.C0715a
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.server.routing.a$a r0 = (io.ktor.server.routing.a.C0715a) r0
            int r1 = r0.f61575f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61575f = r1
            goto L18
        L13:
            io.ktor.server.routing.a$a r0 = new io.ktor.server.routing.a$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f61573d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61575f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f61570a
            io.ktor.server.routing.i0 r7 = (io.ktor.server.routing.i0) r7
            kotlin.e.n(r9)
            goto L7d
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            int r8 = r0.f61572c
            java.lang.Object r7 = r0.f61571b
            io.ktor.server.routing.p1 r7 = (io.ktor.server.routing.p1) r7
            java.lang.Object r2 = r0.f61570a
            io.ktor.server.routing.a r2 = (io.ktor.server.routing.a) r2
            kotlin.e.n(r9)
            goto L5b
        L46:
            kotlin.e.n(r9)
            io.ktor.server.routing.h0 r9 = r6.f61568a
            r0.f61570a = r6
            r0.f61571b = r7
            r0.f61572c = r8
            r0.f61575f = r4
            java.lang.Object r9 = r9.a(r7, r8, r0)
            if (r9 != r1) goto L5a
            goto L79
        L5a:
            r2 = r6
        L5b:
            io.ktor.server.routing.i0 r9 = (io.ktor.server.routing.i0) r9
            boolean r4 = r9 instanceof io.ktor.server.routing.i0.c
            if (r4 != 0) goto L62
            return r9
        L62:
            io.ktor.server.routing.h0 r2 = r2.f61569b
            r4 = r9
            io.ktor.server.routing.i0$c r4 = (io.ktor.server.routing.i0.c) r4
            int r4 = r4.r()
            int r8 = r8 + r4
            r0.f61570a = r9
            r4 = 0
            r0.f61571b = r4
            r0.f61575f = r3
            java.lang.Object r7 = r2.a(r7, r8, r0)
            if (r7 != r1) goto L7a
        L79:
            return r1
        L7a:
            r5 = r9
            r9 = r7
            r7 = r5
        L7d:
            io.ktor.server.routing.i0 r9 = (io.ktor.server.routing.i0) r9
            boolean r8 = r9 instanceof io.ktor.server.routing.i0.c
            if (r8 != 0) goto L84
            return r9
        L84:
            io.ktor.server.routing.i0$c r7 = (io.ktor.server.routing.i0.c) r7
            ix.p1 r8 = r7.p()
            io.ktor.server.routing.i0$c r9 = (io.ktor.server.routing.i0.c) r9
            ix.p1 r0 = r9.p()
            ix.p1 r8 = ix.t1.i(r8, r0)
            io.ktor.server.routing.i0$c r0 = new io.ktor.server.routing.i0$c
            double r1 = r7.q()
            double r3 = r9.q()
            double r1 = r1 * r3
            int r7 = r7.r()
            int r9 = r9.r()
            int r7 = r7 + r9
            r0.<init>(r1, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.a.a(io.ktor.server.routing.p1, int, j00.c):java.lang.Object");
    }

    @m80.k
    public final h0 b() {
        return this.f61568a;
    }

    @m80.k
    public final h0 c() {
        return this.f61569b;
    }

    @m80.k
    public final a d(@m80.k h0 first, @m80.k h0 second) {
        kotlin.jvm.internal.g0.p(first, "first");
        kotlin.jvm.internal.g0.p(second, "second");
        return new a(first, second);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.g0.g(this.f61568a, aVar.f61568a) && kotlin.jvm.internal.g0.g(this.f61569b, aVar.f61569b);
    }

    @m80.k
    public final h0 f() {
        return this.f61568a;
    }

    @m80.k
    public final h0 g() {
        return this.f61569b;
    }

    public int hashCode() {
        return (this.f61568a.hashCode() * 31) + this.f61569b.hashCode();
    }

    @m80.k
    public String toString() {
        return l50.b.f69927i + this.f61568a + " & " + this.f61569b + l50.b.f69928j;
    }
}
