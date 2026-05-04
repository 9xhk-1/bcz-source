package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f62110a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.LookAheadSuspendSession", f = "LookAheadSession.kt", i = {0, 0}, l = {39}, m = "awaitAtLeast", n = {"this", "min"}, s = {"L$0", "I$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62111a;

        /* renamed from: b, reason: collision with root package name */
        public int f62112b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f62113c;

        /* renamed from: e, reason: collision with root package name */
        public int f62115e;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62113c = obj;
            this.f62115e |= Integer.MIN_VALUE;
            return g0.this.b(0, this);
        }
    }

    public g0(@m80.k g channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        this.f62110a = channel;
    }

    public static final ByteBuffer e(y40.c0 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return ByteBuffer.wrap(y40.g0.c(it));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r9, @m80.k j00.c<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.ktor.utils.io.g0.a
            if (r0 == 0) goto L13
            r0 = r10
            io.ktor.utils.io.g0$a r0 = (io.ktor.utils.io.g0.a) r0
            int r1 = r0.f62115e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62115e = r1
            goto L18
        L13:
            io.ktor.utils.io.g0$a r0 = new io.ktor.utils.io.g0$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f62113c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62115e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r9 = r0.f62112b
            java.lang.Object r0 = r0.f62111a
            io.ktor.utils.io.g0 r0 = (io.ktor.utils.io.g0) r0
            kotlin.e.n(r10)
            goto L5e
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            kotlin.e.n(r10)
            io.ktor.utils.io.g r10 = r8.f62110a
            y40.c0 r10 = r10.e()
            long r4 = jz.j.j(r10)
            long r6 = (long) r9
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto L4e
            java.lang.Boolean r9 = l00.a.a(r3)
            return r9
        L4e:
            io.ktor.utils.io.g r10 = r8.f62110a
            r0.f62111a = r8
            r0.f62112b = r9
            r0.f62115e = r3
            java.lang.Object r10 = r10.d(r9, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            r0 = r8
        L5e:
            io.ktor.utils.io.g r10 = r0.f62110a
            y40.c0 r10 = r10.e()
            long r0 = jz.j.j(r10)
            long r9 = (long) r9
            int r9 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r9 < 0) goto L6e
            goto L6f
        L6e:
            r3 = 0
        L6f:
            java.lang.Boolean r9 = l00.a.a(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.g0.b(int, j00.c):java.lang.Object");
    }

    public final void c(int i11) {
        jz.j.g(this.f62110a.e(), i11);
    }

    @m80.l
    public final ByteBuffer d(int i11, int i12) {
        if (jz.j.j(this.f62110a.e()) < i12 + i11) {
            return null;
        }
        ByteBuffer byteBuffer = (ByteBuffer) jz.j.m(this.f62110a.e(), new x00.l() { // from class: io.ktor.utils.io.f0
            @Override // x00.l
            public final Object invoke(Object obj) {
                ByteBuffer e11;
                e11 = g0.e((y40.c0) obj);
                return e11;
            }
        });
        if (i11 > 0) {
            byteBuffer.position(byteBuffer.position() + i11);
        }
        return byteBuffer;
    }
}
