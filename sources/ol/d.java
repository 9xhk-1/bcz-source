package ol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class d extends l {

    /* renamed from: h, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f77550h;

    public d(String str) {
        super(str);
        this.f77550h = new com.badlogic.gdx.graphics.b(0.38f, 0.94f, 0.0f, 1.0f);
    }

    public com.badlogic.gdx.graphics.b e() {
        return this.f77550h;
    }

    @Override // ol.b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public d h() {
        return new d(this);
    }

    public d(d dVar) {
        super(dVar);
        com.badlogic.gdx.graphics.b bVar = new com.badlogic.gdx.graphics.b(0.38f, 0.94f, 0.0f, 1.0f);
        this.f77550h = bVar;
        bVar.H(dVar.f77550h);
    }
}
