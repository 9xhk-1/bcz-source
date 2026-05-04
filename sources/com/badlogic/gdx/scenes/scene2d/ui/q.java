package com.badlogic.gdx.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.a;
import com.badlogic.gdx.graphics.g2d.e;
import com.badlogic.gdx.scenes.scene2d.ui.a;
import com.badlogic.gdx.scenes.scene2d.ui.a0;
import com.badlogic.gdx.scenes.scene2d.ui.b0;
import com.badlogic.gdx.scenes.scene2d.ui.d;
import com.badlogic.gdx.scenes.scene2d.ui.g0;
import com.badlogic.gdx.scenes.scene2d.ui.i;
import com.badlogic.gdx.scenes.scene2d.ui.j;
import com.badlogic.gdx.scenes.scene2d.ui.k;
import com.badlogic.gdx.scenes.scene2d.ui.l;
import com.badlogic.gdx.scenes.scene2d.ui.n;
import com.badlogic.gdx.scenes.scene2d.ui.o;
import com.badlogic.gdx.scenes.scene2d.ui.p;
import com.badlogic.gdx.scenes.scene2d.ui.r;
import com.badlogic.gdx.scenes.scene2d.ui.s;
import com.badlogic.gdx.scenes.scene2d.ui.v;
import com.badlogic.gdx.scenes.scene2d.ui.w;
import com.badlogic.gdx.scenes.scene2d.ui.x;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.SerializationException;
import com.badlogic.gdx.utils.f;
import com.badlogic.gdx.utils.l;
import com.badlogic.gdx.utils.reflect.ReflectionException;
import com.baicizhan.main.activity.GuideActivity;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class q implements a3.q {

    /* renamed from: e, reason: collision with root package name */
    public static final Class[] f13039e = {com.badlogic.gdx.graphics.g2d.a.class, com.badlogic.gdx.graphics.b.class, f.class, z2.m.class, z2.p.class, z2.q.class, z2.r.class, a.b.class, d.a.class, i.a.class, j.a.class, k.a.class, l.c.class, n.a.class, o.d.class, p.d.class, r.b.class, s.b.class, v.a.class, w.h.class, x.a.class, a0.b.class, b0.d.class, g0.d.class};

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.graphics.g2d.e f13041b;

    /* renamed from: d, reason: collision with root package name */
    public final com.badlogic.gdx.utils.l<String, Class> f13043d;

    /* renamed from: a, reason: collision with root package name */
    public com.badlogic.gdx.utils.l<Class, com.badlogic.gdx.utils.l<String, Object>> f13040a = new com.badlogic.gdx.utils.l<>();

    /* renamed from: c, reason: collision with root package name */
    public float f13042c = 1.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends com.badlogic.gdx.utils.f {

        /* renamed from: u, reason: collision with root package name */
        public static final String f13044u = "parent";

        public a() {
        }

        @Override // com.badlogic.gdx.utils.f
        public void I(Object obj, JsonValue jsonValue) {
            if (jsonValue.X(f13044u)) {
                String str = (String) M(f13044u, String.class, jsonValue);
                Class<?> cls = obj.getClass();
                do {
                    try {
                        d(q.this.X(str, cls), obj);
                    } catch (GdxRuntimeException unused) {
                        cls = cls.getSuperclass();
                    }
                } while (cls != Object.class);
                SerializationException serializationException = new SerializationException("Unable to find parent resource with name: " + str);
                serializationException.addTrace(jsonValue.f13156f.P0());
                throw serializationException;
            }
            super.I(obj, jsonValue);
        }

        @Override // com.badlogic.gdx.utils.f
        public <T> T K(Class<T> cls, Class cls2, JsonValue jsonValue) {
            return (jsonValue == null || !jsonValue.l0() || g3.c.y(CharSequence.class, cls)) ? (T) super.K(cls, cls2, jsonValue) : (T) q.this.X(jsonValue.v(), cls);
        }

        @Override // com.badlogic.gdx.utils.f
        public boolean v(Class cls, String str) {
            return str.equals(f13044u);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends f.b<q> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q f13046a;

        public b(q qVar) {
            this.f13046a = qVar;
        }

        @Override // com.badlogic.gdx.utils.f.b, com.badlogic.gdx.utils.f.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q b(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue, Class cls) {
            for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
                try {
                    Class o11 = fVar.o(jsonValue2.q0());
                    if (o11 == null) {
                        o11 = g3.c.a(jsonValue2.q0());
                    }
                    d(fVar, o11, jsonValue2);
                } catch (ReflectionException e11) {
                    throw new SerializationException(e11);
                }
            }
            return this.f13046a;
        }

        public final void d(com.badlogic.gdx.utils.f fVar, Class cls, JsonValue jsonValue) {
            Class cls2 = cls == f.class ? z2.k.class : cls;
            for (JsonValue jsonValue2 = jsonValue.f13156f; jsonValue2 != null; jsonValue2 = jsonValue2.f13158h) {
                Object J = fVar.J(cls, jsonValue2);
                if (J != null) {
                    try {
                        q.this.o(jsonValue2.f13155e, J, cls2);
                        if (cls2 != z2.k.class && g3.c.y(z2.k.class, cls2)) {
                            q.this.o(jsonValue2.f13155e, J, z2.k.class);
                        }
                    } catch (Exception e11) {
                        throw new SerializationException("Error reading " + g3.c.t(cls) + ": " + jsonValue2.f13155e, e11);
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends f.b<com.badlogic.gdx.graphics.g2d.a> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v1.a f13048a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f13049b;

        public c(v1.a aVar, q qVar) {
            this.f13048a = aVar;
            this.f13049b = qVar;
        }

        @Override // com.badlogic.gdx.utils.f.b, com.badlogic.gdx.utils.f.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.badlogic.gdx.graphics.g2d.a b(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue, Class cls) {
            com.badlogic.gdx.graphics.g2d.a aVar;
            String str = (String) fVar.M("file", String.class, jsonValue);
            float floatValue = ((Float) fVar.P("scaledSize", Float.TYPE, Float.valueOf(-1.0f), jsonValue)).floatValue();
            Boolean bool = Boolean.FALSE;
            Boolean bool2 = (Boolean) fVar.P("flip", Boolean.class, bool, jsonValue);
            Boolean bool3 = (Boolean) fVar.P("markupEnabled", Boolean.class, bool, jsonValue);
            Boolean bool4 = (Boolean) fVar.P("useIntegerPositions", Boolean.class, Boolean.TRUE, jsonValue);
            v1.a a11 = this.f13048a.B().a(str);
            if (!a11.l()) {
                a11 = q1.g.f81382e.a(str);
            }
            if (!a11.l()) {
                throw new SerializationException("Font file not found: " + a11);
            }
            String A = a11.A();
            try {
                com.badlogic.gdx.utils.a<w1.o> b12 = this.f13049b.b1(A);
                if (b12 != null) {
                    aVar = new com.badlogic.gdx.graphics.g2d.a(new a.C0189a(a11, bool2.booleanValue()), b12, true);
                } else {
                    w1.o oVar = (w1.o) this.f13049b.m1(A, w1.o.class);
                    if (oVar != null) {
                        aVar = new com.badlogic.gdx.graphics.g2d.a(a11, oVar, bool2.booleanValue());
                    } else {
                        v1.a a12 = a11.B().a(A + GuideActivity.f17949k);
                        aVar = a12.l() ? new com.badlogic.gdx.graphics.g2d.a(a11, a12, bool2.booleanValue()) : new com.badlogic.gdx.graphics.g2d.a(a11, bool2.booleanValue());
                    }
                }
                aVar.i0().f12017q = bool3.booleanValue();
                aVar.k1(bool4.booleanValue());
                if (floatValue != -1.0f) {
                    aVar.i0().p(floatValue / aVar.Z());
                }
                return aVar;
            } catch (RuntimeException e11) {
                throw new SerializationException("Error loading bitmap font: " + a11, e11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends f.b<com.badlogic.gdx.graphics.b> {
        public d() {
        }

        @Override // com.badlogic.gdx.utils.f.b, com.badlogic.gdx.utils.f.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.badlogic.gdx.graphics.b b(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue, Class cls) {
            Float valueOf = Float.valueOf(0.0f);
            if (jsonValue.l0()) {
                return (com.badlogic.gdx.graphics.b) q.this.X(jsonValue.v(), com.badlogic.gdx.graphics.b.class);
            }
            String str = (String) fVar.P("hex", String.class, null, jsonValue);
            if (str != null) {
                return com.badlogic.gdx.graphics.b.R(str);
            }
            Class cls2 = Float.TYPE;
            return new com.badlogic.gdx.graphics.b(((Float) fVar.P(en.r.f50027a, cls2, valueOf, jsonValue)).floatValue(), ((Float) fVar.P("g", cls2, valueOf, jsonValue)).floatValue(), ((Float) fVar.P(yr.e.f100279a, cls2, valueOf, jsonValue)).floatValue(), ((Float) fVar.P("a", cls2, Float.valueOf(1.0f), jsonValue)).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends f.b {
        public e() {
        }

        @Override // com.badlogic.gdx.utils.f.b, com.badlogic.gdx.utils.f.d
        public Object b(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue, Class cls) {
            String str = (String) fVar.M("name", String.class, jsonValue);
            com.badlogic.gdx.graphics.b bVar = (com.badlogic.gdx.graphics.b) fVar.M("color", com.badlogic.gdx.graphics.b.class, jsonValue);
            if (bVar == null) {
                throw new SerializationException("TintedDrawable missing color: " + jsonValue);
            }
            z2.k i12 = q.this.i1(str, bVar);
            if (i12 instanceof z2.c) {
                ((z2.c) i12).e(jsonValue.f13155e + " (" + str + j2.O + bVar + pn.j.f81007d);
            }
            return i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public String f13053a;

        /* renamed from: b, reason: collision with root package name */
        public com.badlogic.gdx.graphics.b f13054b;
    }

    public q() {
        Class[] clsArr = f13039e;
        this.f13043d = new com.badlogic.gdx.utils.l<>(clsArr.length);
        for (Class cls : clsArr) {
            this.f13043d.r(cls.getSimpleName(), cls);
        }
    }

    @a3.d0
    public static g3.f I(Class cls, String str) {
        for (g3.f fVar : g3.c.s(cls)) {
            if (fVar.d().equals(str)) {
                return fVar;
            }
        }
        return null;
    }

    public com.badlogic.gdx.graphics.g2d.a C0(String str) {
        return (com.badlogic.gdx.graphics.g2d.a) X(str, com.badlogic.gdx.graphics.g2d.a.class);
    }

    @a3.d0
    public String D(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("style cannot be null.");
        }
        com.badlogic.gdx.utils.l<String, Object> k11 = this.f13040a.k(obj.getClass());
        if (k11 == null) {
            return null;
        }
        return k11.j(obj, true);
    }

    public com.badlogic.gdx.utils.l<String, Class> J0() {
        return this.f13043d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public com.badlogic.gdx.utils.f Q0(v1.a aVar) {
        a aVar2 = new a();
        aVar2.b0(null);
        aVar2.c0(false);
        aVar2.Z(q.class, new b(this));
        aVar2.Z(com.badlogic.gdx.graphics.g2d.a.class, new c(aVar, this));
        aVar2.Z(com.badlogic.gdx.graphics.b.class, new d());
        aVar2.Z(f.class, new e());
        l.a<String, Class> it = this.f13043d.iterator();
        while (it.hasNext()) {
            l.b next = it.next();
            aVar2.a((String) next.f13394a, (Class) next.f13395b);
        }
        return aVar2;
    }

    public <T> T R(Class<T> cls) {
        return (T) X("default", cls);
    }

    public w1.c V0(String str) {
        int[] D;
        w1.c cVar = (w1.c) m1(str, w1.c.class);
        if (cVar != null) {
            return cVar;
        }
        try {
            w1.o a12 = a1(str);
            if ((a12 instanceof e.a) && (D = ((e.a) a12).D("split")) != null) {
                w1.c cVar2 = new w1.c(a12, D[0], D[1], D[2], D[3]);
                if (((e.a) a12).D("pad") != null) {
                    cVar2.E(r4[0], r4[1], r4[2], r4[3]);
                }
                cVar = cVar2;
            }
            if (cVar == null) {
                cVar = new w1.c(a12);
            }
            float f11 = this.f13042c;
            if (f11 != 1.0f) {
                cVar.t(f11, f11);
            }
            o(str, cVar, w1.c.class);
            return cVar;
        } catch (GdxRuntimeException unused) {
            throw new GdxRuntimeException("No NinePatch, TextureRegion, or Texture registered with name: " + str);
        }
    }

    public <T> T X(String str, Class<T> cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        if (cls == z2.k.class) {
            return (T) w0(str);
        }
        if (cls == w1.o.class) {
            return (T) a1(str);
        }
        if (cls == w1.c.class) {
            return (T) V0(str);
        }
        if (cls == w1.l.class) {
            return (T) c1(str);
        }
        com.badlogic.gdx.utils.l<String, Object> k11 = this.f13040a.k(cls);
        if (k11 == null) {
            throw new GdxRuntimeException("No " + cls.getName() + " registered with name: " + str);
        }
        T t11 = (T) k11.k(str);
        if (t11 != null) {
            return t11;
        }
        throw new GdxRuntimeException("No " + cls.getName() + " registered with name: " + str);
    }

    @a3.d0
    public <T> com.badlogic.gdx.utils.l<String, T> Z(Class<T> cls) {
        return (com.badlogic.gdx.utils.l) this.f13040a.k(cls);
    }

    public w1.o a1(String str) {
        w1.o oVar = (w1.o) m1(str, w1.o.class);
        if (oVar != null) {
            return oVar;
        }
        Texture texture = (Texture) m1(str, Texture.class);
        if (texture != null) {
            w1.o oVar2 = new w1.o(texture);
            o(str, oVar2, w1.o.class);
            return oVar2;
        }
        throw new GdxRuntimeException("No TextureRegion or Texture registered with name: " + str);
    }

    public void b(String str, Object obj) {
        o(str, obj, obj.getClass());
    }

    @a3.d0
    public com.badlogic.gdx.utils.a<w1.o> b1(String str) {
        w1.o oVar = (w1.o) m1(str + "_0", w1.o.class);
        if (oVar == null) {
            return null;
        }
        com.badlogic.gdx.utils.a<w1.o> aVar = new com.badlogic.gdx.utils.a<>();
        int i11 = 1;
        while (oVar != null) {
            aVar.a(oVar);
            oVar = (w1.o) m1(str + "_" + i11, w1.o.class);
            i11++;
        }
        return aVar;
    }

    public w1.l c1(String str) {
        w1.l lVar = (w1.l) m1(str, w1.l.class);
        if (lVar != null) {
            return lVar;
        }
        try {
            w1.o a12 = a1(str);
            if (a12 instanceof e.a) {
                e.a aVar = (e.a) a12;
                if (aVar.f12079p || aVar.f12075l != aVar.f12077n || aVar.f12076m != aVar.f12078o) {
                    lVar = new e.b(aVar);
                }
            }
            if (lVar == null) {
                lVar = new w1.l(a12);
            }
            if (this.f13042c != 1.0f) {
                lVar.m0(lVar.P() * this.f13042c, lVar.H() * this.f13042c);
            }
            o(str, lVar, w1.l.class);
            return lVar;
        } catch (GdxRuntimeException unused) {
            throw new GdxRuntimeException("No NinePatch, TextureRegion, or Texture registered with name: " + str);
        }
    }

    public z2.r d1(String str) {
        z2.r rVar = (z2.r) m1(str, z2.r.class);
        if (rVar != null) {
            return rVar;
        }
        z2.r rVar2 = new z2.r(a1(str));
        rVar2.e(str);
        if (this.f13042c != 1.0f) {
            o1(rVar2);
            rVar2.A(this.f13042c);
        }
        o(str, rVar2, z2.r.class);
        return rVar2;
    }

    @Override // a3.q
    public void dispose() {
        com.badlogic.gdx.graphics.g2d.e eVar = this.f13041b;
        if (eVar != null) {
            eVar.dispose();
        }
        l.e<com.badlogic.gdx.utils.l<String, Object>> it = this.f13040a.z().iterator();
        while (it.hasNext()) {
            l.e<Object> it2 = it.next().z().iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (next instanceof a3.q) {
                    ((a3.q) next).dispose();
                }
            }
        }
    }

    public boolean e1(String str, Class cls) {
        com.badlogic.gdx.utils.l<String, Object> k11 = this.f13040a.k(cls);
        if (k11 == null) {
            return false;
        }
        return k11.b(str);
    }

    public void f1(v1.a aVar) {
        try {
            Q0(aVar).m(q.class, aVar);
        } catch (SerializationException e11) {
            throw new SerializationException("Error reading file: " + aVar, e11);
        }
    }

    public z2.k g1(String str) {
        return j1(w0(str));
    }

    public z2.k h1(String str, float f11, float f12, float f13, float f14) {
        return l1(w0(str), new com.badlogic.gdx.graphics.b(f11, f12, f13, f14));
    }

    @a3.d0
    public com.badlogic.gdx.graphics.g2d.e i0() {
        return this.f13041b;
    }

    public z2.k i1(String str, com.badlogic.gdx.graphics.b bVar) {
        return l1(w0(str), bVar);
    }

    public z2.k j1(z2.k kVar) {
        if (kVar instanceof z2.r) {
            return new z2.r((z2.r) kVar);
        }
        if (kVar instanceof z2.q) {
            return new z2.q((z2.q) kVar);
        }
        if (kVar instanceof z2.m) {
            return new z2.m((z2.m) kVar);
        }
        if (kVar instanceof z2.p) {
            return new z2.p((z2.p) kVar);
        }
        throw new GdxRuntimeException("Unable to copy, unknown drawable type: " + kVar.getClass());
    }

    public z2.k k1(z2.k kVar, float f11, float f12, float f13, float f14) {
        return l1(kVar, new com.badlogic.gdx.graphics.b(f11, f12, f13, f14));
    }

    public z2.k l1(z2.k kVar, com.badlogic.gdx.graphics.b bVar) {
        z2.k i11;
        if (kVar instanceof z2.q) {
            i11 = ((z2.q) kVar).i(bVar);
        } else if (kVar instanceof z2.m) {
            i11 = ((z2.m) kVar).i(bVar);
        } else {
            if (!(kVar instanceof z2.p)) {
                throw new GdxRuntimeException("Unable to copy, unknown drawable type: " + kVar.getClass());
            }
            i11 = ((z2.p) kVar).i(bVar);
        }
        if (i11 instanceof z2.c) {
            z2.c cVar = (z2.c) i11;
            if (kVar instanceof z2.c) {
                cVar.e(((z2.c) kVar).c() + " (" + bVar + pn.j.f81007d);
                return i11;
            }
            cVar.e(" (" + bVar + pn.j.f81007d);
        }
        return i11;
    }

    @a3.d0
    public <T> T m1(String str, Class<T> cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        if (cls == null) {
            throw new IllegalArgumentException("type cannot be null.");
        }
        com.badlogic.gdx.utils.l<String, Object> k11 = this.f13040a.k(cls);
        if (k11 == null) {
            return null;
        }
        return (T) k11.k(str);
    }

    public com.badlogic.gdx.graphics.b n0(String str) {
        return (com.badlogic.gdx.graphics.b) X(str, com.badlogic.gdx.graphics.b.class);
    }

    public void n1(String str, Class cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f13040a.k(cls).u(str);
    }

    public void o(String str, Object obj, Class cls) {
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        if (obj == null) {
            throw new IllegalArgumentException("resource cannot be null.");
        }
        com.badlogic.gdx.utils.l<String, Object> k11 = this.f13040a.k(cls);
        if (k11 == null) {
            k11 = new com.badlogic.gdx.utils.l<>((cls == w1.o.class || cls == z2.k.class || cls == w1.l.class) ? 256 : 64);
            this.f13040a.r(cls, k11);
        }
        k11.r(str, obj);
    }

    public void o1(z2.k kVar) {
        kVar.p(kVar.z() * this.f13042c);
        kVar.q(kVar.u() * this.f13042c);
        kVar.r(kVar.s() * this.f13042c);
        kVar.t(kVar.w() * this.f13042c);
        kVar.x(kVar.b() * this.f13042c);
        kVar.v(kVar.o() * this.f13042c);
    }

    public void p1(com.badlogic.gdx.scenes.scene2d.a aVar, boolean z11) {
        g3.f I = I(aVar.getClass(), "getStyle");
        if (I == null) {
            return;
        }
        try {
            Object g11 = I.g(aVar, new Object[0]);
            String D = D(g11);
            if (D == null) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(D.replace("-disabled", ""));
            sb2.append(z11 ? "" : "-disabled");
            Object X = X(sb2.toString(), g11.getClass());
            g3.f I2 = I(aVar.getClass(), "setStyle");
            if (I2 == null) {
                return;
            }
            I2.g(aVar, X);
        } catch (Exception unused) {
        }
    }

    public void q1(float f11) {
        this.f13042c = f11;
    }

    public z2.k w0(String str) {
        z2.k pVar;
        z2.k pVar2;
        z2.k kVar = (z2.k) m1(str, z2.k.class);
        if (kVar != null) {
            return kVar;
        }
        try {
            w1.o a12 = a1(str);
            if (a12 instanceof e.a) {
                e.a aVar = (e.a) a12;
                if (aVar.D("split") != null) {
                    pVar2 = new z2.m(V0(str));
                } else if (aVar.f12079p || aVar.f12075l != aVar.f12077n || aVar.f12076m != aVar.f12078o) {
                    pVar2 = new z2.p(c1(str));
                }
                kVar = pVar2;
            }
            if (kVar == null) {
                z2.k qVar = new z2.q(a12);
                try {
                    if (this.f13042c != 1.0f) {
                        o1(qVar);
                    }
                } catch (GdxRuntimeException unused) {
                }
                kVar = qVar;
            }
        } catch (GdxRuntimeException unused2) {
        }
        if (kVar == null) {
            w1.c cVar = (w1.c) m1(str, w1.c.class);
            if (cVar != null) {
                pVar = new z2.m(cVar);
            } else {
                w1.l lVar = (w1.l) m1(str, w1.l.class);
                if (lVar == null) {
                    throw new GdxRuntimeException("No Drawable, NinePatch, TextureRegion, Texture, or Sprite registered with name: " + str);
                }
                pVar = new z2.p(lVar);
            }
            kVar = pVar;
        }
        if (kVar instanceof z2.c) {
            ((z2.c) kVar).e(str);
        }
        o(str, kVar, z2.k.class);
        return kVar;
    }

    public void z(com.badlogic.gdx.graphics.g2d.e eVar) {
        com.badlogic.gdx.utils.a<e.a> w02 = eVar.w0();
        int i11 = w02.f13179b;
        for (int i12 = 0; i12 < i11; i12++) {
            e.a aVar = w02.get(i12);
            String str = aVar.f12072i;
            if (aVar.f12071h != -1) {
                str = str + "_" + aVar.f12071h;
            }
            o(str, aVar, w1.o.class);
        }
    }

    public q(v1.a aVar) {
        Class[] clsArr = f13039e;
        this.f13043d = new com.badlogic.gdx.utils.l<>(clsArr.length);
        for (Class cls : clsArr) {
            this.f13043d.r(cls.getSimpleName(), cls);
        }
        v1.a O = aVar.O(aVar.A() + ".atlas");
        if (O.l()) {
            com.badlogic.gdx.graphics.g2d.e eVar = new com.badlogic.gdx.graphics.g2d.e(O);
            this.f13041b = eVar;
            z(eVar);
        }
        f1(aVar);
    }

    public q(v1.a aVar, com.badlogic.gdx.graphics.g2d.e eVar) {
        Class[] clsArr = f13039e;
        this.f13043d = new com.badlogic.gdx.utils.l<>(clsArr.length);
        for (Class cls : clsArr) {
            this.f13043d.r(cls.getSimpleName(), cls);
        }
        this.f13041b = eVar;
        z(eVar);
        f1(aVar);
    }

    public q(com.badlogic.gdx.graphics.g2d.e eVar) {
        Class[] clsArr = f13039e;
        this.f13043d = new com.badlogic.gdx.utils.l<>(clsArr.length);
        for (Class cls : clsArr) {
            this.f13043d.r(cls.getSimpleName(), cls);
        }
        this.f13041b = eVar;
        z(eVar);
    }
}
