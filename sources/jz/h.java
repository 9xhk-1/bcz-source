package jz;

import io.ktor.utils.io.z;
import kotlin.jvm.internal.g0;
import y40.c0;
import y40.x;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {
    @m80.k
    public static final x a() {
        return new y40.b();
    }

    public static final void c(@m80.k x xVar, @m80.k CharSequence value, int i11, int i12) {
        g0.p(xVar, "<this>");
        g0.p(value, "value");
        s.p(xVar, value, i11, i12, null, 8, null);
    }

    public static /* synthetic */ void d(x xVar, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        c(xVar, charSequence, i11, i12);
    }

    @m80.k
    public static final c0 e(@m80.k x xVar) {
        g0.p(xVar, "<this>");
        return xVar.getBuffer();
    }

    public static final int f(@m80.k x xVar) {
        g0.p(xVar, "<this>");
        return (int) xVar.getBuffer().r();
    }

    public static final void h(@m80.k x xVar, @m80.k byte[] buffer, int i11, int i12) {
        g0.p(xVar, "<this>");
        g0.p(buffer, "buffer");
        xVar.write(buffer, i11, i12 + i11);
    }

    public static /* synthetic */ void i(x xVar, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length - i11;
        }
        h(xVar, bArr, i11, i12);
    }

    public static final void j(@m80.k x xVar, @m80.k c0 packet) {
        g0.p(xVar, "<this>");
        g0.p(packet, "packet");
        xVar.T(packet);
    }

    @yz.n(message = z.f62311a, replaceWith = @w0(expression = "Sink", imports = {"kotlinx.io.Sink"}))
    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void g(x xVar) {
    }
}
