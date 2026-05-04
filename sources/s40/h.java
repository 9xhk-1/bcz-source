package s40;

import kotlinx.datetime.format.Padding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalTimeFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalTimeFormat.kt\nkotlinx/datetime/format/AmPmHourDirective\n+ 2 DateTimeFormat.kt\nkotlinx/datetime/format/DateTimeFormatKt\n*L\n1#1,301:1\n103#2:302\n104#2:303\n*S KotlinDebug\n*F\n+ 1 LocalTimeFormat.kt\nkotlinx/datetime/format/AmPmHourDirective\n*L\n149#1:302\n150#1:303\n*E\n"})
/* loaded from: classes8.dex */
public final class h extends u40.e0<y1> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Padding f87677e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87678a;

        static {
            int[] iArr = new int[Padding.values().length];
            try {
                iArr[Padding.ZERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f87678a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(@m80.k Padding padding) {
        super(z1.f87806a.d(), padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        kotlin.jvm.internal.g0.p(padding, "padding");
        this.f87677e = padding;
    }

    @Override // u40.l
    @m80.k
    public String d() {
        if (a.f87678a[this.f87677e.ordinal()] == 1) {
            return "amPmHour()";
        }
        return "amPmHour(" + j0.h(this.f87677e) + ')';
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof h) && this.f87677e == ((h) obj).f87677e;
    }

    public int hashCode() {
        return this.f87677e.hashCode();
    }
}
