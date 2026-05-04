package x30;

import java.time.Duration;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import w00.j;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "DurationConversionsJDK8Kt")
@u0({"SMAP\nDurationConversions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n+ 2 Duration.kt\nkotlin/time/Duration\n*L\n1#1,33:1\n548#2:34\n*S KotlinDebug\n*F\n+ 1 DurationConversions.kt\nkotlin/time/jdk8/DurationConversionsJDK8Kt\n*L\n33#1:34\n*E\n"})
/* loaded from: classes8.dex */
public final class c {
    @y0(version = "1.6")
    @o00.f
    public static final Duration a(long j11) {
        Duration ofSeconds;
        ofSeconds = Duration.ofSeconds(kotlin.time.e.A(j11), kotlin.time.e.E(j11));
        g0.o(ofSeconds, "toComponents-impl(...)");
        return ofSeconds;
    }

    @y0(version = "1.6")
    @o00.f
    public static final long b(Duration duration) {
        long seconds;
        int nano;
        g0.p(duration, "<this>");
        seconds = duration.getSeconds();
        long x11 = kotlin.time.f.x(seconds, DurationUnit.SECONDS);
        nano = duration.getNano();
        return kotlin.time.e.T(x11, kotlin.time.f.w(nano, DurationUnit.NANOSECONDS));
    }
}
