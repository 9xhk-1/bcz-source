package y7;

import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import y7.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final long f99483a = 3000;

    /* renamed from: b, reason: collision with root package name */
    public static final long f99484b = 5000;

    /* renamed from: c, reason: collision with root package name */
    public static final long f99485c = 5000;

    public static final <T> void a(@k w7.d<T> dVar, @k l<? super d.a, g2> config) {
        g0.p(dVar, "<this>");
        g0.p(config, "config");
        d.a aVar = new d.a(0, null, null, null, 0L, 31, null);
        config.invoke(aVar);
        dVar.h(aVar);
    }

    @k
    public static final c b(@k d config) {
        g0.p(config, "config");
        d.a aVar = (d.a) config;
        if (aVar.e().length == 0) {
            throw new RuntimeException("urls should not be empty");
        }
        e eVar = new e();
        eVar.j(aVar.d());
        eVar.k(aVar.e());
        eVar.h(aVar.a());
        eVar.i(aVar.c());
        eVar.g(new b(aVar.b()));
        return eVar;
    }
}
