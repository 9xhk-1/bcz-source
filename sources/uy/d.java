package uy;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import uy.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDurations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Durations.kt\nio/ktor/server/websocket/DurationsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1#2:61\n*E\n"})
/* loaded from: classes8.dex */
public final class d {
    @m80.k
    public static final o a(@m80.l kotlin.time.e eVar, long j11, long j12, boolean z11) {
        return new o(eVar != null ? kotlin.time.e.x(eVar.k0()) : 0L, kotlin.time.e.x(j11), j12, z11);
    }

    @m80.l
    public static final kotlin.time.e b(@m80.k o oVar) {
        g0.p(oVar, "<this>");
        Long valueOf = Long.valueOf(oVar.x0());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        e.a aVar = kotlin.time.e.f67757b;
        return kotlin.time.e.f(kotlin.time.f.x(valueOf.longValue(), DurationUnit.MILLISECONDS));
    }

    @m80.l
    public static final kotlin.time.e c(@m80.k o.b bVar) {
        g0.p(bVar, "<this>");
        Long valueOf = Long.valueOf(bVar.f());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        e.a aVar = kotlin.time.e.f67757b;
        return kotlin.time.e.f(kotlin.time.f.x(valueOf.longValue(), DurationUnit.MILLISECONDS));
    }

    public static final long d(@m80.k o.b bVar) {
        g0.p(bVar, "<this>");
        e.a aVar = kotlin.time.e.f67757b;
        return kotlin.time.f.x(bVar.g(), DurationUnit.MILLISECONDS);
    }

    public static final long e(@m80.k o oVar) {
        g0.p(oVar, "<this>");
        e.a aVar = kotlin.time.e.f67757b;
        return kotlin.time.f.x(oVar.a0(), DurationUnit.MILLISECONDS);
    }

    public static final void f(@m80.k o.b pingPeriod, @m80.l kotlin.time.e eVar) {
        g0.p(pingPeriod, "$this$pingPeriod");
        pingPeriod.k(eVar != null ? kotlin.time.e.x(eVar.k0()) : 0L);
    }

    public static final void g(@m80.k o.b timeout, long j11) {
        g0.p(timeout, "$this$timeout");
        timeout.l(kotlin.time.e.x(j11));
    }
}
