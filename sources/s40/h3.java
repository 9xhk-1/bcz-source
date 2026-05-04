package s40;

import kotlinx.datetime.format.Padding;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUtcOffsetFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UtcOffsetFormat.kt\nkotlinx/datetime/format/UtcOffsetWholeHoursDirective\n+ 2 DateTimeFormat.kt\nkotlinx/datetime/format/DateTimeFormatKt\n*L\n1#1,280:1\n103#2:281\n104#2:282\n*S KotlinDebug\n*F\n+ 1 UtcOffsetFormat.kt\nkotlinx/datetime/format/UtcOffsetWholeHoursDirective\n*L\n196#1:281\n197#1:282\n*E\n"})
/* loaded from: classes8.dex */
public final class h3 extends u40.e0<h2> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Padding f87682e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(@m80.k Padding padding) {
        super(u1.f87786a.c(), padding == Padding.ZERO ? 2 : 1, padding == Padding.SPACE ? 2 : null);
        kotlin.jvm.internal.g0.p(padding, "padding");
        this.f87682e = padding;
    }

    @Override // u40.l
    @m80.k
    public String d() {
        return "offsetHours(" + j0.h(this.f87682e) + ')';
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof h3) && this.f87682e == ((h3) obj).f87682e;
    }

    public int hashCode() {
        return this.f87682e.hashCode();
    }
}
