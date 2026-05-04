package tz;

/* loaded from: classes8.dex */
public class i1 extends d1 {

    /* renamed from: e, reason: collision with root package name */
    public long f91308e = System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g1 f91309f;

    public i1(g1 g1Var) {
        this.f91309f = g1Var;
    }

    @Override // tz.d1
    public void a(long j11) {
        this.f91308e = j11;
    }

    @Override // tz.d1
    public void d(long j11) {
        this.f91309f.b((j11 - this.f91308e) / 1000);
    }
}
