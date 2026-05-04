package ux;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.h
/* loaded from: classes8.dex */
public final class h implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final y40.x f92607a;

    public /* synthetic */ h(y40.x xVar) {
        this.f92607a = xVar;
    }

    public static String C(y40.x xVar) {
        return "Digest(state=" + xVar + ')';
    }

    public static final void H(y40.x xVar, @m80.k y40.c0 packet) {
        kotlin.jvm.internal.g0.p(packet, "packet");
        synchronized (xVar) {
            if (packet.J()) {
                return;
            }
            jz.h.j(xVar, jz.j.f(packet));
            g2 g2Var = g2.f100423a;
        }
    }

    public static final /* synthetic */ h c(y40.x xVar) {
        return new h(xVar);
    }

    public static void e(y40.x xVar) {
        xVar.close();
    }

    @m80.k
    public static y40.x f(@m80.k y40.x state) {
        kotlin.jvm.internal.g0.p(state, "state");
        return state;
    }

    @m80.k
    public static final byte[] i(y40.x xVar, @m80.k final String hashName) {
        byte[] bArr;
        kotlin.jvm.internal.g0.p(hashName, "hashName");
        synchronized (xVar) {
            bArr = (byte[]) jz.j.l(xVar, new x00.l() { // from class: ux.g
                @Override // x00.l
                public final Object invoke(Object obj) {
                    byte[] j11;
                    j11 = h.j(hashName, (y40.c0) obj);
                    return j11;
                }
            });
        }
        kotlin.jvm.internal.g0.o(bArr, "synchronized(...)");
        return bArr;
    }

    public static final byte[] j(String str, y40.c0 handshakes) {
        kotlin.jvm.internal.g0.p(handshakes, "handshakes");
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        kotlin.jvm.internal.g0.m(messageDigest);
        ByteBuffer U6 = io.ktor.network.util.a.a().U6();
        while (!handshakes.J() && jz.i.c(handshakes, U6) != -1) {
            try {
                U6.flip();
                messageDigest.update(U6);
                U6.clear();
            } catch (Throwable th2) {
                io.ktor.network.util.a.a().b4(U6);
                throw th2;
            }
        }
        byte[] digest = messageDigest.digest();
        io.ktor.network.util.a.a().b4(U6);
        return digest;
    }

    public static boolean k(y40.x xVar, Object obj) {
        return (obj instanceof h) && kotlin.jvm.internal.g0.g(xVar, ((h) obj).E());
    }

    public static final boolean q(y40.x xVar, y40.x xVar2) {
        return kotlin.jvm.internal.g0.g(xVar, xVar2);
    }

    public static int w(y40.x xVar) {
        return xVar.hashCode();
    }

    public final /* synthetic */ y40.x E() {
        return this.f92607a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e(this.f92607a);
    }

    public boolean equals(Object obj) {
        return k(this.f92607a, obj);
    }

    public int hashCode() {
        return w(this.f92607a);
    }

    @m80.k
    public final y40.x r() {
        return this.f92607a;
    }

    public String toString() {
        return C(this.f92607a);
    }
}
