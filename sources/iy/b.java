package iy;

import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import py.d;
import py.e;
import zx.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLogging.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Logging.kt\nio/ktor/server/logging/LoggingKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    @k
    public static final c a(@k zx.a aVar) {
        c cVar;
        g0.p(aVar, "<this>");
        Iterator<T> it = q.g(aVar).f().iterator();
        do {
            cVar = null;
            if (!it.hasNext()) {
                break;
            }
            xy.a aVar2 = (xy.a) it.next();
            xy.b g11 = q.g(aVar);
            g0.n(aVar2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            Object a11 = g11.a(aVar2);
            if (a11 instanceof c) {
                cVar = (c) a11;
            }
        } while (cVar == null);
        return cVar == null ? a.f63060a : cVar;
    }

    @k
    public static final String b(@k d dVar) {
        g0.p(dVar, "<this>");
        return e.o(dVar).l() + " - " + e.w(dVar);
    }
}
