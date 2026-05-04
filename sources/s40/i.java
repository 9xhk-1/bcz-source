package s40;

import kotlinx.datetime.format.AmPmMarker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i extends u40.r<y1, AmPmMarker> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final String f87683e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final String f87684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@m80.k String amString, @m80.k String pmString) {
        super(z1.f87806a.a(), a00.l1.W(yz.h1.a(AmPmMarker.AM, amString), yz.h1.a(AmPmMarker.PM, pmString)), "AM/PM marker");
        kotlin.jvm.internal.g0.p(amString, "amString");
        kotlin.jvm.internal.g0.p(pmString, "pmString");
        this.f87683e = amString;
        this.f87684f = pmString;
    }

    @Override // u40.l
    @m80.k
    public String d() {
        return "amPmMarker(" + this.f87683e + org.junit.jupiter.api.j2.O + this.f87684f + ')';
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return kotlin.jvm.internal.g0.g(this.f87683e, iVar.f87683e) && kotlin.jvm.internal.g0.g(this.f87684f, iVar.f87684f);
    }

    public int hashCode() {
        return (this.f87683e.hashCode() * 31) + this.f87684f.hashCode();
    }
}
