package xo;

import com.google.gson.JsonSyntaxException;
import com.google.gson.s;
import com.google.gson.stream.JsonToken;
import com.google.gson.t;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class h implements t {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.c f98174a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f98175b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a<K, V> extends s<Map<K, V>> {

        /* renamed from: a, reason: collision with root package name */
        public final s<K> f98176a;

        /* renamed from: b, reason: collision with root package name */
        public final s<V> f98177b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.gson.internal.h<? extends Map<K, V>> f98178c;

        public a(com.google.gson.d dVar, Type type, s<K> sVar, Type type2, s<V> sVar2, com.google.gson.internal.h<? extends Map<K, V>> hVar) {
            this.f98176a = new m(dVar, sVar, type);
            this.f98177b = new m(dVar, sVar2, type2);
            this.f98178c = hVar;
        }

        public final String j(com.google.gson.j jVar) {
            if (!jVar.x()) {
                if (jVar.v()) {
                    return "null";
                }
                throw new AssertionError();
            }
            com.google.gson.n p11 = jVar.p();
            if (p11.B()) {
                return String.valueOf(p11.r());
            }
            if (p11.z()) {
                return Boolean.toString(p11.f());
            }
            if (p11.C()) {
                return p11.t();
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.s
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map<K, V> e(cp.a aVar) throws IOException {
            JsonToken k02 = aVar.k0();
            if (k02 == JsonToken.NULL) {
                aVar.d0();
                return null;
            }
            Map<K, V> a11 = this.f98178c.a();
            if (k02 != JsonToken.BEGIN_ARRAY) {
                aVar.c();
                while (aVar.E()) {
                    com.google.gson.internal.g.f35036a.a(aVar);
                    K e11 = this.f98176a.e(aVar);
                    if (a11.put(e11, this.f98177b.e(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + e11);
                    }
                }
                aVar.q();
                return a11;
            }
            aVar.a();
            while (aVar.E()) {
                aVar.a();
                K e12 = this.f98176a.e(aVar);
                if (a11.put(e12, this.f98177b.e(aVar)) != null) {
                    throw new JsonSyntaxException("duplicate key: " + e12);
                }
                aVar.k();
            }
            aVar.k();
            return a11;
        }

        @Override // com.google.gson.s
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void i(cp.c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.L();
                return;
            }
            if (!h.this.f98175b) {
                cVar.f();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.H(String.valueOf(entry.getKey()));
                    this.f98177b.i(cVar, entry.getValue());
                }
                cVar.k();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i11 = 0;
            boolean z11 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.j h11 = this.f98176a.h(entry2.getKey());
                arrayList.add(h11);
                arrayList2.add(entry2.getValue());
                z11 |= h11.u() || h11.w();
            }
            if (!z11) {
                cVar.f();
                int size = arrayList.size();
                while (i11 < size) {
                    cVar.H(j((com.google.gson.j) arrayList.get(i11)));
                    this.f98177b.i(cVar, arrayList2.get(i11));
                    i11++;
                }
                cVar.k();
                return;
            }
            cVar.e();
            int size2 = arrayList.size();
            while (i11 < size2) {
                cVar.e();
                com.google.gson.internal.l.b((com.google.gson.j) arrayList.get(i11), cVar);
                this.f98177b.i(cVar, arrayList2.get(i11));
                cVar.j();
                i11++;
            }
            cVar.j();
        }
    }

    public h(com.google.gson.internal.c cVar, boolean z11) {
        this.f98174a = cVar;
        this.f98175b = z11;
    }

    @Override // com.google.gson.t
    public <T> s<T> a(com.google.gson.d dVar, bp.a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Map.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type[] j11 = com.google.gson.internal.b.j(type, rawType);
        return new a(dVar, j11[0], b(dVar, j11[0]), j11[1], dVar.p(bp.a.get(j11[1])), this.f98174a.a(aVar));
    }

    public final s<?> b(com.google.gson.d dVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f98228f : dVar.p(bp.a.get(type));
    }
}
