package e30;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class i0 extends k2 implements i30.e {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final c1 f48604b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c1 f48605c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(@m80.k c1 lowerBound, @m80.k c1 upperBound) {
        super(null);
        kotlin.jvm.internal.g0.p(lowerBound, "lowerBound");
        kotlin.jvm.internal.g0.p(upperBound, "upperBound");
        this.f48604b = lowerBound;
        this.f48605c = upperBound;
    }

    @Override // e30.r0
    @m80.k
    public List<a2> G0() {
        return P0().G0();
    }

    @Override // e30.r0
    @m80.k
    public r1 H0() {
        return P0().H0();
    }

    @Override // e30.r0
    @m80.k
    public u1 I0() {
        return P0().I0();
    }

    @Override // e30.r0
    public boolean J0() {
        return P0().J0();
    }

    @m80.k
    public abstract c1 P0();

    @m80.k
    public final c1 Q0() {
        return this.f48604b;
    }

    @m80.k
    public final c1 R0() {
        return this.f48605c;
    }

    @m80.k
    public abstract String S0(@m80.k p20.m mVar, @m80.k p20.u uVar);

    @Override // e30.r0
    @m80.k
    public x20.k r() {
        return P0().r();
    }

    @m80.k
    public String toString() {
        return p20.m.f78750k.W(this);
    }
}
