package ey;

import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.e0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMapApplicationConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapApplicationConfig.kt\nio/ktor/server/config/MapApplicationConfigKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1#2:149\n*E\n"})
/* loaded from: classes8.dex */
public final class j {
    public static final String c(String str, String str2) {
        if (str.length() == 0) {
            return str2;
        }
        return str + '.' + str2;
    }

    public static final void d(String str, Map<String, Integer> map) {
        int I3 = k0.I3(str, '.', 0, false, 6, null);
        while (I3 != str.length()) {
            int i11 = I3 + 1;
            int I32 = k0.I3(str, '.', i11, false, 4, null);
            if (I32 == -1) {
                I32 = str.length();
            }
            String substring = str.substring(i11, I32);
            g0.o(substring, "substring(...)");
            Integer p12 = e0.p1(substring);
            if (p12 != null) {
                int intValue = p12.intValue();
                String substring2 = str.substring(0, I3);
                g0.o(substring2, "substring(...)");
                int i12 = intValue + 1;
                Integer num = map.get(substring2);
                if (num != null) {
                    i12 = Math.max(num.intValue(), i12);
                }
                map.put(substring2, Integer.valueOf(i12));
            }
            I3 = I32;
        }
    }
}
