package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u f61742a = new u();

    @m80.k
    public final h0 a(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        return kotlin.jvm.internal.g0.g(value, "*") ? w.f61757a : new q(value);
    }

    @m80.k
    public final String b(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        String substring = value.substring(u30.k0.R5(value, l50.b.f69927i, "").length() + 1, (value.length() - u30.k0.N5(value, l50.b.f69928j, "").length()) - 1);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return u30.f0.b2(substring, "?", false, 2, null) ? u30.r0.f7(substring, 1) : u30.f0.b2(substring, "...", false, 2, null) ? u30.r0.f7(substring, 3) : substring;
    }

    @m80.k
    public final h0 c(@m80.k String value) {
        String substring;
        String substring2;
        kotlin.jvm.internal.g0.p(value, "value");
        int I3 = u30.k0.I3(value, l50.b.f69927i, 0, false, 6, null);
        int X3 = u30.k0.X3(value, l50.b.f69928j, 0, false, 6, null);
        if (I3 == 0) {
            substring = null;
        } else {
            substring = value.substring(0, I3);
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
        }
        if (X3 == value.length() - 1) {
            substring2 = null;
        } else {
            substring2 = value.substring(X3 + 1);
            kotlin.jvm.internal.g0.o(substring2, "substring(...)");
        }
        String substring3 = value.substring(I3 + 1, X3);
        kotlin.jvm.internal.g0.o(substring3, "substring(...)");
        if (u30.f0.b2(substring3, "?", false, 2, null)) {
            return new r(u30.r0.f7(substring3, 1), substring, substring2);
        }
        if (!u30.f0.b2(substring3, "...", false, 2, null)) {
            return new s(substring3, substring, substring2);
        }
        if (substring2 != null && substring2.length() != 0) {
            throw new IllegalArgumentException("Suffix after tailcard is not supported");
        }
        String f72 = u30.r0.f7(substring3, 3);
        if (substring == null) {
            substring = "";
        }
        return new v(f72, substring);
    }
}
