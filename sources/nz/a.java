package nz;

import androidx.collection.SieveCacheKt;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import y40.p;
import y40.t;
import y40.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reading.kt\nio/ktor/utils/io/jvm/nio/ReadableByteChannelSource\n+ 2 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n*L\n1#1,72:1\n195#2,28:73\n*S KotlinDebug\n*F\n+ 1 Reading.kt\nio/ktor/utils/io/jvm/nio/ReadableByteChannelSource\n*L\n56#1:73,28\n*E\n"})
/* loaded from: classes8.dex */
public class a implements p {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ReadableByteChannel f75401a;

    public a(@k ReadableByteChannel channel) {
        g0.p(channel, "channel");
        this.f75401a = channel;
    }

    @Override // y40.p, java.lang.AutoCloseable
    public void close() {
        this.f75401a.close();
    }

    @Override // y40.p
    public long r2(@k y40.b sink, long j11) {
        g0.p(sink, "sink");
        if (j11 <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j11, SieveCacheKt.NodeLinkMask);
        d50.d dVar = d50.d.f47268a;
        t d02 = sink.d0(1);
        byte[] b11 = d02.b(false);
        int d11 = d02.d();
        int read = this.f75401a.read(ByteBuffer.wrap(b11, d11, Math.min(min, b11.length - d11)));
        int max = Math.max(read, 0);
        if (max == 1) {
            d02.I(b11, max);
            d02.x(d02.d() + max);
            sink.Z(sink.w() + max);
        } else {
            if (max < 0 || max > d02.l()) {
                throw new IllegalStateException(("Invalid number of bytes written: " + max + ". Should be in 0.." + d02.l()).toString());
            }
            if (max != 0) {
                d02.I(b11, max);
                d02.x(d02.d() + max);
                sink.Z(sink.w() + max);
            } else if (v.d(d02)) {
                sink.U();
            }
        }
        return read;
    }

    @k
    public String toString() {
        return "ReadableByteChannelSource(" + this.f75401a + ')';
    }
}
