package j50;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,190:1\n1#2:191\n37#3:192\n36#3,3:193\n1803#4,3:196\n*S KotlinDebug\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n74#1:192\n74#1:193,3\n160#1:196,3\n*E\n"})
/* loaded from: classes8.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final h50.f[] f63367a = new h50.f[0];

    @m80.k
    public static final Set<String> a(@m80.k h50.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        if (fVar instanceof n) {
            return ((n) fVar).a();
        }
        HashSet hashSet = new HashSet(fVar.h());
        int h11 = fVar.h();
        for (int i11 = 0; i11 < h11; i11++) {
            hashSet.add(fVar.i(i11));
        }
        return hashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.v0
    @m80.k
    public static final <T> f50.e<T> b(@m80.k f50.e<?> eVar) {
        kotlin.jvm.internal.g0.p(eVar, "<this>");
        return eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.v0
    @m80.k
    public static final <T> f50.i<T> c(@m80.k f50.i<?> iVar) {
        kotlin.jvm.internal.g0.p(iVar, "<this>");
        return iVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @yz.v0
    @m80.k
    public static final <T> f50.b0<T> d(@m80.k f50.b0<?> b0Var) {
        kotlin.jvm.internal.g0.p(b0Var, "<this>");
        return b0Var;
    }

    @m80.k
    public static final h50.f[] e(@m80.l List<? extends h50.f> list) {
        h50.f[] fVarArr;
        List<? extends h50.f> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (fVarArr = (h50.f[]) list.toArray(new h50.f[0])) == null) ? f63367a : fVarArr;
    }

    public static final <T, K> int f(@m80.k Iterable<? extends T> iterable, @m80.k x00.l<? super T, ? extends K> selector) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        kotlin.jvm.internal.g0.p(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 1;
        while (it.hasNext()) {
            int i12 = i11 * 31;
            K invoke = selector.invoke(it.next());
            i11 = i12 + (invoke != null ? invoke.hashCode() : 0);
        }
        return i11;
    }

    @m80.k
    public static final h10.d<Object> g(@m80.k h10.r rVar) {
        kotlin.jvm.internal.g0.p(rVar, "<this>");
        h10.g m11 = rVar.m();
        if (m11 instanceof h10.d) {
            return (h10.d) m11;
        }
        if (!(m11 instanceof h10.s)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + m11);
        }
        throw new IllegalArgumentException("Captured type parameter " + m11 + " from generic non-reified function. Such functionality cannot be supported because " + m11 + " is erased, either specify serializer explicitly or make calling function inline with reified " + m11 + '.');
    }

    @m80.k
    public static final String h(@m80.k h10.d<?> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        String C = dVar.C();
        if (C == null) {
            C = "<local class name not available>";
        }
        return i(C);
    }

    @m80.k
    public static final String i(@m80.k String className) {
        kotlin.jvm.internal.g0.p(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    @m80.k
    public static final Void j(@m80.k h10.d<?> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        throw new SerializationException(h(dVar));
    }

    @m80.k
    public static final h10.r k(@m80.k h10.t tVar) {
        kotlin.jvm.internal.g0.p(tVar, "<this>");
        h10.r g11 = tVar.g();
        if (g11 != null) {
            return g11;
        }
        throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + tVar.g()).toString());
    }
}
