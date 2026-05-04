package g20;

/* loaded from: classes8.dex */
public class b implements x00.l {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f52568a;

    /* renamed from: b, reason: collision with root package name */
    public final h[] f52569b;

    public b(f1 f1Var, h[] hVarArr) {
        this.f52568a = f1Var;
        this.f52569b = hVarArr;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        h e11;
        e11 = d.e(this.f52568a, this.f52569b, ((Number) obj).intValue());
        return e11;
    }
}
