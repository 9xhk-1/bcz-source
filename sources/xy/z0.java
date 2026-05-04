package xy;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z0 {
    @m80.k
    public static final ByteBuffer a(@m80.k ByteBuffer byteBuffer, int i11) {
        kotlin.jvm.internal.g0.p(byteBuffer, "<this>");
        ByteBuffer allocate = ByteBuffer.allocate(i11);
        ByteBuffer slice = byteBuffer.slice();
        kotlin.jvm.internal.g0.o(slice, "slice(...)");
        kotlin.jvm.internal.g0.m(allocate);
        h(slice, allocate, 0, 2, null);
        allocate.clear();
        kotlin.jvm.internal.g0.o(allocate, "apply(...)");
        return allocate;
    }

    @m80.k
    public static final ByteBuffer b(@m80.k ByteBuffer byteBuffer, @m80.k pz.h<ByteBuffer> pool, int i11) {
        kotlin.jvm.internal.g0.p(byteBuffer, "<this>");
        kotlin.jvm.internal.g0.p(pool, "pool");
        ByteBuffer U6 = pool.U6();
        U6.limit(i11);
        ByteBuffer slice = byteBuffer.slice();
        kotlin.jvm.internal.g0.o(slice, "slice(...)");
        h(slice, U6, 0, 2, null);
        U6.flip();
        return U6;
    }

    public static /* synthetic */ ByteBuffer c(ByteBuffer byteBuffer, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = byteBuffer.remaining();
        }
        return a(byteBuffer, i11);
    }

    public static /* synthetic */ ByteBuffer d(ByteBuffer byteBuffer, pz.h hVar, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = byteBuffer.remaining();
        }
        return b(byteBuffer, hVar, i11);
    }

    @m80.k
    public static final String e(@m80.k ByteBuffer byteBuffer, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(byteBuffer, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        String charBuffer = charset.decode(byteBuffer).toString();
        kotlin.jvm.internal.g0.o(charBuffer, "toString(...)");
        return charBuffer;
    }

    public static /* synthetic */ String f(ByteBuffer byteBuffer, Charset charset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = u30.d.f91599b;
        }
        return e(byteBuffer, charset);
    }

    public static final int g(@m80.k ByteBuffer byteBuffer, @m80.k ByteBuffer destination, int i11) {
        kotlin.jvm.internal.g0.p(byteBuffer, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        int min = Math.min(i11, Math.min(byteBuffer.remaining(), destination.remaining()));
        if (min == byteBuffer.remaining()) {
            destination.put(byteBuffer);
            return min;
        }
        int limit = byteBuffer.limit();
        byteBuffer.limit(byteBuffer.position() + min);
        destination.put(byteBuffer);
        byteBuffer.limit(limit);
        return min;
    }

    public static /* synthetic */ int h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        return g(byteBuffer, byteBuffer2, i11);
    }

    @m80.k
    public static final byte[] i(@m80.k ByteBuffer byteBuffer) {
        kotlin.jvm.internal.g0.p(byteBuffer, "<this>");
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return bArr;
    }
}
