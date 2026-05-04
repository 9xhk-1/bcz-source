package e30;

import java.util.List;

/* loaded from: classes8.dex */
public class t0 implements x00.l {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f48663a;

    /* renamed from: b, reason: collision with root package name */
    public final List f48664b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f48665c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48666d;

    /* renamed from: e, reason: collision with root package name */
    public final x20.k f48667e;

    public t0(u1 u1Var, List list, r1 r1Var, boolean z11, x20.k kVar) {
        this.f48663a = u1Var;
        this.f48664b = list;
        this.f48665c = r1Var;
        this.f48666d = z11;
        this.f48667e = kVar;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        c1 q11;
        q11 = u0.q(this.f48663a, this.f48664b, this.f48665c, this.f48666d, this.f48667e, (f30.g) obj);
        return q11;
    }
}
