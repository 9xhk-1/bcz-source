package ow;

import a00.v1;
import h10.t;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import rw.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpClientEngineCapability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngineCapability.kt\nio/ktor/client/engine/HttpClientEngineCapabilityKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,26:1\n18#2:27\n58#3,16:28\n*S KotlinDebug\n*F\n+ 1 HttpClientEngineCapability.kt\nio/ktor/client/engine/HttpClientEngineCapabilityKt\n*L\n14#1:27\n14#1:28,16\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<Map<h<?>, Object>> f78447a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Set<h<?>> f78448b;

    static {
        h10.r rVar;
        h10.d d11 = o0.d(Map.class);
        try {
            t.a aVar = h10.t.f57954c;
            rVar = o0.i(o0.D(Map.class, aVar.e(o0.C(h.class, aVar.c())), aVar.e(o0.B(Object.class))));
        } catch (Throwable unused) {
            rVar = null;
        }
        f78447a = new xy.a<>("EngineCapabilities", new gz.a(d11, rVar));
        f78448b = v1.f(c1.f84603a);
    }

    @m80.k
    public static final Set<h<?>> a() {
        return f78448b;
    }

    @m80.k
    public static final xy.a<Map<h<?>, Object>> b() {
        return f78447a;
    }
}
