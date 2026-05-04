package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n1 implements e2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7893a;

    public n1(boolean z11) {
        this.f7893a = z11;
    }

    @Override // c40.e2
    @m80.l
    public w2 a() {
        return null;
    }

    @Override // c40.e2
    public boolean isActive() {
        return this.f7893a;
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(isActive() ? "Active" : "New");
        sb2.append(l50.b.f69928j);
        return sb2.toString();
    }
}
