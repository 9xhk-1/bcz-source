package ix;

import ix.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nContentDisposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDispositionKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,103:1\n1069#2,2:104\n*S KotlinDebug\n*F\n+ 1 ContentDisposition.kt\nio/ktor/http/ContentDispositionKt\n*L\n98#1:104,2\n*E\n"})
/* loaded from: classes8.dex */
public final class h {
    public static final String b(String str, String str2) {
        if (!kotlin.jvm.internal.g0.g(str, g.b.f62789c) || u30.f0.H2(str2, "utf-8''", true)) {
            return str2;
        }
        for (int i11 = 0; i11 < str2.length(); i11++) {
            if (!f.z().contains(Character.valueOf(str2.charAt(i11)))) {
                return "utf-8''" + f.C(str2, f.z());
            }
        }
        return str2;
    }
}
