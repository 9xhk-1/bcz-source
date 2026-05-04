package io.ktor.utils.io;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteWriteChannelOperations.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteWriteChannelOperations.jvm.kt\nio/ktor/utils/io/ByteWriteChannelOperations_jvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n195#2,28:71\n195#2,28:100\n1#3:99\n*S KotlinDebug\n*F\n+ 1 ByteWriteChannelOperations.jvm.kt\nio/ktor/utils/io/ByteWriteChannelOperations_jvmKt\n*L\n26#1:71,28\n56#1:100,28\n*E\n"})
/* loaded from: classes8.dex */
public final class r {
    @m80.l
    public static final Object a(@m80.k m mVar, int i11, @m80.k x00.l<? super ByteBuffer, g2> lVar, @m80.k j00.c<? super g2> cVar) {
        d50.d dVar = d50.d.f47268a;
        y40.b buffer = mVar.i().getBuffer();
        y40.t d02 = buffer.d0(i11);
        byte[] b11 = d02.b(false);
        int d11 = d02.d();
        ByteBuffer wrap = ByteBuffer.wrap(b11, d11, b11.length - d11);
        kotlin.jvm.internal.g0.m(wrap);
        lVar.invoke(wrap);
        int position = wrap.position() - d11;
        if (position == i11) {
            d02.I(b11, position);
            d02.x(d02.d() + position);
            buffer.Z(buffer.w() + position);
        } else {
            if (position < 0 || position > d02.l()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + position + ". Should be in 0.." + d02.l()).toString());
            }
            if (position != 0) {
                d02.I(b11, position);
                d02.x(d02.d() + position);
                buffer.Z(buffer.w() + position);
            } else if (y40.v.d(d02)) {
                buffer.U();
            }
        }
        Object g11 = mVar.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    public static /* synthetic */ Object b(m mVar, int i11, x00.l lVar, j00.c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return a(mVar, i11, lVar, cVar);
    }

    public static final int c(@m80.k m mVar, int i11, @m80.k x00.l<? super ByteBuffer, g2> block) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(block, "block");
        if (i11 <= 0) {
            throw new IllegalArgumentException("min should be positive");
        }
        if (i11 > 1048576) {
            throw new IllegalArgumentException(("Min(" + i11 + ") shouldn't be greater than 1048576").toString());
        }
        if (mVar.h()) {
            return -1;
        }
        d50.d dVar = d50.d.f47268a;
        y40.b buffer = mVar.i().getBuffer();
        y40.t d02 = buffer.d0(i11);
        byte[] b11 = d02.b(false);
        int d11 = d02.d();
        ByteBuffer wrap = ByteBuffer.wrap(b11, d11, b11.length - d11);
        kotlin.jvm.internal.g0.m(wrap);
        block.invoke(wrap);
        int position = wrap.position() - d11;
        int position2 = wrap.position() - d11;
        if (position2 == i11) {
            d02.I(b11, position2);
            d02.x(d02.d() + position2);
            buffer.Z(buffer.w() + position2);
            return position;
        }
        if (position2 < 0 || position2 > d02.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + position2 + ". Should be in 0.." + d02.l()).toString());
        }
        if (position2 == 0) {
            if (y40.v.d(d02)) {
                buffer.U();
            }
            return position;
        }
        d02.I(b11, position2);
        d02.x(d02.d() + position2);
        buffer.Z(buffer.w() + position2);
        return position;
    }

    public static final void d(@m80.k m mVar, @m80.k ByteBuffer buffer) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        y40.a0.g(mVar.i(), buffer);
    }

    public static /* synthetic */ int e(m mVar, int i11, x00.l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return c(mVar, i11, lVar);
    }

    @m80.l
    public static final Object f(@m80.k m mVar, @m80.k ByteBuffer byteBuffer, @m80.k j00.c<? super g2> cVar) {
        jz.p.a(mVar.i(), byteBuffer);
        Object g11 = mVar.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    @m80.l
    public static final Object g(@m80.k m mVar, @m80.k ByteBuffer byteBuffer, @m80.k j00.c<? super g2> cVar) {
        jz.p.a(mVar.i(), byteBuffer);
        Object g11 = mVar.g(cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }
}
