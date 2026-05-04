package jz;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import y40.a0;
import y40.c0;
import y40.f0;
import y40.t;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteReadPacketExtensions.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteReadPacketExtensions.jvm.kt\nio/ktor/utils/io/core/ByteReadPacketExtensions_jvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n99#2:37\n100#2,8:39\n1#3:38\n*S KotlinDebug\n*F\n+ 1 ByteReadPacketExtensions.jvm.kt\nio/ktor/utils/io/core/ByteReadPacketExtensions_jvmKt\n*L\n28#1:37\n28#1:39,8\n28#1:38\n*E\n"})
/* loaded from: classes8.dex */
public final class i {
    @m80.k
    public static final c0 a(@m80.k ByteBuffer byteBuffer) {
        g0.p(byteBuffer, "byteBuffer");
        y40.b bVar = new y40.b();
        a0.g(bVar, byteBuffer);
        return bVar;
    }

    public static final void b(@m80.k c0 c0Var, @m80.k x00.l<? super ByteBuffer, g2> block) {
        g0.p(c0Var, "<this>");
        g0.p(block, "block");
        d50.d dVar = d50.d.f47268a;
        y40.b buffer = c0Var.getBuffer();
        if (buffer.J()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t k11 = buffer.k();
        g0.m(k11);
        byte[] b11 = k11.b(true);
        int h11 = k11.h();
        ByteBuffer wrap = ByteBuffer.wrap(b11, h11, k11.d() - h11);
        g0.m(wrap);
        block.invoke(wrap);
        int position = wrap.position() - h11;
        if (position != 0) {
            if (position < 0) {
                throw new IllegalStateException("Returned negative read bytes count");
            }
            if (position > k11.n()) {
                throw new IllegalStateException("Returned too many bytes");
            }
            buffer.skip(position);
        }
    }

    public static final int c(@m80.k c0 c0Var, @m80.k ByteBuffer buffer) {
        g0.p(c0Var, "<this>");
        g0.p(buffer, "buffer");
        int remaining = buffer.remaining();
        f0.g(c0Var, buffer);
        return remaining - buffer.remaining();
    }

    public static final void d(@m80.k c0 c0Var, @m80.k ByteBuffer buffer) {
        g0.p(c0Var, "<this>");
        g0.p(buffer, "buffer");
        while (!c0Var.J() && buffer.hasRemaining()) {
            f0.g(c0Var, buffer);
        }
    }
}
