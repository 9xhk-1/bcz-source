package xv;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import xv.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nColorHEX.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorHEX.kt\ndev/icerock/moko/graphics/ColorHEXKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
/* loaded from: classes8.dex */
public final class c {
    @k
    public static final a a(@k a.C1331a c1331a, @k String colorHEX) {
        g0.p(c1331a, "<this>");
        g0.p(colorHEX, "colorHEX");
        if (colorHEX.charAt(0) == '#') {
            throw new IllegalArgumentException("Unknown color");
        }
        String substring = colorHEX.substring(1);
        g0.o(substring, "substring(...)");
        long parseLong = Long.parseLong(substring, kotlin.text.a.a(16));
        if (colorHEX.length() == 7) {
            parseLong |= 4278190080L;
        } else if (colorHEX.length() == 9) {
            throw new IllegalArgumentException("Unknown color");
        }
        return new a((int) ((parseLong >> 16) & 255), (int) ((parseLong >> 8) & 255), (int) (parseLong & 255), (int) ((parseLong >> 24) & 255));
    }
}
