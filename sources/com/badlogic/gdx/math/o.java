package com.badlogic.gdx.math;

import a3.j0;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.math.collision.Ray;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final Vector3 f12700e = new Vector3();

    /* renamed from: a, reason: collision with root package name */
    public final int f12701a;

    /* renamed from: b, reason: collision with root package name */
    public final j0<o<T>.c> f12702b = new a();

    /* renamed from: c, reason: collision with root package name */
    public o<T>.c f12703c;

    /* renamed from: d, reason: collision with root package name */
    public final b<T> f12704d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j0<o<T>.c> {
        public a() {
        }

        @Override // a3.j0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public o<T>.c g() {
            return new c();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<T> {
        float a(Ray ray, T t11);

        boolean b(j jVar, T t11);

        boolean c(BoundingBox boundingBox, T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f12706a;

        /* renamed from: b, reason: collision with root package name */
        public final BoundingBox f12707b = new BoundingBox();

        /* renamed from: c, reason: collision with root package name */
        public boolean f12708c;

        /* renamed from: d, reason: collision with root package name */
        public c[] f12709d;

        /* renamed from: e, reason: collision with root package name */
        public final com.badlogic.gdx.utils.a<T> f12710e;

        public c() {
            this.f12710e = new com.badlogic.gdx.utils.a<>(Math.min(16, o.this.f12701a));
        }

        public void a(T t11) {
            if (o.this.f12704d.c(this.f12707b, t11)) {
                int i11 = 0;
                if (!this.f12708c) {
                    c[] cVarArr = this.f12709d;
                    int length = cVarArr.length;
                    while (i11 < length) {
                        cVarArr[i11].a(t11);
                        i11++;
                    }
                    return;
                }
                com.badlogic.gdx.utils.a<T> aVar = this.f12710e;
                if (aVar.f13179b < o.this.f12701a || this.f12706a <= 0) {
                    aVar.a(t11);
                    return;
                }
                l();
                c[] cVarArr2 = this.f12709d;
                int length2 = cVarArr2.length;
                while (i11 < length2) {
                    cVarArr2[i11].a(t11);
                    i11++;
                }
            }
        }

        public final void b() {
            for (int i11 = 0; i11 < 8; i11++) {
                this.f12709d[i11].c();
                this.f12709d[i11] = null;
            }
        }

        public final void c() {
            this.f12710e.clear();
            if (!this.f12708c) {
                b();
            }
            o.this.f12702b.d(this);
        }

        public void d(com.badlogic.gdx.utils.m<T> mVar) {
            if (!this.f12708c) {
                for (c cVar : this.f12709d) {
                    cVar.d(mVar);
                }
            }
            mVar.a(this.f12710e);
        }

        public void e(com.badlogic.gdx.utils.m<BoundingBox> mVar) {
            if (!this.f12708c) {
                for (c cVar : this.f12709d) {
                    cVar.e(mVar);
                }
            }
            mVar.add(this.f12707b);
        }

        public boolean f() {
            return this.f12708c;
        }

        public final void g() {
            b();
            this.f12708c = true;
        }

        public void h(j jVar, com.badlogic.gdx.utils.m<T> mVar) {
            if (m.i(jVar, this.f12707b)) {
                if (this.f12708c) {
                    a.b<T> it = this.f12710e.iterator();
                    while (it.hasNext()) {
                        T next = it.next();
                        if (o.this.f12704d.b(jVar, next)) {
                            mVar.add(next);
                        }
                    }
                    return;
                }
                for (c cVar : this.f12709d) {
                    cVar.h(jVar, mVar);
                }
            }
        }

        public void i(BoundingBox boundingBox, com.badlogic.gdx.utils.m<T> mVar) {
            if (boundingBox.intersects(this.f12707b)) {
                if (this.f12708c) {
                    a.b<T> it = this.f12710e.iterator();
                    while (it.hasNext()) {
                        T next = it.next();
                        if (o.this.f12704d.c(this.f12707b, next)) {
                            mVar.add(next);
                        }
                    }
                    return;
                }
                for (c cVar : this.f12709d) {
                    cVar.i(boundingBox, mVar);
                }
            }
        }

        public void j(Ray ray, d<T> dVar) {
            BoundingBox boundingBox = this.f12707b;
            Vector3 vector3 = o.f12700e;
            if (m.s(ray, boundingBox, vector3) && vector3.dst2(ray.origin) < dVar.f12714c) {
                if (!this.f12708c) {
                    for (c cVar : this.f12709d) {
                        cVar.j(ray, dVar);
                    }
                    return;
                }
                a.b<T> it = this.f12710e.iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    float a11 = o.this.f12704d.a(ray, next);
                    if (dVar.f12712a == null || a11 < dVar.f12713b) {
                        dVar.f12712a = next;
                        dVar.f12713b = a11;
                    }
                }
            }
        }

        public boolean k(T t11) {
            if (this.f12708c) {
                return this.f12710e.C(t11, true);
            }
            boolean z11 = false;
            for (c cVar : this.f12709d) {
                z11 |= cVar.k(t11);
            }
            if (z11) {
                com.badlogic.gdx.utils.m<T> mVar = new com.badlogic.gdx.utils.m<>();
                for (c cVar2 : this.f12709d) {
                    cVar2.d(mVar);
                }
                if (mVar.f13401a <= o.this.f12701a) {
                    m.a<T> it = mVar.iterator();
                    while (it.hasNext()) {
                        this.f12710e.a(it.next());
                    }
                    g();
                }
            }
            return z11;
        }

        public final void l() {
            BoundingBox boundingBox = this.f12707b;
            Vector3 vector3 = boundingBox.max;
            float f11 = vector3.f12537x;
            Vector3 vector32 = boundingBox.min;
            float f12 = (f11 + vector32.f12537x) * 0.5f;
            float f13 = (vector3.f12538y + vector32.f12538y) * 0.5f;
            float f14 = (vector3.f12539z + vector32.f12539z) * 0.5f;
            int i11 = this.f12706a - 1;
            this.f12708c = false;
            if (this.f12709d == null) {
                this.f12709d = new c[8];
            }
            c[] cVarArr = this.f12709d;
            o oVar = o.this;
            Vector3 vector33 = new Vector3(this.f12707b.min.f12537x, f13, f14);
            Vector3 vector34 = this.f12707b.max;
            cVarArr[0] = oVar.b(vector33, new Vector3(f12, vector34.f12538y, vector34.f12539z), i11);
            c[] cVarArr2 = this.f12709d;
            o oVar2 = o.this;
            Vector3 vector35 = new Vector3(f12, f13, f14);
            Vector3 vector36 = this.f12707b.max;
            cVarArr2[1] = oVar2.b(vector35, new Vector3(vector36.f12537x, vector36.f12538y, vector36.f12539z), i11);
            c[] cVarArr3 = this.f12709d;
            o oVar3 = o.this;
            Vector3 vector37 = new Vector3(f12, f13, this.f12707b.min.f12539z);
            Vector3 vector38 = this.f12707b.max;
            cVarArr3[2] = oVar3.b(vector37, new Vector3(vector38.f12537x, vector38.f12538y, f14), i11);
            c[] cVarArr4 = this.f12709d;
            o oVar4 = o.this;
            Vector3 vector39 = this.f12707b.min;
            cVarArr4[3] = oVar4.b(new Vector3(vector39.f12537x, f13, vector39.f12539z), new Vector3(f12, this.f12707b.max.f12538y, f14), i11);
            c[] cVarArr5 = this.f12709d;
            o oVar5 = o.this;
            Vector3 vector310 = this.f12707b.min;
            cVarArr5[4] = oVar5.b(new Vector3(vector310.f12537x, vector310.f12538y, f14), new Vector3(f12, f13, this.f12707b.max.f12539z), i11);
            c[] cVarArr6 = this.f12709d;
            o oVar6 = o.this;
            Vector3 vector311 = new Vector3(f12, this.f12707b.min.f12538y, f14);
            Vector3 vector312 = this.f12707b.max;
            cVarArr6[5] = oVar6.b(vector311, new Vector3(vector312.f12537x, f13, vector312.f12539z), i11);
            c[] cVarArr7 = this.f12709d;
            o oVar7 = o.this;
            Vector3 vector313 = this.f12707b.min;
            cVarArr7[6] = oVar7.b(new Vector3(f12, vector313.f12538y, vector313.f12539z), new Vector3(this.f12707b.max.f12537x, f13, f14), i11);
            c[] cVarArr8 = this.f12709d;
            o oVar8 = o.this;
            Vector3 vector314 = this.f12707b.min;
            cVarArr8[7] = oVar8.b(new Vector3(vector314.f12537x, vector314.f12538y, vector314.f12539z), new Vector3(f12, f13, f14), i11);
            for (c cVar : this.f12709d) {
                a.b<T> it = this.f12710e.iterator();
                while (it.hasNext()) {
                    cVar.a(it.next());
                }
            }
            this.f12710e.clear();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<T> {

        /* renamed from: a, reason: collision with root package name */
        public T f12712a;

        /* renamed from: b, reason: collision with root package name */
        public float f12713b;

        /* renamed from: c, reason: collision with root package name */
        public float f12714c = Float.MAX_VALUE;
    }

    public o(Vector3 vector3, Vector3 vector32, int i11, int i12, b<T> bVar) {
        this.f12703c = b(new Vector3(Math.min(vector3.f12537x, vector32.f12537x), Math.min(vector3.f12538y, vector32.f12538y), Math.min(vector3.f12539z, vector32.f12539z)), new Vector3(Math.max(vector3.f12537x, vector32.f12537x), Math.max(vector3.f12538y, vector32.f12538y), Math.max(vector3.f12539z, vector32.f12539z)), i11);
        this.f12704d = bVar;
        this.f12701a = i12;
    }

    public void a(T t11) {
        this.f12703c.a(t11);
    }

    public o<T>.c b(Vector3 vector3, Vector3 vector32, int i11) {
        o<T>.c h11 = this.f12702b.h();
        h11.f12707b.set(vector3, vector32);
        h11.f12706a = i11;
        h11.f12708c = true;
        return h11;
    }

    public com.badlogic.gdx.utils.m<T> c(com.badlogic.gdx.utils.m<T> mVar) {
        this.f12703c.d(mVar);
        return mVar;
    }

    public com.badlogic.gdx.utils.m<BoundingBox> d(com.badlogic.gdx.utils.m<BoundingBox> mVar) {
        this.f12703c.e(mVar);
        return mVar;
    }

    public com.badlogic.gdx.utils.m<T> e(j jVar, com.badlogic.gdx.utils.m<T> mVar) {
        this.f12703c.h(jVar, mVar);
        return mVar;
    }

    public com.badlogic.gdx.utils.m<T> f(BoundingBox boundingBox, com.badlogic.gdx.utils.m<T> mVar) {
        this.f12703c.i(boundingBox, mVar);
        return mVar;
    }

    public T g(Ray ray, d<T> dVar) {
        dVar.f12713b = dVar.f12714c;
        this.f12703c.j(ray, dVar);
        return dVar.f12712a;
    }

    public void h(T t11) {
        this.f12703c.k(t11);
    }

    public void i(T t11) {
        this.f12703c.k(t11);
        this.f12703c.a(t11);
    }
}
