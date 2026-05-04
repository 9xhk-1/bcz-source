package s00;

import java.nio.charset.Charset;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.g0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @y0(version = "1.8")
    @o00.f
    public static final byte[] a(Base64 base64, CharSequence source, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        if (!(source instanceof String)) {
            return base64.f(source, i11, i12);
        }
        String str = (String) source;
        base64.i(str.length(), i11, i12);
        String substring = str.substring(i11, i12);
        g0.o(substring, "substring(...)");
        Charset charset = u30.d.f91604g;
        g0.n(substring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = substring.getBytes(charset);
        g0.o(bytes, "getBytes(...)");
        return bytes;
    }

    @y0(version = "1.8")
    @o00.f
    public static final int b(Base64 base64, byte[] source, byte[] destination, int i11, int i12, int i13) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        g0.p(destination, "destination");
        return base64.x(source, destination, i11, i12, i13);
    }

    @y0(version = "1.8")
    @o00.f
    public static final byte[] c(Base64 base64, byte[] source, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        return base64.D(source, i11, i12);
    }

    @y0(version = "1.8")
    @o00.f
    public static final String d(Base64 base64, byte[] source, int i11, int i12) {
        g0.p(base64, "<this>");
        g0.p(source, "source");
        return new String(base64.D(source, i11, i12), u30.d.f91604g);
    }
}
