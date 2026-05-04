package e30;

import java.util.List;

/* loaded from: classes8.dex */
public class s0 implements x00.l {

    /* renamed from: a, reason: collision with root package name */
    public final u1 f48656a;

    /* renamed from: b, reason: collision with root package name */
    public final List f48657b;

    /* renamed from: c, reason: collision with root package name */
    public final r1 f48658c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f48659d;

    public s0(u1 u1Var, List list, r1 r1Var, boolean z11) {
        this.f48656a = u1Var;
        this.f48657b = list;
        this.f48658c = r1Var;
        this.f48659d = z11;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        c1 n11;
        n11 = u0.n(this.f48656a, this.f48657b, this.f48658c, this.f48659d, (f30.g) obj);
        return n11;
    }
}
