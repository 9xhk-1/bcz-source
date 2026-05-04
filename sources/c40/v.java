package c40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v extends q2 implements u {

    /* renamed from: e, reason: collision with root package name */
    @w00.g
    @m80.k
    public final w f7991e;

    public v(@m80.k w wVar) {
        this.f7991e = wVar;
    }

    @Override // c40.q2
    public boolean C() {
        return true;
    }

    @Override // c40.q2
    public void D(@m80.l Throwable th2) {
        this.f7991e.C0(B());
    }

    @Override // c40.u
    public boolean e(@m80.k Throwable th2) {
        return B().u0(th2);
    }

    @Override // c40.u
    @m80.k
    public l2 getParent() {
        return B();
    }
}
