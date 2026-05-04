package xy;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesImpl\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n216#2:417\n217#2:419\n1#3:418\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesImpl\n*L\n160#1:417\n160#1:419\n*E\n"})
/* loaded from: classes8.dex */
public class z1 implements u1 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f98671d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Map<String, List<String>> f98672e;

    /* JADX WARN: Multi-variable type inference failed */
    public z1() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    @Override // xy.u1
    @m80.l
    public List<String> a(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return f(name);
    }

    @Override // xy.u1
    public final boolean b() {
        return this.f98671d;
    }

    @Override // xy.u1
    public boolean c(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        List<String> f11 = f(name);
        if (f11 != null) {
            return f11.contains(value);
        }
        return false;
    }

    @Override // xy.u1
    public boolean contains(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return f(name) != null;
    }

    @Override // xy.u1
    public void d(@m80.k x00.p<? super String, ? super List<String>, g2> body) {
        kotlin.jvm.internal.g0.p(body, "body");
        for (Map.Entry<String, List<String>> entry : this.f98672e.entrySet()) {
            body.invoke(entry.getKey(), entry.getValue());
        }
    }

    @m80.k
    public final Map<String, List<String>> e() {
        return this.f98672e;
    }

    @Override // xy.u1
    @m80.k
    public Set<Map.Entry<String, List<String>>> entries() {
        return w.a(this.f98672e.entrySet());
    }

    public boolean equals(@m80.l Object obj) {
        boolean k11;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        if (this.f98671d != u1Var.b()) {
            return false;
        }
        k11 = c2.k(entries(), u1Var.entries());
        return k11;
    }

    public final List<String> f(String str) {
        return this.f98672e.get(str);
    }

    @Override // xy.u1
    @m80.l
    public String get(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        List<String> f11 = f(name);
        if (f11 != null) {
            return (String) a00.r0.L2(f11);
        }
        return null;
    }

    public int hashCode() {
        int l11;
        l11 = c2.l(entries(), Boolean.hashCode(this.f98671d) * 31);
        return l11;
    }

    @Override // xy.u1
    public boolean isEmpty() {
        return this.f98672e.isEmpty();
    }

    @Override // xy.u1
    @m80.k
    public Set<String> names() {
        return w.a(this.f98672e.keySet());
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("StringValues(case=");
        sb2.append(!this.f98671d);
        sb2.append(") ");
        sb2.append(entries());
        return sb2.toString();
    }

    public z1(boolean z11, @m80.k Map<String, ? extends List<String>> values) {
        kotlin.jvm.internal.g0.p(values, "values");
        this.f98671d = z11;
        Map a11 = z11 ? x.a() : new LinkedHashMap();
        for (Map.Entry<String, ? extends List<String>> entry : values.entrySet()) {
            String key = entry.getKey();
            List<String> value = entry.getValue();
            int size = value.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(value.get(i11));
            }
            a11.put(key, arrayList);
        }
        this.f98672e = a11;
    }

    public /* synthetic */ z1(boolean z11, Map map, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? a00.l1.z() : map);
    }
}
