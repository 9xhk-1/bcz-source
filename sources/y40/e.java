package y40;

import androidx.collection.SieveCacheKt;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBuffers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffers.kt\nkotlinx/io/BuffersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ByteStringBuilder.kt\nkotlinx/io/bytestring/ByteStringBuilderKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 5 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsKt\n+ 6 Buffer.kt\nkotlinx/io/BufferKt\n*L\n1#1,80:1\n1#2:81\n127#3:82\n378#4,3:83\n381#4,3:88\n434#5,2:86\n659#6,25:91\n*S KotlinDebug\n*F\n+ 1 Buffers.kt\nkotlinx/io/BuffersKt\n*L\n24#1:82\n25#1:83,3\n25#1:88,3\n26#1:86,2\n52#1:91,25\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    public static final long a(@m80.k b bVar, byte b11, long j11, long j12) {
        long j13;
        long j14;
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        long min = Math.min(j12, bVar.r());
        k0.e(bVar.r(), j11, min);
        if (j11 == min || bVar.k() == null) {
            return -1L;
        }
        if (bVar.r() - j11 < j11) {
            t E = bVar.E();
            j13 = bVar.r();
            while (E != null && j13 > j11) {
                j13 -= E.d() - E.h();
                if (j13 <= j11) {
                    break;
                }
                E = E.j();
            }
            if (j13 == -1) {
                return -1L;
            }
            while (min > j13) {
                kotlin.jvm.internal.g0.m(E);
                int a11 = v.a(E, b11, Math.max((int) (j11 - j13), 0), Math.min(E.n(), (int) (min - j13)));
                if (a11 != -1) {
                    j14 = a11;
                } else {
                    j13 += E.n();
                    E = E.f();
                    if (E == null || j13 >= min) {
                        return -1L;
                    }
                }
            }
            throw new IllegalStateException("Check failed.");
        }
        t k11 = bVar.k();
        j13 = 0;
        while (k11 != null) {
            long d11 = (k11.d() - k11.h()) + j13;
            if (d11 > j11) {
                break;
            }
            k11 = k11.f();
            j13 = d11;
        }
        if (j13 == -1) {
            return -1L;
        }
        while (min > j13) {
            kotlin.jvm.internal.g0.m(k11);
            int a12 = v.a(k11, b11, Math.max((int) (j11 - j13), 0), Math.min(k11.n(), (int) (min - j13)));
            if (a12 != -1) {
                j14 = a12;
            } else {
                j13 += k11.n();
                k11 = k11.f();
                if (k11 == null || j13 >= min) {
                    return -1L;
                }
            }
        }
        throw new IllegalStateException("Check failed.");
        return j13 + j14;
    }

    public static /* synthetic */ long b(b bVar, byte b11, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            j12 = bVar.r();
        }
        return a(bVar, b11, j13, j12);
    }

    @m80.k
    public static final z40.c c(@m80.k b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        if (bVar.r() == 0) {
            return z40.g.a();
        }
        if (bVar.r() > SieveCacheKt.NodeLinkMask) {
            throw new IllegalStateException(("Buffer is too long (" + bVar.r() + ") to be converted into a byte string.").toString());
        }
        z40.d dVar = new z40.d((int) bVar.r());
        d50.d dVar2 = d50.d.f47268a;
        for (t k11 = bVar.k(); k11 != null; k11 = k11.f()) {
            d50.b unused = d50.f.f47269a;
            dVar.b(k11.b(true), k11.h(), k11.d());
        }
        return dVar.g();
    }
}
