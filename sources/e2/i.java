package e2;

import a3.v;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.JsonValue;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.f;
import com.badlogic.gdx.utils.l;
import com.badlogic.gdx.utils.reflect.ReflectionException;
import ix.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i<T> implements f.c {

    /* renamed from: a, reason: collision with root package name */
    public l<String, c> f48418a;

    /* renamed from: b, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<c> f48419b;

    /* renamed from: c, reason: collision with root package name */
    public com.badlogic.gdx.utils.a<a> f48420c;

    /* renamed from: d, reason: collision with root package name */
    public int f48421d;

    /* renamed from: e, reason: collision with root package name */
    public T f48422e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<T> implements f.c {

        /* renamed from: a, reason: collision with root package name */
        public String f48423a;

        /* renamed from: b, reason: collision with root package name */
        public Class<T> f48424b;

        public a() {
        }

        @Override // com.badlogic.gdx.utils.f.c
        public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
            this.f48423a = (String) fVar.M(g.b.f62788b, String.class, jsonValue);
            String str = (String) fVar.M("type", String.class, jsonValue);
            try {
                this.f48424b = g3.c.a(str);
            } catch (ReflectionException e11) {
                throw new GdxRuntimeException("Class not found: " + str, e11);
            }
        }

        @Override // com.badlogic.gdx.utils.f.c
        public void z(com.badlogic.gdx.utils.f fVar) {
            fVar.F0(g.b.f62788b, this.f48423a);
            fVar.F0("type", this.f48424b.getName());
        }

        public a(String str, Class<T> cls) {
            this.f48423a = str;
            this.f48424b = cls;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b<T> {
        void b(r1.e eVar, i<T> iVar);

        void o(r1.e eVar, i<T> iVar);
    }

    public i() {
        this.f48418a = new l<>();
        this.f48419b = new com.badlogic.gdx.utils.a<>(true, 3, c.class);
        this.f48420c = new com.badlogic.gdx.utils.a<>();
        this.f48421d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.badlogic.gdx.utils.f.c
    public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
        l<String, c> lVar = (l) fVar.M("unique", l.class, jsonValue);
        this.f48418a = lVar;
        l.a<String, c> it = lVar.g().iterator();
        while (it.hasNext()) {
            ((c) it.next().f13395b).f48428d = this;
        }
        com.badlogic.gdx.utils.a<c> aVar = (com.badlogic.gdx.utils.a) fVar.N("data", com.badlogic.gdx.utils.a.class, c.class, jsonValue);
        this.f48419b = aVar;
        a.b<c> it2 = aVar.iterator();
        while (it2.hasNext()) {
            it2.next().f48428d = this;
        }
        this.f48420c.g((com.badlogic.gdx.utils.a) fVar.N("assets", com.badlogic.gdx.utils.a.class, a.class, jsonValue));
        this.f48422e = (T) fVar.M("resource", null, jsonValue);
    }

    public c a() {
        c cVar = new c(this);
        this.f48419b.a(cVar);
        return cVar;
    }

    public c b(String str) {
        c cVar = new c(this);
        if (this.f48418a.b(str)) {
            throw new RuntimeException("Key already used, data must be unique, use a different key");
        }
        this.f48418a.r(str, cVar);
        return cVar;
    }

    public <K> int c(String str, Class<K> cls) {
        a.b<a> it = this.f48420c.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            a next = it.next();
            if (next.f48423a.equals(str) && next.f48424b.equals(cls)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public com.badlogic.gdx.utils.a<r1.a> d() {
        com.badlogic.gdx.utils.a<r1.a> aVar = new com.badlogic.gdx.utils.a<>();
        a.b<a> it = this.f48420c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            aVar.a(new r1.a(next.f48423a, next.f48424b));
        }
        return aVar;
    }

    public com.badlogic.gdx.utils.a<a> e() {
        return this.f48420c;
    }

    public c f() {
        com.badlogic.gdx.utils.a<c> aVar = this.f48419b;
        int i11 = this.f48421d;
        this.f48421d = i11 + 1;
        return aVar.get(i11);
    }

    public c g(String str) {
        return this.f48418a.k(str);
    }

    @Override // com.badlogic.gdx.utils.f.c
    public void z(com.badlogic.gdx.utils.f fVar) {
        fVar.G0("unique", this.f48418a, l.class);
        fVar.H0("data", this.f48419b, com.badlogic.gdx.utils.a.class, c.class);
        fVar.G0("assets", this.f48420c.Q(a.class), a[].class);
        fVar.G0("resource", this.f48422e, null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements f.c {

        /* renamed from: a, reason: collision with root package name */
        public l<String, Object> f48425a = new l<>();

        /* renamed from: b, reason: collision with root package name */
        public v f48426b = new v();

        /* renamed from: c, reason: collision with root package name */
        public int f48427c = 0;

        /* renamed from: d, reason: collision with root package name */
        public i f48428d;

        public c() {
        }

        @Override // com.badlogic.gdx.utils.f.c
        public void D(com.badlogic.gdx.utils.f fVar, JsonValue jsonValue) {
            this.f48425a = (l) fVar.M("data", l.class, jsonValue);
            this.f48426b.g((int[]) fVar.M("indices", int[].class, jsonValue));
        }

        public <K> K a(String str) {
            return (K) this.f48425a.k(str);
        }

        public r1.a b() {
            int i11 = this.f48427c;
            v vVar = this.f48426b;
            if (i11 == vVar.f1640b) {
                return null;
            }
            com.badlogic.gdx.utils.a<a> aVar = this.f48428d.f48420c;
            this.f48427c = i11 + 1;
            a aVar2 = aVar.get(vVar.m(i11));
            return new r1.a(aVar2.f48423a, aVar2.f48424b);
        }

        public void c(String str, Object obj) {
            this.f48425a.r(str, obj);
        }

        public <K> void d(String str, Class<K> cls) {
            int c11 = this.f48428d.c(str, cls);
            if (c11 == -1) {
                this.f48428d.f48420c.a(new a(str, cls));
                c11 = this.f48428d.f48420c.f13179b - 1;
            }
            this.f48426b.a(c11);
        }

        @Override // com.badlogic.gdx.utils.f.c
        public void z(com.badlogic.gdx.utils.f fVar) {
            fVar.G0("data", this.f48425a, l.class);
            fVar.G0("indices", this.f48426b.M(), int[].class);
        }

        public c(i iVar) {
            this.f48428d = iVar;
        }
    }

    public i(T t11) {
        this();
        this.f48422e = t11;
    }
}
