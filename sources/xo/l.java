package xo;

import com.google.gson.JsonParseException;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.s;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class l<T> extends s<T> {

    /* renamed from: a, reason: collision with root package name */
    public final p<T> f98207a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.i<T> f98208b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.d f98209c;

    /* renamed from: d, reason: collision with root package name */
    public final bp.a<T> f98210d;

    /* renamed from: e, reason: collision with root package name */
    public final t f98211e;

    /* renamed from: f, reason: collision with root package name */
    public final l<T>.b f98212f = new b();

    /* renamed from: g, reason: collision with root package name */
    public volatile s<T> f98213g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b implements o, com.google.gson.h {
        public b() {
        }

        @Override // com.google.gson.o
        public com.google.gson.j a(Object obj) {
            return l.this.f98209c.G(obj);
        }

        @Override // com.google.gson.o
        public com.google.gson.j b(Object obj, Type type) {
            return l.this.f98209c.H(obj, type);
        }

        @Override // com.google.gson.h
        public <R> R c(com.google.gson.j jVar, Type type) throws JsonParseException {
            return (R) l.this.f98209c.j(jVar, type);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements t {

        /* renamed from: a, reason: collision with root package name */
        public final bp.a<?> f98215a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f98216b;

        /* renamed from: c, reason: collision with root package name */
        public final Class<?> f98217c;

        /* renamed from: d, reason: collision with root package name */
        public final p<?> f98218d;

        /* renamed from: e, reason: collision with root package name */
        public final com.google.gson.i<?> f98219e;

        public c(Object obj, bp.a<?> aVar, boolean z11, Class<?> cls) {
            p<?> pVar = obj instanceof p ? (p) obj : null;
            this.f98218d = pVar;
            com.google.gson.i<?> iVar = obj instanceof com.google.gson.i ? (com.google.gson.i) obj : null;
            this.f98219e = iVar;
            com.google.gson.internal.a.a((pVar == null && iVar == null) ? false : true);
            this.f98215a = aVar;
            this.f98216b = z11;
            this.f98217c = cls;
        }

        @Override // com.google.gson.t
        public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
            bp.a<?> aVar2 = this.f98215a;
            if (aVar2 != null ? aVar2.equals(aVar) || (this.f98216b && this.f98215a.getType() == aVar.getRawType()) : this.f98217c.isAssignableFrom(aVar.getRawType())) {
                return new l(this.f98218d, this.f98219e, dVar, aVar, this);
            }
            return null;
        }
    }

    public l(p<T> pVar, com.google.gson.i<T> iVar, com.google.gson.d dVar, bp.a<T> aVar, t tVar) {
        this.f98207a = pVar;
        this.f98208b = iVar;
        this.f98209c = dVar;
        this.f98210d = aVar;
        this.f98211e = tVar;
    }

    private s<T> j() {
        s<T> sVar = this.f98213g;
        if (sVar != null) {
            return sVar;
        }
        s<T> r11 = this.f98209c.r(this.f98211e, this.f98210d);
        this.f98213g = r11;
        return r11;
    }

    public static t k(bp.a<?> aVar, Object obj) {
        return new c(obj, aVar, false, null);
    }

    public static t l(bp.a<?> aVar, Object obj) {
        return new c(obj, aVar, aVar.getType() == aVar.getRawType(), null);
    }

    public static t m(Class<?> cls, Object obj) {
        return new c(obj, null, false, cls);
    }

    @Override // com.google.gson.s
    public T e(cp.a aVar) throws IOException {
        if (this.f98208b == null) {
            return j().e(aVar);
        }
        com.google.gson.j a11 = com.google.gson.internal.l.a(aVar);
        if (a11.v()) {
            return null;
        }
        return this.f98208b.a(a11, this.f98210d.getType(), this.f98212f);
    }

    @Override // com.google.gson.s
    public void i(cp.c cVar, T t11) throws IOException {
        p<T> pVar = this.f98207a;
        if (pVar == null) {
            j().i(cVar, t11);
        } else if (t11 == null) {
            cVar.L();
        } else {
            com.google.gson.internal.l.b(pVar.a(t11, this.f98210d.getType(), this.f98212f), cVar);
        }
    }
}
