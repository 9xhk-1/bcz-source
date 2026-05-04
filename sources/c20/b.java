package c20;

import a00.k1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeclaredMemberIndex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n992#2:67\n1021#2,3:68\n1024#2,3:78\n678#2:81\n708#2,4:82\n1159#2,3:95\n1159#2,3:98\n381#3,7:71\n774#4:86\n865#4,2:87\n1202#4,2:89\n1230#4,4:91\n*S KotlinDebug\n*F\n+ 1 DeclaredMemberIndex.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/ClassDeclaredMemberIndex\n*L\n52#1:67\n52#1:68,3\n52#1:78,3\n53#1:81\n53#1:82,4\n57#1:95,3\n60#1:98,3\n52#1:71,7\n54#1:86\n54#1:87,2\n54#1:89,2\n54#1:91,4\n*E\n"})
/* loaded from: classes8.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final f20.g f7518a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<f20.q, Boolean> f7519b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.l<f20.r, Boolean> f7520c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<n20.f, List<f20.r>> f7521d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final Map<n20.f, f20.n> f7522e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Map<n20.f, f20.w> f7523f;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@m80.k f20.g jClass, @m80.k x00.l<? super f20.q, Boolean> memberFilter) {
        kotlin.jvm.internal.g0.p(jClass, "jClass");
        kotlin.jvm.internal.g0.p(memberFilter, "memberFilter");
        this.f7518a = jClass;
        this.f7519b = memberFilter;
        a aVar = new a(this);
        this.f7520c = aVar;
        q30.m P0 = q30.k0.P0(a00.r0.E1(jClass.v()), aVar);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : P0) {
            n20.f name = ((f20.r) obj).getName();
            Object obj2 = linkedHashMap.get(name);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(name, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f7521d = linkedHashMap;
        q30.m P02 = q30.k0.P0(a00.r0.E1(this.f7518a.getFields()), this.f7519b);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj3 : P02) {
            linkedHashMap2.put(((f20.n) obj3).getName(), obj3);
        }
        this.f7522e = linkedHashMap2;
        Collection<f20.w> E = this.f7518a.E();
        x00.l<f20.q, Boolean> lVar = this.f7519b;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : E) {
            if (((Boolean) lVar.invoke(obj4)).booleanValue()) {
                arrayList.add(obj4);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(arrayList, 10)), 16));
        for (Object obj5 : arrayList) {
            linkedHashMap3.put(((f20.w) obj5).getName(), obj5);
        }
        this.f7523f = linkedHashMap3;
    }

    public static final boolean h(b bVar, f20.r m11) {
        kotlin.jvm.internal.g0.p(m11, "m");
        return bVar.f7519b.invoke(m11).booleanValue() && !f20.p.c(m11);
    }

    @Override // c20.c
    @m80.k
    public Set<n20.f> a() {
        q30.m P0 = q30.k0.P0(a00.r0.E1(this.f7518a.v()), this.f7520c);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = P0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((f20.r) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // c20.c
    @m80.l
    public f20.w b(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return this.f7523f.get(name);
    }

    @Override // c20.c
    @m80.k
    public Set<n20.f> c() {
        return this.f7523f.keySet();
    }

    @Override // c20.c
    @m80.l
    public f20.n d(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return this.f7522e.get(name);
    }

    @Override // c20.c
    @m80.k
    public Set<n20.f> e() {
        q30.m P0 = q30.k0.P0(a00.r0.E1(this.f7518a.getFields()), this.f7519b);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = P0.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((f20.n) it.next()).getName());
        }
        return linkedHashSet;
    }

    @Override // c20.c
    @m80.k
    public Collection<f20.r> f(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        List<f20.r> list = this.f7521d.get(name);
        return list != null ? list : a00.h0.J();
    }
}
