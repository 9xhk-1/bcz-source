package lk;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lk.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class h<K extends m, V> {

    /* renamed from: a, reason: collision with root package name */
    public final a<K, V> f71446a = new a<>();

    /* renamed from: b, reason: collision with root package name */
    public final Map<K, a<K, V>> f71447b = new HashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final K f71448a;

        /* renamed from: b, reason: collision with root package name */
        public List<V> f71449b;

        /* renamed from: c, reason: collision with root package name */
        public a<K, V> f71450c;

        /* renamed from: d, reason: collision with root package name */
        public a<K, V> f71451d;

        public a() {
            this(null);
        }

        public void a(V v11) {
            if (this.f71449b == null) {
                this.f71449b = new ArrayList();
            }
            this.f71449b.add(v11);
        }

        @Nullable
        public V b() {
            int c11 = c();
            if (c11 > 0) {
                return this.f71449b.remove(c11 - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f71449b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public a(K k11) {
            this.f71451d = this;
            this.f71450c = this;
            this.f71448a = k11;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f71451d;
        aVar2.f71450c = aVar.f71450c;
        aVar.f71450c.f71451d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.f71450c.f71451d = aVar;
        aVar.f71451d.f71450c = aVar;
    }

    @Nullable
    public V a(K k11) {
        a<K, V> aVar = this.f71447b.get(k11);
        if (aVar == null) {
            aVar = new a<>(k11);
            this.f71447b.put(k11, aVar);
        } else {
            k11.a();
        }
        b(aVar);
        return aVar.b();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f71446a;
        aVar.f71451d = aVar2;
        aVar.f71450c = aVar2.f71450c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f71446a;
        aVar.f71451d = aVar2.f71451d;
        aVar.f71450c = aVar2;
        g(aVar);
    }

    public void d(K k11, V v11) {
        a<K, V> aVar = this.f71447b.get(k11);
        if (aVar == null) {
            aVar = new a<>(k11);
            c(aVar);
            this.f71447b.put(k11, aVar);
        } else {
            k11.a();
        }
        aVar.a(v11);
    }

    @Nullable
    public V f() {
        for (a aVar = this.f71446a.f71451d; !aVar.equals(this.f71446a); aVar = aVar.f71451d) {
            V v11 = (V) aVar.b();
            if (v11 != null) {
                return v11;
            }
            e(aVar);
            this.f71447b.remove(aVar.f71448a);
            ((m) aVar.f71448a).a();
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f71446a.f71450c;
        boolean z11 = false;
        while (!aVar.equals(this.f71446a)) {
            sb2.append(l50.b.f69927i);
            sb2.append(aVar.f71448a);
            sb2.append(':');
            sb2.append(aVar.c());
            sb2.append("}, ");
            aVar = aVar.f71450c;
            z11 = true;
        }
        if (z11) {
            sb2.delete(sb2.length() - 2, sb2.length());
        }
        sb2.append(" )");
        return sb2.toString();
    }
}
