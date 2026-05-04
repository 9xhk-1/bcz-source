package zv;

import kotlin.jvm.internal.g0;
import zv.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class b {
    @m80.k
    public static final a a(@m80.k n.a aVar, @m80.k Iterable<? extends n> args, @m80.l String str) {
        g0.p(aVar, "<this>");
        g0.p(args, "args");
        return new a(args, str);
    }

    public static /* synthetic */ a b(n.a aVar, Iterable iterable, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return a(aVar, iterable, str);
    }
}
