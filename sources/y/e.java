package y;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConcurrentMutableMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentMutableMap.kt\nco/touchlab/stately/collections/ConcurrentMutableMap\n+ 2 Synchronizable.kt\nco/touchlab/stately/concurrency/SynchronizableKt\n*L\n1#1,119:1\n5#2:120\n5#2:121\n5#2:122\n5#2:123\n5#2:124\n5#2:125\n5#2:126\n5#2:127\n5#2:128\n5#2:129\n5#2:130\n5#2:131\n5#2:132\n5#2:133\n*S KotlinDebug\n*F\n+ 1 ConcurrentMutableMap.kt\nco/touchlab/stately/collections/ConcurrentMutableMap\n*L\n17#1:120\n19#1:121\n21#1:122\n23#1:123\n25#1:124\n26#1:125\n27#1:126\n28#1:127\n30#1:128\n39#1:129\n51#1:130\n53#1:131\n56#1:132\n58#1:133\n*E\n"})
/* loaded from: classes3.dex */
public final class e<K, V> implements Map<K, V>, y00.g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<K, V> f98752a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Object f98753b;

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<R> extends Lambda implements x00.a<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98754a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<Map<K, V>, R> f98755b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e<K, V> eVar, x00.l<? super Map<K, V>, ? extends R> lVar) {
            super(0);
            this.f98754a = eVar;
            this.f98755b = lVar;
        }

        @Override // x00.a
        public final R invoke() {
            y.i iVar = new y.i(this.f98754a.f98752a);
            R invoke = this.f98755b.invoke(iVar);
            iVar.k(new LinkedHashMap());
            return invoke;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Lambda implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98756a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e<K, V> eVar) {
            super(0);
            this.f98756a = eVar;
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f98756a.f98752a.clear();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends Lambda implements x00.a<V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98757a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ K f98758b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.l<K, V> f98759c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(e<K, V> eVar, K k11, x00.l<? super K, ? extends V> lVar) {
            super(0);
            this.f98757a = eVar;
            this.f98758b = k11;
            this.f98759c = lVar;
        }

        @Override // x00.a
        public final V invoke() {
            V v11 = (V) this.f98757a.f98752a.get(this.f98758b);
            if (v11 != null) {
                return v11;
            }
            V invoke = this.f98759c.invoke(this.f98758b);
            this.f98757a.f98752a.put(this.f98758b, invoke);
            return invoke;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98760a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ K f98761b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(e<K, V> eVar, K k11) {
            super(0);
            this.f98760a = eVar;
            this.f98761b = k11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98760a.f98752a.containsKey(this.f98761b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: y.e$e, reason: collision with other inner class name */
    public static final class C1339e extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98762a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V f98763b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1339e(e<K, V> eVar, V v11) {
            super(0);
            this.f98762a = eVar;
            this.f98763b = v11;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98762a.f98752a.containsValue(this.f98763b));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends Lambda implements x00.a<y.f<Map.Entry<K, V>>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98764a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e<K, V> eVar) {
            super(0);
            this.f98764a = eVar;
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y.f<Map.Entry<K, V>> invoke() {
            e<K, V> eVar = this.f98764a;
            return new y.f<>(eVar, eVar.f98752a.entrySet());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends Lambda implements x00.a<V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98765a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ K f98766b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e<K, V> eVar, K k11) {
            super(0);
            this.f98765a = eVar;
            this.f98766b = k11;
        }

        @Override // x00.a
        @m80.l
        public final V invoke() {
            return (V) this.f98765a.f98752a.get(this.f98766b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends Lambda implements x00.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98767a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(e<K, V> eVar) {
            super(0);
            this.f98767a = eVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Boolean invoke() {
            return Boolean.valueOf(this.f98767a.f98752a.isEmpty());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends Lambda implements x00.a<y.f<K>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98768a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e<K, V> eVar) {
            super(0);
            this.f98768a = eVar;
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y.f<K> invoke() {
            e<K, V> eVar = this.f98768a;
            return new y.f<>(eVar, eVar.f98752a.keySet());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j extends Lambda implements x00.a<V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98769a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ K f98770b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ V f98771c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(e<K, V> eVar, K k11, V v11) {
            super(0);
            this.f98769a = eVar;
            this.f98770b = k11;
            this.f98771c = v11;
        }

        @Override // x00.a
        @m80.l
        public final V invoke() {
            return (V) this.f98769a.f98752a.put(this.f98770b, this.f98771c);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k extends Lambda implements x00.a<g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98772a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Map<? extends K, V> f98773b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public k(e<K, V> eVar, Map<? extends K, ? extends V> map) {
            super(0);
            this.f98772a = eVar;
            this.f98773b = map;
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f98772a.f98752a.putAll(this.f98773b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class l extends Lambda implements x00.a<V> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98774a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ K f98775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(e<K, V> eVar, K k11) {
            super(0);
            this.f98774a = eVar;
            this.f98775b = k11;
        }

        @Override // x00.a
        @m80.l
        public final V invoke() {
            return (V) this.f98774a.f98752a.remove(this.f98775b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m extends Lambda implements x00.a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98776a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(e<K, V> eVar) {
            super(0);
            this.f98776a = eVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        @m80.k
        public final Integer invoke() {
            return Integer.valueOf(this.f98776a.f98752a.size());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n extends Lambda implements x00.a<y.a<V>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e<K, V> f98777a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(e<K, V> eVar) {
            super(0);
            this.f98777a = eVar;
        }

        @Override // x00.a
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y.a<V> invoke() {
            e<K, V> eVar = this.f98777a;
            return new y.a<>(eVar, eVar.f98752a.values());
        }
    }

    public /* synthetic */ e(Object obj, Map map, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : obj, map);
    }

    @Override // java.util.Map
    public void clear() {
        Object obj = this.f98753b;
        b bVar = new b(this);
        synchronized (obj) {
            bVar.invoke();
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        Boolean invoke;
        Object obj2 = this.f98753b;
        d dVar = new d(this, obj);
        synchronized (obj2) {
            invoke = dVar.invoke();
        }
        return invoke.booleanValue();
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Boolean invoke;
        Object obj2 = this.f98753b;
        C1339e c1339e = new C1339e(this, obj);
        synchronized (obj2) {
            invoke = c1339e.invoke();
        }
        return invoke.booleanValue();
    }

    public final <R> R d(@m80.k x00.l<? super Map<K, V>, ? extends R> f11) {
        R invoke;
        g0.p(f11, "f");
        Object obj = this.f98753b;
        a aVar = new a(this, f11);
        synchronized (obj) {
            invoke = aVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return g();
    }

    @m80.k
    public Set<Map.Entry<K, V>> g() {
        y.f<Map.Entry<K, V>> invoke;
        Object obj = this.f98753b;
        f fVar = new f(this);
        synchronized (obj) {
            invoke = fVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.Map
    @m80.l
    public V get(Object obj) {
        V invoke;
        Object obj2 = this.f98753b;
        g gVar = new g(this, obj);
        synchronized (obj2) {
            invoke = gVar.invoke();
        }
        return invoke;
    }

    @m80.k
    public Set<K> h() {
        y.f<K> invoke;
        Object obj = this.f98753b;
        i iVar = new i(this);
        synchronized (obj) {
            invoke = iVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        Boolean invoke;
        Object obj = this.f98753b;
        h hVar = new h(this);
        synchronized (obj) {
            invoke = hVar.invoke();
        }
        return invoke.booleanValue();
    }

    public int j() {
        Integer invoke;
        Object obj = this.f98753b;
        m mVar = new m(this);
        synchronized (obj) {
            invoke = mVar.invoke();
        }
        return invoke.intValue();
    }

    @m80.k
    public Collection<V> k() {
        y.a<V> invoke;
        Object obj = this.f98753b;
        n nVar = new n(this);
        synchronized (obj) {
            invoke = nVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return h();
    }

    @w00.j(name = "safeComputeIfAbsent")
    public final V l(K k11, @m80.k x00.l<? super K, ? extends V> defaultValue) {
        V invoke;
        g0.p(defaultValue, "defaultValue");
        Object obj = this.f98753b;
        c cVar = new c(this, k11, defaultValue);
        synchronized (obj) {
            invoke = cVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.Map
    @m80.l
    public V put(K k11, V v11) {
        V invoke;
        Object obj = this.f98753b;
        j jVar = new j(this, k11, v11);
        synchronized (obj) {
            invoke = jVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.Map
    public void putAll(@m80.k Map<? extends K, ? extends V> from) {
        g0.p(from, "from");
        Object obj = this.f98753b;
        k kVar = new k(this, from);
        synchronized (obj) {
            kVar.invoke();
        }
    }

    @Override // java.util.Map
    @m80.l
    public V remove(Object obj) {
        V invoke;
        Object obj2 = this.f98753b;
        l lVar = new l(this, obj);
        synchronized (obj2) {
            invoke = lVar.invoke();
        }
        return invoke;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return j();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return k();
    }

    public e(@m80.l Object obj, @m80.k Map<K, V> del) {
        g0.p(del, "del");
        this.f98752a = del;
        this.f98753b = obj == null ? this : obj;
    }

    public e() {
        this(null, new LinkedHashMap());
    }
}
