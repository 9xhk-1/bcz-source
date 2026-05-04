package ey;

import java.util.List;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    @m80.k
    public static final a a(@m80.l String str) {
        return d.f50228a.a(str);
    }

    @m80.l
    public static final String b(@m80.k ju.a aVar, @m80.k String path) {
        g0.p(aVar, "<this>");
        g0.p(path, "path");
        if (aVar.m(path)) {
            return aVar.getString(path);
        }
        return null;
    }

    @m80.l
    public static final List<String> c(@m80.k ju.a aVar, @m80.k String path) {
        g0.p(aVar, "<this>");
        g0.p(path, "path");
        if (aVar.m(path)) {
            return aVar.s(path);
        }
        return null;
    }
}
