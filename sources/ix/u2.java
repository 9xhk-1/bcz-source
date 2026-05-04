package ix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUrlDecodedParametersBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,88:1\n1557#2:89\n1628#2,3:90\n1557#2:93\n1628#2,3:94\n1557#2:97\n1628#2,3:98\n1557#2:101\n1628#2,3:102\n*S KotlinDebug\n*F\n+ 1 UrlDecodedParametersBuilder.kt\nio/ktor/http/UrlDecodedParametersBuilder\n*L\n18#1:89\n18#1:90,3\n26#1:93\n26#1:94,3\n44#1:97\n44#1:98,3\n50#1:101\n50#1:102,3\n*E\n"})
/* loaded from: classes8.dex */
public final class u2 implements q1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q1 f63002a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63003b;

    public u2(@m80.k q1 encodedParametersBuilder) {
        kotlin.jvm.internal.g0.p(encodedParametersBuilder, "encodedParametersBuilder");
        this.f63002a = encodedParametersBuilder;
        this.f63003b = encodedParametersBuilder.b();
    }

    @Override // xy.v1
    @m80.l
    public List<String> a(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        List<String> a11 = this.f63002a.a(f.n(name, false, 1, null));
        if (a11 == null) {
            return null;
        }
        List<String> list = a11;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(f.k((String) it.next(), 0, 0, true, null, 11, null));
        }
        return arrayList;
    }

    @Override // xy.v1
    public boolean b() {
        return this.f63003b;
    }

    @Override // xy.v1
    public boolean c(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        return this.f63002a.c(f.n(name, false, 1, null), f.p(value));
    }

    @Override // xy.v1
    public void clear() {
        this.f63002a.clear();
    }

    @Override // xy.v1
    public boolean contains(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return this.f63002a.contains(f.n(name, false, 1, null));
    }

    @Override // xy.v1
    public void d(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f63002a.d(f.n(name, false, 1, null), f.p(value));
    }

    @Override // xy.v1
    public boolean e(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        return this.f63002a.e(f.n(name, false, 1, null), f.p(value));
    }

    @Override // xy.v1
    @m80.k
    public Set<Map.Entry<String, List<String>>> entries() {
        return v2.d(this.f63002a).entries();
    }

    @Override // xy.v1
    public void f(@m80.k String name, @m80.k Iterable<String> values) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        q1 q1Var = this.f63002a;
        String n11 = f.n(name, false, 1, null);
        ArrayList arrayList = new ArrayList(a00.i0.d0(values, 10));
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(f.p(it.next()));
        }
        q1Var.f(n11, arrayList);
    }

    @Override // xy.v1
    public void g() {
        this.f63002a.g();
    }

    @Override // xy.v1
    @m80.l
    public String get(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        String str = this.f63002a.get(f.n(name, false, 1, null));
        if (str != null) {
            return f.k(str, 0, 0, true, null, 11, null);
        }
        return null;
    }

    @Override // xy.v1
    public void h(@m80.k String name, @m80.k Iterable<String> values) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(values, "values");
        q1 q1Var = this.f63002a;
        String n11 = f.n(name, false, 1, null);
        ArrayList arrayList = new ArrayList(a00.i0.d0(values, 10));
        Iterator<String> it = values.iterator();
        while (it.hasNext()) {
            arrayList.add(f.p(it.next()));
        }
        q1Var.h(n11, arrayList);
    }

    @Override // xy.v1
    public void i(@m80.k xy.u1 stringValues) {
        kotlin.jvm.internal.g0.p(stringValues, "stringValues");
        this.f63002a.i(v2.e(stringValues).build());
    }

    @Override // xy.v1
    public boolean isEmpty() {
        return this.f63002a.isEmpty();
    }

    @Override // xy.v1
    public void j(@m80.k xy.u1 stringValues) {
        kotlin.jvm.internal.g0.p(stringValues, "stringValues");
        v2.c(this.f63002a, stringValues);
    }

    @Override // xy.v1
    public void k(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f63002a.k(f.n(name, false, 1, null), f.p(value));
    }

    @Override // xy.v1
    @m80.k
    public Set<String> names() {
        Set<String> names = this.f63002a.names();
        ArrayList arrayList = new ArrayList(a00.i0.d0(names, 10));
        Iterator<T> it = names.iterator();
        while (it.hasNext()) {
            arrayList.add(f.k((String) it.next(), 0, 0, false, null, 15, null));
        }
        return a00.r0.f6(arrayList);
    }

    @Override // xy.v1
    public void remove(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f63002a.remove(f.n(name, false, 1, null));
    }

    @Override // xy.v1
    @m80.k
    public p1 build() {
        return v2.d(this.f63002a);
    }
}
