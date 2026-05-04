package xy;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import kotlin.jvm.internal.Ref;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i {
    public static final int c(@m80.k final ReadableByteChannel readableByteChannel, @m80.k y40.b buffer) {
        kotlin.jvm.internal.g0.p(readableByteChannel, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        if (kz.c.b(buffer) == 0) {
            return 0;
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        kz.b.b(buffer, 1, new x00.l() { // from class: xy.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 d11;
                d11 = i.d(Ref.IntRef.this, readableByteChannel, (ByteBuffer) obj);
                return d11;
            }
        });
        return intRef.element;
    }

    public static final g2 d(Ref.IntRef intRef, ReadableByteChannel readableByteChannel, ByteBuffer bb2) {
        kotlin.jvm.internal.g0.p(bb2, "bb");
        intRef.element = readableByteChannel.read(bb2);
        return g2.f100423a;
    }

    @io.ktor.utils.io.b0
    public static final int e(@m80.k final WritableByteChannel writableByteChannel, @m80.k y40.b buffer) {
        kotlin.jvm.internal.g0.p(writableByteChannel, "<this>");
        kotlin.jvm.internal.g0.p(buffer, "buffer");
        final Ref.IntRef intRef = new Ref.IntRef();
        kz.b.a(buffer, new x00.l() { // from class: xy.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = i.f(Ref.IntRef.this, writableByteChannel, (ByteBuffer) obj);
                return f11;
            }
        });
        return intRef.element;
    }

    public static final g2 f(Ref.IntRef intRef, WritableByteChannel writableByteChannel, ByteBuffer bb2) {
        kotlin.jvm.internal.g0.p(bb2, "bb");
        intRef.element = writableByteChannel.write(bb2);
        return g2.f100423a;
    }
}
