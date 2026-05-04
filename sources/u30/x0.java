package u30;

import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x0 {
    @m80.k
    public static final String a(char c11) {
        String valueOf = String.valueOf(c11);
        kotlin.jvm.internal.g0.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        kotlin.jvm.internal.g0.o(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c11));
        }
        if (c11 == 329) {
            return upperCase;
        }
        char charAt = upperCase.charAt(0);
        kotlin.jvm.internal.g0.n(upperCase, "null cannot be cast to non-null type java.lang.String");
        String substring = upperCase.substring(1);
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        kotlin.jvm.internal.g0.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
        return charAt + lowerCase;
    }
}
