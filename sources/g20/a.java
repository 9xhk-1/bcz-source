package g20;

import g20.d;

/* loaded from: classes8.dex */
public class a implements x00.l {

    /* renamed from: a, reason: collision with root package name */
    public final d f52563a;

    /* renamed from: b, reason: collision with root package name */
    public final d.a f52564b;

    public a(d dVar, d.a aVar) {
        this.f52563a = dVar;
        this.f52564b = aVar;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        boolean i11;
        i11 = d.i(this.f52563a, this.f52564b, obj);
        return Boolean.valueOf(i11);
    }
}
