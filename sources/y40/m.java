package y40;

import java.io.OutputStream;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmCore.kt\nkotlinx/io/OutputStreamSink\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 -Util.kt\nkotlinx/io/_UtilKt\n*L\n1#1,112:1\n99#2:113\n100#2,2:115\n102#2,6:118\n1#3:114\n107#4:117\n*S KotlinDebug\n*F\n+ 1 JvmCore.kt\nkotlinx/io/OutputStreamSink\n*L\n48#1:113\n48#1:115,2\n48#1:118,6\n48#1:114\n49#1:117\n*E\n"})
/* loaded from: classes8.dex */
public class m implements o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final OutputStream f99302a;

    public m(@m80.k OutputStream out) {
        kotlin.jvm.internal.g0.p(out, "out");
        this.f99302a = out;
    }

    @Override // y40.o, java.lang.AutoCloseable
    public void close() {
        this.f99302a.close();
    }

    @Override // y40.o, java.io.Flushable
    public void flush() {
        this.f99302a.flush();
    }

    @Override // y40.o
    public void i6(@m80.k b source, long j11) {
        kotlin.jvm.internal.g0.p(source, "source");
        k0.g(source.r(), 0L, j11);
        while (j11 > 0) {
            d50.d dVar = d50.d.f47268a;
            if (source.J()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            t k11 = source.k();
            kotlin.jvm.internal.g0.m(k11);
            byte[] b11 = k11.b(true);
            int h11 = k11.h();
            int min = (int) Math.min(j11, k11.d() - h11);
            this.f99302a.write(b11, h11, min);
            long j12 = min;
            j11 -= j12;
            if (min != 0) {
                if (min < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (min > k11.n()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                source.skip(j12);
            }
        }
    }

    @m80.k
    public String toString() {
        return "RawSink(" + this.f99302a + ')';
    }
}
