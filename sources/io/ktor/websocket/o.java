package io.ktor.websocket;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.u0;
import xy.z0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSimpleFrameCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleFrameCollector.kt\nio/ktor/websocket/SimpleFrameCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public int f62548a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public ByteBuffer f62549b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f62550c = ByteBuffer.allocate(4);

    public final boolean a() {
        return this.f62548a > 0;
    }

    public final void b(@m80.k ByteBuffer bb2) {
        kotlin.jvm.internal.g0.p(bb2, "bb");
        int i11 = this.f62548a;
        ByteBuffer byteBuffer = this.f62549b;
        kotlin.jvm.internal.g0.m(byteBuffer);
        this.f62548a = i11 - z0.g(bb2, byteBuffer, this.f62548a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r0.capacity() < r2) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r2, @m80.k java.nio.ByteBuffer r3) {
        /*
            r1 = this;
            java.lang.String r0 = "bb"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r1.f62548a
            if (r0 != 0) goto L2a
            r1.f62548a = r2
            java.nio.ByteBuffer r0 = r1.f62549b
            if (r0 == 0) goto L18
            kotlin.jvm.internal.g0.m(r0)
            int r0 = r0.capacity()
            if (r0 >= r2) goto L1e
        L18:
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.f62549b = r2
        L1e:
            java.nio.ByteBuffer r2 = r1.f62549b
            kotlin.jvm.internal.g0.m(r2)
            r2.clear()
            r1.b(r3)
            return
        L2a:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "remaining should be 0"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.o.c(int, java.nio.ByteBuffer):void");
    }

    @m80.k
    public final ByteBuffer d(@m80.l Integer num) {
        ByteBuffer byteBuffer = this.f62549b;
        kotlin.jvm.internal.g0.m(byteBuffer);
        byteBuffer.flip();
        ByteBuffer slice = byteBuffer.slice();
        if (num != null) {
            this.f62550c.clear();
            this.f62550c.asIntBuffer().put(num.intValue());
            this.f62550c.clear();
            kotlin.jvm.internal.g0.m(slice);
            ByteBuffer maskBuffer = this.f62550c;
            kotlin.jvm.internal.g0.o(maskBuffer, "maskBuffer");
            p.d(slice, maskBuffer);
        }
        this.f62549b = null;
        ByteBuffer asReadOnlyBuffer = slice.asReadOnlyBuffer();
        kotlin.jvm.internal.g0.o(asReadOnlyBuffer, "run(...)");
        return asReadOnlyBuffer;
    }
}
