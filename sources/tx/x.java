package tx;

import java.nio.ByteBuffer;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x00.l<Throwable, g2> f91215a = new x00.l() { // from class: tx.v
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 c11;
            c11 = x.c((Throwable) obj);
            return c11;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final x00.l<Throwable, g2> f91216b = new x00.l() { // from class: tx.w
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 d11;
            d11 = x.d((Throwable) obj);
            return d11;
        }
    };

    public static final g2 c(Throwable th2) {
        return g2.f100423a;
    }

    public static final g2 d(Throwable th2) {
        return g2.f100423a;
    }

    public static final void i(x00.l<? super Throwable, g2> lVar) {
        String str;
        if (lVar == f91216b) {
            str = "Another handler was already registered and successfully invoked";
        } else {
            str = "Another handler was already registered: " + lVar;
        }
        throw new IllegalStateException(str);
    }

    public static final void j(y40.c0 c0Var, ByteBuffer byteBuffer) {
        jz.i.d(c0Var, byteBuffer);
        byteBuffer.flip();
    }
}
