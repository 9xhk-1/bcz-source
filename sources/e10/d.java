package e10;

import java.util.Random;
import kotlin.jvm.internal.g0;
import m80.k;
import o00.n;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {
    @y0(version = "1.3")
    @k
    public static final Random a(@k kotlin.random.Random random) {
        Random a11;
        g0.p(random, "<this>");
        a aVar = random instanceof a ? (a) random : null;
        return (aVar == null || (a11 = aVar.a()) == null) ? new c(random) : a11;
    }

    @y0(version = "1.3")
    @k
    public static final kotlin.random.Random b(@k Random random) {
        kotlin.random.Random a11;
        g0.p(random, "<this>");
        c cVar = random instanceof c ? (c) random : null;
        return (cVar == null || (a11 = cVar.a()) == null) ? new kotlin.random.a(random) : a11;
    }

    @o00.f
    public static final kotlin.random.Random c() {
        return n.f75505a.b();
    }

    public static final double d(int i11, int i12) {
        return ((i11 << 27) + i12) / 9.007199254740992E15d;
    }
}
