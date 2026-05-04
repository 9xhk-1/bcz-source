package ax;

import androidx.collection.SieveCacheKt;
import ax.c0;
import io.ktor.websocket.h0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDurations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Durations.kt\nio/ktor/client/plugins/websocket/DurationsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
/* loaded from: classes8.dex */
public final class x {
    @m80.k
    public static final c0 a(@m80.l kotlin.time.e eVar, long j11) {
        return new c0(eVar != null ? kotlin.time.e.x(eVar.k0()) : 0L, j11, new h0(), null, 8, null);
    }

    public static /* synthetic */ c0 b(kotlin.time.e eVar, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = SieveCacheKt.NodeLinkMask;
        }
        return a(eVar, j11);
    }

    @m80.l
    public static final kotlin.time.e c(@m80.k c0.a aVar) {
        g0.p(aVar, "<this>");
        Long valueOf = Long.valueOf(aVar.e());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        e.a aVar2 = kotlin.time.e.f67757b;
        return kotlin.time.e.f(kotlin.time.f.x(valueOf.longValue(), DurationUnit.MILLISECONDS));
    }

    @m80.l
    public static final kotlin.time.e d(@m80.k c0 c0Var) {
        g0.p(c0Var, "<this>");
        Long valueOf = Long.valueOf(c0Var.i());
        if (valueOf.longValue() <= 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        e.a aVar = kotlin.time.e.f67757b;
        return kotlin.time.e.f(kotlin.time.f.x(valueOf.longValue(), DurationUnit.MILLISECONDS));
    }

    public static final void e(@m80.k c0.a pingInterval, @m80.l kotlin.time.e eVar) {
        g0.p(pingInterval, "$this$pingInterval");
        pingInterval.h(eVar != null ? kotlin.time.e.x(eVar.k0()) : 0L);
    }
}
