package my;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKotlinTimeJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTimeJvm.kt\nio/ktor/server/plugins/cors/KotlinTimeJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
/* loaded from: classes8.dex */
public final class g {
    public static final long a(@k c cVar) {
        g0.p(cVar, "<this>");
        e.a aVar = kotlin.time.e.f67757b;
        return kotlin.time.f.x(cVar.C(), DurationUnit.SECONDS);
    }

    public static final void b(@k c maxAgeDuration, long j11) {
        g0.p(maxAgeDuration, "$this$maxAgeDuration");
        if (kotlin.time.e.P(j11)) {
            throw new IllegalArgumentException("Only non-negative durations can be specified");
        }
        maxAgeDuration.I(c10.d.M0(kotlin.time.e.a0(j11, DurationUnit.SECONDS)));
    }
}
