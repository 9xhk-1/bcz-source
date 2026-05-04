package s40;

import kotlinx.datetime.format.Padding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalDateFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDateFormat.kt\nkotlinx/datetime/format/DayOfYearDirective\n+ 2 DateTimeFormat.kt\nkotlinx/datetime/format/DateTimeFormatKt\n*L\n1#1,298:1\n103#2:299\n104#2:300\n*S KotlinDebug\n*F\n+ 1 LocalDateFormat.kt\nkotlinx/datetime/format/DayOfYearDirective\n*L\n216#1:299\n217#1:300\n*E\n"})
/* loaded from: classes8.dex */
public final class n0 extends u40.e0<j> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Padding f87737e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87738a;

        static {
            int[] iArr = new int[Padding.values().length];
            try {
                iArr[Padding.ZERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f87738a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(@m80.k Padding padding) {
        super(k.f87697a.b(), padding == Padding.ZERO ? 3 : 1, padding == Padding.SPACE ? 3 : null);
        kotlin.jvm.internal.g0.p(padding, "padding");
        this.f87737e = padding;
    }

    @Override // u40.l
    @m80.k
    public String d() {
        if (a.f87738a[this.f87737e.ordinal()] == 1) {
            return "dayOfYear()";
        }
        return "dayOfYear(" + j0.h(this.f87737e) + ')';
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof n0) && this.f87737e == ((n0) obj).f87737e;
    }

    public int hashCode() {
        return this.f87737e.hashCode();
    }
}
