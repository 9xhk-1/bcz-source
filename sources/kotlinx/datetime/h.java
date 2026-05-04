package kotlinx.datetime;

import java.time.DateTimeException;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import kotlin.DeprecationLevel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.datetime.b;
import ku.f1;
import ku.g1;
import yz.v0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "LocalDateJvmKt")
@u0({"SMAP\nLocalDate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDate.kt\nkotlinx/datetime/LocalDateJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final long f68510a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f68511b;

    static {
        java.time.LocalDate localDate;
        long epochDay;
        java.time.LocalDate localDate2;
        long epochDay2;
        localDate = java.time.LocalDate.MIN;
        epochDay = localDate.toEpochDay();
        f68510a = epochDay;
        localDate2 = java.time.LocalDate.MAX;
        epochDay2 = localDate2.toEpochDay();
        f68511b = epochDay2;
    }

    @o00.i
    @yz.n(level = DeprecationLevel.WARNING, message = "Use the constructor that accepts a 'day'", replaceWith = @w0(expression = "LocalDate(year = year, month = month.toKotlinMonth(), day = dayOfMonth)", imports = {}))
    @m80.k
    public static final LocalDate a(int i11, @m80.k java.time.Month month, int i12) {
        g0.p(month, "month");
        return new LocalDate(i11, a.q(month), i12);
    }

    public static final int b(@m80.k LocalDate localDate, @m80.k LocalDate other) {
        ChronoUnit chronoUnit;
        long until;
        g0.p(localDate, "<this>");
        g0.p(other, "other");
        java.time.LocalDate value$kotlinx_datetime = localDate.getValue$kotlinx_datetime();
        Temporal a11 = qy.j.a(other.getValue$kotlinx_datetime());
        chronoUnit = ChronoUnit.DAYS;
        until = value$kotlinx_datetime.until(a11, r40.y.a(chronoUnit));
        return t40.f.a(until);
    }

    @o00.i
    @v0
    @m80.k
    public static final LocalDate c(@m80.k LocalDate localDate, int i11, @m80.k b.AbstractC0827b unit) {
        g0.p(localDate, "<this>");
        g0.p(unit, "unit");
        return h(localDate, -i11, unit);
    }

    public static final int d(@m80.k LocalDate localDate, @m80.k LocalDate other) {
        ChronoUnit chronoUnit;
        long until;
        g0.p(localDate, "<this>");
        g0.p(other, "other");
        java.time.LocalDate value$kotlinx_datetime = localDate.getValue$kotlinx_datetime();
        Temporal a11 = qy.j.a(other.getValue$kotlinx_datetime());
        chronoUnit = ChronoUnit.MONTHS;
        until = value$kotlinx_datetime.until(a11, r40.y.a(chronoUnit));
        return t40.f.a(until);
    }

    public static final java.time.LocalDate e(long j11) {
        java.time.LocalDate ofEpochDay;
        long j12 = f68510a;
        if (j11 <= f68511b && j12 <= j11) {
            ofEpochDay = java.time.LocalDate.ofEpochDay(j11);
            g0.o(ofEpochDay, "ofEpochDay(...)");
            return ofEpochDay;
        }
        g1.a();
        throw f1.a("The resulting day " + j11 + " is out of supported LocalDate range.");
    }

    @m80.k
    public static final r40.k f(@m80.k LocalDate localDate, @m80.k LocalDate other) {
        ChronoUnit chronoUnit;
        long until;
        java.time.LocalDate plusMonths;
        ChronoUnit chronoUnit2;
        long until2;
        g0.p(localDate, "<this>");
        g0.p(other, "other");
        java.time.LocalDate value$kotlinx_datetime = localDate.getValue$kotlinx_datetime();
        java.time.LocalDate value$kotlinx_datetime2 = other.getValue$kotlinx_datetime();
        Temporal a11 = qy.j.a(value$kotlinx_datetime2);
        chronoUnit = ChronoUnit.MONTHS;
        until = value$kotlinx_datetime.until(a11, r40.y.a(chronoUnit));
        plusMonths = value$kotlinx_datetime.plusMonths(until);
        g0.o(plusMonths, "plusMonths(...)");
        Temporal a12 = qy.j.a(value$kotlinx_datetime2);
        chronoUnit2 = ChronoUnit.DAYS;
        until2 = plusMonths.until(a12, r40.y.a(chronoUnit2));
        return new r40.k(until, (int) until2);
    }

    @o00.i
    @v0
    @m80.k
    public static final LocalDate g(@m80.k LocalDate localDate, int i11, @m80.k b.AbstractC0827b unit) {
        g0.p(localDate, "<this>");
        g0.p(unit, "unit");
        return h(localDate, i11, unit);
    }

    @m80.k
    public static final LocalDate h(@m80.k LocalDate localDate, long j11, @m80.k b.AbstractC0827b unit) {
        java.time.LocalDate plusMonths;
        long epochDay;
        g0.p(localDate, "<this>");
        g0.p(unit, "unit");
        try {
            if (unit instanceof b.c) {
                long d11 = t40.e.d(j11, ((b.c) unit).p());
                epochDay = localDate.getValue$kotlinx_datetime().toEpochDay();
                plusMonths = e(t40.e.b(epochDay, d11));
            } else {
                if (!(unit instanceof b.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                plusMonths = localDate.getValue$kotlinx_datetime().plusMonths(t40.e.d(j11, ((b.d) unit).p()));
            }
            return new LocalDate(plusMonths);
        } catch (Exception e11) {
            if (!r40.w.a(e11) && !(e11 instanceof ArithmeticException)) {
                throw e11;
            }
            throw new DateTimeArithmeticException("The result of adding " + j11 + " of " + unit + " to " + localDate + " is out of LocalDate range.", e11);
        }
    }

    @yz.n(message = "Use the plus overload with an explicit number of units", replaceWith = @w0(expression = "this.plus(1, unit)", imports = {}))
    @m80.k
    public static final LocalDate i(@m80.k LocalDate localDate, @m80.k b.AbstractC0827b unit) {
        g0.p(localDate, "<this>");
        g0.p(unit, "unit");
        return h(localDate, 1L, unit);
    }

    @m80.k
    public static final LocalDate j(@m80.k LocalDate localDate, @m80.k r40.k period) {
        g0.p(localDate, "<this>");
        g0.p(period, "period");
        try {
            java.time.LocalDate value$kotlinx_datetime = localDate.getValue$kotlinx_datetime();
            if (period.h() != 0) {
                value$kotlinx_datetime = value$kotlinx_datetime.plusMonths(period.h());
            }
            if (period.b() != 0) {
                value$kotlinx_datetime = value$kotlinx_datetime.plusDays(period.b());
            }
            return new LocalDate(value$kotlinx_datetime);
        } catch (DateTimeException unused) {
            throw new DateTimeArithmeticException("The result of adding " + localDate.getValue$kotlinx_datetime() + " to " + localDate + " is out of LocalDate range.");
        }
    }

    @w00.j(name = "until")
    @v0
    public static final int k(@m80.k LocalDate localDate, @m80.k LocalDate other, @m80.k b.AbstractC0827b unit) {
        g0.p(localDate, "<this>");
        g0.p(other, "other");
        g0.p(unit, "unit");
        return t40.f.a(l(localDate, other, unit));
    }

    public static final long l(@m80.k LocalDate localDate, @m80.k LocalDate other, @m80.k b.AbstractC0827b unit) {
        ChronoUnit chronoUnit;
        long until;
        ChronoUnit chronoUnit2;
        long until2;
        g0.p(localDate, "<this>");
        g0.p(other, "other");
        g0.p(unit, "unit");
        if (unit instanceof b.d) {
            java.time.LocalDate value$kotlinx_datetime = localDate.getValue$kotlinx_datetime();
            Temporal a11 = qy.j.a(other.getValue$kotlinx_datetime());
            chronoUnit2 = ChronoUnit.MONTHS;
            until2 = value$kotlinx_datetime.until(a11, r40.y.a(chronoUnit2));
            return until2 / ((b.d) unit).p();
        }
        if (!(unit instanceof b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        java.time.LocalDate value$kotlinx_datetime2 = localDate.getValue$kotlinx_datetime();
        Temporal a12 = qy.j.a(other.getValue$kotlinx_datetime());
        chronoUnit = ChronoUnit.DAYS;
        until = value$kotlinx_datetime2.until(a12, r40.y.a(chronoUnit));
        return until / ((b.c) unit).p();
    }

    public static final int m(@m80.k LocalDate localDate, @m80.k LocalDate other) {
        ChronoUnit chronoUnit;
        long until;
        g0.p(localDate, "<this>");
        g0.p(other, "other");
        java.time.LocalDate value$kotlinx_datetime = localDate.getValue$kotlinx_datetime();
        Temporal a11 = qy.j.a(other.getValue$kotlinx_datetime());
        chronoUnit = ChronoUnit.YEARS;
        until = value$kotlinx_datetime.until(a11, r40.y.a(chronoUnit));
        return (int) until;
    }
}
