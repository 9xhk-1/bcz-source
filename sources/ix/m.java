package ix;

import java.nio.charset.Charset;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m {
    @m80.l
    public static final Charset a(@m80.k o0 o0Var) {
        kotlin.jvm.internal.g0.p(o0Var, "<this>");
        String c11 = o0Var.c("charset");
        if (c11 == null) {
            return null;
        }
        try {
            return iz.a.i(u30.d.f91598a, c11);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @m80.k
    public static final k b(@m80.k k kVar, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(kVar, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        return kVar.j("charset", iz.a.l(charset));
    }

    @m80.k
    public static final k c(@m80.k k kVar, @m80.k Charset charset) {
        kotlin.jvm.internal.g0.p(kVar, "<this>");
        kotlin.jvm.internal.g0.p(charset, "charset");
        String lowerCase = kVar.f().toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        return !kotlin.jvm.internal.g0.g(lowerCase, "text") ? kVar : kVar.j("charset", iz.a.l(charset));
    }
}
