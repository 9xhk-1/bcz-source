package i1;

import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final Comparator<Comparable> f60063i = new a();

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ boolean f60064j = false;

    /* renamed from: a, reason: collision with root package name */
    public Comparator<? super K> f60065a;

    /* renamed from: b, reason: collision with root package name */
    public g<K, V>[] f60066b;

    /* renamed from: c, reason: collision with root package name */
    public final g<K, V> f60067c;

    /* renamed from: d, reason: collision with root package name */
    public int f60068d;

    /* renamed from: e, reason: collision with root package name */
    public int f60069e;

    /* renamed from: f, reason: collision with root package name */
    public int f60070f;

    /* renamed from: g, reason: collision with root package name */
    public d<K, V>.C0687d f60071g;

    /* renamed from: h, reason: collision with root package name */
    public d<K, V>.e f60072h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f60073a;

        /* renamed from: b, reason: collision with root package name */
        public int f60074b;

        /* renamed from: c, reason: collision with root package name */
        public int f60075c;

        /* renamed from: d, reason: collision with root package name */
        public int f60076d;

        public void a(g<K, V> gVar) {
            gVar.f60088c = null;
            gVar.f60086a = null;
            gVar.f60087b = null;
            gVar.f60094i = 1;
            int i11 = this.f60074b;
            if (i11 > 0) {
                int i12 = this.f60076d;
                if ((i12 & 1) == 0) {
                    this.f60076d = i12 + 1;
                    this.f60074b = i11 - 1;
                    this.f60075c++;
                }
            }
            gVar.f60086a = this.f60073a;
            this.f60073a = gVar;
            int i13 = this.f60076d;
            int i14 = i13 + 1;
            this.f60076d = i14;
            int i15 = this.f60074b;
            if (i15 > 0 && (i14 & 1) == 0) {
                this.f60076d = i13 + 2;
                this.f60074b = i15 - 1;
                this.f60075c++;
            }
            int i16 = 4;
            while (true) {
                int i17 = i16 - 1;
                if ((this.f60076d & i17) != i17) {
                    return;
                }
                int i18 = this.f60075c;
                if (i18 == 0) {
                    g<K, V> gVar2 = this.f60073a;
                    g<K, V> gVar3 = gVar2.f60086a;
                    g<K, V> gVar4 = gVar3.f60086a;
                    gVar3.f60086a = gVar4.f60086a;
                    this.f60073a = gVar3;
                    gVar3.f60087b = gVar4;
                    gVar3.f60088c = gVar2;
                    gVar3.f60094i = gVar2.f60094i + 1;
                    gVar4.f60086a = gVar3;
                    gVar2.f60086a = gVar3;
                } else if (i18 == 1) {
                    g<K, V> gVar5 = this.f60073a;
                    g<K, V> gVar6 = gVar5.f60086a;
                    this.f60073a = gVar6;
                    gVar6.f60088c = gVar5;
                    gVar6.f60094i = gVar5.f60094i + 1;
                    gVar5.f60086a = gVar6;
                    this.f60075c = 0;
                } else if (i18 == 2) {
                    this.f60075c = 0;
                }
                i16 *= 2;
            }
        }

        public void b(int i11) {
            this.f60074b = ((Integer.highestOneBit(i11) * 2) - 1) - i11;
            this.f60076d = 0;
            this.f60075c = 0;
            this.f60073a = null;
        }

        public g<K, V> c() {
            g<K, V> gVar = this.f60073a;
            if (gVar.f60086a == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f60077a;

        public g<K, V> a() {
            g<K, V> gVar = this.f60077a;
            if (gVar == null) {
                return null;
            }
            g<K, V> gVar2 = gVar.f60086a;
            gVar.f60086a = null;
            g<K, V> gVar3 = gVar.f60088c;
            while (true) {
                g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                if (gVar2 == null) {
                    this.f60077a = gVar4;
                    return gVar;
                }
                gVar2.f60086a = gVar4;
                gVar3 = gVar2.f60087b;
            }
        }

        public void b(g<K, V> gVar) {
            g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f60086a = gVar2;
                gVar2 = gVar;
                gVar = gVar.f60087b;
            }
            this.f60077a = gVar2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: i1.d$d, reason: collision with other inner class name */
    public final class C0687d extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: i1.d$d$a */
        public class a extends d<K, V>.f<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public C0687d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && d.this.i((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            g<K, V> i11;
            if (!(obj instanceof Map.Entry) || (i11 = d.this.i((Map.Entry) obj)) == null) {
                return false;
            }
            d.this.l(i11, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.f60068d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class e extends AbstractSet<K> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends d<K, V>.f<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f60091f;
            }
        }

        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return d.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return d.this.m(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d.this.f60068d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public abstract class f<T> implements Iterator<T> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f60082a;

        /* renamed from: b, reason: collision with root package name */
        public g<K, V> f60083b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f60084c;

        public f() {
            this.f60082a = d.this.f60067c.f60089d;
            this.f60084c = d.this.f60069e;
        }

        public final g<K, V> a() {
            g<K, V> gVar = this.f60082a;
            d dVar = d.this;
            if (gVar == dVar.f60067c) {
                throw new NoSuchElementException();
            }
            if (dVar.f60069e != this.f60084c) {
                throw new ConcurrentModificationException();
            }
            this.f60082a = gVar.f60089d;
            this.f60083b = gVar;
            return gVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f60082a != d.this.f60067c;
        }

        @Override // java.util.Iterator
        public final void remove() {
            g<K, V> gVar = this.f60083b;
            if (gVar == null) {
                throw new IllegalStateException();
            }
            d.this.l(gVar, true);
            this.f60083b = null;
            this.f60084c = d.this.f60069e;
        }
    }

    public d() {
        this(null);
    }

    public static <K, V> g<K, V>[] d(g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        g<K, V>[] gVarArr2 = new g[length * 2];
        c cVar = new c();
        b bVar = new b();
        b bVar2 = new b();
        for (int i11 = 0; i11 < length; i11++) {
            g<K, V> gVar = gVarArr[i11];
            if (gVar != null) {
                cVar.b(gVar);
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    g<K, V> a11 = cVar.a();
                    if (a11 == null) {
                        break;
                    }
                    if ((a11.f60092g & length) == 0) {
                        i12++;
                    } else {
                        i13++;
                    }
                }
                bVar.b(i12);
                bVar2.b(i13);
                cVar.b(gVar);
                while (true) {
                    g<K, V> a12 = cVar.a();
                    if (a12 == null) {
                        break;
                    }
                    if ((a12.f60092g & length) == 0) {
                        bVar.a(a12);
                    } else {
                        bVar2.a(a12);
                    }
                }
                gVarArr2[i11] = i12 > 0 ? bVar.c() : null;
                gVarArr2[i11 + length] = i13 > 0 ? bVar2.c() : null;
            }
        }
        return gVarArr2;
    }

    public static int r(int i11) {
        int i12 = i11 ^ ((i11 >>> 20) ^ (i11 >>> 12));
        return (i12 >>> 4) ^ ((i12 >>> 7) ^ i12);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final void b() {
        g<K, V>[] d11 = d(this.f60066b);
        this.f60066b = d11;
        this.f60070f = (d11.length / 2) + (d11.length / 4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f60066b, (Object) null);
        this.f60068d = 0;
        this.f60069e++;
        g<K, V> gVar = this.f60067c;
        g<K, V> gVar2 = gVar.f60089d;
        while (gVar2 != gVar) {
            g<K, V> gVar3 = gVar2.f60089d;
            gVar2.f60090e = null;
            gVar2.f60089d = null;
            gVar2 = gVar3;
        }
        gVar.f60090e = gVar;
        gVar.f60089d = gVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return j(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        d<K, V>.C0687d c0687d = this.f60071g;
        if (c0687d != null) {
            return c0687d;
        }
        d<K, V>.C0687d c0687d2 = new C0687d();
        this.f60071g = c0687d2;
        return c0687d2;
    }

    public final boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        g<K, V> j11 = j(obj);
        if (j11 != null) {
            return j11.f60093h;
        }
        return null;
    }

    public g<K, V> h(K k11, boolean z11) {
        int i11;
        g<K, V> gVar;
        Comparator<? super K> comparator = this.f60065a;
        g<K, V>[] gVarArr = this.f60066b;
        int r11 = r(k11.hashCode());
        int length = (gVarArr.length - 1) & r11;
        g<K, V> gVar2 = gVarArr[length];
        if (gVar2 != null) {
            Comparable comparable = comparator == f60063i ? (Comparable) k11 : null;
            while (true) {
                i11 = comparable != null ? comparable.compareTo(gVar2.f60091f) : comparator.compare(k11, gVar2.f60091f);
                if (i11 == 0) {
                    return gVar2;
                }
                g<K, V> gVar3 = i11 < 0 ? gVar2.f60087b : gVar2.f60088c;
                if (gVar3 == null) {
                    break;
                }
                gVar2 = gVar3;
            }
        } else {
            i11 = 0;
        }
        int i12 = i11;
        if (!z11) {
            return null;
        }
        g<K, V> gVar4 = this.f60067c;
        if (gVar2 != null) {
            g<K, V> gVar5 = gVar2;
            gVar = new g<>(gVar5, k11, r11, gVar4, gVar4.f60090e);
            if (i12 < 0) {
                gVar5.f60087b = gVar;
            } else {
                gVar5.f60088c = gVar;
            }
            k(gVar5, true);
        } else {
            if (comparator == f60063i && !(k11 instanceof Comparable)) {
                throw new ClassCastException(k11.getClass().getName() + " is not Comparable");
            }
            gVar = new g<>(gVar2, k11, r11, gVar4, gVar4.f60090e);
            gVarArr[length] = gVar;
        }
        int i13 = this.f60068d;
        this.f60068d = i13 + 1;
        if (i13 > this.f60070f) {
            b();
        }
        this.f60069e++;
        return gVar;
    }

    public g<K, V> i(Map.Entry<?, ?> entry) {
        g<K, V> j11 = j(entry.getKey());
        if (j11 == null || !g(j11.f60093h, entry.getValue())) {
            return null;
        }
        return j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g<K, V> j(Object obj) {
        if (obj != 0) {
            try {
                return h(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return null;
    }

    public final void k(g<K, V> gVar, boolean z11) {
        while (gVar != null) {
            g<K, V> gVar2 = gVar.f60087b;
            g<K, V> gVar3 = gVar.f60088c;
            int i11 = gVar2 != null ? gVar2.f60094i : 0;
            int i12 = gVar3 != null ? gVar3.f60094i : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                g<K, V> gVar4 = gVar3.f60087b;
                g<K, V> gVar5 = gVar3.f60088c;
                int i14 = (gVar4 != null ? gVar4.f60094i : 0) - (gVar5 != null ? gVar5.f60094i : 0);
                if (i14 == -1 || (i14 == 0 && !z11)) {
                    o(gVar);
                } else {
                    p(gVar3);
                    o(gVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 2) {
                g<K, V> gVar6 = gVar2.f60087b;
                g<K, V> gVar7 = gVar2.f60088c;
                int i15 = (gVar6 != null ? gVar6.f60094i : 0) - (gVar7 != null ? gVar7.f60094i : 0);
                if (i15 == 1 || (i15 == 0 && !z11)) {
                    p(gVar);
                } else {
                    o(gVar2);
                    p(gVar);
                }
                if (z11) {
                    return;
                }
            } else if (i13 == 0) {
                gVar.f60094i = i11 + 1;
                if (z11) {
                    return;
                }
            } else {
                gVar.f60094i = Math.max(i11, i12) + 1;
                if (!z11) {
                    return;
                }
            }
            gVar = gVar.f60086a;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        d<K, V>.e eVar = this.f60072h;
        if (eVar != null) {
            return eVar;
        }
        d<K, V>.e eVar2 = new e();
        this.f60072h = eVar2;
        return eVar2;
    }

    public void l(g<K, V> gVar, boolean z11) {
        int i11;
        if (z11) {
            g<K, V> gVar2 = gVar.f60090e;
            gVar2.f60089d = gVar.f60089d;
            gVar.f60089d.f60090e = gVar2;
            gVar.f60090e = null;
            gVar.f60089d = null;
        }
        g<K, V> gVar3 = gVar.f60087b;
        g<K, V> gVar4 = gVar.f60088c;
        g<K, V> gVar5 = gVar.f60086a;
        int i12 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                n(gVar, gVar3);
                gVar.f60087b = null;
            } else if (gVar4 != null) {
                n(gVar, gVar4);
                gVar.f60088c = null;
            } else {
                n(gVar, null);
            }
            k(gVar5, false);
            this.f60068d--;
            this.f60069e++;
            return;
        }
        g<K, V> b11 = gVar3.f60094i > gVar4.f60094i ? gVar3.b() : gVar4.a();
        l(b11, false);
        g<K, V> gVar6 = gVar.f60087b;
        if (gVar6 != null) {
            i11 = gVar6.f60094i;
            b11.f60087b = gVar6;
            gVar6.f60086a = b11;
            gVar.f60087b = null;
        } else {
            i11 = 0;
        }
        g<K, V> gVar7 = gVar.f60088c;
        if (gVar7 != null) {
            i12 = gVar7.f60094i;
            b11.f60088c = gVar7;
            gVar7.f60086a = b11;
            gVar.f60088c = null;
        }
        b11.f60094i = Math.max(i11, i12) + 1;
        n(gVar, b11);
    }

    public g<K, V> m(Object obj) {
        g<K, V> j11 = j(obj);
        if (j11 != null) {
            l(j11, true);
        }
        return j11;
    }

    public final void n(g<K, V> gVar, g<K, V> gVar2) {
        g<K, V> gVar3 = gVar.f60086a;
        gVar.f60086a = null;
        if (gVar2 != null) {
            gVar2.f60086a = gVar3;
        }
        if (gVar3 == null) {
            int i11 = gVar.f60092g;
            this.f60066b[i11 & (r0.length - 1)] = gVar2;
        } else if (gVar3.f60087b == gVar) {
            gVar3.f60087b = gVar2;
        } else {
            gVar3.f60088c = gVar2;
        }
    }

    public final void o(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f60087b;
        g<K, V> gVar3 = gVar.f60088c;
        g<K, V> gVar4 = gVar3.f60087b;
        g<K, V> gVar5 = gVar3.f60088c;
        gVar.f60088c = gVar4;
        if (gVar4 != null) {
            gVar4.f60086a = gVar;
        }
        n(gVar, gVar3);
        gVar3.f60087b = gVar;
        gVar.f60086a = gVar3;
        int max = Math.max(gVar2 != null ? gVar2.f60094i : 0, gVar4 != null ? gVar4.f60094i : 0) + 1;
        gVar.f60094i = max;
        gVar3.f60094i = Math.max(max, gVar5 != null ? gVar5.f60094i : 0) + 1;
    }

    public final void p(g<K, V> gVar) {
        g<K, V> gVar2 = gVar.f60087b;
        g<K, V> gVar3 = gVar.f60088c;
        g<K, V> gVar4 = gVar2.f60087b;
        g<K, V> gVar5 = gVar2.f60088c;
        gVar.f60087b = gVar5;
        if (gVar5 != null) {
            gVar5.f60086a = gVar;
        }
        n(gVar, gVar2);
        gVar2.f60088c = gVar;
        gVar.f60086a = gVar2;
        int max = Math.max(gVar3 != null ? gVar3.f60094i : 0, gVar5 != null ? gVar5.f60094i : 0) + 1;
        gVar.f60094i = max;
        gVar2.f60094i = Math.max(max, gVar4 != null ? gVar4.f60094i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k11, V v11) {
        if (k11 == null) {
            throw new NullPointerException("key == null");
        }
        g<K, V> h11 = h(k11, true);
        V v12 = h11.f60093h;
        h11.f60093h = v11;
        return v12;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g<K, V> m11 = m(obj);
        if (m11 != null) {
            return m11.f60093h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f60068d;
    }

    public d(Comparator<? super K> comparator) {
        this.f60068d = 0;
        this.f60069e = 0;
        this.f60065a = comparator == null ? f60063i : comparator;
        this.f60067c = new g<>();
        g<K, V>[] gVarArr = new g[16];
        this.f60066b = gVarArr;
        this.f60070f = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<K, V> implements Map.Entry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public g<K, V> f60086a;

        /* renamed from: b, reason: collision with root package name */
        public g<K, V> f60087b;

        /* renamed from: c, reason: collision with root package name */
        public g<K, V> f60088c;

        /* renamed from: d, reason: collision with root package name */
        public g<K, V> f60089d;

        /* renamed from: e, reason: collision with root package name */
        public g<K, V> f60090e;

        /* renamed from: f, reason: collision with root package name */
        public final K f60091f;

        /* renamed from: g, reason: collision with root package name */
        public final int f60092g;

        /* renamed from: h, reason: collision with root package name */
        public V f60093h;

        /* renamed from: i, reason: collision with root package name */
        public int f60094i;

        public g() {
            this.f60091f = null;
            this.f60092g = -1;
            this.f60090e = this;
            this.f60089d = this;
        }

        public g<K, V> a() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f60087b; gVar2 != null; gVar2 = gVar2.f60087b) {
                gVar = gVar2;
            }
            return gVar;
        }

        public g<K, V> b() {
            g<K, V> gVar = this;
            for (g<K, V> gVar2 = this.f60088c; gVar2 != null; gVar2 = gVar2.f60088c) {
                gVar = gVar2;
            }
            return gVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                K k11 = this.f60091f;
                if (k11 != null ? k11.equals(entry.getKey()) : entry.getKey() == null) {
                    V v11 = this.f60093h;
                    if (v11 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (v11.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f60091f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f60093h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f60091f;
            int hashCode = k11 == null ? 0 : k11.hashCode();
            V v11 = this.f60093h;
            return hashCode ^ (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            V v12 = this.f60093h;
            this.f60093h = v11;
            return v12;
        }

        public String toString() {
            return this.f60091f + ContainerUtils.KEY_VALUE_DELIMITER + this.f60093h;
        }

        public g(g<K, V> gVar, K k11, int i11, g<K, V> gVar2, g<K, V> gVar3) {
            this.f60086a = gVar;
            this.f60091f = k11;
            this.f60092g = i11;
            this.f60094i = 1;
            this.f60089d = gVar2;
            this.f60090e = gVar3;
            gVar3.f60089d = this;
            gVar2.f60090e = this;
        }
    }
}
