package zv;

import a00.h0;
import kotlin.jvm.internal.g0;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o {
    @m80.k
    public static final f a(@m80.k yv.f fVar, int i11) {
        g0.p(fVar, "<this>");
        return g.a(n.f102916a, fVar, i11);
    }

    @m80.k
    public static final h b(@m80.k String str) {
        g0.p(str, "<this>");
        return i.a(n.f102916a, str);
    }

    @m80.k
    public static final l c(@m80.k yv.m mVar) {
        g0.p(mVar, "<this>");
        return m.a(n.f102916a, mVar);
    }

    @m80.k
    public static final n d(@m80.k Iterable<? extends n> iterable, @m80.k String separator) {
        g0.p(iterable, "<this>");
        g0.p(separator, "separator");
        return b.a(n.f102916a, iterable, separator);
    }

    public static /* synthetic */ n e(Iterable iterable, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = j2.O;
        }
        return d(iterable, str);
    }

    @m80.k
    public static final n f(@m80.k n nVar, @m80.k n other) {
        g0.p(nVar, "<this>");
        g0.p(other, "other");
        return b.b(n.f102916a, h0.Q(nVar, other), null, 2, null);
    }
}
