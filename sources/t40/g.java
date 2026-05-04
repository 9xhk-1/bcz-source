package t40;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    @k
    public static final String a(char c11) {
        if (c11 == '\'') {
            return "'\\''";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\'');
        sb2.append(c11);
        sb2.append('\'');
        return sb2.toString();
    }

    @k
    public static final String b(@k String str) {
        g0.p(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append('\"');
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == '\r') {
                sb2.append("\\r");
            } else if (charAt == '\"') {
                sb2.append("\\\"");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        sb2.append("\\b");
                        break;
                    case '\t':
                        sb2.append("\\t");
                        break;
                    case '\n':
                        sb2.append("\\n");
                        break;
                    default:
                        sb2.append(charAt);
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        sb2.append('\"');
        return sb2.toString();
    }
}
