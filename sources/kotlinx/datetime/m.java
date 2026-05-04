package kotlinx.datetime;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;
import kotlinx.datetime.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLocalDateRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateRange.kt\nkotlinx/datetime/LocalDateRangeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,278:1\n1#2:279\n*E\n"})
/* loaded from: classes8.dex */
public final class m {
    @m80.k
    public static final j a(@m80.k LocalDate localDate, @m80.k LocalDate that) {
        g0.p(localDate, "<this>");
        g0.p(that, "that");
        return j.f68518d.a(localDate, that, -1L, b.Companion.b());
    }

    @m80.k
    public static final LocalDate b(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.g();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @m80.l
    public static final LocalDate c(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return jVar.g();
    }

    @m80.k
    public static final LocalDate d(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        if (!jVar.isEmpty()) {
            return jVar.h();
        }
        throw new NoSuchElementException("Progression " + jVar + " is empty.");
    }

    @m80.l
    public static final LocalDate e(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        if (jVar.isEmpty()) {
            return null;
        }
        return jVar.h();
    }

    @m80.k
    public static final LocalDate f(@m80.k j jVar, @m80.k Random random) {
        g0.p(jVar, "<this>");
        g0.p(random, "random");
        if (!jVar.isEmpty()) {
            return LocalDate.Companion.c(t40.f.k(jVar.j(), random));
        }
        throw new NoSuchElementException("Cannot get random in empty range: " + jVar);
    }

    public static /* synthetic */ LocalDate g(j jVar, Random random, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            random = Random.Default;
        }
        return f(jVar, random);
    }

    @m80.l
    public static final LocalDate h(@m80.k j jVar, @m80.k Random random) {
        g0.p(jVar, "<this>");
        g0.p(random, "random");
        Long m11 = t40.f.m(jVar.j(), random);
        if (m11 != null) {
            return LocalDate.Companion.c(m11.longValue());
        }
        return null;
    }

    public static /* synthetic */ LocalDate i(j jVar, Random random, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            random = Random.Default;
        }
        return h(jVar, random);
    }

    @m80.k
    public static final j j(@m80.k j jVar) {
        g0.p(jVar, "<this>");
        return new j(g10.u.r1(jVar.j()));
    }

    @m80.k
    public static final j k(@m80.k j jVar, int i11, @m80.k b.c unit) {
        g0.p(jVar, "<this>");
        g0.p(unit, "unit");
        return l(jVar, i11, unit);
    }

    @m80.k
    public static final j l(@m80.k j jVar, long j11, @m80.k b.c unit) {
        g0.p(jVar, "<this>");
        g0.p(unit, "unit");
        return new j(g10.u.C1(jVar.j(), t40.f.o(j11, unit.p())));
    }
}
