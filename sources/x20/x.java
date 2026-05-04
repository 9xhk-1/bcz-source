package x20;

import a00.i0;
import e30.r0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import p10.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n3193#2,10:60\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope\n*L\n36#1:60,10\n*E\n"})
/* loaded from: classes8.dex */
public final class x extends x20.a {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f97137d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f97138b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final k f97139c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTypeIntersectionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,59:1\n1557#2:60\n1628#2,3:61\n*S KotlinDebug\n*F\n+ 1 TypeIntersectionScope.kt\norg/jetbrains/kotlin/resolve/scopes/TypeIntersectionScope$Companion\n*L\n50#1:60\n50#1:61,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @w00.o
        @m80.k
        public final k a(@m80.k String message, @m80.k Collection<? extends r0> types) {
            g0.p(message, "message");
            g0.p(types, "types");
            Collection<? extends r0> collection = types;
            ArrayList arrayList = new ArrayList(i0.d0(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((r0) it.next()).r());
            }
            o30.k<k> b11 = n30.a.b(arrayList);
            k b12 = b.f97072d.b(message, b11);
            return b11.size() <= 1 ? b12 : new x(message, b12, null);
        }

        public a() {
        }
    }

    public /* synthetic */ x(String str, k kVar, kotlin.jvm.internal.v vVar) {
        this(str, kVar);
    }

    @w00.o
    @m80.k
    public static final k n(@m80.k String str, @m80.k Collection<? extends r0> collection) {
        return f97137d.a(str, collection);
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.a o(kotlin.reflect.jvm.internal.impl.descriptors.a selectMostSpecificInEachOverridableGroup) {
        g0.p(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.a p(kotlin.reflect.jvm.internal.impl.descriptors.g selectMostSpecificInEachOverridableGroup) {
        g0.p(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    public static final kotlin.reflect.jvm.internal.impl.descriptors.a q(q0 selectMostSpecificInEachOverridableGroup) {
        g0.p(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
        return selectMostSpecificInEachOverridableGroup;
    }

    @Override // x20.a, x20.k, x20.n
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return q20.o.b(super.a(name, location), u.f97134a);
    }

    @Override // x20.a, x20.k
    @m80.k
    public Collection<q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return q20.o.b(super.c(name, location), v.f97135a);
    }

    @Override // x20.a, x20.n
    @m80.k
    public Collection<p10.h> f(@m80.k d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        g0.p(kindFilter, "kindFilter");
        g0.p(nameFilter, "nameFilter");
        Collection<p10.h> f11 = super.f(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : f11) {
            if (((p10.h) obj) instanceof kotlin.reflect.jvm.internal.impl.descriptors.a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list = (List) pair.component1();
        List list2 = (List) pair.component2();
        g0.n(list, "null cannot be cast to non-null type kotlin.collections.Collection<org.jetbrains.kotlin.descriptors.CallableDescriptor>");
        return a00.r0.I4(q20.o.b(list, w.f97136a), list2);
    }

    @Override // x20.a
    @m80.k
    public k j() {
        return this.f97139c;
    }

    public x(String str, k kVar) {
        this.f97138b = str;
        this.f97139c = kVar;
    }
}
