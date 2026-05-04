package z1;

import a3.j0;
import a3.q;
import com.badlogic.gdx.utils.l;
import java.util.Comparator;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a implements f, q {

    /* renamed from: g, reason: collision with root package name */
    public static final int f100540g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static final int f100541h = 1;

    /* renamed from: a, reason: collision with root package name */
    public j0<com.badlogic.gdx.utils.a<z1.b>> f100542a;

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<com.badlogic.gdx.utils.a<z1.b>> f100543b;

    /* renamed from: c, reason: collision with root package name */
    public l<d, com.badlogic.gdx.utils.a<z1.b>> f100544c;

    /* renamed from: d, reason: collision with root package name */
    public com.badlogic.gdx.graphics.a f100545d;

    /* renamed from: e, reason: collision with root package name */
    public w f100546e;

    /* renamed from: f, reason: collision with root package name */
    public final Comparator<z1.b> f100547f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: z1.a$a, reason: collision with other inner class name */
    public class C1375a extends j0<com.badlogic.gdx.utils.a<z1.b>> {
        public C1375a(int i11) {
            super(i11);
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public com.badlogic.gdx.utils.a<z1.b> g() {
            return new com.badlogic.gdx.utils.a<>();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Comparator<z1.b> {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(z1.b bVar, z1.b bVar2) {
            return (int) Math.signum(a.this.f100545d.f11508a.dst(bVar2.f100568c) - a.this.f100545d.f11508a.dst(bVar.f100568c));
        }
    }

    public a(com.badlogic.gdx.graphics.a aVar) {
        this.f100542a = new C1375a(16);
        this.f100543b = new com.badlogic.gdx.utils.a<>();
        this.f100544c = new l<>();
        this.f100545d = aVar;
        this.f100547f = new b();
        X();
    }

    @Override // z1.f
    public void D(int i11, com.badlogic.gdx.utils.a<z1.b> aVar) {
        if (i11 == 1) {
            q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11564c0);
            q1.g.f81384g.glDepthMask(false);
            aVar.sort(this.f100547f);
            return;
        }
        int i12 = aVar.f13179b;
        for (int i13 = 0; i13 < i12; i13++) {
            z1.b bVar = aVar.get(i13);
            com.badlogic.gdx.utils.a<z1.b> k11 = this.f100544c.k(bVar.f100574i);
            if (k11 == null) {
                k11 = this.f100542a.h();
                k11.clear();
                this.f100543b.a(k11);
                this.f100544c.r(bVar.f100574i, k11);
            }
            k11.a(bVar);
        }
        aVar.clear();
        l.e<com.badlogic.gdx.utils.a<z1.b>> it = this.f100544c.z().iterator();
        while (it.hasNext()) {
            aVar.g(it.next());
        }
        this.f100544c.clear();
        this.f100542a.e(this.f100543b);
        this.f100543b.clear();
    }

    @Override // z1.f
    public void I(int i11) {
        if (i11 == 1) {
            q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11564c0);
            q1.g.f81384g.glDepthMask(true);
        }
    }

    @Override // z1.f
    public w R(int i11) {
        return this.f100546e;
    }

    public final void X() {
        w wVar = new w("attribute vec4 a_position;\nattribute vec4 a_color;\nattribute vec2 a_texCoord0;\nuniform mat4 u_projectionViewMatrix;\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\n\nvoid main()\n{\n   v_color = a_color;\n   v_color.a = v_color.a * (255.0/254.0);\n   v_texCoords = a_texCoord0;\n   gl_Position =  u_projectionViewMatrix * a_position;\n}\n", "#ifdef GL_ES\nprecision mediump float;\n#endif\nvarying vec4 v_color;\nvarying vec2 v_texCoords;\nuniform sampler2D u_texture;\nvoid main()\n{\n  gl_FragColor = v_color * texture2D(u_texture, v_texCoords);\n}");
        this.f100546e = wVar;
        if (wVar.q1()) {
            return;
        }
        throw new IllegalArgumentException("couldn't compile shader: " + this.f100546e.f1());
    }

    public com.badlogic.gdx.graphics.a Z() {
        return this.f100545d;
    }

    @Override // z1.f
    public void b() {
        q1.g.f81384g.glDisable(com.badlogic.gdx.graphics.f.f11582f0);
    }

    @Override // a3.q
    public void dispose() {
        w wVar = this.f100546e;
        if (wVar != null) {
            wVar.dispose();
        }
    }

    public void i0(com.badlogic.gdx.graphics.a aVar) {
        this.f100545d = aVar;
    }

    @Override // z1.f
    public int o(z1.b bVar) {
        return !bVar.c().c() ? 1 : 0;
    }

    @Override // z1.f
    public void z() {
        q1.g.f81384g.glEnable(com.badlogic.gdx.graphics.f.f11582f0);
        this.f100546e.S();
        this.f100546e.I1("u_projectionViewMatrix", this.f100545d.f11513f);
        this.f100546e.i2("u_texture", 0);
    }

    public a(com.badlogic.gdx.graphics.a aVar, Comparator<z1.b> comparator) {
        this.f100542a = new C1375a(16);
        this.f100543b = new com.badlogic.gdx.utils.a<>();
        this.f100544c = new l<>();
        this.f100545d = aVar;
        this.f100547f = comparator;
        X();
    }
}
