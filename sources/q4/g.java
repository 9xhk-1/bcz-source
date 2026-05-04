package q4;

import ix.l2;
import kotlin.jvm.internal.g0;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class g {
    public static final String b(String str) {
        if (f0.J2(str, "/", false, 2, null)) {
            return str;
        }
        if (!k0.n3(str, "://", false, 2, null)) {
            return '/' + str;
        }
        try {
            return l2.l(l2.f(str));
        } catch (Exception unused) {
            int I3 = k0.I3(str, '/', k0.J3(str, "://", 0, false, 6, null) + 3, false, 4, null);
            if (I3 == -1) {
                return "/";
            }
            String substring = str.substring(I3);
            g0.o(substring, "substring(...)");
            return substring;
        }
    }
}
