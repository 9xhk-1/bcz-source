package kotlinx.datetime;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import kotlinx.datetime.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nYearMonthRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearMonthRange.kt\nkotlinx/datetime/YearMonthRangeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
/* loaded from: classes8.dex */
public final class y {
    @m80.k
    public static final v a(@m80.k YearMonth yearMonth, @m80.k YearMonth that) {
        g0.p(yearMonth, "<this>");
        g0.p(that, "that");
        return v.f68530d.a(yearMonth, that, -1L, b.Companion.g());
    }

    @m80.k
    public static final YearMonth b(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.g();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @m80.l
    public static final YearMonth c(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return vVar.g();
    }

    @m80.k
    public static final YearMonth d(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.h();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @m80.l
    public static final YearMonth e(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return vVar.h();
    }

    @m80.k
    public static final YearMonth f(@m80.k v vVar, @m80.k Random random) {
        g0.p(vVar, "<this>");
        g0.p(random, "random");
        if (!vVar.isEmpty()) {
            return u.b(YearMonth.Companion, t40.f.k(vVar.j(), random));
        }
        throw new NoSuchElementException("Cannot get random in empty range: " + vVar);
    }

    public static /* synthetic */ YearMonth g(v vVar, Random random, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            random = Random.Default;
        }
        return f(vVar, random);
    }

    @m80.l
    public static final YearMonth h(@m80.k v vVar, @m80.k Random random) {
        g0.p(vVar, "<this>");
        g0.p(random, "random");
        Long m11 = t40.f.m(vVar.j(), random);
        if (m11 != null) {
            return u.b(YearMonth.Companion, m11.longValue());
        }
        return null;
    }

    public static /* synthetic */ YearMonth i(v vVar, Random random, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            random = Random.Default;
        }
        return h(vVar, random);
    }

    @m80.k
    public static final v j(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        return new v(g10.u.r1(vVar.j()));
    }

    @m80.k
    public static final v k(@m80.k v vVar, int i11, @m80.k b.d unit) {
        g0.p(vVar, "<this>");
        g0.p(unit, "unit");
        return l(vVar, i11, unit);
    }

    @m80.k
    public static final v l(@m80.k v vVar, long j11, @m80.k b.d unit) {
        g0.p(vVar, "<this>");
        g0.p(unit, "unit");
        return new v(g10.u.C1(vVar.j(), t40.f.o(j11, unit.p())));
    }
}
