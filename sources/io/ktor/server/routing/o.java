package io.ktor.server.routing;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h0 f61677a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h0 f61678b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.routing.OrRouteSelector", f = "RouteSelector.kt", i = {0, 0, 0}, l = {com.alipay.sdk.m.u.n.f11119i, 464}, m = "evaluate", n = {"this", c90.k.f8409a, "segmentIndex"}, s = {"L$0", "L$1", "I$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61679a;

        /* renamed from: b, reason: collision with root package name */
        public Object f61680b;

        /* renamed from: c, reason: collision with root package name */
        public int f61681c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f61682d;

        /* renamed from: f, reason: collision with root package name */
        public int f61684f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61682d = obj;
            this.f61684f |= Integer.MIN_VALUE;
            return o.this.a(null, 0, this);
        }
    }

    public o(@m80.k h0 first, @m80.k h0 second) {
        kotlin.jvm.internal.g0.p(first, "first");
        kotlin.jvm.internal.g0.p(second, "second");
        this.f61677a = first;
        this.f61678b = second;
    }

    public static /* synthetic */ o e(o oVar, h0 h0Var, h0 h0Var2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            h0Var = oVar.f61677a;
        }
        if ((i11 & 2) != 0) {
            h0Var2 = oVar.f61678b;
        }
        return oVar.d(h0Var, h0Var2);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.ktor.server.routing.h0
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(@m80.k io.ktor.server.routing.p1 r6, int r7, @m80.k j00.c<? super io.ktor.server.routing.i0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof io.ktor.server.routing.o.a
            if (r0 == 0) goto L13
            r0 = r8
            io.ktor.server.routing.o$a r0 = (io.ktor.server.routing.o.a) r0
            int r1 = r0.f61684f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f61684f = r1
            goto L18
        L13:
            io.ktor.server.routing.o$a r0 = new io.ktor.server.routing.o$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f61682d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f61684f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r8)
            return r8
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            int r7 = r0.f61681c
            java.lang.Object r6 = r0.f61680b
            io.ktor.server.routing.p1 r6 = (io.ktor.server.routing.p1) r6
            java.lang.Object r2 = r0.f61679a
            io.ktor.server.routing.o r2 = (io.ktor.server.routing.o) r2
            kotlin.e.n(r8)
            goto L57
        L42:
            kotlin.e.n(r8)
            io.ktor.server.routing.h0 r8 = r5.f61677a
            r0.f61679a = r5
            r0.f61680b = r6
            r0.f61681c = r7
            r0.f61684f = r4
            java.lang.Object r8 = r8.a(r6, r7, r0)
            if (r8 != r1) goto L56
            goto L6f
        L56:
            r2 = r5
        L57:
            io.ktor.server.routing.i0 r8 = (io.ktor.server.routing.i0) r8
            boolean r4 = r8.j()
            if (r4 == 0) goto L60
            return r8
        L60:
            io.ktor.server.routing.h0 r8 = r2.f61678b
            r2 = 0
            r0.f61679a = r2
            r0.f61680b = r2
            r0.f61684f = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L70
        L6f:
            return r1
        L70:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.routing.o.a(io.ktor.server.routing.p1, int, j00.c):java.lang.Object");
    }

    @m80.k
    public final h0 b() {
        return this.f61677a;
    }

    @m80.k
    public final h0 c() {
        return this.f61678b;
    }

    @m80.k
    public final o d(@m80.k h0 first, @m80.k h0 second) {
        kotlin.jvm.internal.g0.p(first, "first");
        kotlin.jvm.internal.g0.p(second, "second");
        return new o(first, second);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.g0.g(this.f61677a, oVar.f61677a) && kotlin.jvm.internal.g0.g(this.f61678b, oVar.f61678b);
    }

    @m80.k
    public final h0 f() {
        return this.f61677a;
    }

    @m80.k
    public final h0 g() {
        return this.f61678b;
    }

    public int hashCode() {
        return (this.f61677a.hashCode() * 31) + this.f61678b.hashCode();
    }

    @m80.k
    public String toString() {
        return l50.b.f69927i + this.f61677a + " | " + this.f61678b + l50.b.f69928j;
    }
}
