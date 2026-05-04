package d50;

import java.nio.ByteBuffer;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import y40.h0;
import y40.t;
import y40.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUnsafeBufferOperationsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsafeBufferOperationsJvm.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsJvmKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n99#2:187\n100#2,8:189\n195#2,28:197\n1#3:188\n*S KotlinDebug\n*F\n+ 1 UnsafeBufferOperationsJvm.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsJvmKt\n*L\n50#1:187\n50#1:189,8\n100#1:197,28\n50#1:188\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    @h0
    public static final long a(@k d dVar, @k y40.b buffer, @k ByteBuffer[] iovec, @k p<? super ByteBuffer[], ? super Integer, Long> readAction) {
        int i11;
        int i12;
        g0.p(dVar, "<this>");
        g0.p(buffer, "buffer");
        g0.p(iovec, "iovec");
        g0.p(readAction, "readAction");
        t k11 = buffer.k();
        if (k11 == null) {
            throw new IllegalArgumentException("buffer is empty.");
        }
        if (iovec.length == 0) {
            throw new IllegalArgumentException("iovec is empty.");
        }
        long j11 = 0;
        while (true) {
            int h11 = k11.h();
            int d11 = k11.d() - h11;
            i12 = i11 + 1;
            iovec[i11] = ByteBuffer.wrap(k11.b(true), h11, d11).slice().asReadOnlyBuffer();
            j11 += d11;
            k11 = k11.f();
            i11 = (k11 != null && i12 < iovec.length) ? i12 : 0;
        }
        long longValue = readAction.invoke(iovec, Integer.valueOf(i12)).longValue();
        if (longValue == 0) {
            return longValue;
        }
        if (longValue >= 0 && longValue <= j11) {
            buffer.skip(longValue);
            return longValue;
        }
        throw new IllegalStateException("readAction should return a value in range [0, " + j11 + "], but returned: " + longValue);
    }

    @h0
    public static final int b(@k d dVar, @k y40.b buffer, @k l<? super ByteBuffer, g2> readAction) {
        g0.p(dVar, "<this>");
        g0.p(buffer, "buffer");
        g0.p(readAction, "readAction");
        if (buffer.J()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t k11 = buffer.k();
        g0.m(k11);
        byte[] b11 = k11.b(true);
        int h11 = k11.h();
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(b11, h11, k11.d() - h11).slice().asReadOnlyBuffer();
        g0.m(asReadOnlyBuffer);
        readAction.invoke(asReadOnlyBuffer);
        int position = asReadOnlyBuffer.position();
        if (position == 0) {
            return position;
        }
        if (position < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (position > k11.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        buffer.skip(position);
        return position;
    }

    @h0
    public static final int c(@k d dVar, @k y40.b buffer, int i11, @k l<? super ByteBuffer, g2> writeAction) {
        g0.p(dVar, "<this>");
        g0.p(buffer, "buffer");
        g0.p(writeAction, "writeAction");
        t d02 = buffer.d0(i11);
        byte[] b11 = d02.b(false);
        int d11 = d02.d();
        ByteBuffer slice = ByteBuffer.wrap(b11, d11, b11.length - d11).slice();
        g0.m(slice);
        writeAction.invoke(slice);
        int position = slice.position();
        if (position == i11) {
            d02.I(b11, position);
            d02.x(d02.d() + position);
            buffer.Z(buffer.w() + position);
            return position;
        }
        if (position < 0 || position > d02.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + position + ". Should be in 0.." + d02.l()).toString());
        }
        if (position == 0) {
            if (v.d(d02)) {
                buffer.U();
            }
            return position;
        }
        d02.I(b11, position);
        d02.x(d02.d() + position);
        buffer.Z(buffer.w() + position);
        return position;
    }
}
