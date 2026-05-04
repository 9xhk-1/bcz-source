package c2;

import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public String f7494a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7496c;

    /* renamed from: j, reason: collision with root package name */
    public c f7503j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7495b = true;

    /* renamed from: d, reason: collision with root package name */
    public final Vector3 f7497d = new Vector3();

    /* renamed from: e, reason: collision with root package name */
    public final Quaternion f7498e = new Quaternion(0.0f, 0.0f, 0.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    public final Vector3 f7499f = new Vector3(1.0f, 1.0f, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    public final Matrix4 f7500g = new Matrix4();

    /* renamed from: h, reason: collision with root package name */
    public final Matrix4 f7501h = new Matrix4();

    /* renamed from: i, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<f> f7502i = new com.badlogic.gdx.utils.a<>(2);

    /* renamed from: k, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c> f7504k = new com.badlogic.gdx.utils.a<>(2);

    public static c r(com.badlogic.gdx.utils.a<c> aVar, String str, boolean z11, boolean z12) {
        int i11 = aVar.f13179b;
        if (z12) {
            for (int i12 = 0; i12 < i11; i12++) {
                c cVar = aVar.get(i12);
                if (cVar.f7494a.equalsIgnoreCase(str)) {
                    return cVar;
                }
            }
        } else {
            for (int i13 = 0; i13 < i11; i13++) {
                c cVar2 = aVar.get(i13);
                if (cVar2.f7494a.equals(str)) {
                    return cVar2;
                }
            }
        }
        if (!z11) {
            return null;
        }
        for (int i14 = 0; i14 < i11; i14++) {
            c r11 = r(aVar.get(i14).f7504k, str, true, z12);
            if (r11 != null) {
                return r11;
            }
        }
        return null;
    }

    public <T extends c> int a(T t11) {
        return v(-1, t11);
    }

    public <T extends c> int b(Iterable<T> iterable) {
        return w(-1, iterable);
    }

    public <T extends c> void c(T t11) {
        t11.a(this);
    }

    public void d(boolean z11) {
        Matrix4[] matrix4Arr;
        int i11;
        a.b<f> it = this.f7502i.iterator();
        while (it.hasNext()) {
            f next = it.next();
            com.badlogic.gdx.utils.b<c, Matrix4> bVar = next.f7513c;
            if (bVar != null && (matrix4Arr = next.f7514d) != null && (i11 = bVar.f13193c) == matrix4Arr.length) {
                for (int i12 = 0; i12 < i11; i12++) {
                    next.f7514d[i12].set(next.f7513c.f13191a[i12].f7501h).mul(next.f7513c.f13192b[i12]);
                }
            }
        }
        if (z11) {
            a.b<c> it2 = this.f7504k.iterator();
            while (it2.hasNext()) {
                it2.next().d(true);
            }
        }
    }

    public BoundingBox e(BoundingBox boundingBox) {
        boundingBox.inf();
        return l(boundingBox);
    }

    public BoundingBox f(BoundingBox boundingBox, boolean z11) {
        boundingBox.inf();
        return m(boundingBox, z11);
    }

    public Matrix4 g() {
        if (!this.f7496c) {
            this.f7500g.set(this.f7497d, this.f7498e, this.f7499f);
        }
        return this.f7500g;
    }

    public void h(boolean z11) {
        g();
        i();
        if (z11) {
            a.b<c> it = this.f7504k.iterator();
            while (it.hasNext()) {
                it.next().h(true);
            }
        }
    }

    public Matrix4 i() {
        c cVar;
        if (!this.f7495b || (cVar = this.f7503j) == null) {
            this.f7501h.set(this.f7500g);
        } else {
            this.f7501h.set(cVar.f7501h).mul(this.f7500g);
        }
        return this.f7501h;
    }

    public c j() {
        return new c().y(this);
    }

    public void k() {
        c cVar = this.f7503j;
        if (cVar != null) {
            cVar.x(this);
            this.f7503j = null;
        }
    }

    public BoundingBox l(BoundingBox boundingBox) {
        return m(boundingBox, true);
    }

    public BoundingBox m(BoundingBox boundingBox, boolean z11) {
        int i11 = this.f7502i.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            f fVar = this.f7502i.get(i12);
            if (fVar.f7515e) {
                b bVar = fVar.f7511a;
                if (z11) {
                    bVar.f7490e.e1(boundingBox, bVar.f7488c, bVar.f7489d, this.f7501h);
                } else {
                    bVar.f7490e.d1(boundingBox, bVar.f7488c, bVar.f7489d);
                }
            }
        }
        int i13 = this.f7504k.f13179b;
        for (int i14 = 0; i14 < i13; i14++) {
            this.f7504k.get(i14).l(boundingBox);
        }
        return boundingBox;
    }

    public c n(int i11) {
        return this.f7504k.get(i11);
    }

    public c o(String str, boolean z11, boolean z12) {
        return r(this.f7504k, str, z11, z12);
    }

    public int p() {
        return this.f7504k.f13179b;
    }

    public Iterable<c> q() {
        return this.f7504k;
    }

    public c s() {
        return this.f7503j;
    }

    public boolean t() {
        com.badlogic.gdx.utils.a<c> aVar = this.f7504k;
        return aVar != null && aVar.f13179b > 0;
    }

    public boolean u() {
        return this.f7503j != null;
    }

    public <T extends c> int v(int i11, T t11) {
        for (c cVar = this; cVar != null; cVar = cVar.s()) {
            if (cVar == t11) {
                throw new GdxRuntimeException("Cannot add a parent as a child");
            }
        }
        c s11 = t11.s();
        if (s11 != null && !s11.x(t11)) {
            throw new GdxRuntimeException("Could not remove child from its current parent");
        }
        if (i11 >= 0) {
            com.badlogic.gdx.utils.a<c> aVar = this.f7504k;
            if (i11 < aVar.f13179b) {
                aVar.r(i11, t11);
                t11.f7503j = this;
                return i11;
            }
        }
        com.badlogic.gdx.utils.a<c> aVar2 = this.f7504k;
        int i12 = aVar2.f13179b;
        aVar2.a(t11);
        i11 = i12;
        t11.f7503j = this;
        return i11;
    }

    public <T extends c> int w(int i11, Iterable<T> iterable) {
        if (i11 < 0 || i11 > this.f7504k.f13179b) {
            i11 = this.f7504k.f13179b;
        }
        Iterator<T> it = iterable.iterator();
        int i12 = i11;
        while (it.hasNext()) {
            v(i12, it.next());
            i12++;
        }
        return i11;
    }

    public <T extends c> boolean x(T t11) {
        if (!this.f7504k.C(t11, true)) {
            return false;
        }
        t11.f7503j = null;
        return true;
    }

    public c y(c cVar) {
        k();
        this.f7494a = cVar.f7494a;
        this.f7496c = cVar.f7496c;
        this.f7495b = cVar.f7495b;
        this.f7497d.set(cVar.f7497d);
        this.f7498e.set(cVar.f7498e);
        this.f7499f.set(cVar.f7499f);
        this.f7500g.set(cVar.f7500g);
        this.f7501h.set(cVar.f7501h);
        this.f7502i.clear();
        a.b<f> it = cVar.f7502i.iterator();
        while (it.hasNext()) {
            this.f7502i.a(it.next().a());
        }
        this.f7504k.clear();
        Iterator<c> it2 = cVar.q().iterator();
        while (it2.hasNext()) {
            a(it2.next().j());
        }
        return this;
    }
}
