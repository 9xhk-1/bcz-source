package io.ktor.serialization.kotlinx;

import a00.a0;
import a00.i0;
import a00.r0;
import f50.h;
import f50.i;
import f50.k0;
import h10.r;
import io.ktor.utils.io.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.w0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerializerLookup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SerializerLookup.kt\nio/ktor/serialization/kotlinx/SerializerLookupKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,83:1\n1#2:84\n1557#3:85\n1628#3,3:86\n1663#3,8:89\n1557#3:97\n1628#3,3:98\n1755#3,3:101\n*S KotlinDebug\n*F\n+ 1 SerializerLookup.kt\nio/ktor/serialization/kotlinx/SerializerLookupKt\n*L\n59#1:85\n59#1:86,3\n59#1:89,8\n64#1:97\n64#1:98,3\n77#1:101,3\n*E\n"})
/* loaded from: classes8.dex */
public final class g {
    public static final i<?> a(Collection<?> collection, o50.f fVar) {
        Collection<?> collection2 = collection;
        List x22 = r0.x2(collection2);
        ArrayList arrayList = new ArrayList(i0.d0(x22, 10));
        Iterator it = x22.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next(), fVar));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((i) obj).a().k())) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.size() > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Serializing collections of different element types is not yet supported. Selected serializers: ");
            ArrayList arrayList3 = new ArrayList(i0.d0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((i) it2.next()).a().k());
            }
            sb2.append(arrayList3);
            throw new IllegalStateException(sb2.toString().toString());
        }
        i<String> iVar = (i) r0.p5(arrayList2);
        if (iVar == null) {
            iVar = g50.a.F(w0.f67050a);
        }
        if (iVar.a().b()) {
            return iVar;
        }
        g0.n(iVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return iVar;
        }
        Iterator<T> it3 = collection2.iterator();
        while (it3.hasNext()) {
            if (it3.next() == null) {
                return g50.a.v(iVar);
            }
        }
        return iVar;
    }

    @b0
    @k
    public static final i<Object> b(@l Object obj, @k o50.f module) {
        i<Object> h11;
        g0.p(module, "module");
        if (obj == null) {
            h11 = g50.a.v(g50.a.F(w0.f67050a));
        } else if (obj instanceof List) {
            h11 = g50.a.i(a((Collection) obj, module));
        } else if (obj instanceof Object[]) {
            Object Fc = a0.Fc((Object[]) obj);
            if (Fc == null || (h11 = b(Fc, module)) == null) {
                h11 = g50.a.i(g50.a.F(w0.f67050a));
            }
        } else if (obj instanceof Set) {
            h11 = g50.a.o(a((Collection) obj, module));
        } else if (obj instanceof Map) {
            Map map = (Map) obj;
            h11 = g50.a.l(a(map.keySet(), module), a(map.values(), module));
        } else {
            i<Object> d11 = o50.f.d(module, o0.d(obj.getClass()), null, 2, null);
            h11 = d11 == null ? k0.h(o0.d(obj.getClass())) : d11;
        }
        g0.n(h11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return h11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> i<?> c(i<T> iVar, gz.a aVar) {
        r a11 = aVar.a();
        return (a11 == null || !a11.e()) ? iVar : g50.a.v(iVar);
    }

    @h
    @f50.f
    @k
    public static final i<?> d(@k o50.f fVar, @k gz.a typeInfo) {
        g0.p(fVar, "<this>");
        g0.p(typeInfo, "typeInfo");
        r a11 = typeInfo.a();
        if (a11 != null) {
            i<?> s11 = a11.getArguments().isEmpty() ? null : k0.s(fVar, a11);
            if (s11 != null) {
                return s11;
            }
        }
        i d11 = o50.f.d(fVar, typeInfo.b(), null, 2, null);
        return d11 != null ? c(d11, typeInfo) : c(k0.h(typeInfo.b()), typeInfo);
    }
}
