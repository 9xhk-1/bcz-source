package t40;

import kotlin.jvm.internal.g0;
import m80.k;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {
    public static final int a(char c11) {
        return c11 - '0';
    }

    public static final boolean b(char c11) {
        return '0' <= c11 && c11 < ':';
    }

    public static final boolean c(char c11) {
        if ('A' > c11 || c11 >= '[') {
            return 'a' <= c11 && c11 < '{';
        }
        return true;
    }

    public static final String d(String str, int i11) {
        if (str.length() >= i11 + 12) {
            int i12 = 0;
            if (k0.m3("+-", str.charAt(0), false, 2, null)) {
                int I3 = k0.I3(str, '-', 1, false, 4, null);
                if (I3 < 12) {
                    return str;
                }
                while (true) {
                    int i13 = i12 + 1;
                    if (str.charAt(i13) != '0') {
                        break;
                    }
                    i12 = i13;
                }
                return I3 - i12 >= 12 ? str : k0.y4(str, 1, I3 - 10).toString();
            }
        }
        return str;
    }

    @k
    public static final String e(@k String input) {
        g0.p(input, "input");
        return d(input.toString(), 6);
    }

    @k
    public static final String f(@k String input) {
        g0.p(input, "input");
        return d(input.toString(), 12);
    }

    @k
    public static final String g(@k String input) {
        g0.p(input, "input");
        return d(input.toString(), 3);
    }
}
