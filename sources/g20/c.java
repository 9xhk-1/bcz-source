package g20;

import g20.d;

/* loaded from: classes8.dex */
public class c implements x00.l {

    /* renamed from: a, reason: collision with root package name */
    public final d f52573a;

    /* renamed from: b, reason: collision with root package name */
    public final i30.o f52574b;

    public c(d dVar, i30.o oVar) {
        this.f52573a = dVar;
        this.f52574b = oVar;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        Iterable I;
        I = d.I(this.f52573a, this.f52574b, (d.a) obj);
        return I;
    }
}
