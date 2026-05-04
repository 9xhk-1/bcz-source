package i80;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a implements Runnable, k {

    /* renamed from: a, reason: collision with root package name */
    public final j f60254a = new j();

    /* renamed from: b, reason: collision with root package name */
    public final c f60255b;

    public a(c cVar) {
        this.f60255b = cVar;
    }

    @Override // i80.k
    public void a(p pVar, Object obj) {
        this.f60254a.a(i.a(pVar, obj));
        this.f60255b.g().execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        i b11 = this.f60254a.b();
        if (b11 == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f60255b.l(b11);
    }
}
