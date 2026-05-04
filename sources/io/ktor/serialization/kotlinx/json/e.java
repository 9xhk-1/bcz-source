package io.ktor.serialization.kotlinx.json;

import io.ktor.serialization.b;
import ix.k;
import k50.a0;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final k50.a f61232a = a0.b(null, new l() { // from class: io.ktor.serialization.kotlinx.json.d
        @Override // x00.l
        public final Object invoke(Object obj) {
            g2 b11;
            b11 = e.b((k50.e) obj);
            return b11;
        }
    }, 1, null);

    public static final g2 b(k50.e Json) {
        g0.p(Json, "$this$Json");
        Json.H(true);
        Json.K(true);
        Json.A(true);
        Json.B(true);
        Json.M(false);
        Json.Q(false);
        return g2.f100423a;
    }

    @k
    public static final k50.a c() {
        return f61232a;
    }

    public static final void d(@k io.ktor.serialization.b bVar, @k k50.a json, @k ix.k contentType) {
        g0.p(bVar, "<this>");
        g0.p(json, "json");
        g0.p(contentType, "contentType");
        io.ktor.serialization.kotlinx.c.b(bVar, contentType, json);
    }

    public static /* synthetic */ void e(io.ktor.serialization.b bVar, k50.a aVar, ix.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = f61232a;
        }
        if ((i11 & 2) != 0) {
            kVar = k.a.f62847a.i();
        }
        d(bVar, aVar, kVar);
    }

    @f50.f
    public static final void f(@m80.k io.ktor.serialization.b bVar, @m80.k k50.a json, @m80.k ix.k contentType) {
        g0.p(bVar, "<this>");
        g0.p(json, "json");
        g0.p(contentType, "contentType");
        b.a.b(bVar, contentType, new a(json), null, 4, null);
    }

    public static /* synthetic */ void g(io.ktor.serialization.b bVar, k50.a aVar, ix.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = f61232a;
        }
        if ((i11 & 2) != 0) {
            kVar = k.a.f62847a.i();
        }
        f(bVar, aVar, kVar);
    }
}
