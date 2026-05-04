package y40;

import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteStrings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteStrings.kt\nkotlinx/io/ByteStringsKt\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 Sinks.kt\nkotlinx/io/SinksKt\n+ 4 UnsafeByteStringOperations.kt\nkotlinx/io/bytestring/unsafe/UnsafeByteStringOperations\n+ 5 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Buffer.kt\nkotlinx/io/BufferKt\n*L\n1#1,167:1\n38#2:168\n374#3:169\n375#3,2:200\n42#4:170\n43#4:199\n42#4:203\n43#4:229\n195#5,28:171\n1#6:202\n659#7,25:204\n*S KotlinDebug\n*F\n+ 1 ByteStrings.kt\nkotlinx/io/ByteStringsKt\n*L\n31#1:168\n36#1:169\n36#1:200,2\n39#1:170\n39#1:199\n128#1:203\n128#1:229\n42#1:171,28\n129#1:204,25\n*E\n"})
/* loaded from: classes8.dex */
public final class f {
    public static final long a(@m80.k b bVar, @m80.k z40.c byteString, long j11) {
        long j12;
        long j13;
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(byteString, "byteString");
        if (j11 > bVar.r()) {
            throw new IllegalArgumentException(("startIndex (" + j11 + ") should not exceed size (" + bVar.r() + ')').toString());
        }
        long j14 = 0;
        if (z40.g.p(byteString)) {
            return 0L;
        }
        if (j11 > bVar.r() - byteString.g()) {
            return -1L;
        }
        a50.b bVar2 = a50.b.f1957a;
        byte[] f11 = byteString.f();
        if (bVar.k() == null) {
            return -1L;
        }
        if (bVar.r() - j11 >= j11) {
            t k11 = bVar.k();
            while (k11 != null) {
                long d11 = (k11.d() - k11.h()) + j14;
                if (d11 > j11) {
                    break;
                }
                k11 = k11.f();
                j14 = d11;
            }
            if (j14 == -1) {
                return -1L;
            }
            do {
                kotlin.jvm.internal.g0.m(k11);
                int max = Math.max((int) (j11 - j14), 0);
                int b11 = v.b(k11, f11, max);
                if (b11 == -1) {
                    int c11 = v.c(k11, f11, Math.max(max, (k11.n() - f11.length) + 1));
                    if (c11 == -1) {
                        j14 += k11.n();
                        k11 = k11.f();
                        if (k11 == null) {
                            break;
                        }
                    } else {
                        j12 = c11;
                    }
                } else {
                    j12 = b11;
                }
                return j14 + j12;
            } while (byteString.g() + j14 <= bVar.r());
            return -1L;
        }
        t E = bVar.E();
        long r11 = bVar.r();
        while (E != null && r11 > j11) {
            r11 -= E.d() - E.h();
            if (r11 <= j11) {
                break;
            }
            E = E.j();
        }
        if (r11 == -1) {
            return -1L;
        }
        do {
            kotlin.jvm.internal.g0.m(E);
            int max2 = Math.max((int) (j11 - r11), 0);
            int b12 = v.b(E, f11, max2);
            if (b12 == -1) {
                int c12 = v.c(E, f11, Math.max(max2, (E.n() - f11.length) + 1));
                if (c12 == -1) {
                    r11 += E.n();
                    E = E.f();
                    if (E == null) {
                        break;
                    }
                } else {
                    j13 = c12;
                }
            } else {
                j13 = b12;
            }
            return r11 + j13;
        } while (byteString.g() + r11 <= bVar.r());
        return -1L;
    }

    public static final long b(@m80.k c0 c0Var, @m80.k z40.c byteString, long j11) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        kotlin.jvm.internal.g0.p(byteString, "byteString");
        if (j11 < 0) {
            throw new IllegalArgumentException(("startIndex: " + j11).toString());
        }
        if (z40.g.p(byteString)) {
            return 0L;
        }
        while (c0Var.request(byteString.g() + j11)) {
            long a11 = a(c0Var.getBuffer(), byteString, j11);
            if (a11 >= 0) {
                return a11;
            }
            j11 = (c0Var.getBuffer().r() - byteString.g()) + 1;
        }
        return -1L;
    }

    public static /* synthetic */ long c(b bVar, z40.c cVar, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        return a(bVar, cVar, j11);
    }

    public static /* synthetic */ long d(c0 c0Var, z40.c cVar, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        return b(c0Var, cVar, j11);
    }

    @m80.k
    public static final z40.c e(@m80.k c0 c0Var) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return a50.b.f1957a.b(g0.c(c0Var));
    }

    @m80.k
    public static final z40.c f(@m80.k c0 c0Var, int i11) {
        kotlin.jvm.internal.g0.p(c0Var, "<this>");
        return a50.b.f1957a.b(g0.d(c0Var, i11));
    }

    public static final void g(@m80.k x xVar, @m80.k z40.c byteString, int i11, int i12) {
        kotlin.jvm.internal.g0.p(xVar, "<this>");
        kotlin.jvm.internal.g0.p(byteString, "byteString");
        k0.e(byteString.g(), i11, i12);
        if (i12 == i11) {
            return;
        }
        b buffer = xVar.getBuffer();
        a50.b bVar = a50.b.f1957a;
        byte[] f11 = byteString.f();
        while (i11 < i12) {
            d50.d dVar = d50.d.f47268a;
            t d02 = buffer.d0(1);
            byte[] b11 = d02.b(false);
            int d11 = d02.d();
            int min = Math.min(i12 - i11, b11.length - d11);
            int i13 = i11 + min;
            a00.q.v0(f11, b11, d11, i11, i13);
            if (min == 1) {
                d02.I(b11, min);
                d02.x(d02.d() + min);
                buffer.Z(buffer.w() + min);
            } else {
                if (min < 0 || min > d02.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + min + ". Should be in 0.." + d02.l()).toString());
                }
                if (min != 0) {
                    d02.I(b11, min);
                    d02.x(d02.d() + min);
                    buffer.Z(buffer.w() + min);
                } else if (v.d(d02)) {
                    buffer.U();
                }
            }
            i11 = i13;
        }
        xVar.U0();
    }

    public static /* synthetic */ void h(x xVar, z40.c cVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = cVar.g();
        }
        g(xVar, cVar, i11, i12);
    }
}
