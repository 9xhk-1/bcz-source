package fb0;

import kotlin.jvm.internal.g0;
import m80.k;
import u30.k0;
import u30.r0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class c {
    @k
    public static final String a(@k String str) {
        g0.p(str, "<this>");
        if (str.length() <= 1 || r0.x7(str) != '\"' || r0.W7(str) != '\"') {
            return str;
        }
        String substring = str.substring(1, k0.A3(str));
        g0.o(substring, "substring(...)");
        return substring;
    }
}
