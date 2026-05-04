package io.ktor.utils.io;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x implements m {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final m f62304b;

    /* renamed from: c, reason: collision with root package name */
    public int f62305c;

    /* renamed from: d, reason: collision with root package name */
    public int f62306d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.CountedByteWriteChannel", f = "CountedByteWriteChannel.kt", i = {0}, l = {32}, m = "flush", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62307a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f62308b;

        /* renamed from: d, reason: collision with root package name */
        public int f62310d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62308b = obj;
            this.f62310d |= Integer.MIN_VALUE;
            return x.this.g(this);
        }
    }

    public x(@m80.k m delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f62304b = delegate;
        this.f62305c = jz.h.f(delegate.i());
    }

    @Override // io.ktor.utils.io.m
    public void a(@m80.l Throwable th2) {
        this.f62304b.a(th2);
    }

    @Override // io.ktor.utils.io.m
    @m80.l
    public Throwable b() {
        return this.f62304b.b();
    }

    public final long e() {
        return (this.f62306d + jz.h.f(i())) - this.f62305c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // io.ktor.utils.io.m
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@m80.k j00.c<? super yz.g2> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof io.ktor.utils.io.x.a
            if (r0 == 0) goto L13
            r0 = r5
            io.ktor.utils.io.x$a r0 = (io.ktor.utils.io.x.a) r0
            int r1 = r0.f62310d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62310d = r1
            goto L18
        L13:
            io.ktor.utils.io.x$a r0 = new io.ktor.utils.io.x$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f62308b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62310d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f62307a
            io.ktor.utils.io.x r0 = (io.ktor.utils.io.x) r0
            kotlin.e.n(r5)
            goto L53
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.e.n(r5)
            int r5 = r4.f62306d
            y40.x r2 = r4.i()
            int r2 = jz.h.f(r2)
            int r5 = r5 + r2
            r4.f62306d = r5
            io.ktor.utils.io.m r5 = r4.f62304b
            r0.f62307a = r4
            r0.f62310d = r3
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L52
            return r1
        L52:
            r0 = r4
        L53:
            y40.x r5 = r0.i()
            int r5 = jz.h.f(r5)
            r0.f62305c = r5
            yz.g2 r5 = yz.g2.f100423a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.x.g(j00.c):java.lang.Object");
    }

    @Override // io.ktor.utils.io.m
    public boolean h() {
        return this.f62304b.h();
    }

    @Override // io.ktor.utils.io.m
    @m80.k
    public y40.x i() {
        return this.f62304b.i();
    }

    @Override // io.ktor.utils.io.m
    @m80.l
    public Object j(@m80.k j00.c<? super g2> cVar) {
        Object j11 = this.f62304b.j(cVar);
        return j11 == kotlin.coroutines.intrinsics.b.l() ? j11 : g2.f100423a;
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    @b0
    public static /* synthetic */ void k() {
    }
}
