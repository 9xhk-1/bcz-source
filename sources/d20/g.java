package d20;

import e30.c1;
import x00.l;

/* loaded from: classes8.dex */
public class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public final p10.b f47079a;

    /* renamed from: b, reason: collision with root package name */
    public final h f47080b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f47081c;

    /* renamed from: d, reason: collision with root package name */
    public final a f47082d;

    public g(p10.b bVar, h hVar, c1 c1Var, a aVar) {
        this.f47079a = bVar;
        this.f47080b = hVar;
        this.f47081c = c1Var;
        this.f47082d = aVar;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        c1 k11;
        k11 = h.k(this.f47079a, this.f47080b, this.f47081c, this.f47082d, (f30.g) obj);
        return k11;
    }
}
