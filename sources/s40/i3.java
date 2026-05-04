package s40;

import kotlinx.datetime.format.Padding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nYearMonthFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YearMonthFormat.kt\nkotlinx/datetime/format/YearDirective\n+ 2 DateTimeFormat.kt\nkotlinx/datetime/format/DateTimeFormatKt\n*L\n1#1,301:1\n103#2:302\n104#2:303\n*S KotlinDebug\n*F\n+ 1 YearMonthFormat.kt\nkotlinx/datetime/format/YearDirective\n*L\n145#1:302\n147#1:303\n*E\n"})
/* loaded from: classes8.dex */
public final class i3 extends u40.b0<j3> {

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Padding f87691f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f87692g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87693a;

        static {
            int[] iArr = new int[Padding.values().length];
            try {
                iArr[Padding.ZERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f87693a = iArr;
        }
    }

    public /* synthetic */ i3(Padding padding, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(padding, (i11 & 2) != 0 ? false : z11);
    }

    @Override // u40.l
    @m80.k
    public String d() {
        String str;
        if (a.f87693a[this.f87691f.ordinal()] == 1) {
            str = "year()";
        } else {
            str = "year(" + j0.h(this.f87691f) + ')';
        }
        if (!this.f87692g) {
            return str;
        }
        return str + o3.f87744a;
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return this.f87691f == i3Var.f87691f && this.f87692g == i3Var.f87692g;
    }

    public int hashCode() {
        return (this.f87691f.hashCode() * 31) + Boolean.hashCode(this.f87692g);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(@m80.k Padding padding, boolean z11) {
        super(k3.f87706a.b(), Integer.valueOf(padding != Padding.ZERO ? 1 : 4), null, padding == Padding.SPACE ? 4 : null, 4);
        kotlin.jvm.internal.g0.p(padding, "padding");
        this.f87691f = padding;
        this.f87692g = z11;
    }
}
