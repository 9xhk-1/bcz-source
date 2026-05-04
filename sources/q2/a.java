package q2;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.l;
import w1.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: q2.a$a, reason: collision with other inner class name */
    public static class C1000a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final r1.e f81431a;

        public C1000a(r1.e eVar) {
            this.f81431a = eVar;
        }

        @Override // q2.a
        public o a(String str) {
            return new o((Texture) this.f81431a.w0(str, Texture.class));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public final l<String, Texture> f81432a;

        public b(l<String, Texture> lVar) {
            this.f81432a = lVar;
        }

        @Override // q2.a
        public o a(String str) {
            return new o(this.f81432a.k(str));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements a {

        /* renamed from: a, reason: collision with root package name */
        public final com.badlogic.gdx.graphics.g2d.e f81433a;

        public c(com.badlogic.gdx.graphics.g2d.e eVar) {
            this.f81433a = eVar;
        }

        @Override // q2.a
        public o a(String str) {
            return this.f81433a.Z(str);
        }
    }

    o a(String str);
}
