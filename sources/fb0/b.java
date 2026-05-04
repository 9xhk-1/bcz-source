package fb0;

import h10.d;
import java.util.Map;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final Map<d<?>, String> f51503a = jb0.c.f64013a.h();

    @k
    public static final String a(@k d<?> dVar) {
        g0.p(dVar, "<this>");
        String str = f51503a.get(dVar);
        return str == null ? b(dVar) : str;
    }

    @k
    public static final String b(@k d<?> dVar) {
        g0.p(dVar, "<this>");
        String f11 = jb0.c.f64013a.f(dVar);
        f51503a.put(dVar, f11);
        return f11;
    }
}
