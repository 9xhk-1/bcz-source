package j90;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public b f63911a;

    /* renamed from: b, reason: collision with root package name */
    public b f63912b;

    /* renamed from: c, reason: collision with root package name */
    public a f63913c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends j90.a<h90.d> {
        public a(String str, a aVar) {
            super(str, aVar);
        }

        @Override // j90.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public h90.d c(String str) {
            for (h90.d dVar : this.f63908b.keySet()) {
                if (dVar.e().equals(str)) {
                    return dVar;
                }
            }
            return null;
        }

        @Override // j90.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public String d(String str, h90.d dVar) {
            return e.b(str, dVar.e());
        }

        @Override // j90.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public h90.d n(String str, h90.d dVar) {
            if (dVar.d().equals(str)) {
                return dVar;
            }
            return null;
        }
    }

    public e() {
        this("", null);
    }

    public static String b(String str, String str2) {
        if (!str2.startsWith(str)) {
            return null;
        }
        int i11 = !str.isEmpty() ? 1 : 0;
        int indexOf = str2.indexOf(46, str.length() + i11);
        if (indexOf != -1) {
            return str2.substring(str.length() + i11, indexOf);
        }
        return null;
    }

    @Override // j90.d
    public void C(String str, String str2) {
        this.f63912b.j(str, str2);
    }

    @Override // j90.d
    public void C0(Map<String, String> map) {
        this.f63911a.l(map);
    }

    @Override // j90.d
    public void D0(Map<String, String> map) {
        this.f63912b.l(map);
    }

    @Override // j90.d
    public void H0(Map<String, Integer> map) {
        this.f63911a.i(map);
    }

    @Override // j90.d
    public void I(String str, int i11) {
        this.f63912b.h(str, i11);
    }

    @Override // j90.d
    public void L(String str, Enum<?> r32) {
        this.f63911a.g(str, r32);
    }

    @Override // j90.d
    public void L0(Map<String, Enum<?>> map) {
        this.f63912b.m(map);
    }

    @Override // j90.d
    public void Q0(String str, String str2) {
        this.f63911a.j(str, str2);
    }

    @Override // j90.d
    public void R0(String str, Class<?> cls, String str2) {
        g(h90.d.i(str, cls), str2);
    }

    @Override // j90.d
    public void S(String str, Class<?> cls, int i11) {
        h(h90.d.i(str, cls), i11);
    }

    public Set<String> c() {
        HashSet hashSet = new HashSet();
        this.f63911a.b(hashSet);
        this.f63912b.b(hashSet);
        this.f63913c.b(hashSet);
        return hashSet;
    }

    public String d() {
        return this.f63913c.f63907a;
    }

    @Override // j90.d
    public void d0(String str, int i11) {
        this.f63911a.h(str, i11);
    }

    public boolean e(h90.d dVar, String str) {
        return this.f63913c.f(dVar) || this.f63911a.f(str) || this.f63912b.f(str);
    }

    public final void f(h90.d dVar, Enum<?> r32) {
        this.f63913c.g(dVar, r32);
    }

    public final void g(h90.d dVar, String str) {
        this.f63913c.j(dVar, str);
    }

    public final void h(h90.d dVar, int i11) {
        this.f63913c.h(dVar, i11);
    }

    public boolean i(h90.c cVar, String str, h90.d dVar) {
        if (this.f63913c.f(dVar)) {
            return this.f63913c.o(cVar, dVar);
        }
        if (this.f63911a.f(str)) {
            return this.f63911a.o(cVar, str);
        }
        if (this.f63912b.f(str)) {
            return this.f63912b.o(cVar, str);
        }
        return false;
    }

    @Override // j90.d
    public void k(String str, Class<?> cls, Enum<?> r32) {
        f(h90.d.i(str, cls), r32);
    }

    @Override // j90.d
    public void k0(String str, Enum<?> r32) {
        this.f63912b.g(str, r32);
    }

    @Override // j90.d
    public void remove(String str) {
        this.f63911a.remove(str);
        this.f63912b.remove(str);
        this.f63913c.remove(str);
    }

    @Override // j90.d
    public void w0(Map<String, Enum<?>> map) {
        this.f63911a.m(map);
    }

    @Override // j90.d
    public void y0(Map<String, Integer> map) {
        this.f63912b.i(map);
    }

    public e(String str, e eVar) {
        this.f63911a = new b(str, eVar == null ? null : eVar.f63911a);
        this.f63912b = new b(str, eVar == null ? null : eVar.f63912b);
        this.f63913c = new a(str, eVar != null ? eVar.f63913c : null);
    }

    @Override // j90.d
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public d m6306clone() {
        try {
            e eVar = (e) super.clone();
            eVar.f63911a = (b) this.f63911a.clone();
            eVar.f63912b = (b) this.f63912b.clone();
            eVar.f63913c = (a) this.f63913c.clone();
            return eVar;
        } catch (CloneNotSupportedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends j90.a<String> {
        public b(String str, b bVar) {
            super(str, bVar);
        }

        @Override // j90.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public String d(String str, String str2) {
            return e.b(str, str2);
        }

        @Override // j90.a
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public String n(String str, String str2) {
            if (str.isEmpty()) {
                return str2;
            }
            return str + '.' + str2;
        }

        @Override // j90.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public String c(String str) {
            return str;
        }
    }
}
