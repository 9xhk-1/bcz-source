package kotlinx.datetime;

import androidx.media3.common.C;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.time.Instant;
import kotlinx.datetime.b;
import s40.c0;
import s40.e0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nInstant.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Instant.kt\nkotlinx/datetime/InstantKt__InstantKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class g {
    public static final int b(@m80.k Instant instant, @m80.k Instant other, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(other, "other");
        g0.p(timeZone, "timeZone");
        return t40.f.a(d.h(instant, other, b.Companion.b(), timeZone));
    }

    @m80.k
    public static final String c(@m80.k final Instant instant, @m80.k e0<s40.l> format, @m80.k final UtcOffset offset) {
        g0.p(instant, "<this>");
        g0.p(format, "format");
        g0.p(offset, "offset");
        return c0.b(format, new x00.l() { // from class: r40.a0
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 e11;
                e11 = kotlinx.datetime.g.e(Instant.this, offset, (s40.l) obj);
                return e11;
            }
        });
    }

    public static /* synthetic */ String d(Instant instant, e0 e0Var, UtcOffset utcOffset, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            utcOffset = UtcOffset.Companion.b();
        }
        return f.b(instant, e0Var, utcOffset);
    }

    public static final g2 e(Instant instant, UtcOffset utcOffset, s40.l format) {
        g0.p(format, "$this$format");
        format.B(instant, utcOffset);
        return g2.f100423a;
    }

    public static final long f(@m80.k Instant instant, @m80.k Instant other, @m80.k b.e unit) {
        g0.p(instant, "<this>");
        g0.p(other, "other");
        g0.p(unit, "unit");
        return f.q(other, instant, unit);
    }

    public static final long g(@m80.k Instant instant, @m80.k Instant other, @m80.k b unit, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(other, "other");
        g0.p(unit, "unit");
        g0.p(timeZone, "timeZone");
        return d.h(other, instant, unit, timeZone);
    }

    @m80.k
    public static final Instant h(@m80.k Instant instant, int i11, @m80.k b.e unit) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        return f.g(instant, i11, unit);
    }

    @m80.k
    public static final Instant i(@m80.k Instant instant, long j11, @m80.k b.e unit) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        return j11 != Long.MIN_VALUE ? d.d(instant, -j11, unit) : f.o(d.d(instant, -(j11 + 1), unit), 1, unit);
    }

    @m80.k
    public static final Instant j(@m80.k Instant instant, long j11, @m80.k b unit, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        g0.p(timeZone, "timeZone");
        return j11 != Long.MIN_VALUE ? d.e(instant, -j11, unit, timeZone) : d.c(d.e(instant, -(j11 + 1), unit, timeZone), 1, unit, timeZone);
    }

    @yz.n(message = "Use the minus overload with an explicit number of units", replaceWith = @w0(expression = "this.minus(1, unit)", imports = {}))
    @m80.k
    public static final Instant k(@m80.k Instant instant, @m80.k b.e unit) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        return d.d(instant, -1L, unit);
    }

    @yz.n(message = "Use the minus overload with an explicit number of units", replaceWith = @w0(expression = "this.minus(1, unit, timeZone)", imports = {}))
    @m80.k
    public static final Instant l(@m80.k Instant instant, @m80.k b unit, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        g0.p(timeZone, "timeZone");
        return d.c(instant, -1, unit, timeZone);
    }

    @m80.k
    public static final Instant m(@m80.k Instant instant, @m80.k r40.l period, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(period, "period");
        g0.p(timeZone, "timeZone");
        return period.i() != Long.MIN_VALUE ? d.g(instant, r40.n.d(-period.h(), -period.b(), -period.i()), timeZone) : f.o(d.g(instant, r40.n.d(-period.h(), -period.b(), -(period.i() + 1)), timeZone), 1, b.Companion.h());
    }

    @m80.k
    public static final r40.l n(@m80.k Instant instant, @m80.k Instant other, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(other, "other");
        g0.p(timeZone, "timeZone");
        return d.b(other, instant, timeZone);
    }

    public static final int o(@m80.k Instant instant, @m80.k Instant other, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(other, "other");
        g0.p(timeZone, "timeZone");
        return t40.f.a(d.h(instant, other, b.Companion.g(), timeZone));
    }

    @m80.k
    public static final Instant p(@m80.k Instant.a aVar, @m80.k CharSequence input, @m80.k e0<s40.l> format) {
        g0.p(aVar, "<this>");
        g0.p(input, "input");
        g0.p(format, "format");
        try {
            return s40.l.Y(format.d(input), null, 1, null);
        } catch (IllegalArgumentException e11) {
            throw new DateTimeFormatException("Failed to parse an instant from '" + ((Object) input) + '\'', e11);
        }
    }

    @m80.k
    public static final Instant q(@m80.k Instant instant, int i11, @m80.k b.e unit) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        return d.d(instant, i11, unit);
    }

    @yz.n(message = "Use the plus overload with an explicit number of units", replaceWith = @w0(expression = "this.plus(1, unit)", imports = {}))
    @m80.k
    public static final Instant r(@m80.k Instant instant, @m80.k b.e unit) {
        g0.p(instant, "<this>");
        g0.p(unit, "unit");
        return d.d(instant, 1L, unit);
    }

    public static final long s(@m80.k Instant instant, @m80.k Instant other, @m80.k b.e unit) {
        g0.p(instant, "<this>");
        g0.p(other, "other");
        g0.p(unit, "unit");
        try {
            return t40.f.h(other.getEpochSeconds() - instant.getEpochSeconds(), C.NANOS_PER_SECOND, other.getNanosecondsOfSecond() - instant.getNanosecondsOfSecond(), unit.q());
        } catch (ArithmeticException unused) {
            return instant.compareTo(other) < 0 ? Long.MAX_VALUE : Long.MIN_VALUE;
        }
    }

    public static final int t(@m80.k Instant instant, @m80.k Instant other, @m80.k q timeZone) {
        g0.p(instant, "<this>");
        g0.p(other, "other");
        g0.p(timeZone, "timeZone");
        return t40.f.a(d.h(instant, other, b.Companion.l(), timeZone));
    }
}
