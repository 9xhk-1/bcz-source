package ty;

import io.ktor.utils.io.b0;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final ZoneId f91231a;

    static {
        ZoneId of2;
        of2 = ZoneId.of("GMT");
        g0.o(of2, "of(...)");
        f91231a = of2;
    }

    @k
    public static final ZoneId a() {
        return f91231a;
    }

    @k
    public static final bz.b c(@k Instant instant) {
        ZoneOffset zoneOffset;
        ZonedDateTime atZone;
        g0.p(instant, "<this>");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        zoneOffset = ZoneOffset.UTC;
        atZone = instant.atZone(vx.g.a(zoneOffset));
        return io.ktor.util.date.a.b(Long.valueOf(timeUnit.toMillis(atZone.toEpochSecond())));
    }

    @k
    public static final bz.b d(@k ZonedDateTime zonedDateTime) {
        g0.p(zonedDateTime, "<this>");
        Instant instant = zonedDateTime.toInstant();
        g0.o(instant, "toInstant(...)");
        return c(instant);
    }

    @b0
    @k
    public static final LocalDateTime e(@k Date date) {
        Instant instant;
        ZoneId systemDefault;
        LocalDateTime ofInstant;
        g0.p(date, "<this>");
        instant = date.toInstant();
        systemDefault = ZoneId.systemDefault();
        ofInstant = LocalDateTime.ofInstant(instant, systemDefault);
        g0.o(ofInstant, "ofInstant(...)");
        return ofInstant;
    }

    @b0
    @k
    public static final ZonedDateTime f(@k Date date) {
        Instant instant;
        ZonedDateTime ofInstant;
        g0.p(date, "<this>");
        instant = date.toInstant();
        ofInstant = ZonedDateTime.ofInstant(instant, f91231a);
        g0.o(ofInstant, "ofInstant(...)");
        return ofInstant;
    }

    @b0
    public static /* synthetic */ void b() {
    }
}
