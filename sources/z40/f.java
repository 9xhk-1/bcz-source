package z40;

import g10.l;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import z40.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nByteStringJvmExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteStringJvmExt.kt\nkotlinx/io/bytestring/ByteStringJvmExtKt\n+ 2 UnsafeByteStringOperations.kt\nkotlinx/io/bytestring/unsafe/UnsafeByteStringOperations\n*L\n1#1,137:1\n42#2,2:138\n42#2,2:140\n*S KotlinDebug\n*F\n+ 1 ByteStringJvmExt.kt\nkotlinx/io/bytestring/ByteStringJvmExtKt\n*L\n37#1:138,2\n101#1:140,2\n*E\n"})
/* loaded from: classes8.dex */
public final class f {
    @k
    public static final ByteBuffer a(@k c cVar) {
        g0.p(cVar, "<this>");
        a50.b bVar = a50.b.f1957a;
        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(cVar.f()).asReadOnlyBuffer();
        g0.o(asReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return asReadOnlyBuffer;
    }

    public static final void b(ByteBuffer byteBuffer, int i11, int i12) {
        if (i11 < 0 || i11 >= byteBuffer.limit()) {
            throw new IndexOutOfBoundsException("Index " + i11 + " is out of this ByteBuffer's bounds: [0, " + byteBuffer.limit() + ')');
        }
        if (i12 < 0) {
            throw new IndexOutOfBoundsException("length should be non-negative (was " + i12 + ')');
        }
        if (i11 + i12 <= byteBuffer.limit()) {
            return;
        }
        throw new IndexOutOfBoundsException("There's not enough space to put ByteString of length " + i12 + " starting from index " + i11);
    }

    @k
    public static final String c(@k c cVar, @k Charset charset) {
        g0.p(cVar, "<this>");
        g0.p(charset, "charset");
        return new String(cVar.f(), charset);
    }

    @k
    public static final c d(@k String str, @k Charset charset) {
        g0.p(str, "<this>");
        g0.p(charset, "charset");
        c.a aVar = c.f100824c;
        byte[] bytes = str.getBytes(charset);
        g0.o(bytes, "getBytes(...)");
        return aVar.b(bytes);
    }

    @k
    public static final c e(@k ByteBuffer byteBuffer, int i11) {
        g0.p(byteBuffer, "<this>");
        if (i11 < 0) {
            throw new IndexOutOfBoundsException("length should be non-negative (was " + i11 + ')');
        }
        if (byteBuffer.remaining() >= i11) {
            byte[] bArr = new byte[i11];
            byteBuffer.get(bArr);
            return a50.b.f1957a.b(bArr);
        }
        throw new IndexOutOfBoundsException("length (" + i11 + ") exceeds remaining bytes count ({" + byteBuffer.remaining() + "})");
    }

    @k
    public static final c f(@k ByteBuffer byteBuffer, int i11, int i12) {
        g0.p(byteBuffer, "<this>");
        b(byteBuffer, i11, i12);
        byte[] bArr = new byte[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            bArr[i13] = byteBuffer.get(i11 + i13);
        }
        return a50.b.f1957a.b(bArr);
    }

    public static /* synthetic */ c g(ByteBuffer byteBuffer, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = byteBuffer.remaining();
        }
        return e(byteBuffer, i11);
    }

    public static final void h(@k ByteBuffer byteBuffer, int i11, @k c string) {
        g0.p(byteBuffer, "<this>");
        g0.p(string, "string");
        b(byteBuffer, i11, string.g());
        l i12 = g.i(string);
        int d11 = i12.d();
        int f11 = i12.f();
        if (d11 > f11) {
            return;
        }
        while (true) {
            byteBuffer.put(i11 + d11, string.e(d11));
            if (d11 == f11) {
                return;
            } else {
                d11++;
            }
        }
    }

    public static final void i(@k ByteBuffer byteBuffer, @k c string) {
        g0.p(byteBuffer, "<this>");
        g0.p(string, "string");
        a50.b bVar = a50.b.f1957a;
        byteBuffer.put(string.f());
    }
}
