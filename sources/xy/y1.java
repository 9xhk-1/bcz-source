package xy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesBuilderImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1863#2,2:417\n774#2:419\n865#2,2:420\n535#3:422\n520#3,6:423\n1#4:429\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesBuilderImpl\n*L\n245#1:417,2\n253#1:419\n253#1:420,2\n261#1:422\n261#1:423,6\n*E\n"})
/* loaded from: classes8.dex */
public class y1 implements v1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f98669a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<String, List<String>> f98670b;

    /* JADX WARN: Multi-variable type inference failed */
    public y1() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static final g2 n(y1 y1Var, String name, List values) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        y1Var.f(name, values);
        return g2.f100423a;
    }

    public static final g2 o(y1 y1Var, String name, List values) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        y1Var.h(name, values);
        return g2.f100423a;
    }

    @Override // xy.v1
    @m80.l
    public List<String> a(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return this.f98670b.get(name);
    }

    @Override // xy.v1
    public final boolean b() {
        return this.f98669a;
    }

    @Override // xy.v1
    @m80.k
    public u1 build() {
        return new z1(this.f98669a, this.f98670b);
    }

    @Override // xy.v1
    public boolean c(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        List<String> list = this.f98670b.get(name);
        if (list != null) {
            return list.contains(value);
        }
        return false;
    }

    @Override // xy.v1
    public void clear() {
        this.f98670b.clear();
    }

    @Override // xy.v1
    public boolean contains(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return this.f98670b.containsKey(name);
    }

    @Override // xy.v1
    public void d(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        s(value);
        List<String> p11 = p(name);
        p11.clear();
        p11.add(value);
    }

    @Override // xy.v1
    public boolean e(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        List<String> list = this.f98670b.get(name);
        if (list != null) {
            return list.remove(value);
        }
        return false;
    }

    @Override // xy.v1
    @m80.k
    public Set<Map.Entry<String, List<String>>> entries() {
        return w.a(this.f98670b.entrySet());
    }

    @Override // xy.v1
    public void f(@m80.k String name, @m80.k Iterable<String> values) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        List<String> p11 = p(name);
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        a00.m0.s0(p11, values);
    }

    @Override // xy.v1
    public void g() {
        Map<String, List<String>> map = this.f98670b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            remove((String) ((Map.Entry) it.next()).getKey());
        }
    }

    @Override // xy.v1
    @m80.l
    public String get(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        List<String> a11 = a(name);
        if (a11 != null) {
            return (String) a00.r0.L2(a11);
        }
        return null;
    }

    @Override // xy.v1
    public void h(@m80.k String name, @m80.k Iterable<String> values) {
        Set k11;
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        List<String> list = this.f98670b.get(name);
        if (list == null || (k11 = a00.r0.f6(list)) == null) {
            k11 = a00.w1.k();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : values) {
            if (!k11.contains(str)) {
                arrayList.add(str);
            }
        }
        f(name, arrayList);
    }

    @Override // xy.v1
    public void i(@m80.k u1 stringValues) {
        kotlin.jvm.internal.g0.p(stringValues, "stringValues");
        stringValues.d(new x00.p() { // from class: xy.w1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 o11;
                o11 = y1.o(y1.this, (String) obj, (List) obj2);
                return o11;
            }
        });
    }

    @Override // xy.v1
    public boolean isEmpty() {
        return this.f98670b.isEmpty();
    }

    @Override // xy.v1
    public void j(@m80.k u1 stringValues) {
        kotlin.jvm.internal.g0.p(stringValues, "stringValues");
        stringValues.d(new x00.p() { // from class: xy.x1
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                g2 n11;
                n11 = y1.n(y1.this, (String) obj, (List) obj2);
                return n11;
            }
        });
    }

    @Override // xy.v1
    public void k(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        s(value);
        p(name).add(value);
    }

    @Override // xy.v1
    @m80.k
    public Set<String> names() {
        return this.f98670b.keySet();
    }

    public final List<String> p(String str) {
        List<String> list = this.f98670b.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        r(str);
        this.f98670b.put(str, arrayList);
        return arrayList;
    }

    @m80.k
    public final Map<String, List<String>> q() {
        return this.f98670b;
    }

    public void r(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
    }

    @Override // xy.v1
    public void remove(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f98670b.remove(name);
    }

    public void s(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
    }

    public y1(boolean z11, int i11) {
        this.f98669a = z11;
        this.f98670b = z11 ? x.a() : new LinkedHashMap<>(i11);
    }

    public /* synthetic */ y1(boolean z11, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this((i12 & 1) != 0 ? false : z11, (i12 & 2) != 0 ? 8 : i11);
    }
}
