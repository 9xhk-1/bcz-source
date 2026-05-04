package j90;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class a<K> implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public final String f63907a;

    /* renamed from: b, reason: collision with root package name */
    public Map<K, Object> f63908b;

    public a(String str, a aVar) {
        if (aVar == null) {
            this.f63908b = new LinkedHashMap();
            this.f63907a = str;
            return;
        }
        this.f63908b = aVar.f63908b;
        if (!aVar.f63907a.isEmpty()) {
            str = aVar.f63907a + '.' + str;
        }
        this.f63907a = str;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a<K> clone() {
        try {
            a<K> aVar = (a) super.clone();
            aVar.f63908b = new LinkedHashMap(this.f63908b);
            return aVar;
        } catch (CloneNotSupportedException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public void b(Set<String> set) {
        Iterator<K> it = this.f63908b.keySet().iterator();
        while (it.hasNext()) {
            String d11 = d(this.f63907a, it.next());
            if (d11 != null) {
                set.add(d11);
            }
        }
    }

    public abstract K c(String str);

    public abstract String d(String str, K k11);

    public final Object e(K k11) {
        if (k11 == null) {
            return null;
        }
        return this.f63908b.get(n(this.f63907a, k11));
    }

    public boolean f(K k11) {
        return e(k11) != null;
    }

    public void g(K k11, Enum<?> r32) {
        this.f63908b.put(k11, r32);
    }

    public void h(K k11, int i11) {
        this.f63908b.put(k11, Integer.valueOf(i11));
    }

    public void i(Map<K, Integer> map) {
        this.f63908b.putAll(map);
    }

    public void j(K k11, String str) {
        this.f63908b.put(k11, str);
    }

    public void l(Map<K, String> map) {
        this.f63908b.putAll(map);
    }

    public void m(Map<K, Enum<?>> map) {
        this.f63908b.putAll(map);
    }

    public abstract K n(String str, K k11);

    public boolean o(h90.c cVar, K k11) {
        Object e11 = e(k11);
        if (e11 == null) {
            return false;
        }
        if (e11 instanceof Enum) {
            e11 = ((Enum) e11).name();
        }
        if (e11 instanceof String) {
            cVar.m((String) e11);
            cVar.o(-1);
            return true;
        }
        if (e11 instanceof Integer) {
            cVar.o(((Integer) e11).intValue());
            return true;
        }
        throw new IllegalStateException("Unexpected mapping of '" + k11 + "' to " + e11);
    }

    public void remove(String str) {
        K c11;
        do {
            c11 = c(str);
            if (c11 == null) {
                return;
            }
        } while (this.f63908b.remove(c11) != null);
    }
}
