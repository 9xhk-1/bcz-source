package y40;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmCore.kt\nkotlinx/io/InputStreamSource\n+ 2 -Util.kt\nkotlinx/io/_UtilKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,112:1\n52#2:113\n53#2:115\n107#2:122\n1#3:114\n195#4,6:116\n203#4,20:123\n*S KotlinDebug\n*F\n+ 1 JvmCore.kt\nkotlinx/io/InputStreamSource\n*L\n80#1:113\n80#1:115\n84#1:122\n80#1:114\n83#1:116,6\n83#1:123,20\n*E\n"})
/* loaded from: classes8.dex */
public class j implements p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final InputStream f99300a;

    public j(@m80.k InputStream input) {
        kotlin.jvm.internal.g0.p(input, "input");
        this.f99300a = input;
    }

    @Override // y40.p, java.lang.AutoCloseable
    public void close() {
        this.f99300a.close();
    }

    @Override // y40.p
    public long r2(@m80.k b sink, long j11) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (j11 == 0) {
            return 0L;
        }
        if (j11 < 0) {
            throw new IllegalArgumentException(("byteCount (" + j11 + ") < 0").toString());
        }
        try {
            d50.d dVar = d50.d.f47268a;
            t d02 = sink.d0(1);
            int i11 = 0;
            byte[] b11 = d02.b(false);
            long read = this.f99300a.read(b11, d02.d(), (int) Math.min(j11, b11.length - r4));
            if (read != -1) {
                i11 = (int) read;
            }
            if (i11 == 1) {
                d02.I(b11, i11);
                d02.x(d02.d() + i11);
                sink.Z(sink.w() + i11);
                return read;
            }
            if (i11 < 0 || i11 > d02.l()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + i11 + ". Should be in 0.." + d02.l()).toString());
            }
            if (i11 == 0) {
                if (v.d(d02)) {
                    sink.U();
                }
                return read;
            }
            d02.I(b11, i11);
            d02.x(d02.d() + i11);
            sink.Z(sink.w() + i11);
            return read;
        } catch (AssertionError e11) {
            if (l.c(e11)) {
                throw new IOException(e11);
            }
            throw e11;
        }
    }

    @m80.k
    public String toString() {
        return "RawSource(" + this.f99300a + ')';
    }
}
