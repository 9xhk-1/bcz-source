package kz;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import y40.t;
import y40.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nChunkBufferJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChunkBufferJvm.kt\nio/ktor/utils/io/core/internal/ChunkBufferJvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n195#2,28:32\n99#2:60\n100#2,8:62\n1#3:61\n*S KotlinDebug\n*F\n+ 1 ChunkBufferJvm.kt\nio/ktor/utils/io/core/internal/ChunkBufferJvmKt\n*L\n14#1:32,28\n23#1:60\n23#1:62,8\n23#1:61\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    public static final void a(@k y40.b bVar, @k l<? super ByteBuffer, g2> block) {
        g0.p(bVar, "<this>");
        g0.p(block, "block");
        d50.d dVar = d50.d.f47268a;
        y40.b buffer = bVar.getBuffer();
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

    public static final void b(@k y40.b bVar, int i11, @k l<? super ByteBuffer, g2> block) {
        g0.p(bVar, "<this>");
        g0.p(block, "block");
        d50.d dVar = d50.d.f47268a;
        y40.b buffer = bVar.getBuffer();
        t d02 = buffer.d0(i11);
        byte[] b11 = d02.b(false);
        int d11 = d02.d();
        ByteBuffer wrap = ByteBuffer.wrap(b11, d11, b11.length - d11);
        g0.m(wrap);
        block.invoke(wrap);
        int position = wrap.position() - d11;
        if (position == i11) {
            d02.I(b11, position);
            d02.x(d02.d() + position);
            buffer.Z(buffer.w() + position);
            return;
        }
        if (position < 0 || position > d02.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + position + ". Should be in 0.." + d02.l()).toString());
        }
        if (position != 0) {
            d02.I(b11, position);
            d02.x(d02.d() + position);
            buffer.Z(buffer.w() + position);
        } else if (v.d(d02)) {
            buffer.U();
        }
    }
}
