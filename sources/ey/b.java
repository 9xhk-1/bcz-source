package ey;

import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    @m80.l
    public static final String a(@m80.k a aVar, @m80.k String key) {
        g0.p(aVar, "<this>");
        g0.p(key, "key");
        c d11 = aVar.d(key);
        if (d11 != null) {
            return d11.getString();
        }
        return null;
    }

    @m80.l
    public static final List<String> b(@m80.k a aVar, @m80.k String key) {
        g0.p(aVar, "<this>");
        g0.p(key, "key");
        c d11 = aVar.d(key);
        if (d11 != null) {
            return d11.a();
        }
        return null;
    }
}
