package x20;

import a00.h0;
import a00.m0;
import a00.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import p10.q0;
import x20.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nGivenFunctionsMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n+ 2 CollectionUtil.kt\norg/jetbrains/kotlin/utils/CollectionUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,91:1\n32#2,2:92\n9#2,6:94\n32#2,2:100\n9#2,6:102\n1368#3:108\n1454#3,5:109\n808#3,11:114\n1485#3:125\n1510#3,3:126\n1513#3,3:136\n1485#3:139\n1510#3,3:140\n1513#3,3:150\n774#3:153\n865#3,2:154\n381#4,7:129\n381#4,7:143\n*S KotlinDebug\n*F\n+ 1 GivenFunctionsMemberScope.kt\norg/jetbrains/kotlin/resolve/scopes/GivenFunctionsMemberScope\n*L\n51#1:92,2\n51#1:94,6\n55#1:100,2\n55#1:102,6\n61#1:108\n61#1:109,5\n62#1:114,11\n63#1:125\n63#1:126,3\n63#1:136,3\n64#1:139\n64#1:140,3\n64#1:150,3\n68#1:153\n68#1:154,2\n63#1:129,7\n64#1:143,7\n*E\n"})
/* loaded from: classes8.dex */
public abstract class f extends l {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f97107d = {o0.u(new PropertyReference1Impl(o0.d(f.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p10.b f97108b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d30.i f97109c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends q20.k {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList<p10.h> f97110a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f97111b;

        public a(ArrayList<p10.h> arrayList, f fVar) {
            this.f97110a = arrayList;
            this.f97111b = fVar;
        }

        @Override // q20.l
        public void a(CallableMemberDescriptor fakeOverride) {
            g0.p(fakeOverride, "fakeOverride");
            OverridingUtil.K(fakeOverride, null);
            this.f97110a.add(fakeOverride);
        }

        @Override // q20.k
        public void e(CallableMemberDescriptor fromSuper, CallableMemberDescriptor fromCurrent) {
            g0.p(fromSuper, "fromSuper");
            g0.p(fromCurrent, "fromCurrent");
            throw new IllegalStateException(("Conflict in scope of " + this.f97111b.n() + ": " + fromSuper + " vs " + fromCurrent).toString());
        }
    }

    public f(@m80.k d30.n storageManager, @m80.k p10.b containingClass) {
        g0.p(storageManager, "storageManager");
        g0.p(containingClass, "containingClass");
        this.f97108b = containingClass;
        this.f97109c = storageManager.f(new e(this));
    }

    public static final List j(f fVar) {
        List<kotlin.reflect.jvm.internal.impl.descriptors.e> k11 = fVar.k();
        return r0.I4(k11, fVar.l(k11));
    }

    @Override // x20.l, x20.k, x20.n
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        List list;
        g0.p(name, "name");
        g0.p(location, "location");
        List<p10.h> m11 = m();
        if (m11.isEmpty()) {
            list = h0.J();
        } else {
            o30.k kVar = new o30.k();
            for (Object obj : m11) {
                if ((obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) && g0.g(((kotlin.reflect.jvm.internal.impl.descriptors.g) obj).getName(), name)) {
                    kVar.add(obj);
                }
            }
            list = kVar;
        }
        return list;
    }

    @Override // x20.l, x20.k
    @m80.k
    public Collection<q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        List list;
        g0.p(name, "name");
        g0.p(location, "location");
        List<p10.h> m11 = m();
        if (m11.isEmpty()) {
            list = h0.J();
        } else {
            o30.k kVar = new o30.k();
            for (Object obj : m11) {
                if ((obj instanceof q0) && g0.g(((q0) obj).getName(), name)) {
                    kVar.add(obj);
                }
            }
            list = kVar;
        }
        return list;
    }

    @Override // x20.l, x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        g0.p(kindFilter, "kindFilter");
        g0.p(nameFilter, "nameFilter");
        return !kindFilter.a(d.f97091p.m()) ? h0.J() : m();
    }

    @m80.k
    public abstract List<kotlin.reflect.jvm.internal.impl.descriptors.e> k();

    /* JADX WARN: Multi-variable type inference failed */
    public final List<p10.h> l(List<? extends kotlin.reflect.jvm.internal.impl.descriptors.e> list) {
        Collection<? extends CallableMemberDescriptor> J;
        ArrayList arrayList = new ArrayList(3);
        Collection<e30.r0> c11 = this.f97108b.o().c();
        g0.o(c11, "getSupertypes(...)");
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            m0.s0(arrayList2, n.a.a(((e30.r0) it.next()).r(), null, null, 3, null));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (obj instanceof CallableMemberDescriptor) {
                arrayList3.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList3) {
            n20.f name = ((CallableMemberDescriptor) obj2).getName();
            Object obj3 = linkedHashMap.get(name);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(name, obj3);
            }
            ((List) obj3).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            g0.o(key, "component1(...)");
            n20.f fVar = (n20.f) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj4 : list2) {
                Boolean valueOf = Boolean.valueOf(((CallableMemberDescriptor) obj4) instanceof kotlin.reflect.jvm.internal.impl.descriptors.e);
                Object obj5 = linkedHashMap2.get(valueOf);
                if (obj5 == null) {
                    obj5 = new ArrayList();
                    linkedHashMap2.put(valueOf, obj5);
                }
                ((List) obj5).add(obj4);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean booleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                OverridingUtil overridingUtil = OverridingUtil.f67634f;
                List list4 = list3;
                if (booleanValue) {
                    J = new ArrayList<>();
                    for (Object obj6 : list) {
                        if (g0.g(((kotlin.reflect.jvm.internal.impl.descriptors.e) obj6).getName(), fVar)) {
                            J.add(obj6);
                        }
                    }
                } else {
                    J = h0.J();
                }
                overridingUtil.v(fVar, list4, J, this.f97108b, new a(arrayList, this));
            }
        }
        return o30.a.c(arrayList);
    }

    public final List<p10.h> m() {
        return (List) d30.m.a(this.f97109c, this, f97107d[0]);
    }

    @m80.k
    public final p10.b n() {
        return this.f97108b;
    }
}
