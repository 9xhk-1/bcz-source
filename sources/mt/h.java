package mt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public a f73724a;

    /* renamed from: b, reason: collision with root package name */
    public a f73725b;

    public void a(a aVar) {
        if (this.f73724a == null) {
            this.f73724a = aVar;
        }
        a aVar2 = this.f73725b;
        if (aVar2 != null) {
            aVar2.f73673a = aVar;
        }
        this.f73725b = aVar;
    }

    public void b() {
        this.f73724a.request();
    }
}
