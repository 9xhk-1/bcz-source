package zv;

import a00.q;
import java.util.List;
import kotlin.jvm.internal.g0;
import zv.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {
    @m80.k
    public static final d a(@m80.k n.a aVar, @m80.k yv.f pluralsRes, int i11, @m80.k List<? extends Object> args) {
        g0.p(aVar, "<this>");
        g0.p(pluralsRes, "pluralsRes");
        g0.p(args, "args");
        return new d(pluralsRes, i11, args);
    }

    @m80.k
    public static final d b(@m80.k n.a aVar, @m80.k yv.f pluralsRes, int i11, @m80.k Object... args) {
        g0.p(aVar, "<this>");
        g0.p(pluralsRes, "pluralsRes");
        g0.p(args, "args");
        return new d(pluralsRes, i11, q.t(args));
    }
}
