package t50;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.jvm.internal.g0;
import okio.ByteString;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final j f89618a = new j();

    @w00.k
    @w00.o
    @m80.k
    public static final String a(@m80.k String username, @m80.k String password) {
        g0.p(username, "username");
        g0.p(password, "password");
        return c(username, password, null, 4, null);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final String b(@m80.k String username, @m80.k String password, @m80.k Charset charset) {
        g0.p(username, "username");
        g0.p(password, "password");
        g0.p(charset, "charset");
        return "Basic " + ByteString.Companion.j(username + ':' + password, charset).base64();
    }

    public static /* synthetic */ String c(String str, String str2, Charset ISO_8859_1, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            ISO_8859_1 = StandardCharsets.ISO_8859_1;
            g0.o(ISO_8859_1, "ISO_8859_1");
        }
        return b(str, str2, ISO_8859_1);
    }
}
