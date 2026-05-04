package e9;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public a f49602a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(e9.a book);
    }

    public void b(a l11) {
        this.f49602a = l11;
        b.V(this).g(new Void[0]);
    }

    @Override // pb.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Void err) {
        a aVar = this.f49602a;
        if (aVar != null) {
            aVar.a(null);
        }
    }

    @Override // pb.b
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onSuccess(e9.a book) {
        a aVar = this.f49602a;
        if (aVar != null) {
            aVar.a(book);
        }
    }

    @Override // pb.b
    public void onProgress(int progress) {
    }
}
