package b5;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r(binds = {d5.f.class})
/* loaded from: classes3.dex */
public final class s0 implements d5.f<t0, c1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f6035a = "biz.log";

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final f50.e<t0> f6036b = t0.Companion.serializer();

    @Override // d5.f
    public /* bridge */ /* synthetic */ Object a(t0 t0Var, j00.c<? super c1> cVar) {
        return d(t0Var.h(), cVar);
    }

    @Override // d5.f
    @m80.l
    public f50.e<t0> b() {
        return this.f6036b;
    }

    @Override // d5.f
    @m80.k
    public String c() {
        return this.f6035a;
    }

    @m80.l
    public Object d(@m80.k m3.c0 c0Var, @m80.k j00.c<? super c1> cVar) {
        int e11 = c0Var.e();
        if (e11 == 1) {
            z6.b.d(z6.b.f101032b, "", c0Var.g(), null, 4, null);
        } else if (e11 == 2) {
            z6.b.j(z6.b.f101032b, "", c0Var.g(), null, 4, null);
        } else if (e11 == 3) {
            z6.b.f(z6.b.f101032b, "", c0Var.g(), null, 4, null);
        }
        return e1.INSTANCE;
    }
}
