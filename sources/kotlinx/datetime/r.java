package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.Instant;
import r40.t2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTimeZoneJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeZoneJvm.kt\nkotlinx/datetime/TimeZoneKt__TimeZoneJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,109:1\n1#2:110\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class r {
    @m80.k
    public static final Instant b(@m80.k LocalDate localDate, @m80.k q timeZone, @m80.k p youShallNotPass) {
        ZonedDateTime atStartOfDay;
        g0.p(localDate, "<this>");
        g0.p(timeZone, "timeZone");
        g0.p(youShallNotPass, "youShallNotPass");
        atStartOfDay = localDate.getValue$kotlinx_datetime().atStartOfDay(timeZone.c());
        java.time.Instant instant = atStartOfDay.toInstant();
        g0.o(instant, "toInstant(...)");
        return x30.g.b(instant);
    }

    public static /* synthetic */ Instant c(LocalDate localDate, q qVar, p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = p.f68525a.a();
        }
        return t2.a(localDate, qVar, pVar);
    }

    public static final boolean d(ZoneId zoneId) {
        ZoneRules rules;
        boolean isFixedOffset;
        try {
            rules = zoneId.getRules();
            isFixedOffset = rules.isFixedOffset();
            return isFixedOffset;
        } catch (ArrayIndexOutOfBoundsException unused) {
            return false;
        }
    }

    @m80.k
    public static final UtcOffset e(@m80.k q qVar, @m80.k Instant instant) {
        ZoneRules rules;
        ZoneOffset offset;
        g0.p(qVar, "<this>");
        g0.p(instant, "instant");
        rules = qVar.c().getRules();
        offset = rules.getOffset(x30.g.a(instant));
        return new UtcOffset(offset);
    }

    @m80.k
    public static final Instant f(@m80.k LocalDateTime localDateTime, @m80.k q timeZone, @m80.k p youShallNotPass) {
        ZonedDateTime atZone;
        g0.p(localDateTime, "<this>");
        g0.p(timeZone, "timeZone");
        g0.p(youShallNotPass, "youShallNotPass");
        atZone = localDateTime.getValue$kotlinx_datetime().atZone(timeZone.c());
        java.time.Instant instant = atZone.toInstant();
        g0.o(instant, "toInstant(...)");
        return x30.g.b(instant);
    }

    @m80.k
    public static final Instant g(@m80.k LocalDateTime localDateTime, @m80.k UtcOffset offset, @m80.k p youShallNotPass) {
        g0.p(localDateTime, "<this>");
        g0.p(offset, "offset");
        g0.p(youShallNotPass, "youShallNotPass");
        java.time.Instant instant = localDateTime.getValue$kotlinx_datetime().toInstant(offset.getZoneOffset$kotlinx_datetime());
        g0.o(instant, "toInstant(...)");
        return x30.g.b(instant);
    }

    public static /* synthetic */ Instant h(LocalDateTime localDateTime, q qVar, p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = p.f68525a.a();
        }
        return t2.e(localDateTime, qVar, pVar);
    }

    public static /* synthetic */ Instant i(LocalDateTime localDateTime, UtcOffset utcOffset, p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = p.f68525a.a();
        }
        return t2.f(localDateTime, utcOffset, pVar);
    }

    @m80.k
    public static final LocalDateTime j(@m80.k Instant instant, @m80.k q timeZone) {
        java.time.LocalDateTime ofInstant;
        g0.p(instant, "<this>");
        g0.p(timeZone, "timeZone");
        try {
            ofInstant = java.time.LocalDateTime.ofInstant(x30.g.a(instant), timeZone.c());
            return new LocalDateTime(ofInstant);
        } catch (DateTimeException e11) {
            throw new DateTimeArithmeticException(e11);
        }
    }

    @m80.k
    public static final LocalDateTime k(@m80.k Instant instant, @m80.k UtcOffset offset) {
        java.time.LocalDateTime ofInstant;
        g0.p(instant, "<this>");
        g0.p(offset, "offset");
        try {
            ofInstant = java.time.LocalDateTime.ofInstant(x30.g.a(instant), vx.g.a(offset.getZoneOffset$kotlinx_datetime()));
            return new LocalDateTime(ofInstant);
        } catch (DateTimeException e11) {
            throw new DateTimeArithmeticException(e11);
        }
    }
}
