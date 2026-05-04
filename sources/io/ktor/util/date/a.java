package io.ktor.util.date;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDateJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateJvm.kt\nio/ktor/util/date/DateJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f61995a = TimeZone.getTimeZone("GMT");

    @k
    public static final bz.b a(int i11, int i12, int i13, int i14, @k Month month, int i15) {
        g0.p(month, "month");
        Calendar calendar = Calendar.getInstance(f61995a, Locale.ROOT);
        g0.m(calendar);
        calendar.set(1, i15);
        calendar.set(2, month.ordinal());
        calendar.set(5, i14);
        calendar.set(11, i13);
        calendar.set(12, i12);
        calendar.set(13, i11);
        calendar.set(14, 0);
        return e(calendar, null);
    }

    @k
    public static final bz.b b(@l Long l11) {
        Calendar calendar = Calendar.getInstance(f61995a, Locale.ROOT);
        g0.m(calendar);
        return e(calendar, l11);
    }

    public static /* synthetic */ bz.b c(Long l11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = null;
        }
        return b(l11);
    }

    public static final long d() {
        return System.currentTimeMillis();
    }

    @k
    public static final bz.b e(@k Calendar calendar, @l Long l11) {
        g0.p(calendar, "<this>");
        if (l11 != null) {
            calendar.setTimeInMillis(l11.longValue());
        }
        return new bz.b(calendar.get(13), calendar.get(12), calendar.get(11), WeekDay.Companion.a((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), Month.Companion.a(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + calendar.get(15) + calendar.get(16));
    }

    @k
    public static final Date f(@k bz.b bVar) {
        g0.p(bVar, "<this>");
        return new Date(bVar.z());
    }
}
