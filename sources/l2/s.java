package l2;

import com.badlogic.gdx.graphics.Texture;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface s {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements s {

        /* renamed from: a, reason: collision with root package name */
        public final r1.e f69255a;

        public a(r1.e eVar) {
            this.f69255a = eVar;
        }

        @Override // l2.s
        public Texture load(String str) {
            return (Texture) this.f69255a.w0(str, Texture.class);
        }
    }

    Texture load(String str);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements s {

        /* renamed from: a, reason: collision with root package name */
        public Texture.TextureFilter f69256a;

        /* renamed from: b, reason: collision with root package name */
        public Texture.TextureFilter f69257b;

        /* renamed from: c, reason: collision with root package name */
        public Texture.TextureWrap f69258c;

        /* renamed from: d, reason: collision with root package name */
        public Texture.TextureWrap f69259d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f69260e;

        public b() {
            Texture.TextureFilter textureFilter = Texture.TextureFilter.Linear;
            this.f69257b = textureFilter;
            this.f69256a = textureFilter;
            Texture.TextureWrap textureWrap = Texture.TextureWrap.Repeat;
            this.f69259d = textureWrap;
            this.f69258c = textureWrap;
            this.f69260e = false;
        }

        @Override // l2.s
        public Texture load(String str) {
            Texture texture = new Texture(q1.g.f81382e.a(str), this.f69260e);
            texture.a1(this.f69256a, this.f69257b);
            texture.b1(this.f69258c, this.f69259d);
            return texture;
        }

        public b(Texture.TextureFilter textureFilter, Texture.TextureFilter textureFilter2, Texture.TextureWrap textureWrap, Texture.TextureWrap textureWrap2, boolean z11) {
            this.f69256a = textureFilter;
            this.f69257b = textureFilter2;
            this.f69258c = textureWrap;
            this.f69259d = textureWrap2;
            this.f69260e = z11;
        }
    }
}
