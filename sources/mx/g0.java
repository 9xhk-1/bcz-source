package mx;

import java.util.List;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\nio/ktor/http/content/VersionsKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,261:1\n18#2:262\n58#3,16:263\n*S KotlinDebug\n*F\n+ 1 Versions.kt\nio/ktor/http/content/VersionsKt\n*L\n14#1:262\n14#1:263,16\n*E\n"})
/* loaded from: classes8.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<List<e0>> f73789a;

    static {
        h10.r rVar;
        h10.d d11 = o0.d(List.class);
        try {
            rVar = o0.C(List.class, h10.t.f57954c.e(o0.B(e0.class)));
        } catch (Throwable unused) {
            rVar = null;
        }
        f73789a = new xy.a<>("VersionList", new gz.a(d11, rVar));
    }

    @m80.k
    public static final p a(@m80.k String spec) {
        kotlin.jvm.internal.g0.p(spec, "spec");
        return p.f73815d.c(spec);
    }

    @m80.k
    public static final xy.a<List<e0>> b() {
        return f73789a;
    }

    @m80.k
    public static final List<e0> c(@m80.k v vVar) {
        kotlin.jvm.internal.g0.p(vVar, "<this>");
        List<e0> list = (List) vVar.e(f73789a);
        return list == null ? a00.h0.J() : list;
    }

    public static final void d(@m80.k v vVar, @m80.k List<? extends e0> value) {
        kotlin.jvm.internal.g0.p(vVar, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        vVar.i(f73789a, value);
    }
}
