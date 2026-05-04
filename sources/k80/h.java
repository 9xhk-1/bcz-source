package k80;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f66046a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f66047b;

    /* renamed from: c, reason: collision with root package name */
    public Object f66048c;

    public h(Throwable th2) {
        this.f66046a = th2;
        this.f66047b = false;
    }

    @Override // k80.g
    public void a(Object obj) {
        this.f66048c = obj;
    }

    @Override // k80.g
    public Object b() {
        return this.f66048c;
    }

    public Throwable c() {
        return this.f66046a;
    }

    public boolean d() {
        return this.f66047b;
    }

    public h(Throwable th2, boolean z11) {
        this.f66046a = th2;
        this.f66047b = z11;
    }
}
