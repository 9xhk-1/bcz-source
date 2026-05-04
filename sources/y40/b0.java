package y40;

import androidx.media3.common.C;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSinks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sinks.kt\nkotlinx/io/SinksKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,377:1\n374#1:378\n375#1,2:402\n374#1:408\n375#1,2:432\n262#2,23:379\n262#2,23:409\n179#3,4:404\n*S KotlinDebug\n*F\n+ 1 Sinks.kt\nkotlinx/io/SinksKt\n*L\n123#1:378\n123#1:402,2\n161#1:408\n161#1:432,2\n124#1:379,23\n162#1:409,23\n159#1:404,4\n*E\n"})
/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final byte[] f99292a;

    static {
        byte[] bArr = new byte[16];
        int i11 = 0;
        while (i11 < 16) {
            bArr[i11] = (byte) ((i11 < 10 ? 48 : 87) + i11);
            i11++;
        }
        f99292a = bArr;
    }

    public static final void a(@m80.k x xVar, long j11) {
        x xVar2;
        int i11;
        d50.c cVar;
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        if (j11 == 0) {
            xVar.u((byte) 48);
            return;
        }
        int i12 = 1;
        if (j11 < 0) {
            j11 = -j11;
            if (j11 < 0) {
                i0.r(xVar, "-9223372036854775808", 0, 0, 6, null);
                return;
            } else {
                xVar2 = xVar;
                i11 = 1;
            }
        } else {
            xVar2 = xVar;
            i11 = 0;
        }
        if (j11 >= vb.a.f93807j) {
            i12 = j11 < 1000000000000L ? j11 < z50.f.f100989w ? j11 < C.NANOS_PER_SECOND ? 9 : 10 : j11 < 100000000000L ? 11 : 12 : j11 < 1000000000000000L ? j11 < 10000000000000L ? 13 : j11 < 100000000000000L ? 14 : 15 : j11 < 100000000000000000L ? j11 < 10000000000000000L ? 16 : 17 : j11 < 1000000000000000000L ? 18 : 19;
        } else if (j11 >= 10000) {
            i12 = j11 < 1000000 ? j11 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US ? 5 : 6 : j11 < 10000000 ? 7 : 8;
        } else if (j11 >= 100) {
            i12 = j11 < 1000 ? 3 : 4;
        } else if (j11 >= 10) {
            i12 = 2;
        }
        if (i11 != 0) {
            i12++;
        }
        b buffer = xVar2.getBuffer();
        d50.d dVar = d50.d.f47268a;
        t d02 = buffer.d0(i12);
        cVar = d50.f.f47270b;
        int i13 = i12 - 1;
        if (i11 <= i13) {
            while (true) {
                cVar.c(d02, i13, f99292a[(byte) (j11 % r8)]);
                j11 /= 10;
                if (i13 == i11) {
                    break;
                } else {
                    i13--;
                }
            }
        }
        if (i11 != 0) {
            cVar.c(d02, 0, kx.a0.f68904b);
        }
        d02.x(d02.d() + i12);
        buffer.Z(buffer.w() + i12);
        xVar2.U0();
    }

    public static final void b(@m80.k x xVar, double d11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        xVar.writeLong(Double.doubleToLongBits(d11));
    }

    public static final void c(@m80.k x xVar, double d11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        h(xVar, Double.doubleToLongBits(d11));
    }

    public static final void d(@m80.k x xVar, float f11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        xVar.writeInt(Float.floatToIntBits(f11));
    }

    public static final void e(@m80.k x xVar, float f11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        g(xVar, Float.floatToIntBits(f11));
    }

    public static final void f(@m80.k x xVar, long j11) {
        d50.c cVar;
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        if (j11 == 0) {
            xVar.u((byte) 48);
            return;
        }
        int numberOfLeadingZeros = j11 == 0 ? 1 : (67 - Long.numberOfLeadingZeros(j11)) / 4;
        b buffer = xVar.getBuffer();
        d50.d dVar = d50.d.f47268a;
        t d02 = buffer.d0(numberOfLeadingZeros);
        cVar = d50.f.f47270b;
        for (int i11 = numberOfLeadingZeros - 1; -1 < i11; i11--) {
            cVar.c(d02, i11, f99292a[((int) j11) & 15]);
            j11 >>>= 4;
        }
        d02.x(d02.d() + numberOfLeadingZeros);
        buffer.Z(buffer.w() + numberOfLeadingZeros);
        xVar.U0();
    }

    public static final void g(@m80.k x xVar, int i11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        xVar.writeInt(l0.a(i11));
    }

    public static final void h(@m80.k x xVar, long j11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        xVar.writeLong(l0.b(j11));
    }

    public static final void i(@m80.k x xVar, short s11) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        xVar.writeShort(l0.c(s11));
    }

    @h
    public static final void j(@m80.k x xVar, @m80.k x00.l<? super b, g2> lambda) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(lambda, "lambda");
        lambda.invoke(xVar.getBuffer());
        xVar.U0();
    }

    public static final void k(@m80.k x writeUByte, byte b11) {
        kotlin.jvm.internal.g0.p(writeUByte, "$this$writeUByte");
        writeUByte.u(b11);
    }

    public static final void l(@m80.k x writeUInt, int i11) {
        kotlin.jvm.internal.g0.p(writeUInt, "$this$writeUInt");
        writeUInt.writeInt(i11);
    }

    public static final void m(@m80.k x writeUIntLe, int i11) {
        kotlin.jvm.internal.g0.p(writeUIntLe, "$this$writeUIntLe");
        g(writeUIntLe, i11);
    }

    public static final void n(@m80.k x writeULong, long j11) {
        kotlin.jvm.internal.g0.p(writeULong, "$this$writeULong");
        writeULong.writeLong(j11);
    }

    public static final void o(@m80.k x writeULongLe, long j11) {
        kotlin.jvm.internal.g0.p(writeULongLe, "$this$writeULongLe");
        h(writeULongLe, j11);
    }

    public static final void p(@m80.k x writeUShort, short s11) {
        kotlin.jvm.internal.g0.p(writeUShort, "$this$writeUShort");
        writeUShort.writeShort(s11);
    }

    public static final void q(@m80.k x writeUShortLe, short s11) {
        kotlin.jvm.internal.g0.p(writeUShortLe, "$this$writeUShortLe");
        i(writeUShortLe, s11);
    }
}
