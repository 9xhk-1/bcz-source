package x1;

import a3.q;
import com.badlogic.gdx.graphics.Mesh;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g3d.model.data.ModelMaterial;
import com.badlogic.gdx.graphics.s;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.utils.BufferUtils;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.l;
import java.nio.ShortBuffer;
import java.util.Iterator;
import l2.r;
import l2.s;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<d> f97010a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c2.c> f97011b;

    /* renamed from: c, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c2.a> f97012c;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<Mesh> f97013d;

    /* renamed from: e, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<c2.b> f97014e;

    /* renamed from: f, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<q> f97015f;

    /* renamed from: g, reason: collision with root package name */
    public l<c2.f, com.badlogic.gdx.utils.b<String, Matrix4>> f97016g;

    public e() {
        this.f97010a = new com.badlogic.gdx.utils.a<>();
        this.f97011b = new com.badlogic.gdx.utils.a<>();
        this.f97012c = new com.badlogic.gdx.utils.a<>();
        this.f97013d = new com.badlogic.gdx.utils.a<>();
        this.f97014e = new com.badlogic.gdx.utils.a<>();
        this.f97015f = new com.badlogic.gdx.utils.a<>();
        this.f97016g = new l<>();
    }

    public c2.c C0(String str, boolean z11) {
        return J0(str, z11, false);
    }

    public void D(d2.c cVar) {
        int i11 = 0;
        for (d2.d dVar : cVar.f47025d) {
            i11 += dVar.f47027b.length;
        }
        boolean z11 = i11 > 0;
        s sVar = new s(cVar.f47023b);
        int length = cVar.f47024c.length / (sVar.f12497b / 4);
        Mesh mesh = new Mesh(true, length, i11, sVar);
        this.f97013d.a(mesh);
        this.f97015f.a(mesh);
        BufferUtils.j(cVar.f47024c, mesh.y1(true), cVar.f47024c.length, 0);
        ShortBuffer l12 = mesh.l1(true);
        l12.clear();
        int i12 = 0;
        for (d2.d dVar2 : cVar.f47025d) {
            c2.b bVar = new c2.b();
            bVar.f7486a = dVar2.f47026a;
            bVar.f7487b = dVar2.f47028c;
            bVar.f7488c = i12;
            bVar.f7489d = z11 ? dVar2.f47027b.length : length;
            bVar.f7490e = mesh;
            if (z11) {
                l12.put(dVar2.f47027b);
            }
            i12 += bVar.f7489d;
            this.f97014e.a(bVar);
        }
        l12.position(0);
        a.b<c2.b> it = this.f97014e.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public BoundingBox I(BoundingBox boundingBox) {
        int i11 = this.f97011b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f97011b.get(i12).l(boundingBox);
        }
        return boundingBox;
    }

    public c2.c J0(String str, boolean z11, boolean z12) {
        return c2.c.r(this.f97011b, str, z11, z12);
    }

    public void Q0(d2.b bVar, l2.s sVar) {
        b1(bVar.f47018c);
        a1(bVar.f47019d, sVar);
        d1(bVar.f47020e);
        V0(bVar.f47021f);
        o();
    }

    public c2.a R(String str) {
        return X(str, true);
    }

    public void V0(Iterable<d2.a> iterable) {
        com.badlogic.gdx.utils.a<c2.e<Quaternion>> aVar;
        com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar2;
        for (d2.a aVar3 : iterable) {
            c2.a aVar4 = new c2.a();
            aVar4.f7482a = aVar3.f47014a;
            a.b<d2.f> it = aVar3.f47015b.iterator();
            while (it.hasNext()) {
                d2.f next = it.next();
                c2.c w02 = w0(next.f47036a);
                if (w02 != null) {
                    c2.d dVar = new c2.d();
                    dVar.f7505a = w02;
                    if (next.f47037b != null) {
                        com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar5 = new com.badlogic.gdx.utils.a<>();
                        dVar.f7506b = aVar5;
                        aVar5.o(next.f47037b.f13179b);
                        a.b<d2.g<Vector3>> it2 = next.f47037b.iterator();
                        while (it2.hasNext()) {
                            d2.g<Vector3> next2 = it2.next();
                            float f11 = next2.f47040a;
                            if (f11 > aVar4.f7483b) {
                                aVar4.f7483b = f11;
                            }
                            com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar6 = dVar.f7506b;
                            Vector3 vector3 = next2.f47041b;
                            aVar6.a(new c2.e<>(f11, new Vector3(vector3 == null ? w02.f7497d : vector3)));
                        }
                    }
                    if (next.f47038c != null) {
                        com.badlogic.gdx.utils.a<c2.e<Quaternion>> aVar7 = new com.badlogic.gdx.utils.a<>();
                        dVar.f7507c = aVar7;
                        aVar7.o(next.f47038c.f13179b);
                        a.b<d2.g<Quaternion>> it3 = next.f47038c.iterator();
                        while (it3.hasNext()) {
                            d2.g<Quaternion> next3 = it3.next();
                            float f12 = next3.f47040a;
                            if (f12 > aVar4.f7483b) {
                                aVar4.f7483b = f12;
                            }
                            com.badlogic.gdx.utils.a<c2.e<Quaternion>> aVar8 = dVar.f7507c;
                            Quaternion quaternion = next3.f47041b;
                            aVar8.a(new c2.e<>(f12, new Quaternion(quaternion == null ? w02.f7498e : quaternion)));
                        }
                    }
                    if (next.f47039d != null) {
                        com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar9 = new com.badlogic.gdx.utils.a<>();
                        dVar.f7508d = aVar9;
                        aVar9.o(next.f47039d.f13179b);
                        a.b<d2.g<Vector3>> it4 = next.f47039d.iterator();
                        while (it4.hasNext()) {
                            d2.g<Vector3> next4 = it4.next();
                            float f13 = next4.f47040a;
                            if (f13 > aVar4.f7483b) {
                                aVar4.f7483b = f13;
                            }
                            com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar10 = dVar.f7508d;
                            Vector3 vector32 = next4.f47041b;
                            aVar10.a(new c2.e<>(f13, new Vector3(vector32 == null ? w02.f7499f : vector32)));
                        }
                    }
                    com.badlogic.gdx.utils.a<c2.e<Vector3>> aVar11 = dVar.f7506b;
                    if ((aVar11 != null && aVar11.f13179b > 0) || (((aVar = dVar.f7507c) != null && aVar.f13179b > 0) || ((aVar2 = dVar.f7508d) != null && aVar2.f13179b > 0))) {
                        aVar4.f7484c.a(dVar);
                    }
                }
            }
            if (aVar4.f7484c.f13179b > 0) {
                this.f97012c.a(aVar4);
            }
        }
    }

    public c2.a X(String str, boolean z11) {
        int i11 = this.f97012c.f13179b;
        int i12 = 0;
        if (z11) {
            while (i12 < i11) {
                c2.a aVar = this.f97012c.get(i12);
                if (aVar.f7482a.equalsIgnoreCase(str)) {
                    return aVar;
                }
                i12++;
            }
            return null;
        }
        while (i12 < i11) {
            c2.a aVar2 = this.f97012c.get(i12);
            if (aVar2.f7482a.equals(str)) {
                return aVar2;
            }
            i12++;
        }
        return null;
    }

    public Iterable<q> Z() {
        return this.f97015f;
    }

    public void a1(Iterable<ModelMaterial> iterable, l2.s sVar) {
        Iterator<ModelMaterial> it = iterable.iterator();
        while (it.hasNext()) {
            this.f97010a.a(z(it.next(), sVar));
        }
    }

    public BoundingBox b(BoundingBox boundingBox) {
        boundingBox.inf();
        return I(boundingBox);
    }

    public void b1(Iterable<d2.c> iterable) {
        Iterator<d2.c> it = iterable.iterator();
        while (it.hasNext()) {
            D(it.next());
        }
    }

    public c2.c c1(d2.e eVar) {
        c2.b bVar;
        c2.c cVar = new c2.c();
        cVar.f7494a = eVar.f47029a;
        Vector3 vector3 = eVar.f47030b;
        if (vector3 != null) {
            cVar.f7497d.set(vector3);
        }
        Quaternion quaternion = eVar.f47031c;
        if (quaternion != null) {
            cVar.f7498e.set(quaternion);
        }
        Vector3 vector32 = eVar.f47032d;
        if (vector32 != null) {
            cVar.f7499f.set(vector32);
        }
        d2.h[] hVarArr = eVar.f47034f;
        if (hVarArr != null) {
            for (d2.h hVar : hVarArr) {
                d dVar = null;
                if (hVar.f47043b != null) {
                    a.b<c2.b> it = this.f97014e.iterator();
                    while (it.hasNext()) {
                        bVar = it.next();
                        if (hVar.f47043b.equals(bVar.f7486a)) {
                            break;
                        }
                    }
                }
                bVar = null;
                if (hVar.f47042a != null) {
                    a.b<d> it2 = this.f97010a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        d next = it2.next();
                        if (hVar.f47042a.equals(next.f97009d)) {
                            dVar = next;
                            break;
                        }
                    }
                }
                if (bVar == null || dVar == null) {
                    throw new GdxRuntimeException("Invalid node: " + cVar.f7494a);
                }
                c2.f fVar = new c2.f();
                fVar.f7511a = bVar;
                fVar.f7512b = dVar;
                cVar.f7502i.a(fVar);
                com.badlogic.gdx.utils.b<String, Matrix4> bVar2 = hVar.f47044c;
                if (bVar2 != null) {
                    this.f97016g.r(fVar, bVar2);
                }
            }
        }
        d2.e[] eVarArr = eVar.f47035g;
        if (eVarArr != null) {
            for (d2.e eVar2 : eVarArr) {
                cVar.a(c1(eVar2));
            }
        }
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void d1(Iterable<d2.e> iterable) {
        this.f97016g.clear();
        Iterator<d2.e> it = iterable.iterator();
        while (it.hasNext()) {
            this.f97011b.a(c1(it.next()));
        }
        l.a<c2.f, com.badlogic.gdx.utils.b<String, Matrix4>> it2 = this.f97016g.g().iterator();
        while (it2.hasNext()) {
            l.b next = it2.next();
            K k11 = next.f13394a;
            if (((c2.f) k11).f7513c == null) {
                ((c2.f) k11).f7513c = new com.badlogic.gdx.utils.b<>(c2.c.class, Matrix4.class);
            }
            ((c2.f) next.f13394a).f7513c.clear();
            Iterator it3 = ((com.badlogic.gdx.utils.b) next.f13395b).g().iterator();
            while (it3.hasNext()) {
                l.b bVar = (l.b) it3.next();
                ((c2.f) next.f13394a).f7513c.x(w0((String) bVar.f13394a), new Matrix4((Matrix4) bVar.f13395b).inv());
            }
        }
    }

    @Override // a3.q
    public void dispose() {
        a.b<q> it = this.f97015f.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
    }

    public void e1(q qVar) {
        if (this.f97015f.l(qVar, true)) {
            return;
        }
        this.f97015f.a(qVar);
    }

    public d i0(String str) {
        return n0(str, true);
    }

    public d n0(String str, boolean z11) {
        int i11 = this.f97010a.f13179b;
        int i12 = 0;
        if (z11) {
            while (i12 < i11) {
                d dVar = this.f97010a.get(i12);
                if (dVar.f97009d.equalsIgnoreCase(str)) {
                    return dVar;
                }
                i12++;
            }
            return null;
        }
        while (i12 < i11) {
            d dVar2 = this.f97010a.get(i12);
            if (dVar2.f97009d.equals(str)) {
                return dVar2;
            }
            i12++;
        }
        return null;
    }

    public void o() {
        int i11 = this.f97011b.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            this.f97011b.get(i12).h(true);
        }
        for (int i13 = 0; i13 < i11; i13++) {
            this.f97011b.get(i13).d(true);
        }
    }

    public c2.c w0(String str) {
        return C0(str, true);
    }

    public d z(ModelMaterial modelMaterial, l2.s sVar) {
        Texture load;
        d dVar = new d();
        dVar.f97009d = modelMaterial.f12144a;
        if (modelMaterial.f12146c != null) {
            dVar.v(new y1.b(y1.b.f98951k, modelMaterial.f12146c));
        }
        if (modelMaterial.f12147d != null) {
            dVar.v(new y1.b(y1.b.f98947g, modelMaterial.f12147d));
        }
        if (modelMaterial.f12148e != null) {
            dVar.v(new y1.b(y1.b.f98949i, modelMaterial.f12148e));
        }
        if (modelMaterial.f12149f != null) {
            dVar.v(new y1.b(y1.b.f98953m, modelMaterial.f12149f));
        }
        if (modelMaterial.f12150g != null) {
            dVar.v(new y1.b(y1.b.f98955o, modelMaterial.f12150g));
        }
        if (modelMaterial.f12151h > 0.0f) {
            dVar.v(new y1.f(y1.f.f98977g, modelMaterial.f12151h));
        }
        if (modelMaterial.f12152i != 1.0f) {
            dVar.v(new y1.a(com.badlogic.gdx.graphics.f.f11653r, com.badlogic.gdx.graphics.f.f11659s, modelMaterial.f12152i));
        }
        l lVar = new l();
        com.badlogic.gdx.utils.a<d2.i> aVar = modelMaterial.f12153j;
        if (aVar != null) {
            a.b<d2.i> it = aVar.iterator();
            while (it.hasNext()) {
                d2.i next = it.next();
                if (lVar.b(next.f47058b)) {
                    load = (Texture) lVar.k(next.f47058b);
                } else {
                    load = sVar.load(next.f47058b);
                    lVar.r(next.f47058b, load);
                    this.f97015f.a(load);
                }
                r rVar = new r(load);
                rVar.f69251b = load.Z();
                rVar.f69252c = load.R();
                rVar.f69253d = load.n0();
                rVar.f69254e = load.w0();
                Vector2 vector2 = next.f47059c;
                float f11 = vector2 == null ? 0.0f : vector2.f12535x;
                float f12 = vector2 == null ? 0.0f : vector2.f12536y;
                Vector2 vector22 = next.f47060d;
                float f13 = vector22 == null ? 1.0f : vector22.f12535x;
                float f14 = vector22 == null ? 1.0f : vector22.f12536y;
                int i11 = next.f47061e;
                if (i11 == 2) {
                    dVar.v(new y1.j(y1.j.f98991l, rVar, f11, f12, f13, f14));
                } else if (i11 == 3) {
                    dVar.v(new y1.j(y1.j.f99001v, rVar, f11, f12, f13, f14));
                } else if (i11 == 4) {
                    dVar.v(new y1.j(y1.j.f98999t, rVar, f11, f12, f13, f14));
                } else if (i11 == 5) {
                    dVar.v(new y1.j(y1.j.f98993n, rVar, f11, f12, f13, f14));
                } else if (i11 == 7) {
                    dVar.v(new y1.j(y1.j.f98997r, rVar, f11, f12, f13, f14));
                } else if (i11 == 8) {
                    dVar.v(new y1.j(y1.j.f98995p, rVar, f11, f12, f13, f14));
                } else if (i11 == 10) {
                    dVar.v(new y1.j(y1.j.f99003x, rVar, f11, f12, f13, f14));
                }
            }
        }
        return dVar;
    }

    public e(d2.b bVar) {
        this(bVar, new s.b());
    }

    public e(d2.b bVar, l2.s sVar) {
        this.f97010a = new com.badlogic.gdx.utils.a<>();
        this.f97011b = new com.badlogic.gdx.utils.a<>();
        this.f97012c = new com.badlogic.gdx.utils.a<>();
        this.f97013d = new com.badlogic.gdx.utils.a<>();
        this.f97014e = new com.badlogic.gdx.utils.a<>();
        this.f97015f = new com.badlogic.gdx.utils.a<>();
        this.f97016g = new l<>();
        Q0(bVar, sVar);
    }
}
