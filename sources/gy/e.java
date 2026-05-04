package gy;

import ix.l1;
import ix.y0;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import m80.k;
import qy.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    public static final void a(@k qy.a aVar, @k l1 header) {
        g0.p(aVar, "<this>");
        g0.p(header, "header");
        q.c(aVar.a(), y0.f63006a.Y(), header.toString(), false, 4, null);
    }

    public static final void b(@k qy.a aVar, @k String uri, @k String... rel) {
        g0.p(aVar, "<this>");
        g0.p(uri, "uri");
        g0.p(rel, "rel");
        a(aVar, new l1(uri, (String[]) Arrays.copyOf(rel, rel.length)));
    }
}
