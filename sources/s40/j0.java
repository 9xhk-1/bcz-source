package s40;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlinx.datetime.LocalDate;
import kotlinx.datetime.LocalDateTime;
import kotlinx.datetime.LocalTime;
import kotlinx.datetime.UtcOffset;
import kotlinx.datetime.YearMonth;
import kotlinx.datetime.format.Padding;
import s40.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f87694a = yz.e0.c(new x00.a() { // from class: s40.i0
        @Override // x00.a
        public final Object invoke() {
            List c11;
            c11 = j0.c();
            return c11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87695a;

        static {
            int[] iArr = new int[Padding.values().length];
            try {
                iArr[Padding.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Padding.ZERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Padding.SPACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87695a = iArr;
        }
    }

    public static final List c() {
        l.b bVar = l.b.f87725a;
        Pair a11 = yz.h1.a("dateTimeComponents(DateTimeComponents.Formats.RFC_1123)", d(bVar.D()));
        Pair a12 = yz.h1.a("dateTimeComponents(DateTimeComponents.Formats.ISO_DATE_TIME_OFFSET)", d(bVar.C()));
        Pair a13 = yz.h1.a("date(LocalDateTime.Formats.ISO)", d(LocalDateTime.b.f68485a.a()));
        LocalDate.b bVar2 = LocalDate.b.f68483a;
        Pair a14 = yz.h1.a("date(LocalDate.Formats.ISO)", d(bVar2.a()));
        Pair a15 = yz.h1.a("date(LocalDate.Formats.ISO_BASIC)", d(bVar2.b()));
        Pair a16 = yz.h1.a("time(LocalTime.Formats.ISO)", d(LocalTime.b.f68487a.a()));
        UtcOffset.b bVar3 = UtcOffset.b.f68488a;
        return a00.h0.Q(a11, a12, a13, a14, a15, a16, yz.h1.a("offset(UtcOffset.Formats.ISO)", d(bVar3.b())), yz.h1.a("offset(UtcOffset.Formats.ISO_BASIC)", d(bVar3.c())), yz.h1.a("offset(UtcOffset.Formats.FOUR_DIGITS)", d(bVar3.a())), yz.h1.a("yearMonth(YearMonth.Formats.ISO)", d(YearMonth.b.f68489a.a())));
    }

    public static final u40.f<?> d(e0<?> e0Var) {
        kotlin.jvm.internal.g0.n(e0Var, "null cannot be cast to non-null type kotlinx.datetime.format.AbstractDateTimeFormat<*, *>");
        return ((s40.a) e0Var).e();
    }

    public static final List<Pair<String, u40.f<?>>> e() {
        return (List) f87694a.getValue();
    }

    public static final int f(@m80.k Padding padding, int i11) {
        kotlin.jvm.internal.g0.p(padding, "<this>");
        if (padding == Padding.ZERO) {
            return i11;
        }
        return 1;
    }

    @m80.l
    public static final Integer g(@m80.k Padding padding, int i11) {
        kotlin.jvm.internal.g0.p(padding, "<this>");
        if (padding == Padding.SPACE) {
            return Integer.valueOf(i11);
        }
        return null;
    }

    @m80.k
    public static final String h(@m80.k Padding padding) {
        kotlin.jvm.internal.g0.p(padding, "<this>");
        int i11 = a.f87695a[padding.ordinal()];
        if (i11 == 1) {
            return "Padding.NONE";
        }
        if (i11 == 2) {
            return "Padding.ZERO";
        }
        if (i11 == 3) {
            return "Padding.SPACE";
        }
        throw new NoWhenBranchMatchedException();
    }
}
