package hz;

import kotlin.jvm.internal.u0;
import yz.c2;
import yz.s1;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteOrder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteOrder.kt\nio/ktor/utils/io/bits/ByteOrderKt\n+ 2 ByteOrderJvm.kt\nio/ktor/utils/io/bits/ByteOrderJVMKt\n*L\n1#1,54:1\n9#2:55\n15#2:56\n21#2:57\n*S KotlinDebug\n*F\n+ 1 ByteOrder.kt\nio/ktor/utils/io/bits/ByteOrderKt\n*L\n31#1:55\n36#1:56\n41#1:57\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    public static final byte a(short s11) {
        return (byte) (s11 >>> 8);
    }

    public static final int b(long j11) {
        return (int) (j11 >>> 32);
    }

    public static final short c(int i11) {
        return (short) (i11 >>> 16);
    }

    public static final byte d(short s11) {
        return (byte) (s11 & 255);
    }

    public static final int e(long j11) {
        return (int) (j11 & 4294967295L);
    }

    public static final short f(int i11) {
        return (short) (i11 & 65535);
    }

    public static final long g(long j11) {
        return w1.i(Long.reverseBytes(j11));
    }

    public static final int h(int i11) {
        return s1.i(Integer.reverseBytes(i11));
    }

    public static final short i(short s11) {
        return c2.i(Short.reverseBytes(s11));
    }
}
