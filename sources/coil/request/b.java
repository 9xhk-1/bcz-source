package coil.request;

import a00.k1;
import a00.l1;
import ix.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.g;
import w00.j;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Collections.kt\ncoil/util/-Collections\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,138:1\n453#2:139\n403#2:140\n1238#3,4:141\n72#4,8:145\n125#5:153\n152#5,3:154\n*S KotlinDebug\n*F\n+ 1 Parameters.kt\ncoil/request/Parameters\n*L\n44#1:139\n44#1:140\n44#1:141,4\n53#1:145,8\n59#1:153\n59#1:154,3\n*E\n"})
/* loaded from: classes3.dex */
public final class b implements Iterable<Pair<? extends String, ? extends c>>, y00.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C0156b f9797b = new C0156b(null);

    /* renamed from: c, reason: collision with root package name */
    @g
    @k
    public static final b f9798c = new b();

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Map<String, c> f9799a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: coil.request.b$b, reason: collision with other inner class name */
    public static final class C0156b {
        public /* synthetic */ C0156b(v vVar) {
            this();
        }

        public C0156b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Object f9801a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f9802b;

        public c(@l Object obj, @l String str) {
            this.f9801a = obj;
            this.f9802b = str;
        }

        @l
        public final String a() {
            return this.f9802b;
        }

        @l
        public final Object b() {
            return this.f9801a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return g0.g(this.f9801a, cVar.f9801a) && g0.g(this.f9802b, cVar.f9802b);
        }

        public int hashCode() {
            Object obj = this.f9801a;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f9802b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        @k
        public String toString() {
            return "Entry(value=" + this.f9801a + ", memoryCacheKey=" + this.f9802b + ')';
        }
    }

    public /* synthetic */ b(Map map, v vVar) {
        this(map);
    }

    @l
    public final c b(@k String str) {
        return this.f9799a.get(str);
    }

    @l
    public final String d(@k String str) {
        c cVar = this.f9799a.get(str);
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && g0.g(this.f9799a, ((b) obj).f9799a);
    }

    @k
    public final Map<String, String> f() {
        if (isEmpty()) {
            return l1.z();
        }
        Map<String, c> map = this.f9799a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, c> entry : map.entrySet()) {
            String a11 = entry.getValue().a();
            if (a11 != null) {
                linkedHashMap.put(entry.getKey(), a11);
            }
        }
        return linkedHashMap;
    }

    @k
    public final a g() {
        return new a(this);
    }

    @l
    public final <T> T h(@k String str) {
        c cVar = this.f9799a.get(str);
        if (cVar != null) {
            return (T) cVar.b();
        }
        return null;
    }

    public int hashCode() {
        return this.f9799a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f9799a.isEmpty();
    }

    @Override // java.lang.Iterable
    @k
    public Iterator<Pair<? extends String, ? extends c>> iterator() {
        Map<String, c> map = this.f9799a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, c> entry : map.entrySet()) {
            arrayList.add(h1.a(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @k
    public final Map<String, Object> j() {
        if (isEmpty()) {
            return l1.z();
        }
        Map<String, c> map = this.f9799a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((c) entry.getValue()).b());
        }
        return linkedHashMap;
    }

    @j(name = g.b.f62794h)
    public final int size() {
        return this.f9799a.size();
    }

    @k
    public String toString() {
        return "Parameters(entries=" + this.f9799a + ')';
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<String, c> f9800a;

        public a() {
            this.f9800a = new LinkedHashMap();
        }

        public static /* synthetic */ a e(a aVar, String str, Object obj, String str2, int i11, Object obj2) {
            if ((i11 & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return aVar.d(str, obj, str2);
        }

        @k
        public final b a() {
            return new b(u0.c.h(this.f9800a), null);
        }

        @k
        public final a b(@k String str) {
            this.f9800a.remove(str);
            return this;
        }

        @w00.k
        @k
        public final a c(@k String str, @l Object obj) {
            return e(this, str, obj, null, 4, null);
        }

        @w00.k
        @k
        public final a d(@k String str, @l Object obj, @l String str2) {
            this.f9800a.put(str, new c(obj, str2));
            return this;
        }

        public a(@k b bVar) {
            this.f9800a = l1.J0(bVar.f9799a);
        }
    }

    public b(Map<String, c> map) {
        this.f9799a = map;
    }

    public b() {
        this(l1.z());
    }
}
