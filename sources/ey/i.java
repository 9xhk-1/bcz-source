package ey;

import a00.d1;
import a00.h0;
import a00.i0;
import a00.k1;
import a00.l1;
import a00.r0;
import g10.u;
import io.ktor.server.config.ApplicationConfigurationException;
import ix.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;
import u30.k0;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMapApplicationConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapApplicationConfig.kt\nio/ktor/server/config/MapApplicationConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1863#2,2:149\n1872#2,3:153\n1557#2:156\n1628#2,3:157\n774#2:160\n865#2,2:161\n774#2:163\n865#2,2:164\n1557#2:166\n1628#2,3:167\n1611#2,9:170\n1863#2:179\n295#2,2:180\n1864#2:183\n1620#2:184\n774#2:185\n865#2,2:186\n1557#2:188\n1628#2,3:189\n1187#2,2:192\n1261#2,2:194\n1557#2:196\n1628#2,3:197\n1264#2:200\n216#3,2:151\n1#4:182\n*S KotlinDebug\n*F\n+ 1 MapApplicationConfig.kt\nio/ktor/server/config/MapApplicationConfig\n*L\n28#1:149,2\n47#1:153,3\n63#1:156\n63#1:157,3\n81#1:160\n81#1:161,2\n82#1:163\n82#1:164,2\n82#1:166\n82#1:167,3\n84#1:170,9\n84#1:179\n85#1:180,2\n84#1:183\n84#1:184\n99#1:185\n99#1:186,2\n100#1:188\n100#1:189,3\n102#1:192,2\n102#1:194,2\n108#1:196\n108#1:197,3\n102#1:200\n29#1:151,2\n84#1:182\n*E\n"})
/* loaded from: classes8.dex */
public class i implements ey.a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<String, String> f50234a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f50235b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMapApplicationConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapApplicationConfig.kt\nio/ktor/server/config/MapApplicationConfig$MapApplicationConfigValue\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,148:1\n1557#2:149\n1628#2,3:150\n*S KotlinDebug\n*F\n+ 1 MapApplicationConfig.kt\nio/ktor/server/config/MapApplicationConfig$MapApplicationConfigValue\n*L\n128#1:149\n128#1:150,3\n*E\n"})
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Map<String, String> f50236a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f50237b;

        public a(@m80.k Map<String, String> map, @m80.k String path) {
            g0.p(map, "map");
            g0.p(path, "path");
            this.f50236a = map;
            this.f50237b = path;
        }

        @Override // ey.c
        @m80.k
        public List<String> a() {
            String c11;
            String c12;
            Map<String, String> map = this.f50236a;
            c11 = j.c(this.f50237b, g.b.f62794h);
            String str = map.get(c11);
            if (str == null) {
                throw new ApplicationConfigurationException("Property " + this.f50237b + ".size not found.");
            }
            g10.l W1 = u.W1(0, Integer.parseInt(str));
            ArrayList arrayList = new ArrayList(i0.d0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int nextInt = ((d1) it).nextInt();
                Map<String, String> map2 = this.f50236a;
                c12 = j.c(this.f50237b, String.valueOf(nextInt));
                String str2 = map2.get(c12);
                g0.m(str2);
                arrayList.add(str2);
            }
            return arrayList;
        }

        @m80.k
        public final Map<String, String> b() {
            return this.f50236a;
        }

        @m80.k
        public final String c() {
            return this.f50237b;
        }

        @Override // ey.c
        @m80.k
        public String getString() {
            String str = this.f50236a.get(this.f50237b);
            g0.m(str);
            return str;
        }
    }

    public i(Map<String, String> map, String str) {
        this.f50234a = map;
        this.f50235b = str;
    }

    @Override // ey.a
    @m80.k
    public List<ey.a> a(@m80.k String path) {
        String c11;
        String c12;
        String c13;
        g0.p(path, "path");
        c11 = j.c(this.f50235b, path);
        Map<String, String> map = this.f50234a;
        c12 = j.c(c11, g.b.f62794h);
        String str = map.get(c12);
        if (str == null) {
            throw new ApplicationConfigurationException("Property " + c11 + ".size not found.");
        }
        g10.l W1 = u.W1(0, Integer.parseInt(str));
        ArrayList arrayList = new ArrayList(i0.d0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            int nextInt = ((d1) it).nextInt();
            Map<String, String> map2 = this.f50234a;
            c13 = j.c(c11, String.valueOf(nextInt));
            arrayList.add(new i(map2, c13));
        }
        return arrayList;
    }

    @Override // ey.a
    @m80.k
    public ey.a b(@m80.k String path) {
        String c11;
        g0.p(path, "path");
        Map<String, String> map = this.f50234a;
        c11 = j.c(this.f50235b, path);
        return new i(map, c11);
    }

    @Override // ey.a
    @m80.k
    public Map<String, Object> c() {
        String c11;
        String c12;
        Pair a11;
        String c13;
        Set<String> keySet = this.f50234a.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (f0.J2((String) obj, this.f50235b, false, 2, null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) r0.G2(k0.n5(u30.r0.d7((String) it.next(), this.f50235b.length() == 0 ? 0 : this.f50235b.length() + 1), new char[]{'.'}, false, 0, 6, null)));
        }
        List<String> e22 = r0.e2(arrayList2);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(k1.j(i0.d0(e22, 10)), 16));
        for (String str : e22) {
            c11 = j.c(this.f50235b, str);
            if (this.f50234a.containsKey(c11)) {
                a11 = h1.a(str, this.f50234a.get(c11));
            } else {
                Map<String, String> map = this.f50234a;
                c12 = j.c(c11, g.b.f62794h);
                if (map.containsKey(c12)) {
                    Map<String, String> map2 = this.f50234a;
                    c13 = j.c(c11, "0");
                    if (map2.containsKey(c13)) {
                        a11 = h1.a(str, e(c11).a());
                    } else {
                        List<ey.a> a12 = a(c11);
                        ArrayList arrayList3 = new ArrayList(i0.d0(a12, 10));
                        Iterator<T> it2 = a12.iterator();
                        while (it2.hasNext()) {
                            arrayList3.add(((ey.a) it2.next()).c());
                        }
                        a11 = h1.a(str, arrayList3);
                    }
                } else {
                    a11 = h1.a(str, b(str).c());
                }
            }
            linkedHashMap.put(a11.getFirst(), a11.getSecond());
        }
        return linkedHashMap;
    }

    @Override // ey.a
    @m80.l
    public c d(@m80.k String path) {
        String c11;
        String c12;
        g0.p(path, "path");
        c11 = j.c(this.f50235b, path);
        if (!this.f50234a.containsKey(c11)) {
            Map<String, String> map = this.f50234a;
            c12 = j.c(c11, g.b.f62794h);
            if (!map.containsKey(c12)) {
                return null;
            }
        }
        return new a(this.f50234a, c11);
    }

    @Override // ey.a
    @m80.k
    public c e(@m80.k String path) {
        String c11;
        g0.p(path, "path");
        c d11 = d(path);
        if (d11 != null) {
            return d11;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Property ");
        c11 = j.c(this.f50235b, path);
        sb2.append(c11);
        sb2.append(" not found.");
        throw new ApplicationConfigurationException(sb2.toString());
    }

    @m80.k
    public final Map<String, String> f() {
        return this.f50234a;
    }

    @m80.k
    public final String g() {
        return this.f50235b;
    }

    public final void h(@m80.k String path, @m80.k Iterable<String> values) {
        String c11;
        String c12;
        g0.p(path, "path");
        g0.p(values, "values");
        int i11 = 0;
        int i12 = 0;
        for (String str : values) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                h0.b0();
            }
            c12 = j.c(path, String.valueOf(i12));
            i(c12, str);
            i11++;
            i12 = i13;
        }
        c11 = j.c(path, g.b.f62794h);
        i(c11, String.valueOf(i11));
    }

    public final void i(@m80.k String path, @m80.k String value) {
        String c11;
        g0.p(path, "path");
        g0.p(value, "value");
        Map<String, String> map = this.f50234a;
        c11 = j.c(this.f50235b, path);
        map.put(c11, value);
    }

    @Override // ey.a
    @m80.k
    public Set<String> keys() {
        Set<String> set;
        Object obj;
        boolean z11 = this.f50235b.length() == 0;
        Set<String> keySet = this.f50234a.keySet();
        if (z11) {
            set = keySet;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : keySet) {
                if (f0.J2((String) obj2, this.f50235b + '.', false, 2, null)) {
                    arrayList.add(obj2);
                }
            }
            set = arrayList;
        }
        Iterable<String> iterable = set;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : iterable) {
            if (k0.n3((String) obj3, ".size", false, 2, null)) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList(i0.d0(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(k0.U5((String) it.next(), ".size", null, 2, null));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList4 = new ArrayList();
        for (String str : iterable) {
            Iterator it2 = arrayList3.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (f0.J2(str, (String) obj, false, 2, null)) {
                    break;
                }
            }
            String str2 = (String) obj;
            if (str2 != null && !linkedHashSet.contains(str2)) {
                linkedHashSet.add(str2);
                str = str2;
            } else if (str2 != null) {
                str = null;
            }
            if (!z11) {
                str = str != null ? k0.M5(str, this.f50235b + '.', null, 2, null) : null;
            }
            if (str != null) {
                arrayList4.add(str);
            }
        }
        return r0.f6(arrayList4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(@m80.k java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Map r0 = a00.l1.B0(r5)
            java.util.Map r0 = a00.l1.J0(r0)
            java.lang.String r1 = ""
            r4.<init>(r0, r1)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r5.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r1 = r1.getFirst()
            java.lang.String r1 = (java.lang.String) r1
            ey.j.b(r1, r0)
            goto L1d
        L33:
            java.util.Set r5 = r0.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L3b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.f50234a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = ".size"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.put(r1, r0)
            goto L3b
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ey.i.<init>(java.util.List):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(@m80.k Pair<String, String>... values) {
        this(l1.j0((Pair[]) Arrays.copyOf(values, values.length)), "");
        g0.p(values, "values");
    }

    public i() {
        this(new LinkedHashMap(), "");
    }
}
