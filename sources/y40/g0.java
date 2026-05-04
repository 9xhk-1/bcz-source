package y40;

import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import kotlin.jvm.internal.u0;
import yz.c2;
import yz.o1;
import yz.s1;
import yz.w1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sources.kt\nkotlinx/io/SourcesKt\n+ 2 Buffer.kt\nkotlinx/io/BufferKt\n+ 3 -Util.kt\nkotlinx/io/_UtilKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,465:1\n659#2,25:466\n659#2,25:491\n52#3:516\n53#3:518\n38#3:520\n1#4:517\n1#4:519\n*S KotlinDebug\n*F\n+ 1 Sources.kt\nkotlinx/io/SourcesKt\n*L\n94#1:466,25\n156#1:491,25\n251#1:516\n251#1:518\n291#1:520\n251#1:517\n*E\n"})
/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f99298a = -922337203685477580L;

    /* renamed from: b, reason: collision with root package name */
    public static final long f99299b = -7;

    public static final long a(@m80.k c0 c0Var, byte b11, long j11, long j12) {
        String str;
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        if (0 <= j11 && j11 <= j12) {
            if (j11 == j12) {
                return -1L;
            }
            long j13 = j11;
            while (j13 < j12 && c0Var.request(1 + j13)) {
                byte b12 = b11;
                long a11 = e.a(c0Var.getBuffer(), b12, j13, Math.min(j12, c0Var.getBuffer().r()));
                if (a11 != -1) {
                    return a11;
                }
                j13 = c0Var.getBuffer().r();
                b11 = b12;
            }
            return -1L;
        }
        if (j12 < 0) {
            str = "startIndex (" + j11 + ") and endIndex (" + j12 + ") should be non negative";
        } else {
            str = "startIndex (" + j11 + ") is not within the range [0..endIndex(" + j12 + dp.a.f48058d;
        }
        throw new IllegalArgumentException(str.toString());
    }

    public static /* synthetic */ long b(c0 c0Var, byte b11, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return a(c0Var, b11, j13, j12);
    }

    @m80.k
    public static final byte[] c(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return e(c0Var, -1);
    }

    @m80.k
    public static final byte[] d(@m80.k c0 c0Var, int i11) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        long j11 = i11;
        if (j11 >= 0) {
            return e(c0Var, i11);
        }
        throw new IllegalArgumentException(("byteCount (" + j11 + ") < 0").toString());
    }

    public static final byte[] e(c0 c0Var, int i11) {
        if (i11 == -1) {
            for (long j11 = 2147483647L; c0Var.getBuffer().r() < SieveCacheKt.NodeLinkMask && c0Var.request(j11); j11 *= 2) {
            }
            if (c0Var.getBuffer().r() >= SieveCacheKt.NodeLinkMask) {
                throw new IllegalStateException(("Can't create an array of size " + c0Var.getBuffer().r()).toString());
            }
            i11 = (int) c0Var.getBuffer().r();
        } else {
            c0Var.F(i11);
        }
        byte[] bArr = new byte[i11];
        p(c0Var.getBuffer(), bArr, 0, 0, 6, null);
        return bArr;
    }

    public static final long f(@m80.k c0 c0Var) {
        long j11;
        long j12;
        boolean z11;
        boolean z12;
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        c0Var.F(1L);
        byte j13 = c0Var.getBuffer().j(0L);
        byte b11 = 58;
        byte b12 = 48;
        if (j13 == 45) {
            c0Var.F(2L);
            byte j14 = c0Var.getBuffer().j(1L);
            if (48 > j14 || j14 >= 58) {
                throw new NumberFormatException("Expected a digit but was 0x" + k0.q(c0Var.getBuffer().j(1L)));
            }
            j12 = -8;
            z11 = true;
            j11 = 0;
        } else {
            if (48 > j13 || j13 >= 58) {
                throw new NumberFormatException("Expected a digit or '-' but was 0x" + k0.q(j13));
            }
            j11 = 48 - j13;
            j12 = -7;
            z11 = false;
        }
        long j15 = 1;
        while (c0Var.request(j15 + 1)) {
            b buffer = c0Var.getBuffer();
            if (buffer.k() == null) {
                kotlin.jvm.internal.g0.m(null);
                throw null;
            }
            if (buffer.r() - j15 < j15) {
                t E = buffer.E();
                long r11 = buffer.r();
                while (E != null && r11 > j15) {
                    r11 -= E.d() - E.h();
                    if (r11 <= j15) {
                        break;
                    }
                    E = E.j();
                }
                kotlin.jvm.internal.g0.m(E);
                int i11 = (int) (j15 - r11);
                int n11 = E.n();
                while (i11 < n11) {
                    byte o11 = E.o(i11);
                    if (b12 <= o11 && o11 < b11) {
                        int i12 = 48 - o11;
                        if (j11 < -922337203685477580L || (j11 == -922337203685477580L && i12 < j12)) {
                            b bVar = new b();
                            b0.a(bVar, j11);
                            bVar.u(o11);
                            if (!z11) {
                                bVar.readByte();
                            }
                            throw new NumberFormatException("Number too large: " + i0.i(bVar));
                        }
                        j11 = (j11 * 10) + i12;
                        i11++;
                        j15++;
                        b12 = 48;
                    }
                    z12 = true;
                    break;
                }
                z12 = false;
            } else {
                t k11 = buffer.k();
                long j16 = 0;
                while (k11 != null) {
                    long d11 = (k11.d() - k11.h()) + j16;
                    if (d11 > j15) {
                        break;
                    }
                    k11 = k11.f();
                    j16 = d11;
                }
                kotlin.jvm.internal.g0.m(k11);
                int i13 = (int) (j15 - j16);
                int n12 = k11.n();
                while (i13 < n12) {
                    byte o12 = k11.o(i13);
                    if (48 <= o12 && o12 < b11) {
                        int i14 = 48 - o12;
                        if (j11 < -922337203685477580L || (j11 == -922337203685477580L && i14 < j12)) {
                            b bVar2 = new b();
                            b0.a(bVar2, j11);
                            bVar2.u(o12);
                            if (!z11) {
                                bVar2.readByte();
                            }
                            throw new NumberFormatException("Number too large: " + i0.i(bVar2));
                        }
                        j11 = (j11 * 10) + i14;
                        i13++;
                        j15++;
                        b11 = 58;
                    }
                    z12 = true;
                    break;
                }
                z12 = false;
            }
            if (z12) {
                break;
            }
            b11 = 58;
            b12 = 48;
        }
        c0Var.skip(j15);
        return z11 ? j11 : -j11;
    }

    public static final double g(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.w wVar = kotlin.jvm.internal.w.f67042a;
        return Double.longBitsToDouble(c0Var.readLong());
    }

    public static final double h(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.w wVar = kotlin.jvm.internal.w.f67042a;
        return Double.longBitsToDouble(m(c0Var));
    }

    public static final float i(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f67060a;
        return Float.intBitsToFloat(c0Var.readInt());
    }

    public static final float j(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f67060a;
        return Float.intBitsToFloat(l(c0Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0144 A[LOOP:4: B:61:0x0116->B:69:0x0144, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long k(@m80.k y40.c0 r28) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y40.g0.k(y40.c0):long");
    }

    public static final int l(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return l0.a(c0Var.readInt());
    }

    public static final long m(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return l0.b(c0Var.readLong());
    }

    public static final short n(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return l0.c(c0Var.readShort());
    }

    public static final void o(@m80.k c0 c0Var, @m80.k byte[] sink, int i11, int i12) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.g0.p(sink, "sink");
        k0.e(sink.length, i11, i12);
        int i13 = i11;
        while (i13 < i12) {
            int c72 = c0Var.c7(sink, i13, i12);
            if (c72 == -1) {
                throw new EOFException("Source exhausted before reading " + (i12 - i11) + " bytes. Only " + c72 + " bytes were read.");
            }
            i13 += c72;
        }
    }

    public static /* synthetic */ void p(c0 c0Var, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        o(c0Var, bArr, i11, i12);
    }

    public static final byte q(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return o1.i(c0Var.readByte());
    }

    public static final int r(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return s1.i(c0Var.readInt());
    }

    public static final int s(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return s1.i(l(c0Var));
    }

    public static final long t(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return w1.i(c0Var.readLong());
    }

    public static final long u(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return w1.i(m(c0Var));
    }

    public static final short v(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return c2.i(c0Var.readShort());
    }

    public static final short w(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return c2.i(n(c0Var));
    }

    public static final boolean x(@m80.k c0 c0Var, byte b11) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return c0Var.request(1L) && c0Var.getBuffer().j(0L) == b11;
    }
}
