package io.ktor.serialization.kotlinx.json;

import h10.r;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {
    @k
    public static final gz.a a(@k gz.a aVar) {
        g0.p(aVar, "<this>");
        r a11 = aVar.a();
        g0.m(a11);
        r g11 = a11.getArguments().get(0).g();
        g0.m(g11);
        h10.g m11 = g11.m();
        g0.n(m11, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
        return new gz.a((h10.d) m11, g11);
    }
}
