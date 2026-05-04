package s00;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f {
    @y0(version = "1.8")
    @d
    @k
    public static final InputStream a(@k InputStream inputStream, @k Base64 base64) {
        g0.p(inputStream, "<this>");
        g0.p(base64, "base64");
        return new c(inputStream, base64);
    }

    @y0(version = "1.8")
    @d
    @k
    public static final OutputStream b(@k OutputStream outputStream, @k Base64 base64) {
        g0.p(outputStream, "<this>");
        g0.p(base64, "base64");
        return new kotlin.io.encoding.a(outputStream, base64);
    }
}
