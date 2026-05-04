package s40;

import kotlinx.datetime.format.Padding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUtcOffsetFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtcOffsetFormat.kt\nkotlinx/datetime/format/UtcOffsetMinuteOfHourDirective\n+ 2 DateTimeFormat.kt\nkotlinx/datetime/format/DateTimeFormatKt\n*L\n1#1,280:1\n103#2,2:281\n*S KotlinDebug\n*F\n+ 1 UtcOffsetFormat.kt\nkotlinx/datetime/format/UtcOffsetMinuteOfHourDirective\n*L\n211#1:281,2\n*E\n"})
/* loaded from: classes8.dex */
public final class f3 extends u40.e0<h2> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Padding f87671e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87672a;

        static {
            int[] iArr = new int[Padding.values().length];
            try {
                iArr[Padding.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f87672a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(@m80.k Padding padding) {
        super(u1.f87786a.a(), padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        kotlin.jvm.internal.g0.p(padding, "padding");
        this.f87671e = padding;
    }

    @Override // u40.l
    @m80.k
    public String d() {
        if (a.f87672a[this.f87671e.ordinal()] == 1) {
            return "offsetMinutesOfHour()";
        }
        return "offsetMinutesOfHour(" + j0.h(this.f87671e) + ')';
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof f3) && this.f87671e == ((f3) obj).f87671e;
    }

    public int hashCode() {
        return this.f87671e.hashCode();
    }
}
