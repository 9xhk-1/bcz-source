package kk;

import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kk.h;
import pk.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class g<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final List<o.a<?>> f66649a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List<ik.b> f66650b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.e f66651c;

    /* renamed from: d, reason: collision with root package name */
    public Object f66652d;

    /* renamed from: e, reason: collision with root package name */
    public int f66653e;

    /* renamed from: f, reason: collision with root package name */
    public int f66654f;

    /* renamed from: g, reason: collision with root package name */
    public Class<?> f66655g;

    /* renamed from: h, reason: collision with root package name */
    public h.e f66656h;

    /* renamed from: i, reason: collision with root package name */
    public ik.e f66657i;

    /* renamed from: j, reason: collision with root package name */
    public Map<Class<?>, ik.h<?>> f66658j;

    /* renamed from: k, reason: collision with root package name */
    public Class<Transcode> f66659k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f66660l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f66661m;

    /* renamed from: n, reason: collision with root package name */
    public ik.b f66662n;

    /* renamed from: o, reason: collision with root package name */
    public Priority f66663o;

    /* renamed from: p, reason: collision with root package name */
    public j f66664p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f66665q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f66666r;

    public void a() {
        this.f66651c = null;
        this.f66652d = null;
        this.f66662n = null;
        this.f66655g = null;
        this.f66659k = null;
        this.f66657i = null;
        this.f66663o = null;
        this.f66658j = null;
        this.f66664p = null;
        this.f66649a.clear();
        this.f66660l = false;
        this.f66650b.clear();
        this.f66661m = false;
    }

    public lk.b b() {
        return this.f66651c.b();
    }

    public List<ik.b> c() {
        if (!this.f66661m) {
            this.f66661m = true;
            this.f66650b.clear();
            List<o.a<?>> g11 = g();
            int size = g11.size();
            for (int i11 = 0; i11 < size; i11++) {
                o.a<?> aVar = g11.get(i11);
                if (!this.f66650b.contains(aVar.f80728a)) {
                    this.f66650b.add(aVar.f80728a);
                }
                for (int i12 = 0; i12 < aVar.f80729b.size(); i12++) {
                    if (!this.f66650b.contains(aVar.f80729b.get(i12))) {
                        this.f66650b.add(aVar.f80729b.get(i12));
                    }
                }
            }
        }
        return this.f66650b;
    }

    public mk.a d() {
        return this.f66656h.a();
    }

    public j e() {
        return this.f66664p;
    }

    public int f() {
        return this.f66654f;
    }

    public List<o.a<?>> g() {
        if (!this.f66660l) {
            this.f66660l = true;
            this.f66649a.clear();
            List i11 = this.f66651c.i().i(this.f66652d);
            int size = i11.size();
            for (int i12 = 0; i12 < size; i12++) {
                o.a<?> buildLoadData = ((pk.o) i11.get(i12)).buildLoadData(this.f66652d, this.f66653e, this.f66654f, this.f66657i);
                if (buildLoadData != null) {
                    this.f66649a.add(buildLoadData);
                }
            }
        }
        return this.f66649a;
    }

    public <Data> s<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f66651c.i().h(cls, this.f66655g, this.f66659k);
    }

    public Class<?> i() {
        return this.f66652d.getClass();
    }

    public List<pk.o<File, ?>> j(File file) throws Registry.NoModelLoaderAvailableException {
        return this.f66651c.i().i(file);
    }

    public ik.e k() {
        return this.f66657i;
    }

    public Priority l() {
        return this.f66663o;
    }

    public List<Class<?>> m() {
        return this.f66651c.i().j(this.f66652d.getClass(), this.f66655g, this.f66659k);
    }

    public <Z> ik.g<Z> n(u<Z> uVar) {
        return this.f66651c.i().k(uVar);
    }

    public <T> com.bumptech.glide.load.data.e<T> o(T t11) {
        return this.f66651c.i().l(t11);
    }

    public ik.b p() {
        return this.f66662n;
    }

    public <X> ik.a<X> q(X x11) throws Registry.NoSourceEncoderAvailableException {
        return this.f66651c.i().m(x11);
    }

    public Class<?> r() {
        return this.f66659k;
    }

    public <Z> ik.h<Z> s(Class<Z> cls) {
        ik.h<Z> hVar = (ik.h) this.f66658j.get(cls);
        if (hVar == null) {
            Iterator<Map.Entry<Class<?>, ik.h<?>>> it = this.f66658j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<Class<?>, ik.h<?>> next = it.next();
                if (next.getKey().isAssignableFrom(cls)) {
                    hVar = (ik.h) next.getValue();
                    break;
                }
            }
        }
        if (hVar != null) {
            return hVar;
        }
        if (!this.f66658j.isEmpty() || !this.f66665q) {
            return rk.f.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public int t() {
        return this.f66653e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean u(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <R> void v(com.bumptech.glide.e eVar, Object obj, ik.b bVar, int i11, int i12, j jVar, Class<?> cls, Class<R> cls2, Priority priority, ik.e eVar2, Map<Class<?>, ik.h<?>> map, boolean z11, boolean z12, h.e eVar3) {
        this.f66651c = eVar;
        this.f66652d = obj;
        this.f66662n = bVar;
        this.f66653e = i11;
        this.f66654f = i12;
        this.f66664p = jVar;
        this.f66655g = cls;
        this.f66656h = eVar3;
        this.f66659k = cls2;
        this.f66663o = priority;
        this.f66657i = eVar2;
        this.f66658j = map;
        this.f66665q = z11;
        this.f66666r = z12;
    }

    public boolean w(u<?> uVar) {
        return this.f66651c.i().n(uVar);
    }

    public boolean x() {
        return this.f66666r;
    }

    public boolean y(ik.b bVar) {
        List<o.a<?>> g11 = g();
        int size = g11.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (g11.get(i11).f80728a.equals(bVar)) {
                return true;
            }
        }
        return false;
    }
}
