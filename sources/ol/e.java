package ol;

import a3.d0;
import jl.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e extends l {

    /* renamed from: h, reason: collision with root package name */
    @d0
    public n f77551h;

    /* renamed from: i, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f77552i;

    public e(String str) {
        super(str);
        this.f77552i = new com.badlogic.gdx.graphics.b(0.2275f, 0.2275f, 0.8078f, 1.0f);
    }

    public com.badlogic.gdx.graphics.b e() {
        return this.f77552i;
    }

    @Override // ol.b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public e h() {
        return new e(this);
    }

    @d0
    public n v() {
        return this.f77551h;
    }

    public void w(@d0 n nVar) {
        this.f77551h = nVar;
    }

    public e(e eVar) {
        super(eVar);
        com.badlogic.gdx.graphics.b bVar = new com.badlogic.gdx.graphics.b(0.2275f, 0.2275f, 0.8078f, 1.0f);
        this.f77552i = bVar;
        this.f77551h = eVar.f77551h;
        bVar.H(eVar.f77552i);
    }
}
