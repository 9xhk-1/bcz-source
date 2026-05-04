package r40;

import kotlinx.datetime.DayOfWeek;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDayOfWeek.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DayOfWeek.kt\nkotlinx/datetime/DayOfWeekKt__DayOfWeekKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class q {
    /* JADX WARN: Multi-variable type inference failed */
    @m80.k
    public static final DayOfWeek a(int i11) {
        if (1 <= i11 && i11 < 8) {
            return (DayOfWeek) DayOfWeek.getEntries().get(i11 - 1);
        }
        throw new IllegalArgumentException(("Expected ISO day-of-week number in 1..7, got " + i11).toString());
    }

    public static final int b(@m80.k DayOfWeek dayOfWeek) {
        kotlin.jvm.internal.g0.p(dayOfWeek, "<this>");
        return dayOfWeek.ordinal() + 1;
    }
}
