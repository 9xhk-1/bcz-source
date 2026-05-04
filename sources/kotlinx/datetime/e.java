package kotlinx.datetime;

import androidx.media3.common.C;
import java.time.DateTimeException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.DurationUnit;
import kotlin.time.Instant;
import kotlin.time.e;
import kotlinx.datetime.b;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlinx/datetime/InstantJvmKt__InstantKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,100:1\n1#2:101\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class e {
    public static final ZonedDateTime a(Instant instant, q qVar) {
        ZonedDateTime atZone;
        try {
            atZone = x30.g.a(instant).atZone(qVar.c());
            g0.m(atZone);
            return atZone;
        } catch (DateTimeException e11) {
            throw new DateTimeArithmeticException(e11);
        }
    }

    @m80.k
    public static final Instant b(@m80.k Instant instant, int i11, @m80.k b unit, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        g0.p(timeZone, "timeZone");
        return d.e(instant, -i11, unit, timeZone);
    }

    @m80.k
    public static final r40.l c(@m80.k Instant instant, @m80.k Instant other, @m80.k q timeZone) {
        ChronoUnit chronoUnit;
        long until;
        ZonedDateTime plusMonths;
        ChronoUnit chronoUnit2;
        long until2;
        ZonedDateTime plusDays;
        ChronoUnit chronoUnit3;
        long until3;
        g0.p(instant, "<this>");
        g0.p(other, "other");
        g0.p(timeZone, "timeZone");
        ZonedDateTime a11 = a(instant, timeZone);
        ZonedDateTime a12 = a(other, timeZone);
        Temporal a13 = qy.j.a(a12);
        chronoUnit = ChronoUnit.MONTHS;
        until = a11.until(a13, r40.y.a(chronoUnit));
        plusMonths = a11.plusMonths(until);
        g0.o(plusMonths, "plusMonths(...)");
        Temporal a14 = qy.j.a(a12);
        chronoUnit2 = ChronoUnit.DAYS;
        until2 = plusMonths.until(a14, r40.y.a(chronoUnit2));
        plusDays = plusMonths.plusDays(until2);
        g0.o(plusDays, "plusDays(...)");
        Temporal a15 = qy.j.a(a12);
        chronoUnit3 = ChronoUnit.NANOS;
        until3 = plusDays.until(a15, r40.y.a(chronoUnit3));
        return r40.n.d(until, (int) until2, until3);
    }

    @m80.k
    public static final Instant d(@m80.k Instant instant, int i11, @m80.k b unit, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        g0.p(timeZone, "timeZone");
        return d.e(instant, i11, unit, timeZone);
    }

    @m80.k
    public static final Instant e(@m80.k Instant instant, long j11, @m80.k b.e unit) {
        long j12;
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        try {
            j12 = j11;
        } catch (Exception e11) {
            e = e11;
            j12 = j11;
        }
        try {
            t40.d j13 = t40.f.j(j12, unit.q(), C.NANOS_PER_SECOND);
            long a11 = j13.a();
            long b11 = j13.b();
            e.a aVar = kotlin.time.e.f67757b;
            return instant.m6321plusLRDsOJo(kotlin.time.f.x(a11, DurationUnit.SECONDS)).m6321plusLRDsOJo(kotlin.time.f.x(b11, DurationUnit.NANOSECONDS));
        } catch (Exception e12) {
            e = e12;
            Exception exc = e;
            if (r40.w.a(exc) || (exc instanceof ArithmeticException)) {
                return Instant.a.d(Instant.Companion, j12 > 0 ? Long.MAX_VALUE : Long.MIN_VALUE, 0L, 2, null);
            }
            throw exc;
        }
    }

    @m80.k
    public static final Instant f(@m80.k Instant instant, long j11, @m80.k b unit, @m80.k q timeZone) {
        ZonedDateTime plusMonths;
        java.time.Instant instant2;
        ZonedDateTime plusDays;
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        g0.p(timeZone, "timeZone");
        try {
            ZonedDateTime a11 = a(instant, timeZone);
            if (unit instanceof b.e) {
                instant2 = x30.g.a(d.d(instant, j11, (b.e) unit));
                instant2.atZone(timeZone.c());
            } else if (unit instanceof b.c) {
                plusDays = a11.plusDays(t40.e.d(j11, ((b.c) unit).p()));
                instant2 = plusDays.toInstant();
            } else {
                if (!(unit instanceof b.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                plusMonths = a11.plusMonths(t40.e.d(j11, ((b.d) unit).p()));
                instant2 = plusMonths.toInstant();
            }
            g0.m(instant2);
            return x30.g.b(instant2);
        } catch (Exception e11) {
            if (!r40.w.a(e11) && !(e11 instanceof ArithmeticException)) {
                throw e11;
            }
            throw new DateTimeArithmeticException("Instant " + instant + " cannot be represented as local date when adding " + j11 + ' ' + unit + " to it", e11);
        }
    }

    @yz.n(message = "Use the plus overload with an explicit number of units", replaceWith = @w0(expression = "this.plus(1, unit, timeZone)", imports = {}))
    @m80.k
    public static final Instant g(@m80.k Instant instant, @m80.k b unit, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        g0.p(timeZone, "timeZone");
        return d.e(instant, 1L, unit, timeZone);
    }

    @m80.k
    public static final Instant h(@m80.k Instant instant, @m80.k r40.l period, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(period, "period");
        g0.p(timeZone, "timeZone");
        try {
            ZonedDateTime a11 = a(instant, timeZone);
            if (period.h() != 0) {
                a11 = a11.plusMonths(period.h());
            }
            if (period.b() != 0) {
                a11 = a11.plusDays(period.b());
            }
            if (period.i() != 0) {
                a11 = a11.plusNanos(period.i());
            }
            java.time.Instant instant2 = a11.toInstant();
            g0.o(instant2, "toInstant(...)");
            return x30.g.b(instant2);
        } catch (DateTimeException e11) {
            throw new DateTimeArithmeticException(e11);
        }
    }

    public static final long i(@m80.k Instant instant, @m80.k Instant other, @m80.k b unit, @m80.k q timeZone) {
        ChronoUnit chronoUnit;
        long until;
        ChronoUnit chronoUnit2;
        long until2;
        g0.p(instant, "<this>");
        g0.p(other, "other");
        g0.p(unit, "unit");
        g0.p(timeZone, "timeZone");
        try {
            ZonedDateTime a11 = a(instant, timeZone);
            ZonedDateTime a12 = a(other, timeZone);
            if (unit instanceof b.e) {
                return f.q(instant, other, (b.e) unit);
            }
            if (unit instanceof b.c) {
                Temporal a13 = qy.j.a(a12);
                chronoUnit2 = ChronoUnit.DAYS;
                until2 = a11.until(a13, r40.y.a(chronoUnit2));
                return until2 / ((b.c) unit).p();
            }
            if (!(unit instanceof b.d)) {
                throw new NoWhenBranchMatchedException();
            }
            Temporal a14 = qy.j.a(a12);
            chronoUnit = ChronoUnit.MONTHS;
            until = a11.until(a14, r40.y.a(chronoUnit));
            return until / ((b.d) unit).p();
        } catch (ArithmeticException unused) {
            return instant.compareTo(other) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
        } catch (DateTimeException e11) {
            throw new DateTimeArithmeticException(e11);
        }
    }
}
