package z40;

import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @s00.d
    @k
    public static final byte[] a(@k Base64 base64, @k c source, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        return base64.k(source.f(), i11, i12);
    }

    public static /* synthetic */ byte[] b(Base64 base64, c cVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = cVar.g();
        }
        return a(base64, cVar, i11, i12);
    }

    @s00.d
    public static final int c(@k Base64 base64, @k c source, @k byte[] destination, int i11, int i12, int i13) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        g0.p(destination, "destination");
        return base64.p(source.f(), destination, i11, i12, i13);
    }

    public static /* synthetic */ int d(Base64 base64, c cVar, byte[] bArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        if ((i14 & 16) != 0) {
            i13 = cVar.g();
        }
        return c(base64, cVar, bArr, i11, i12, i13);
    }

    @s00.d
    @k
    public static final c e(@k Base64 base64, @k CharSequence source, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        return c.f100824c.b(base64.j(source, i11, i12));
    }

    @s00.d
    @k
    public static final c f(@k Base64 base64, @k c source, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        return c.f100824c.b(base64.k(source.f(), i11, i12));
    }

    @s00.d
    @k
    public static final c g(@k Base64 base64, @k byte[] source, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        return c.f100824c.b(base64.k(source, i11, i12));
    }

    public static /* synthetic */ c h(Base64 base64, CharSequence charSequence, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = charSequence.length();
        }
        return e(base64, charSequence, i11, i12);
    }

    public static /* synthetic */ c i(Base64 base64, c cVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = cVar.g();
        }
        return f(base64, cVar, i11, i12);
    }

    public static /* synthetic */ c j(Base64 base64, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = bArr.length;
        }
        return g(base64, bArr, i11, i12);
    }

    @s00.d
    @k
    public static final String k(@k Base64 base64, @k c source, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        return base64.t(source.f(), i11, i12);
    }

    public static /* synthetic */ String l(Base64 base64, c cVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = cVar.g();
        }
        return k(base64, cVar, i11, i12);
    }

    @s00.d
    public static final int m(@k Base64 base64, @k c source, @k byte[] destination, int i11, int i12, int i13) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        g0.p(destination, "destination");
        return base64.v(source.f(), destination, i11, i12, i13);
    }

    public static /* synthetic */ int n(Base64 base64, c cVar, byte[] bArr, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i11 = 0;
        }
        if ((i14 & 8) != 0) {
            i12 = 0;
        }
        if ((i14 & 16) != 0) {
            i13 = cVar.g();
        }
        return m(base64, cVar, bArr, i11, i12, i13);
    }

    @s00.d
    @k
    public static final <A extends Appendable> A o(@k Base64 base64, @k c source, @k A destination, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        g0.p(destination, "destination");
        return (A) base64.z(source.f(), destination, i11, i12);
    }

    public static /* synthetic */ Appendable p(Base64 base64, c cVar, Appendable appendable, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = cVar.g();
        }
        return o(base64, cVar, appendable, i11, i12);
    }

    @s00.d
    @k
    public static final byte[] q(@k Base64 base64, @k c source, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        return base64.B(source.f(), i11, i12);
    }

    public static /* synthetic */ byte[] r(Base64 base64, c cVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if ((i13 & 4) != 0) {
            i12 = cVar.g();
        }
        return q(base64, cVar, i11, i12);
    }
}
