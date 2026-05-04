package u30;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "CharsetsKt")
/* loaded from: classes8.dex */
public final class e {
    @o00.f
    public static final Charset a(String charsetName) {
        kotlin.jvm.internal.g0.p(charsetName, "charsetName");
        Charset forName = Charset.forName(charsetName);
        kotlin.jvm.internal.g0.o(forName, "forName(...)");
        return forName;
    }
}
