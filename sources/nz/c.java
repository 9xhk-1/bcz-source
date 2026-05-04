package nz;

import io.ktor.utils.io.m;
import java.nio.ByteBuffer;
import jz.p;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import y40.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final m f75402a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f75403b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.utils.io.jvm.nio.WriteSuspendSession", f = "WriteSuspendSession.kt", i = {0}, l = {30, 32}, m = "written", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f75404a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f75405b;

        /* renamed from: d, reason: collision with root package name */
        public int f75407d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f75405b = obj;
            this.f75407d |= Integer.MIN_VALUE;
            return c.this.d(0, this);
        }
    }

    public c(@k m channel) {
        g0.p(channel, "channel");
        this.f75402a = channel;
        this.f75403b = ByteBuffer.allocate(8192);
    }

    @k
    public final m a() {
        return this.f75402a;
    }

    @l
    public final ByteBuffer b(int i11) {
        return this.f75403b;
    }

    public final void c(int i11) {
        x i12 = this.f75402a.i();
        ByteBuffer byteBuffer = this.f75403b;
        g0.o(byteBuffer, "byteBuffer");
        p.a(i12, byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r7.g(r6) != r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r6, @m80.k j00.c<? super yz.g2> r7) {
        /*
            r5 = this;
            boolean r6 = r7 instanceof nz.c.a
            if (r6 == 0) goto L13
            r6 = r7
            nz.c$a r6 = (nz.c.a) r6
            int r0 = r6.f75407d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f75407d = r0
            goto L18
        L13:
            nz.c$a r6 = new nz.c$a
            r6.<init>(r7)
        L18:
            java.lang.Object r7 = r6.f75405b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f75407d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kotlin.e.n(r7)
            goto L6c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r1 = r6.f75404a
            nz.c r1 = (nz.c) r1
            kotlin.e.n(r7)
            goto L59
        L3c:
            kotlin.e.n(r7)
            java.nio.ByteBuffer r7 = r5.f75403b
            r7.flip()
            io.ktor.utils.io.m r7 = r5.f75402a
            java.nio.ByteBuffer r1 = r5.f75403b
            java.lang.String r4 = "byteBuffer"
            kotlin.jvm.internal.g0.o(r1, r4)
            r6.f75404a = r5
            r6.f75407d = r3
            java.lang.Object r7 = io.ktor.utils.io.r.g(r7, r1, r6)
            if (r7 != r0) goto L58
            goto L6b
        L58:
            r1 = r5
        L59:
            java.nio.ByteBuffer r7 = r1.f75403b
            r7.clear()
            io.ktor.utils.io.m r7 = r1.f75402a
            r1 = 0
            r6.f75404a = r1
            r6.f75407d = r2
            java.lang.Object r6 = r7.g(r6)
            if (r6 != r0) goto L6c
        L6b:
            return r0
        L6c:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nz.c.d(int, j00.c):java.lang.Object");
    }
}
