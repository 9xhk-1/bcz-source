package c30;

import a00.k1;
import a00.l1;
import a00.x1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import p10.b1;
import q20.j;
import x20.d;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class w extends x20.l {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f7762f = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(w.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(w.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final a30.o f7763b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final a f7764c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d30.i f7765d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d30.j f7766e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        @m80.k
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f fVar, @m80.k x10.b bVar);

        @m80.k
        Set<n20.f> b();

        @m80.k
        Collection<p10.q0> c(@m80.k n20.f fVar, @m80.k x10.b bVar);

        @m80.k
        Set<n20.f> d();

        void e(@m80.k Collection<p10.h> collection, @m80.k x20.d dVar, @m80.k x00.l<? super n20.f, Boolean> lVar, @m80.k x10.b bVar);

        @m80.k
        Set<n20.f> f();

        @m80.l
        b1 g(@m80.k n20.f fVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,512:1\n502#1:513\n508#1:517\n508#1:532\n508#1:546\n492#1:572\n493#1,5:575\n492#1:580\n493#1,5:583\n502#1:644\n502#1:648\n1628#2,3:514\n1611#2,9:518\n1863#2:527\n1864#2:530\n1620#2:531\n1611#2,9:533\n1863#2:542\n1864#2:544\n1620#2:545\n1611#2,9:547\n1863#2:556\n1864#2:558\n1620#2:559\n1368#2:560\n1454#2,5:561\n1368#2:566\n1454#2,5:567\n865#2,2:573\n865#2,2:581\n865#2,2:588\n865#2,2:590\n865#2,2:592\n1628#2,3:594\n1611#2,9:597\n1863#2:606\n1864#2:608\n1620#2:609\n1202#2,2:610\n1230#2,4:612\n1485#2:616\n1510#2,3:617\n1513#2,3:627\n1485#2:630\n1510#2,3:631\n1513#2,3:641\n1628#2,3:645\n1628#2,3:649\n1#3:528\n1#3:529\n1#3:543\n1#3:557\n1#3:607\n381#4,7:620\n381#4,7:634\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$NoReorderImplementation\n*L\n429#1:513\n432#1:517\n435#1:532\n438#1:546\n447#1:572\n447#1:575,5\n450#1:580\n450#1:583,5\n421#1:644\n425#1:648\n429#1:514,3\n432#1:518,9\n432#1:527\n432#1:530\n432#1:531\n435#1:533,9\n435#1:542\n435#1:544\n435#1:545\n438#1:547,9\n438#1:556\n438#1:558\n438#1:559\n441#1:560\n441#1:561,5\n444#1:566\n444#1:567,5\n447#1:573,2\n450#1:581,2\n473#1:588,2\n477#1:590,2\n492#1:592,2\n502#1:594,3\n508#1:597,9\n508#1:606\n508#1:608\n508#1:609\n412#1:610,2\n412#1:612,4\n415#1:616\n415#1:617,3\n415#1:627,3\n418#1:630\n418#1:631,3\n418#1:641,3\n421#1:645,3\n425#1:649,3\n432#1:529\n435#1:543\n438#1:557\n508#1:607\n415#1:620,7\n418#1:634,7\n*E\n"})
    public final class b implements a {

        /* renamed from: o, reason: collision with root package name */
        public static final /* synthetic */ h10.n<Object>[] f7767o = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final List<ProtoBuf.Function> f7768a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<ProtoBuf.Property> f7769b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final List<ProtoBuf.TypeAlias> f7770c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final d30.i f7771d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final d30.i f7772e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final d30.i f7773f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final d30.i f7774g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final d30.i f7775h;

        /* renamed from: i, reason: collision with root package name */
        @m80.k
        public final d30.i f7776i;

        /* renamed from: j, reason: collision with root package name */
        @m80.k
        public final d30.i f7777j;

        /* renamed from: k, reason: collision with root package name */
        @m80.k
        public final d30.i f7778k;

        /* renamed from: l, reason: collision with root package name */
        @m80.k
        public final d30.i f7779l;

        /* renamed from: m, reason: collision with root package name */
        @m80.k
        public final d30.i f7780m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ w f7781n;

        public b(@m80.k w wVar, @m80.k List<ProtoBuf.Function> functionList, @m80.k List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) {
            kotlin.jvm.internal.g0.p(functionList, "functionList");
            kotlin.jvm.internal.g0.p(propertyList, "propertyList");
            kotlin.jvm.internal.g0.p(typeAliasList, "typeAliasList");
            this.f7781n = wVar;
            this.f7768a = functionList;
            this.f7769b = propertyList;
            this.f7770c = wVar.t().c().g().f() ? typeAliasList : a00.h0.J();
            this.f7771d = wVar.t().h().f(new x(this));
            this.f7772e = wVar.t().h().f(new y(this));
            this.f7773f = wVar.t().h().f(new z(this));
            this.f7774g = wVar.t().h().f(new a0(this));
            this.f7775h = wVar.t().h().f(new b0(this));
            this.f7776i = wVar.t().h().f(new c0(this));
            this.f7777j = wVar.t().h().f(new d0(this));
            this.f7778k = wVar.t().h().f(new e0(this));
            this.f7779l = wVar.t().h().f(new f0(this, wVar));
            this.f7780m = wVar.t().h().f(new g0(this, wVar));
        }

        public static final List B(b bVar) {
            return bVar.w();
        }

        public static final List C(b bVar) {
            return bVar.z();
        }

        public static final Set D(b bVar, w wVar) {
            List<ProtoBuf.Function> list = bVar.f7768a;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f7781n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(a30.k0.b(wVar2.t().g(), ((ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next())).getName()));
            }
            return x1.C(linkedHashSet, wVar.x());
        }

        public static final Map E(b bVar) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.g> F = bVar.F();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : F) {
                n20.f name = ((kotlin.reflect.jvm.internal.impl.descriptors.g) obj).getName();
                kotlin.jvm.internal.g0.o(name, "getName(...)");
                Object obj2 = linkedHashMap.get(name);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(name, obj2);
                }
                ((List) obj2).add(obj);
            }
            return linkedHashMap;
        }

        public static final Map N(b bVar) {
            List<p10.q0> G = bVar.G();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : G) {
                n20.f name = ((p10.q0) obj).getName();
                kotlin.jvm.internal.g0.o(name, "getName(...)");
                Object obj2 = linkedHashMap.get(name);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(name, obj2);
                }
                ((List) obj2).add(obj);
            }
            return linkedHashMap;
        }

        public static final Map O(b bVar) {
            List<b1> H = bVar.H();
            LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(H, 10)), 16));
            for (Object obj : H) {
                n20.f name = ((b1) obj).getName();
                kotlin.jvm.internal.g0.o(name, "getName(...)");
                linkedHashMap.put(name, obj);
            }
            return linkedHashMap;
        }

        public static final Set P(b bVar, w wVar) {
            List<ProtoBuf.Property> list = bVar.f7769b;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar2 = bVar.f7781n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(a30.k0.b(wVar2.t().g(), ((ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next())).getName()));
            }
            return x1.C(linkedHashSet, wVar.y());
        }

        public static final List r(b bVar) {
            return a00.r0.I4(bVar.I(), bVar.u());
        }

        public static final List s(b bVar) {
            return a00.r0.I4(bVar.J(), bVar.v());
        }

        public static final List t(b bVar) {
            return bVar.A();
        }

        public final List<b1> A() {
            List<ProtoBuf.TypeAlias> list = this.f7770c;
            w wVar = this.f7781n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                b1 z11 = wVar.t().f().z((ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next()));
                if (z11 != null) {
                    arrayList.add(z11);
                }
            }
            return arrayList;
        }

        public final List<kotlin.reflect.jvm.internal.impl.descriptors.g> F() {
            return (List) d30.m.a(this.f7774g, this, f7767o[3]);
        }

        public final List<p10.q0> G() {
            return (List) d30.m.a(this.f7775h, this, f7767o[4]);
        }

        public final List<b1> H() {
            return (List) d30.m.a(this.f7773f, this, f7767o[2]);
        }

        public final List<kotlin.reflect.jvm.internal.impl.descriptors.g> I() {
            return (List) d30.m.a(this.f7771d, this, f7767o[0]);
        }

        public final List<p10.q0> J() {
            return (List) d30.m.a(this.f7772e, this, f7767o[1]);
        }

        public final Map<n20.f, Collection<kotlin.reflect.jvm.internal.impl.descriptors.g>> K() {
            return (Map) d30.m.a(this.f7777j, this, f7767o[6]);
        }

        public final Map<n20.f, Collection<p10.q0>> L() {
            return (Map) d30.m.a(this.f7778k, this, f7767o[7]);
        }

        public final Map<n20.f, b1> M() {
            return (Map) d30.m.a(this.f7776i, this, f7767o[5]);
        }

        @Override // c30.w.a
        @m80.k
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(location, "location");
            if (!b().contains(name)) {
                return a00.h0.J();
            }
            Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> collection = K().get(name);
            return collection == null ? a00.h0.J() : collection;
        }

        @Override // c30.w.a
        @m80.k
        public Set<n20.f> b() {
            return (Set) d30.m.a(this.f7779l, this, f7767o[8]);
        }

        @Override // c30.w.a
        @m80.k
        public Collection<p10.q0> c(@m80.k n20.f name, @m80.k x10.b location) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(location, "location");
            if (!d().contains(name)) {
                return a00.h0.J();
            }
            Collection<p10.q0> collection = L().get(name);
            return collection == null ? a00.h0.J() : collection;
        }

        @Override // c30.w.a
        @m80.k
        public Set<n20.f> d() {
            return (Set) d30.m.a(this.f7780m, this, f7767o[9]);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // c30.w.a
        public void e(@m80.k Collection<p10.h> result, @m80.k x20.d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter, @m80.k x10.b location) {
            kotlin.jvm.internal.g0.p(result, "result");
            kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
            kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
            kotlin.jvm.internal.g0.p(location, "location");
            if (kindFilter.a(x20.d.f97078c.i())) {
                for (Object obj : G()) {
                    n20.f name = ((p10.q0) obj).getName();
                    kotlin.jvm.internal.g0.o(name, "getName(...)");
                    if (nameFilter.invoke(name).booleanValue()) {
                        result.add(obj);
                    }
                }
            }
            if (kindFilter.a(x20.d.f97078c.d())) {
                for (Object obj2 : F()) {
                    n20.f name2 = ((kotlin.reflect.jvm.internal.impl.descriptors.g) obj2).getName();
                    kotlin.jvm.internal.g0.o(name2, "getName(...)");
                    if (nameFilter.invoke(name2).booleanValue()) {
                        result.add(obj2);
                    }
                }
            }
        }

        @Override // c30.w.a
        @m80.k
        public Set<n20.f> f() {
            List<ProtoBuf.TypeAlias> list = this.f7770c;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            w wVar = this.f7781n;
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(a30.k0.b(wVar.t().g(), ((ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next())).getName()));
            }
            return linkedHashSet;
        }

        @Override // c30.w.a
        @m80.l
        public b1 g(@m80.k n20.f name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return M().get(name);
        }

        public final List<kotlin.reflect.jvm.internal.impl.descriptors.g> u() {
            Set<n20.f> x11 = this.f7781n.x();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = x11.iterator();
            while (it.hasNext()) {
                a00.m0.s0(arrayList, x((n20.f) it.next()));
            }
            return arrayList;
        }

        public final List<p10.q0> v() {
            Set<n20.f> y11 = this.f7781n.y();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = y11.iterator();
            while (it.hasNext()) {
                a00.m0.s0(arrayList, y((n20.f) it.next()));
            }
            return arrayList;
        }

        public final List<kotlin.reflect.jvm.internal.impl.descriptors.g> w() {
            List<ProtoBuf.Function> list = this.f7768a;
            w wVar = this.f7781n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                kotlin.reflect.jvm.internal.impl.descriptors.g s11 = wVar.t().f().s((ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next()));
                if (!wVar.B(s11)) {
                    s11 = null;
                }
                if (s11 != null) {
                    arrayList.add(s11);
                }
            }
            return arrayList;
        }

        public final List<kotlin.reflect.jvm.internal.impl.descriptors.g> x(n20.f fVar) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.g> I = I();
            w wVar = this.f7781n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : I) {
                if (kotlin.jvm.internal.g0.g(((p10.h) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.o(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        public final List<p10.q0> y(n20.f fVar) {
            List<p10.q0> J = J();
            w wVar = this.f7781n;
            ArrayList arrayList = new ArrayList();
            for (Object obj : J) {
                if (kotlin.jvm.internal.g0.g(((p10.h) obj).getName(), fVar)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            wVar.p(fVar, arrayList);
            return arrayList.subList(size, arrayList.size());
        }

        public final List<p10.q0> z() {
            List<ProtoBuf.Property> list = this.f7769b;
            w wVar = this.f7781n;
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                p10.q0 u11 = wVar.t().f().u((ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.n) it.next()));
                if (u11 != null) {
                    arrayList.add(u11);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDeserializedMemberScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n269#1:513\n269#1:528\n269#1:543\n287#1,17:581\n305#1,2:604\n296#1:606\n303#1:607\n305#1,2:613\n287#1,17:620\n305#1,2:642\n296#1:644\n370#1,11:645\n370#1,11:656\n1485#2:514\n1510#2,3:515\n1513#2,3:525\n1485#2:529\n1510#2,3:530\n1513#2,3:540\n1485#2:544\n1510#2,3:545\n1513#2,3:555\n1246#2,2:560\n1557#2:562\n1628#2,3:563\n1249#2:566\n1485#2:567\n1510#2,3:568\n1513#2,3:578\n1619#2:598\n1863#2:599\n1864#2:602\n1620#2:603\n1619#2:608\n1863#2:609\n1864#2:611\n1620#2:612\n1619#2:615\n1863#2:616\n1864#2:618\n1620#2:619\n1619#2:637\n1863#2:638\n1864#2:640\n1620#2:641\n381#3,7:518\n381#3,7:533\n381#3,7:548\n462#3:558\n412#3:559\n381#3,7:571\n1#4:600\n1#4:601\n1#4:610\n1#4:617\n1#4:639\n*S KotlinDebug\n*F\n+ 1 DeserializedMemberScope.kt\norg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedMemberScope$OptimizedImplementation\n*L\n233#1:513\n235#1:528\n239#1:543\n272#1:581,17\n272#1:604,2\n272#1:606\n287#1:607\n287#1:613,2\n310#1:620,17\n310#1:642,2\n310#1:644\n348#1:645,11\n356#1:656,11\n233#1:514\n233#1:515,3\n233#1:525,3\n235#1:529\n235#1:530,3\n235#1:540,3\n239#1:544\n239#1:545,3\n239#1:555,3\n244#1:560,2\n246#1:562\n246#1:563,3\n244#1:566\n269#1:567\n269#1:568,3\n269#1:578,3\n272#1:598\n272#1:599\n272#1:602\n272#1:603\n287#1:608\n287#1:609\n287#1:611\n287#1:612\n303#1:615\n303#1:616\n303#1:618\n303#1:619\n310#1:637\n310#1:638\n310#1:640\n310#1:641\n233#1:518,7\n235#1:533,7\n239#1:548,7\n244#1:558\n244#1:559\n269#1:571,7\n272#1:601\n287#1:610\n303#1:617\n310#1:639\n*E\n"})
    public final class c implements a {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ h10.n<Object>[] f7782j = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Map<n20.f, byte[]> f7783a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final Map<n20.f, byte[]> f7784b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Map<n20.f, byte[]> f7785c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final d30.g<n20.f, Collection<kotlin.reflect.jvm.internal.impl.descriptors.g>> f7786d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final d30.g<n20.f, Collection<p10.q0>> f7787e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final d30.h<n20.f, b1> f7788f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final d30.i f7789g;

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public final d30.i f7790h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ w f7791i;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a implements x00.a<Object> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.p<Object> f7792a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ByteArrayInputStream f7793b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f7794c;

            public a(kotlin.reflect.jvm.internal.impl.protobuf.p<Object> pVar, ByteArrayInputStream byteArrayInputStream, w wVar) {
                this.f7792a = pVar;
                this.f7793b = byteArrayInputStream;
                this.f7794c = wVar;
            }

            @Override // x00.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke() {
                return (kotlin.reflect.jvm.internal.impl.protobuf.n) this.f7792a.a(this.f7793b, this.f7794c.t().c().k());
            }
        }

        public c(@m80.k w wVar, @m80.k List<ProtoBuf.Function> functionList, @m80.k List<ProtoBuf.Property> propertyList, List<ProtoBuf.TypeAlias> typeAliasList) {
            Map<n20.f, byte[]> z11;
            kotlin.jvm.internal.g0.p(functionList, "functionList");
            kotlin.jvm.internal.g0.p(propertyList, "propertyList");
            kotlin.jvm.internal.g0.p(typeAliasList, "typeAliasList");
            this.f7791i = wVar;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : functionList) {
                n20.f b11 = a30.k0.b(wVar.t().g(), ((ProtoBuf.Function) ((kotlin.reflect.jvm.internal.impl.protobuf.n) obj)).getName());
                Object obj2 = linkedHashMap.get(b11);
                if (obj2 == null) {
                    obj2 = new ArrayList();
                    linkedHashMap.put(b11, obj2);
                }
                ((List) obj2).add(obj);
            }
            this.f7783a = r(linkedHashMap);
            w wVar2 = this.f7791i;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : propertyList) {
                n20.f b12 = a30.k0.b(wVar2.t().g(), ((ProtoBuf.Property) ((kotlin.reflect.jvm.internal.impl.protobuf.n) obj3)).getName());
                Object obj4 = linkedHashMap2.get(b12);
                if (obj4 == null) {
                    obj4 = new ArrayList();
                    linkedHashMap2.put(b12, obj4);
                }
                ((List) obj4).add(obj3);
            }
            this.f7784b = r(linkedHashMap2);
            if (this.f7791i.t().c().g().f()) {
                w wVar3 = this.f7791i;
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj5 : typeAliasList) {
                    n20.f b13 = a30.k0.b(wVar3.t().g(), ((ProtoBuf.TypeAlias) ((kotlin.reflect.jvm.internal.impl.protobuf.n) obj5)).getName());
                    Object obj6 = linkedHashMap3.get(b13);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap3.put(b13, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                z11 = r(linkedHashMap3);
            } else {
                z11 = l1.z();
            }
            this.f7785c = z11;
            this.f7786d = this.f7791i.t().h().b(new h0(this));
            this.f7787e = this.f7791i.t().h().b(new i0(this));
            this.f7788f = this.f7791i.t().h().h(new j0(this));
            this.f7789g = this.f7791i.t().h().f(new k0(this, this.f7791i));
            this.f7790h = this.f7791i.t().h().f(new l0(this, this.f7791i));
        }

        public static final Set p(c cVar, w wVar) {
            return x1.C(cVar.f7783a.keySet(), wVar.x());
        }

        public static final Collection q(c cVar, n20.f it) {
            kotlin.jvm.internal.g0.p(it, "it");
            return cVar.m(it);
        }

        public static final Collection s(c cVar, n20.f it) {
            kotlin.jvm.internal.g0.p(it, "it");
            return cVar.n(it);
        }

        public static final b1 t(c cVar, n20.f it) {
            kotlin.jvm.internal.g0.p(it, "it");
            return cVar.o(it);
        }

        public static final Set u(c cVar, w wVar) {
            return x1.C(cVar.f7784b.keySet(), wVar.y());
        }

        @Override // c30.w.a
        @m80.k
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(location, "location");
            return !b().contains(name) ? a00.h0.J() : this.f7786d.invoke(name);
        }

        @Override // c30.w.a
        @m80.k
        public Set<n20.f> b() {
            return (Set) d30.m.a(this.f7789g, this, f7782j[0]);
        }

        @Override // c30.w.a
        @m80.k
        public Collection<p10.q0> c(@m80.k n20.f name, @m80.k x10.b location) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(location, "location");
            return !d().contains(name) ? a00.h0.J() : this.f7787e.invoke(name);
        }

        @Override // c30.w.a
        @m80.k
        public Set<n20.f> d() {
            return (Set) d30.m.a(this.f7790h, this, f7782j[1]);
        }

        @Override // c30.w.a
        public void e(@m80.k Collection<p10.h> result, @m80.k x20.d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter, @m80.k x10.b location) {
            kotlin.jvm.internal.g0.p(result, "result");
            kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
            kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
            kotlin.jvm.internal.g0.p(location, "location");
            if (kindFilter.a(x20.d.f97078c.i())) {
                Set<n20.f> d11 = d();
                ArrayList arrayList = new ArrayList();
                for (n20.f fVar : d11) {
                    if (nameFilter.invoke(fVar).booleanValue()) {
                        arrayList.addAll(c(fVar, location));
                    }
                }
                j.b INSTANCE = j.b.f81476a;
                kotlin.jvm.internal.g0.o(INSTANCE, "INSTANCE");
                a00.l0.r0(arrayList, INSTANCE);
                result.addAll(arrayList);
            }
            if (kindFilter.a(x20.d.f97078c.d())) {
                Set<n20.f> b11 = b();
                ArrayList arrayList2 = new ArrayList();
                for (n20.f fVar2 : b11) {
                    if (nameFilter.invoke(fVar2).booleanValue()) {
                        arrayList2.addAll(a(fVar2, location));
                    }
                }
                j.b INSTANCE2 = j.b.f81476a;
                kotlin.jvm.internal.g0.o(INSTANCE2, "INSTANCE");
                a00.l0.r0(arrayList2, INSTANCE2);
                result.addAll(arrayList2);
            }
        }

        @Override // c30.w.a
        @m80.k
        public Set<n20.f> f() {
            return this.f7785c.keySet();
        }

        @Override // c30.w.a
        @m80.l
        public b1 g(@m80.k n20.f name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return this.f7788f.invoke(name);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> m(n20.f r6) {
            /*
                r5 = this;
                java.util.Map<n20.f, byte[]> r0 = r5.f7783a
                kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function.PARSER
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.g0.o(r1, r2)
                c30.w r2 = r5.f7791i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                c30.w r3 = r5.f7791i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                c30.w$c$a r0 = new c30.w$c$a
                r0.<init>(r1, r4, r3)
                q30.m r0 = q30.x.u(r0)
                java.util.List r0 = q30.k0.I3(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = a00.h0.J()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L6b
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function) r1
                a30.o r4 = r2.t()
                a30.j0 r4 = r4.f()
                kotlin.jvm.internal.g0.m(r1)
                kotlin.reflect.jvm.internal.impl.descriptors.g r1 = r4.s(r1)
                boolean r4 = r2.B(r1)
                if (r4 == 0) goto L64
                goto L65
            L64:
                r1 = 0
            L65:
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L6b:
                r2.o(r6, r3)
                java.util.List r6 = o30.a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: c30.w.c.m(n20.f):java.util.Collection");
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.Collection<p10.q0> n(n20.f r6) {
            /*
                r5 = this;
                java.util.Map<n20.f, byte[]> r0 = r5.f7784b
                kotlin.reflect.jvm.internal.impl.protobuf.p<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r1 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property.PARSER
                java.lang.String r2 = "PARSER"
                kotlin.jvm.internal.g0.o(r1, r2)
                c30.w r2 = r5.f7791i
                java.lang.Object r0 = r0.get(r6)
                byte[] r0 = (byte[]) r0
                if (r0 == 0) goto L2c
                c30.w r3 = r5.f7791i
                java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
                r4.<init>(r0)
                c30.w$c$a r0 = new c30.w$c$a
                r0.<init>(r1, r4, r3)
                q30.m r0 = q30.x.u(r0)
                java.util.List r0 = q30.k0.I3(r0)
                if (r0 == 0) goto L2c
                java.util.Collection r0 = (java.util.Collection) r0
                goto L32
            L2c:
                java.util.List r0 = a00.h0.J()
                java.util.Collection r0 = (java.util.Collection) r0
            L32:
                r1 = r0
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r3 = new java.util.ArrayList
                int r0 = r0.size()
                r3.<init>(r0)
                java.util.Iterator r0 = r1.iterator()
            L42:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L63
                java.lang.Object r1 = r0.next()
                kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r1 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property) r1
                a30.o r4 = r2.t()
                a30.j0 r4 = r4.f()
                kotlin.jvm.internal.g0.m(r1)
                p10.q0 r1 = r4.u(r1)
                if (r1 == 0) goto L42
                r3.add(r1)
                goto L42
            L63:
                r2.p(r6, r3)
                java.util.List r6 = o30.a.c(r3)
                java.util.Collection r6 = (java.util.Collection) r6
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: c30.w.c.n(n20.f):java.util.Collection");
        }

        public final b1 o(n20.f fVar) {
            ProtoBuf.TypeAlias parseDelimitedFrom;
            byte[] bArr = this.f7785c.get(fVar);
            if (bArr == null || (parseDelimitedFrom = ProtoBuf.TypeAlias.parseDelimitedFrom(new ByteArrayInputStream(bArr), this.f7791i.t().c().k())) == null) {
                return null;
            }
            return this.f7791i.t().f().z(parseDelimitedFrom);
        }

        public final Map<n20.f, byte[]> r(Map<n20.f, ? extends Collection<? extends kotlin.reflect.jvm.internal.impl.protobuf.a>> map) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(map.size()));
            Iterator<T> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(a00.i0.d0(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    ((kotlin.reflect.jvm.internal.impl.protobuf.a) it2.next()).writeDelimitedTo(byteArrayOutputStream);
                    arrayList.add(g2.f100423a);
                }
                linkedHashMap.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap;
        }
    }

    public w(@m80.k a30.o c11, @m80.k List<ProtoBuf.Function> functionList, @m80.k List<ProtoBuf.Property> propertyList, @m80.k List<ProtoBuf.TypeAlias> typeAliasList, @m80.k x00.a<? extends Collection<n20.f>> classNames) {
        kotlin.jvm.internal.g0.p(c11, "c");
        kotlin.jvm.internal.g0.p(functionList, "functionList");
        kotlin.jvm.internal.g0.p(propertyList, "propertyList");
        kotlin.jvm.internal.g0.p(typeAliasList, "typeAliasList");
        kotlin.jvm.internal.g0.p(classNames, "classNames");
        this.f7763b = c11;
        this.f7764c = r(functionList, propertyList, typeAliasList);
        this.f7765d = c11.h().f(new u(classNames));
        this.f7766e = c11.h().e(new v(this));
    }

    public static final Set l(x00.a aVar) {
        return a00.r0.f6((Iterable) aVar.invoke());
    }

    public static final Set m(w wVar) {
        Set<n20.f> w11 = wVar.w();
        if (w11 == null) {
            return null;
        }
        return x1.C(x1.C(wVar.u(), wVar.f7764c.f()), w11);
    }

    public boolean A(@m80.k n20.f name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return u().contains(name);
    }

    public boolean B(@m80.k kotlin.reflect.jvm.internal.impl.descriptors.g function) {
        kotlin.jvm.internal.g0.p(function, "function");
        return true;
    }

    @Override // x20.l, x20.k, x20.n
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        return this.f7764c.a(name, location);
    }

    @Override // x20.l, x20.k
    @m80.k
    public Set<n20.f> b() {
        return this.f7764c.b();
    }

    @Override // x20.l, x20.k
    @m80.k
    public Collection<p10.q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        return this.f7764c.c(name, location);
    }

    @Override // x20.l, x20.k
    @m80.k
    public Set<n20.f> d() {
        return this.f7764c.d();
    }

    @Override // x20.l, x20.k
    @m80.l
    public Set<n20.f> g() {
        return v();
    }

    @Override // x20.l, x20.n
    @m80.l
    public p10.d h(@m80.k n20.f name, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(location, "location");
        if (A(name)) {
            return s(name);
        }
        if (this.f7764c.f().contains(name)) {
            return z(name);
        }
        return null;
    }

    public abstract void k(@m80.k Collection<p10.h> collection, @m80.k x00.l<? super n20.f, Boolean> lVar);

    @m80.k
    public final Collection<p10.h> n(@m80.k x20.d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter, @m80.k x10.b location) {
        kotlin.jvm.internal.g0.p(kindFilter, "kindFilter");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        kotlin.jvm.internal.g0.p(location, "location");
        ArrayList arrayList = new ArrayList(0);
        d.a aVar = x20.d.f97078c;
        if (kindFilter.a(aVar.g())) {
            k(arrayList, nameFilter);
        }
        this.f7764c.e(arrayList, kindFilter, nameFilter, location);
        if (kindFilter.a(aVar.c())) {
            for (n20.f fVar : u()) {
                if (nameFilter.invoke(fVar).booleanValue()) {
                    o30.a.a(arrayList, s(fVar));
                }
            }
        }
        if (kindFilter.a(x20.d.f97078c.h())) {
            for (n20.f fVar2 : this.f7764c.f()) {
                if (nameFilter.invoke(fVar2).booleanValue()) {
                    o30.a.a(arrayList, this.f7764c.g(fVar2));
                }
            }
        }
        return o30.a.c(arrayList);
    }

    public void o(@m80.k n20.f name, @m80.k List<kotlin.reflect.jvm.internal.impl.descriptors.g> functions) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(functions, "functions");
    }

    public void p(@m80.k n20.f name, @m80.k List<p10.q0> descriptors) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(descriptors, "descriptors");
    }

    @m80.k
    public abstract n20.b q(@m80.k n20.f fVar);

    public final a r(List<ProtoBuf.Function> list, List<ProtoBuf.Property> list2, List<ProtoBuf.TypeAlias> list3) {
        return this.f7763b.c().g().d() ? new b(this, list, list2, list3) : new c(this, list, list2, list3);
    }

    public final p10.b s(n20.f fVar) {
        return this.f7763b.c().b(q(fVar));
    }

    @m80.k
    public final a30.o t() {
        return this.f7763b;
    }

    @m80.k
    public final Set<n20.f> u() {
        return (Set) d30.m.a(this.f7765d, this, f7762f[0]);
    }

    public final Set<n20.f> v() {
        return (Set) d30.m.b(this.f7766e, this, f7762f[1]);
    }

    @m80.l
    public abstract Set<n20.f> w();

    @m80.k
    public abstract Set<n20.f> x();

    @m80.k
    public abstract Set<n20.f> y();

    public final b1 z(n20.f fVar) {
        return this.f7764c.g(fVar);
    }
}
