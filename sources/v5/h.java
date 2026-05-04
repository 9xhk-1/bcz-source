package v5;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.k0;
import u30.w0;
import yz.s1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMediaFileRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaFileRepo.kt\ncom/baicizhan/app/biz/game/repo/resource/MediaFileRepoKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n1#2:84\n*E\n"})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f93013a = "resource";

    public static final String c(String str) {
        String N5 = k0.N5(d(str), '.', "");
        if (N5.length() > 4) {
            N5 = null;
        }
        return N5 == null ? "" : N5;
    }

    public static final String d(String str) {
        return k0.Q5(k0.U5(k0.U5(str, "?", null, 2, null), "#", null, 2, null), "/", null, 2, null);
    }

    public static final String e(String str) {
        String substring = k0.m4(w0.c(s1.i(str.hashCode()), 16), 8, '0').substring(0, 2);
        g0.o(substring, "substring(...)");
        return substring;
    }
}
