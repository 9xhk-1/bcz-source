package kotlin;

import kotlin.Result;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.j2;
import yz.m;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Object f66910a;

    static {
        Result.a aVar = Result.Companion;
        f66910a = Result.m6308constructorimpl(kotlin.coroutines.intrinsics.b.l());
    }

    @y0(version = "1.7")
    @j2(markerClass = {c.class})
    public static final <T, R> R b(@k yz.k<T, R> kVar, T t11) {
        g0.p(kVar, "<this>");
        return (R) new m(kVar.a(), t11).j();
    }
}
