package kotlin.uuid;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUuidJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n1#1,277:1\n277#1:278\n277#1:279\n277#1:280\n277#1:281\n277#1:282\n277#1:283\n277#1:284\n277#1:285\n*S KotlinDebug\n*F\n+ 1 UuidJVM.kt\nkotlin/uuid/UuidKt__UuidJVMKt\n*L\n139#1:278\n140#1:279\n184#1:280\n185#1:281\n224#1:282\n225#1:283\n271#1:284\n272#1:285\n*E\n"})
/* loaded from: classes8.dex */
public class a {
    @y30.a
    public static final void a(long j11, @k byte[] dst, int i11, int i12, int i13) {
        g0.p(dst, "dst");
        b.r(j11, dst, i11, i12, i13);
    }

    @y30.a
    public static final long b(@k byte[] bArr, int i11) {
        g0.p(bArr, "<this>");
        return b.s(bArr, i11);
    }

    @y0(version = "2.0")
    @y30.a
    @k
    public static final Uuid c(@k ByteBuffer byteBuffer) {
        g0.p(byteBuffer, "<this>");
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferUnderflowException();
        }
        long j11 = byteBuffer.getLong();
        long j12 = byteBuffer.getLong();
        if (g0.g(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
            j11 = Long.reverseBytes(j11);
            j12 = Long.reverseBytes(j12);
        }
        return Uuid.Companion.b(j11, j12);
    }

    @y0(version = "2.0")
    @y30.a
    @k
    public static final Uuid d(@k ByteBuffer byteBuffer, int i11) {
        g0.p(byteBuffer, "<this>");
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Negative index: " + i11);
        }
        if (i11 + 15 < byteBuffer.limit()) {
            long j11 = byteBuffer.getLong(i11);
            long j12 = byteBuffer.getLong(i11 + 8);
            if (g0.g(byteBuffer.order(), ByteOrder.LITTLE_ENDIAN)) {
                j11 = Long.reverseBytes(j11);
                j12 = Long.reverseBytes(j12);
            }
            return Uuid.Companion.b(j11, j12);
        }
        throw new IndexOutOfBoundsException("Not enough bytes to read a uuid at index: " + i11 + ", with limit: " + byteBuffer.limit() + ' ');
    }

    @y0(version = "2.0")
    @y30.a
    @k
    public static final ByteBuffer e(@k ByteBuffer byteBuffer, int i11, @k Uuid uuid) {
        ByteBuffer putLong;
        g0.p(byteBuffer, "<this>");
        g0.p(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("Negative index: " + i11);
        }
        if (i11 + 15 < byteBuffer.limit()) {
            if (g0.g(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
                byteBuffer.putLong(i11, mostSignificantBits);
                putLong = byteBuffer.putLong(i11 + 8, leastSignificantBits);
            } else {
                byteBuffer.putLong(i11, Long.reverseBytes(mostSignificantBits));
                putLong = byteBuffer.putLong(i11 + 8, Long.reverseBytes(leastSignificantBits));
            }
            g0.o(putLong, "toLongs(...)");
            return putLong;
        }
        throw new IndexOutOfBoundsException("Not enough capacity to write a uuid at index: " + i11 + ", with limit: " + byteBuffer.limit() + ' ');
    }

    @y0(version = "2.0")
    @y30.a
    @k
    public static final ByteBuffer f(@k ByteBuffer byteBuffer, @k Uuid uuid) {
        ByteBuffer putLong;
        g0.p(byteBuffer, "<this>");
        g0.p(uuid, "uuid");
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        if (byteBuffer.position() + 15 >= byteBuffer.limit()) {
            throw new BufferOverflowException();
        }
        if (g0.g(byteBuffer.order(), ByteOrder.BIG_ENDIAN)) {
            byteBuffer.putLong(mostSignificantBits);
            putLong = byteBuffer.putLong(leastSignificantBits);
        } else {
            byteBuffer.putLong(Long.reverseBytes(mostSignificantBits));
            putLong = byteBuffer.putLong(Long.reverseBytes(leastSignificantBits));
        }
        g0.o(putLong, "toLongs(...)");
        return putLong;
    }

    public static final long g(long j11) {
        return Long.reverseBytes(j11);
    }

    @y30.a
    @k
    public static final Uuid h() {
        byte[] bArr = new byte[16];
        y30.b.f99229a.a().nextBytes(bArr);
        return b.w(bArr);
    }

    @y30.a
    @k
    public static final Object i(@k Uuid uuid) {
        g0.p(uuid, "uuid");
        return new c(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @y30.a
    public static final void j(@k byte[] bArr, int i11, long j11) {
        g0.p(bArr, "<this>");
        b.t(bArr, i11, j11);
    }

    @y0(version = "2.0")
    @y30.a
    @k
    public static final UUID k(@k Uuid uuid) {
        g0.p(uuid, "<this>");
        return new UUID(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @y0(version = "2.0")
    @y30.a
    @k
    public static final Uuid l(@k UUID uuid) {
        g0.p(uuid, "<this>");
        return Uuid.Companion.b(uuid.getMostSignificantBits(), uuid.getLeastSignificantBits());
    }

    @y30.a
    @k
    public static final Uuid m(@k String hexString) {
        g0.p(hexString, "hexString");
        return b.x(hexString);
    }

    @y30.a
    @k
    public static final Uuid n(@k String hexDashString) {
        g0.p(hexDashString, "hexDashString");
        return b.y(hexDashString);
    }
}
