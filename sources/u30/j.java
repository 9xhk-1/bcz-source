package u30;

import u30.i;
import yz.g2;
import yz.j2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,845:1\n1088#2,2:846\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n843#1:846,2\n*E\n"})
/* loaded from: classes8.dex */
public final class j {
    @y0(version = "2.2")
    @o00.f
    @j2(markerClass = {kotlin.c.class})
    public static final i a(x00.l<? super i.a, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        i.a aVar = new i.a();
        builderAction.invoke(aVar);
        return aVar.a();
    }

    public static final boolean c(String str) {
        for (int i11 = 0; i11 < str.length(); i11++) {
            char charAt = str.charAt(i11);
            if (kotlin.jvm.internal.g0.t(charAt, 128) >= 0 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}
