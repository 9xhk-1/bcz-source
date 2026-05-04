package io.ktor.server.routing;

import io.ktor.server.routing.i0;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j0 {
    @m80.k
    public static final i0 a(@m80.k List<String> segments, int i11, @m80.k String name, @m80.l String str, @m80.l String str2, boolean z11) {
        String d72;
        kotlin.jvm.internal.g0.p(segments, "segments");
        kotlin.jvm.internal.g0.p(name, "name");
        if (i11 >= segments.size()) {
            return c(z11, null);
        }
        String str3 = segments.get(i11);
        if (str3.length() == 0) {
            return c(z11, str3);
        }
        if (str == null) {
            d72 = str3;
        } else {
            if (!u30.f0.J2(str3, str, false, 2, null)) {
                return c(z11, str3);
            }
            d72 = u30.r0.d7(str3, str.length());
        }
        if (str2 != null) {
            if (!u30.f0.b2(d72, str2, false, 2, null)) {
                return c(z11, str3);
            }
            d72 = u30.r0.f7(d72, str2.length());
        }
        return new i0.c(((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) ? 0.8d : 0.9d, ix.t1.e(name, d72), 1);
    }

    public static /* synthetic */ i0 b(List list, int i11, String str, String str2, String str3, boolean z11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            str2 = null;
        }
        if ((i12 & 16) != 0) {
            str3 = null;
        }
        return a(list, i11, str, str2, str3, z11);
    }

    public static final i0 c(boolean z11, String str) {
        return !z11 ? i0.f61619b.f() : str == null ? i0.f61619b.g() : str.length() == 0 ? new i0.c(0.2d, null, 1, 2, null) : i0.f61619b.g();
    }
}
