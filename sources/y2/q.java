package y2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class q extends d0 {

    /* renamed from: j, reason: collision with root package name */
    public float f99193j;

    @Override // y2.d0
    public void i() {
        this.f99193j = 0.0f;
    }

    @Override // y2.d0
    public void u(float f11) {
        v(f11 - this.f99193j);
        this.f99193j = f11;
    }

    public abstract void v(float f11);
}
