package qz;

import d50.d;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import y40.b;
import y40.c0;
import y40.f0;
import y40.g;
import y40.l;
import y40.t;
import y40.v;
import y40.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Streams.kt\nio/ktor/utils/io/streams/StreamsKt\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,38:1\n195#2,28:39\n*S KotlinDebug\n*F\n+ 1 Streams.kt\nio/ktor/utils/io/streams/StreamsKt\n*L\n31#1:39,28\n*E\n"})
/* loaded from: classes8.dex */
public final class a {
    @k
    public static final c0 a(@k InputStream inputStream) {
        g0.p(inputStream, "<this>");
        return g.b(l.b(inputStream));
    }

    @k
    public static final InputStream b(@k c0 c0Var) {
        g0.p(c0Var, "<this>");
        return f0.e(c0Var);
    }

    @k
    public static final c0 c(@k InputStream inputStream, int i11) {
        g0.p(inputStream, "<this>");
        b bVar = new b();
        d dVar = d.f47268a;
        t d02 = bVar.d0(i11);
        byte[] b11 = d02.b(false);
        int d11 = d02.d();
        int read = inputStream.read(b11, d11, b11.length - d11);
        int i12 = read >= 0 ? read : 0;
        if (i12 == i11) {
            d02.I(b11, i12);
            d02.x(d02.d() + i12);
            bVar.Z(bVar.w() + i12);
            return bVar;
        }
        if (i12 < 0 || i12 > d02.l()) {
            throw new IllegalStateException(("Invalid number of bytes written: " + i12 + ". Should be in 0.." + d02.l()).toString());
        }
        if (i12 == 0) {
            if (v.d(d02)) {
                bVar.U();
            }
            return bVar;
        }
        d02.I(b11, i12);
        d02.x(d02.d() + i12);
        bVar.Z(bVar.w() + i12);
        return bVar;
    }

    public static /* synthetic */ c0 d(InputStream inputStream, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        return c(inputStream, i11);
    }

    public static final void e(@k OutputStream outputStream, @k x00.l<? super x, g2> block) {
        g0.p(outputStream, "<this>");
        g0.p(block, "block");
        b bVar = new b();
        block.invoke(bVar);
        f(outputStream, bVar);
    }

    public static final void f(@k OutputStream outputStream, @k c0 packet) {
        g0.p(outputStream, "<this>");
        g0.p(packet, "packet");
        y40.d.c(packet.getBuffer(), outputStream, 0L, 0L, 6, null);
    }
}
