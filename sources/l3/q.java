package l3;

import com.baicizhan.app.api.service.model.MemberShipTypeVo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MemberShipTypeVo f69687a;

    /* renamed from: b, reason: collision with root package name */
    public final long f69688b;

    public q(@m80.k MemberShipTypeVo memberShip, long j11) {
        kotlin.jvm.internal.g0.p(memberShip, "memberShip");
        this.f69687a = memberShip;
        this.f69688b = j11;
    }

    public static /* synthetic */ q d(q qVar, MemberShipTypeVo memberShipTypeVo, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            memberShipTypeVo = qVar.f69687a;
        }
        if ((i11 & 2) != 0) {
            j11 = qVar.f69688b;
        }
        return qVar.c(memberShipTypeVo, j11);
    }

    @m80.k
    public final MemberShipTypeVo a() {
        return this.f69687a;
    }

    public final long b() {
        return this.f69688b;
    }

    @m80.k
    public final q c(@m80.k MemberShipTypeVo memberShip, long j11) {
        kotlin.jvm.internal.g0.p(memberShip, "memberShip");
        return new q(memberShip, j11);
    }

    public final long e() {
        return this.f69688b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f69687a == qVar.f69687a && this.f69688b == qVar.f69688b;
    }

    @m80.k
    public final MemberShipTypeVo f() {
        return this.f69687a;
    }

    public int hashCode() {
        return (this.f69687a.hashCode() * 31) + Long.hashCode(this.f69688b);
    }

    @m80.k
    public String toString() {
        return "MemberShipVo(memberShip=" + this.f69687a + ", endTime=" + this.f69688b + ')';
    }
}
