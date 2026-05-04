package d20;

import e30.r0;
import e30.u1;
import p10.c1;

/* loaded from: classes8.dex */
public class c implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final d f47068a;

    /* renamed from: b, reason: collision with root package name */
    public final c1 f47069b;

    /* renamed from: c, reason: collision with root package name */
    public final a f47070c;

    /* renamed from: d, reason: collision with root package name */
    public final u1 f47071d;

    /* renamed from: e, reason: collision with root package name */
    public final f20.j f47072e;

    public c(d dVar, c1 c1Var, a aVar, u1 u1Var, f20.j jVar) {
        this.f47068a = dVar;
        this.f47069b = c1Var;
        this.f47070c = aVar;
        this.f47071d = u1Var;
        this.f47072e = jVar;
    }

    @Override // x00.a
    public Object invoke() {
        r0 e11;
        e11 = d.e(this.f47068a, this.f47069b, this.f47070c, this.f47071d, this.f47072e);
        return e11;
    }
}
