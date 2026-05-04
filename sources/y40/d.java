package y40;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBuffersJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuffersJvm.kt\nkotlinx/io/BuffersJvmKt\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 5 Buffer.kt\nkotlinx/io/BufferKt\n+ 6 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsKt\n*L\n1#1,207:1\n52#2:208\n53#2:210\n107#2:217\n107#2:242\n110#2:260\n1#3:209\n1#3:239\n1#3:250\n1#3:286\n195#4,6:211\n203#4,20:218\n99#4:238\n100#4,2:240\n102#4,6:243\n347#4:249\n348#4,5:251\n353#4:258\n354#4:262\n355#4:284\n99#4:285\n100#4,8:287\n195#4,28:295\n659#5,2:256\n663#5,21:263\n434#6:259\n435#6:261\n*S KotlinDebug\n*F\n+ 1 BuffersJvm.kt\nkotlinx/io/BuffersJvmKt\n*L\n57#1:208\n57#1:210\n68#1:217\n101#1:242\n138#1:260\n57#1:209\n100#1:239\n133#1:250\n160#1:286\n67#1:211,6\n67#1:218,20\n100#1:238\n100#1:240,2\n100#1:243,6\n133#1:249\n133#1:251,5\n133#1:258\n133#1:262\n133#1:284\n160#1:285\n160#1:287,8\n180#1:295,28\n133#1:256,2\n133#1:263,21\n137#1:259\n137#1:261\n*E\n"})
/* loaded from: classes8.dex */
public final class d {
    @m80.k
    public static final ByteChannel a(@m80.k b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return new a(bVar);
    }

    public static final void b(@m80.k b bVar, @m80.k OutputStream out, long j11, long j12) {
        d50.a aVar;
        d50.a aVar2;
        d50.a aVar3;
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(out, "out");
        k0.e(bVar.r(), j11, j12);
        if (j11 == j12) {
            return;
        }
        long j13 = j12 - j11;
        d50.d dVar = d50.d.f47268a;
        if (j11 < 0) {
            throw new IllegalArgumentException(("Offset must be non-negative: " + j11).toString());
        }
        if (j11 >= bVar.r()) {
            throw new IndexOutOfBoundsException("Offset should be less than buffer's size (" + bVar.r() + "): " + j11);
        }
        if (bVar.k() == null) {
            aVar3 = d50.f.f47271c;
            t tVar = null;
            kotlin.jvm.internal.g0.m(null);
            int i11 = (int) (j11 - (-1));
            while (j13 > 0) {
                byte[] b11 = tVar.b(true);
                int h11 = tVar.h();
                int min = (int) Math.min((tVar.d() - h11) - i11, j13);
                out.write(b11, h11 + i11, min);
                j13 -= min;
                tVar = aVar3.a(tVar);
                if (tVar == null) {
                    return;
                } else {
                    i11 = 0;
                }
            }
            return;
        }
        if (bVar.r() - j11 < j11) {
            t E = bVar.E();
            long r11 = bVar.r();
            while (E != null && r11 > j11) {
                r11 -= E.d() - E.h();
                if (r11 <= j11) {
                    break;
                } else {
                    E = E.j();
                }
            }
            aVar2 = d50.f.f47271c;
            kotlin.jvm.internal.g0.m(E);
            int i12 = (int) (j11 - r11);
            while (j13 > 0) {
                byte[] b12 = E.b(true);
                int h12 = E.h();
                int min2 = (int) Math.min((E.d() - h12) - i12, j13);
                out.write(b12, h12 + i12, min2);
                j13 -= min2;
                E = aVar2.a(E);
                if (E == null) {
                    return;
                } else {
                    i12 = 0;
                }
            }
            return;
        }
        t k11 = bVar.k();
        long j14 = 0;
        while (k11 != null) {
            long d11 = (k11.d() - k11.h()) + j14;
            if (d11 > j11) {
                break;
            }
            k11 = k11.f();
            j14 = d11;
        }
        aVar = d50.f.f47271c;
        kotlin.jvm.internal.g0.m(k11);
        int i13 = (int) (j11 - j14);
        while (j13 > 0) {
            byte[] b13 = k11.b(true);
            int h13 = k11.h();
            int min3 = (int) Math.min((k11.d() - h13) - i13, j13);
            out.write(b13, h13 + i13, min3);
            j13 -= min3;
            k11 = aVar.a(k11);
            if (k11 == null) {
                return;
            } else {
                i13 = 0;
            }
        }
    }

    public static /* synthetic */ void c(b bVar, OutputStream outputStream, long j11, long j12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        long j13 = j11;
        if ((i11 & 4) != 0) {
            j12 = bVar.r();
        }
        b(bVar, outputStream, j13, j12);
    }

    public static final int d(@m80.k b bVar, @m80.k ByteBuffer sink) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (bVar.J()) {
            return -1;
        }
        d50.d dVar = d50.d.f47268a;
        if (bVar.J()) {
            throw new IllegalArgumentException("Buffer is empty");
        }
        t k11 = bVar.k();
        kotlin.jvm.internal.g0.m(k11);
        byte[] b11 = k11.b(true);
        int h11 = k11.h();
        int min = Math.min(sink.remaining(), k11.d() - h11);
        sink.put(b11, h11, min);
        if (min == 0) {
            return min;
        }
        if (min < 0) {
            throw new IllegalStateException("Returned negative read bytes count");
        }
        if (min > k11.n()) {
            throw new IllegalStateException("Returned too many bytes");
        }
        bVar.skip(min);
        return min;
    }

    public static final void e(@m80.k b bVar, @m80.k OutputStream out, long j11) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(out, "out");
        k0.g(bVar.r(), 0L, j11);
        while (j11 > 0) {
            d50.d dVar = d50.d.f47268a;
            if (bVar.J()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            t k11 = bVar.k();
            kotlin.jvm.internal.g0.m(k11);
            byte[] b11 = k11.b(true);
            int h11 = k11.h();
            int min = (int) Math.min(j11, k11.d() - h11);
            out.write(b11, h11, min);
            long j12 = min;
            j11 -= j12;
            if (min != 0) {
                if (min < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (min > k11.n()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                bVar.skip(j12);
            }
        }
    }

    public static /* synthetic */ void f(b bVar, OutputStream outputStream, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = bVar.r();
        }
        e(bVar, outputStream, j11);
    }

    @m80.k
    public static final b g(@m80.k b bVar, @m80.k InputStream input) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(input, "input");
        j(bVar, input, Long.MAX_VALUE, true);
        return bVar;
    }

    @m80.k
    public static final b h(@m80.k b bVar, @m80.k ByteBuffer source) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(source, "source");
        int remaining = source.remaining();
        while (remaining > 0) {
            d50.d dVar = d50.d.f47268a;
            t d02 = bVar.d0(1);
            byte[] b11 = d02.b(false);
            int d11 = d02.d();
            int min = Math.min(remaining, b11.length - d11);
            source.get(b11, d11, min);
            remaining -= min;
            if (min == 1) {
                d02.I(b11, min);
                d02.x(d02.d() + min);
                bVar.Z(bVar.w() + min);
            } else {
                if (min < 0 || min > d02.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + min + ". Should be in 0.." + d02.l()).toString());
                }
                if (min != 0) {
                    d02.I(b11, min);
                    d02.x(d02.d() + min);
                    bVar.Z(bVar.w() + min);
                } else if (v.d(d02)) {
                    bVar.U();
                }
            }
        }
        return bVar;
    }

    @m80.k
    public static final b i(@m80.k b bVar, @m80.k InputStream input, long j11) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(input, "input");
        if (j11 >= 0) {
            j(bVar, input, j11, false);
            return bVar;
        }
        throw new IllegalArgumentException(("byteCount (" + j11 + ") < 0").toString());
    }

    public static final void j(b bVar, InputStream inputStream, long j11, boolean z11) {
        long j12 = j11;
        boolean z12 = false;
        while (!z12) {
            if (j12 <= 0 && !z11) {
                return;
            }
            d50.d dVar = d50.d.f47268a;
            t d02 = bVar.d0(1);
            byte[] b11 = d02.b(false);
            int read = inputStream.read(b11, d02.d(), (int) Math.min(j12, b11.length - r7));
            if (read != -1) {
                j12 -= read;
            } else {
                if (!z11) {
                    throw new EOFException("Stream exhausted before " + j11 + " bytes were read.");
                }
                read = 0;
                z12 = true;
            }
            if (read == 1) {
                d02.I(b11, read);
                d02.x(d02.d() + read);
                bVar.Z(bVar.w() + read);
            } else {
                if (read < 0 || read > d02.l()) {
                    throw new IllegalStateException(("Invalid number of bytes written: " + read + ". Should be in 0.." + d02.l()).toString());
                }
                if (read != 0) {
                    d02.I(b11, read);
                    d02.x(d02.d() + read);
                    bVar.Z(bVar.w() + read);
                } else if (v.d(d02)) {
                    bVar.U();
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements ByteChannel {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b f99293a;

        public a(b bVar) {
            this.f99293a = bVar;
        }

        @Override // java.nio.channels.Channel
        public boolean isOpen() {
            return true;
        }

        @Override // java.nio.channels.ReadableByteChannel
        public int read(ByteBuffer sink) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            return d.d(this.f99293a, sink);
        }

        @Override // java.nio.channels.WritableByteChannel
        public int write(ByteBuffer source) {
            kotlin.jvm.internal.g0.p(source, "source");
            long r11 = this.f99293a.r();
            d.h(this.f99293a, source);
            return (int) (this.f99293a.r() - r11);
        }

        @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }
}
