package d50;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import x00.q;
import y40.h0;
import y40.k0;
import y40.t;
import y40.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nUnsafeBufferOperations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Buffer.kt\nkotlinx/io/BufferKt\n*L\n1#1,568:1\n38#2:569\n1#3:570\n659#4,25:571\n*S KotlinDebug\n*F\n+ 1 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n43#1:569\n352#1:571,25\n*E\n"})
@h0
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final d f47268a = new d();

    public static /* synthetic */ void f(d dVar, y40.b bVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        dVar.e(bVar, bArr, i11, i12);
    }

    public final void a(@k y40.b buffer, @k p<? super b, ? super t, g2> action) {
        g0.p(buffer, "buffer");
        g0.p(action, "action");
        for (t k11 = buffer.k(); k11 != null; k11 = k11.f()) {
            action.invoke(f.f47269a, k11);
        }
    }

    public final int b() {
        return 8192;
    }

    public final void c(@k y40.b buffer, long j11, @k q<? super a, ? super t, ? super Long, g2> iterationAction) {
        a aVar;
        a aVar2;
        a aVar3;
        g0.p(buffer, "buffer");
        g0.p(iterationAction, "iterationAction");
        long j12 = 0;
        if (j11 < 0) {
            throw new IllegalArgumentException(("Offset must be non-negative: " + j11).toString());
        }
        if (j11 >= buffer.r()) {
            throw new IndexOutOfBoundsException("Offset should be less than buffer's size (" + buffer.r() + "): " + j11);
        }
        if (buffer.k() == null) {
            aVar3 = f.f47271c;
            iterationAction.invoke(aVar3, null, -1L);
            return;
        }
        if (buffer.r() - j11 >= j11) {
            t k11 = buffer.k();
            while (k11 != null) {
                long d11 = (k11.d() - k11.h()) + j12;
                if (d11 > j11) {
                    break;
                }
                k11 = k11.f();
                j12 = d11;
            }
            aVar = f.f47271c;
            iterationAction.invoke(aVar, k11, Long.valueOf(j12));
            return;
        }
        t E = buffer.E();
        long r11 = buffer.r();
        while (E != null && r11 > j11) {
            r11 -= E.d() - E.h();
            if (r11 <= j11) {
                break;
            } else {
                E = E.j();
            }
        }
        aVar2 = f.f47271c;
        iterationAction.invoke(aVar2, E, Long.valueOf(r11));
    }

    public final void d(@k y40.b buffer, @k p<? super a, ? super t, g2> iterationAction) {
        a aVar;
        g0.p(buffer, "buffer");
        g0.p(iterationAction, "iterationAction");
        aVar = f.f47271c;
        iterationAction.invoke(aVar, buffer.k());
    }

    public final void e(@k y40.b buffer, @k byte[] bytes, int i11, int i12) {
        g0.p(buffer, "buffer");
        g0.p(bytes, "bytes");
        k0.e(bytes.length, i11, i12);
        t b11 = t.f99318h.b(bytes, i11, i12, y40.a.f99284a, false);
        t E = buffer.E();
        if (E == null) {
            buffer.V(b11);
            buffer.a0(b11);
        } else {
            buffer.a0(E.q(b11));
        }
        buffer.Z(buffer.w() + (i12 - i11));
    }

    public final int g(@k y40.b buffer, @k p<? super b, ? super t, Integer> readAction) {
        g0.p(buffer, "buffer");
        g0.p(readAction, "readAction");
        if (buffer.J()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t k11 = buffer.k();
        g0.m(k11);
        int intValue = readAction.invoke(f.f47269a, k11).intValue();
        if (intValue == 0) {
            return intValue;
        }
        if (intValue < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (intValue > k11.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        buffer.skip(intValue);
        return intValue;
    }

    public final int h(@k y40.b buffer, @k q<? super byte[], ? super Integer, ? super Integer, Integer> readAction) {
        g0.p(buffer, "buffer");
        g0.p(readAction, "readAction");
        if (buffer.J()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t k11 = buffer.k();
        g0.m(k11);
        int intValue = readAction.invoke(k11.b(true), Integer.valueOf(k11.h()), Integer.valueOf(k11.d())).intValue();
        if (intValue == 0) {
            return intValue;
        }
        if (intValue < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (intValue > k11.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        buffer.skip(intValue);
        return intValue;
    }

    public final int i(@k y40.b buffer, int i11, @k p<? super c, ? super t, Integer> writeAction) {
        c cVar;
        g0.p(buffer, "buffer");
        g0.p(writeAction, "writeAction");
        t d02 = buffer.d0(i11);
        cVar = f.f47270b;
        int intValue = writeAction.invoke(cVar, d02).intValue();
        if (intValue == i11) {
            d02.x(d02.d() + intValue);
            buffer.Z(buffer.w() + intValue);
            return intValue;
        }
        if (intValue < 0 || intValue > d02.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + intValue + ". Should be in 0.." + d02.l()).toString());
        }
        if (intValue != 0) {
            d02.x(d02.d() + intValue);
            buffer.Z(buffer.w() + intValue);
            return intValue;
        }
        if (v.d(d02)) {
            buffer.U();
        }
        return intValue;
    }

    public final int j(@k y40.b buffer, int i11, @k q<? super byte[], ? super Integer, ? super Integer, Integer> writeAction) {
        g0.p(buffer, "buffer");
        g0.p(writeAction, "writeAction");
        t d02 = buffer.d0(i11);
        byte[] b11 = d02.b(false);
        int intValue = writeAction.invoke(b11, Integer.valueOf(d02.d()), Integer.valueOf(b11.length)).intValue();
        if (intValue == i11) {
            d02.I(b11, intValue);
            d02.x(d02.d() + intValue);
            buffer.Z(buffer.w() + intValue);
            return intValue;
        }
        if (intValue < 0 || intValue > d02.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + intValue + ". Should be in 0.." + d02.l()).toString());
        }
        if (intValue == 0) {
            if (v.d(d02)) {
                buffer.U();
            }
            return intValue;
        }
        d02.I(b11, intValue);
        d02.x(d02.d() + intValue);
        buffer.Z(buffer.w() + intValue);
        return intValue;
    }
}
