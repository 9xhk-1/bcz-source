package c2;

import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import n2.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    public static final BoundingBox f7485i = new BoundingBox();

    /* renamed from: a, reason: collision with root package name */
    public String f7486a;

    /* renamed from: b, reason: collision with root package name */
    public int f7487b;

    /* renamed from: c, reason: collision with root package name */
    public int f7488c;

    /* renamed from: d, reason: collision with root package name */
    public int f7489d;

    /* renamed from: e, reason: collision with root package name */
    public Mesh f7490e;

    /* renamed from: f, reason: collision with root package name */
    public final Vector3 f7491f = new Vector3();

    /* renamed from: g, reason: collision with root package name */
    public final Vector3 f7492g = new Vector3();

    /* renamed from: h, reason: collision with root package name */
    public float f7493h = -1.0f;

    public b() {
    }

    public boolean a(b bVar) {
        if (bVar != this) {
            return bVar != null && bVar.f7490e == this.f7490e && bVar.f7487b == this.f7487b && bVar.f7488c == this.f7488c && bVar.f7489d == this.f7489d;
        }
        return true;
    }

    public void b(w wVar) {
        this.f7490e.D1(wVar, this.f7487b, this.f7488c, this.f7489d);
    }

    public void c(w wVar, boolean z11) {
        this.f7490e.E1(wVar, this.f7487b, this.f7488c, this.f7489d, z11);
    }

    public b d(b bVar) {
        this.f7486a = bVar.f7486a;
        this.f7490e = bVar.f7490e;
        this.f7488c = bVar.f7488c;
        this.f7489d = bVar.f7489d;
        this.f7487b = bVar.f7487b;
        this.f7491f.set(bVar.f7491f);
        this.f7492g.set(bVar.f7492g);
        this.f7493h = bVar.f7493h;
        return this;
    }

    public b e(String str, Mesh mesh, int i11, int i12, int i13) {
        this.f7486a = str;
        this.f7490e = mesh;
        this.f7488c = i11;
        this.f7489d = i12;
        this.f7487b = i13;
        this.f7491f.set(0.0f, 0.0f, 0.0f);
        this.f7492g.set(0.0f, 0.0f, 0.0f);
        this.f7493h = -1.0f;
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            return a((b) obj);
        }
        return false;
    }

    public void f() {
        Mesh mesh = this.f7490e;
        BoundingBox boundingBox = f7485i;
        mesh.D(boundingBox, this.f7488c, this.f7489d);
        boundingBox.getCenter(this.f7491f);
        boundingBox.getDimensions(this.f7492g).scl(0.5f);
        this.f7493h = this.f7492g.len();
    }

    public b(String str, Mesh mesh, int i11, int i12, int i13) {
        e(str, mesh, i11, i12, i13);
    }

    public b(b bVar) {
        d(bVar);
    }
}
