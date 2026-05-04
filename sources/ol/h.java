package ol;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h extends l {

    /* renamed from: h, reason: collision with root package name */
    public float[] f77565h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f77566i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f77567j;

    /* renamed from: k, reason: collision with root package name */
    public final com.badlogic.gdx.graphics.b f77568k;

    public h(String str) {
        super(str);
        this.f77568k = new com.badlogic.gdx.graphics.b(1.0f, 0.5f, 0.0f, 1.0f);
    }

    public void A(float[] fArr) {
        this.f77565h = fArr;
    }

    public com.badlogic.gdx.graphics.b e() {
        return this.f77568k;
    }

    @Override // ol.b
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public h h() {
        return new h(this);
    }

    public boolean v() {
        return this.f77566i;
    }

    public boolean w() {
        return this.f77567j;
    }

    public float[] x() {
        return this.f77565h;
    }

    public void y(boolean z11) {
        this.f77566i = z11;
    }

    public void z(boolean z11) {
        this.f77567j = z11;
    }

    public h(h hVar) {
        super(hVar);
        com.badlogic.gdx.graphics.b bVar = new com.badlogic.gdx.graphics.b(1.0f, 0.5f, 0.0f, 1.0f);
        this.f77568k = bVar;
        float[] fArr = new float[hVar.f77565h.length];
        this.f77565h = fArr;
        pl.g.a(hVar.f77565h, 0, fArr, 0, fArr.length);
        this.f77566i = hVar.f77566i;
        this.f77567j = hVar.f77567j;
        bVar.H(hVar.f77568k);
    }
}
