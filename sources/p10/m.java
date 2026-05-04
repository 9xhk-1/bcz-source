package p10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class m extends p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o1 f78573a;

    public m(@m80.k o1 delegate) {
        kotlin.jvm.internal.g0.p(delegate, "delegate");
        this.f78573a = delegate;
    }

    @Override // p10.p
    @m80.k
    public o1 b() {
        return this.f78573a;
    }

    @Override // p10.p
    @m80.k
    public String c() {
        return b().b();
    }

    @Override // p10.p
    @m80.k
    public p f() {
        p j11 = o.j(b().d());
        kotlin.jvm.internal.g0.o(j11, "toDescriptorVisibility(...)");
        return j11;
    }
}
