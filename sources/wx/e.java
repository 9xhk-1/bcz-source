package wx;

import java.nio.ByteBuffer;
import javax.crypto.Cipher;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import y40.c0;
import y40.x;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCipherUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherUtils.kt\nio/ktor/network/tls/cipher/CipherUtilsKt\n+ 2 Builder.kt\nio/ktor/utils/io/core/BuilderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n15#2,2:77\n17#2:80\n1#3:79\n*S KotlinDebug\n*F\n+ 1 CipherUtils.kt\nio/ktor/network/tls/cipher/CipherUtilsKt\n*L\n22#1:77,2\n22#1:80\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final pz.h<ByteBuffer> f96955a = new pz.b(128, 65536);

    @k
    public static final c0 b(@k c0 c0Var, @k Cipher cipher, @k l<? super x, g2> header) {
        g0.p(c0Var, "<this>");
        g0.p(cipher, "cipher");
        g0.p(header, "header");
        ByteBuffer U6 = io.ktor.network.util.a.a().U6();
        ByteBuffer U62 = f96955a.U6();
        boolean z11 = true;
        try {
            y40.b bVar = new y40.b();
            U6.clear();
            header.invoke(bVar);
            while (true) {
                int c11 = U6.hasRemaining() ? jz.i.c(c0Var, U6) : 0;
                U6.flip();
                if (U6.hasRemaining() || (c11 != -1 && !c0Var.J())) {
                    U62.clear();
                    if (cipher.getOutputSize(U6.remaining()) > U62.remaining()) {
                        if (z11) {
                            f96955a.b4(U62);
                        }
                        U62 = ByteBuffer.allocate(cipher.getOutputSize(U6.remaining()));
                        z11 = false;
                    }
                    cipher.update(U6, U62);
                    U62.flip();
                    jz.g.a(bVar, U62);
                    U6.compact();
                }
            }
            U6.hasRemaining();
            U62.hasRemaining();
            int outputSize = cipher.getOutputSize(0);
            if (outputSize != 0) {
                if (outputSize > U62.capacity()) {
                    byte[] doFinal = cipher.doFinal();
                    g0.o(doFinal, "doFinal(...)");
                    jz.h.i(bVar, doFinal, 0, 0, 6, null);
                } else {
                    U62.clear();
                    cipher.doFinal(c.a(), U62);
                    U62.flip();
                    if (U62.hasRemaining()) {
                        jz.g.a(bVar, U62);
                    } else {
                        byte[] doFinal2 = cipher.doFinal();
                        g0.o(doFinal2, "doFinal(...)");
                        jz.h.i(bVar, doFinal2, 0, 0, 6, null);
                    }
                }
            }
            io.ktor.network.util.a.a().b4(U6);
            if (z11) {
                f96955a.b4(U62);
            }
            return bVar;
        } finally {
        }
    }

    public static /* synthetic */ c0 c(c0 c0Var, Cipher cipher, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new l() { // from class: wx.d
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 d11;
                    d11 = e.d((x) obj2);
                    return d11;
                }
            };
        }
        return b(c0Var, cipher, lVar);
    }

    public static final g2 d(x xVar) {
        g0.p(xVar, "<this>");
        return g2.f100423a;
    }

    @k
    public static final pz.h<ByteBuffer> e() {
        return f96955a;
    }
}
