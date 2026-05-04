package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l1 implements m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k1 f7885a;

    public l1(@m80.k k1 k1Var) {
        this.f7885a = k1Var;
    }

    @Override // c40.m
    public void a(@m80.l Throwable th2) {
        this.f7885a.dispose();
    }

    @m80.k
    public String toString() {
        return "DisposeOnCancel[" + this.f7885a + l50.b.f69930l;
    }
}
