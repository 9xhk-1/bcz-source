package f50;

import androidx.exifinterface.media.ExifInterface;
import j50.f1;
import j50.f2;
import j50.g2;
import j50.h1;
import j50.t0;
import j50.u2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.jvm.internal.u0;
import kotlinx.serialization.SerializationException;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSerializers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 2 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 SerializersCache.kt\nkotlinx/serialization/SerializersCacheKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,449:1\n78#2:450\n78#2:451\n78#2:458\n78#2:459\n1563#3:452\n1634#3,3:453\n1563#3:460\n1634#3,3:461\n1563#3:464\n1634#3,3:465\n78#4:456\n78#4:457\n37#5:468\n36#5,3:469\n*S KotlinDebug\n*F\n+ 1 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n*L\n35#1:450\n54#1:451\n260#1:458\n284#1:459\n218#1:452\n218#1:453,3\n295#1:460\n295#1:461,3\n297#1:464\n297#1:465,3\n251#1:456\n258#1:457\n362#1:468\n362#1:469,3\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class o0 {
    public static final i<? extends Object> c(h10.d<Object> dVar, List<? extends i<Object>> list, x00.a<? extends h10.g> aVar) {
        if (kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(Collection.class)) || kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(List.class)) || kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(List.class)) || kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(ArrayList.class))) {
            return new j50.f(list.get(0));
        }
        if (kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(HashSet.class))) {
            return new t0(list.get(0));
        }
        if (kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(Set.class)) || kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(Set.class)) || kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(LinkedHashSet.class))) {
            return new h1(list.get(0));
        }
        if (kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(HashMap.class))) {
            return new j50.r0(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(Map.class)) || kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(Map.class)) || kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(LinkedHashMap.class))) {
            return new f1(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(Map.Entry.class))) {
            return g50.a.k(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(Pair.class))) {
            return g50.a.n(list.get(0), list.get(1));
        }
        if (kotlin.jvm.internal.g0.g(dVar, kotlin.jvm.internal.o0.d(Triple.class))) {
            return g50.a.q(list.get(0), list.get(1), list.get(2));
        }
        if (!f2.q(dVar)) {
            return null;
        }
        h10.g invoke = aVar.invoke();
        kotlin.jvm.internal.g0.n(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return g50.a.b((h10.d) invoke, list.get(0));
    }

    public static final i<? extends Object> d(h10.d<Object> dVar, List<? extends i<Object>> list) {
        i[] iVarArr = (i[]) list.toArray(new i[0]);
        return f2.c(dVar, (i[]) Arrays.copyOf(iVarArr, iVarArr.length));
    }

    @v0
    @m80.k
    public static final i<?> e(@m80.k o50.f module, @m80.k h10.d<?> kClass) {
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(kClass, "kClass");
        i<?> d11 = o50.f.d(module, kClass, null, 2, null);
        return d11 == null ? new o(kClass) : d11;
    }

    @v0
    @m80.k
    public static final i<?> f(@m80.k o50.f module, @m80.k h10.d<?> kClass, @m80.k i<?>[] argSerializers) {
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(kClass, "kClass");
        kotlin.jvm.internal.g0.p(argSerializers, "argSerializers");
        i<?> c11 = module.c(kClass, a00.q.t(argSerializers));
        return c11 == null ? new o(kClass) : c11;
    }

    @v0
    @m80.k
    public static final i<?> g(@m80.k String forClass) {
        kotlin.jvm.internal.g0.p(forClass, "forClass");
        throw new SerializationException(g2.i(forClass));
    }

    @v0
    @m80.k
    public static final i<?> h(@m80.k o50.f module, @m80.k h10.d<?> kClass) {
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(kClass, "kClass");
        i<?> d11 = o50.f.d(module, kClass, null, 2, null);
        if (d11 != null) {
            return d11;
        }
        g2.j(kClass);
        throw new KotlinNothingValueException();
    }

    @v0
    @m80.k
    public static final i<?> i(@m80.k o50.f module, @m80.k h10.d<?> kClass, @m80.k i<?>[] argSerializers) {
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(kClass, "kClass");
        kotlin.jvm.internal.g0.p(argSerializers, "argSerializers");
        i<?> c11 = module.c(kClass, a00.q.t(argSerializers));
        if (c11 != null) {
            return c11;
        }
        g2.j(kClass);
        throw new KotlinNothingValueException();
    }

    public static final <T> i<T> j(i<T> iVar, boolean z11) {
        if (z11) {
            return g50.a.v(iVar);
        }
        kotlin.jvm.internal.g0.n(iVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return iVar;
    }

    @m80.l
    public static final i<? extends Object> k(@m80.k h10.d<Object> dVar, @m80.k List<? extends i<Object>> serializers, @m80.k x00.a<? extends h10.g> elementClassifierIfArray) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        kotlin.jvm.internal.g0.p(serializers, "serializers");
        kotlin.jvm.internal.g0.p(elementClassifierIfArray, "elementClassifierIfArray");
        i<? extends Object> c11 = c(dVar, serializers, elementClassifierIfArray);
        return c11 == null ? d(dVar, serializers) : c11;
    }

    public static final /* synthetic */ <T> i<T> l() {
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        b0 j11 = k0.j(null);
        kotlin.jvm.internal.g0.n(j11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (i) j11;
    }

    @h
    @m80.k
    public static final <T> i<T> m(@m80.k h10.d<T> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        i<T> p11 = k0.p(dVar);
        if (p11 != null) {
            return p11;
        }
        g2.j(dVar);
        throw new KotlinNothingValueException();
    }

    @f
    @m80.k
    public static final i<Object> n(@m80.k h10.d<?> kClass, @m80.k List<? extends i<?>> typeArgumentsSerializers, boolean z11) {
        kotlin.jvm.internal.g0.p(kClass, "kClass");
        kotlin.jvm.internal.g0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
        return k0.m(o50.h.a(), kClass, typeArgumentsSerializers, z11);
    }

    @m80.k
    public static final i<Object> o(@m80.k h10.r type) {
        kotlin.jvm.internal.g0.p(type, "type");
        return k0.n(o50.h.a(), type);
    }

    public static final /* synthetic */ <T> i<T> p(o50.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        b0 n11 = k0.n(fVar, null);
        kotlin.jvm.internal.g0.n(n11, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return (i) n11;
    }

    @f
    @m80.k
    public static final i<Object> q(@m80.k o50.f fVar, @m80.k h10.d<?> kClass, @m80.k List<? extends i<?>> typeArgumentsSerializers, boolean z11) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(kClass, "kClass");
        kotlin.jvm.internal.g0.p(typeArgumentsSerializers, "typeArgumentsSerializers");
        i<Object> s11 = s(fVar, kClass, typeArgumentsSerializers, z11);
        if (s11 != null) {
            return s11;
        }
        f2.s(kClass);
        throw new KotlinNothingValueException();
    }

    @m80.k
    public static final i<Object> r(@m80.k o50.f fVar, @m80.k h10.r type) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(type, "type");
        i<Object> u11 = u(fVar, type, true);
        if (u11 != null) {
            return u11;
        }
        f2.s(g2.g(type));
        throw new KotlinNothingValueException();
    }

    public static final i<Object> s(o50.f fVar, h10.d<Object> dVar, List<? extends i<Object>> list, boolean z11) {
        i<? extends Object> c11;
        if (list.isEmpty()) {
            c11 = k0.p(dVar);
            if (c11 == null) {
                c11 = o50.f.d(fVar, dVar, null, 2, null);
            }
        } else {
            try {
                i<? extends Object> f11 = k0.f(dVar, list, new x00.a() { // from class: f50.m0
                    @Override // x00.a
                    public final Object invoke() {
                        h10.g t11;
                        t11 = o0.t();
                        return t11;
                    }
                });
                c11 = f11 == null ? fVar.c(dVar, list) : f11;
            } catch (IndexOutOfBoundsException e11) {
                throw new SerializationException("Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters", e11);
            }
        }
        if (c11 != null) {
            return j(c11, z11);
        }
        return null;
    }

    public static final h10.g t() {
        throw new SerializationException("It is not possible to retrieve an array serializer using KClass alone, use KType instead or ArraySerializer factory");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final f50.i<java.lang.Object> u(o50.f r6, h10.r r7, boolean r8) {
        /*
            h10.d r0 = j50.g2.g(r7)
            boolean r1 = r7.e()
            java.util.List r7 = r7.getArguments()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = a00.i0.d0(r7, r3)
            r2.<init>(r3)
            java.util.Iterator r7 = r7.iterator()
        L1d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r7.next()
            h10.t r3 = (h10.t) r3
            h10.r r3 = j50.g2.k(r3)
            r2.add(r3)
            goto L1d
        L31:
            boolean r7 = r2.isEmpty()
            r3 = 2
            r4 = 0
            if (r7 == 0) goto L4c
            boolean r7 = j50.f2.n(r0)
            if (r7 == 0) goto L47
            f50.i r7 = o50.f.d(r6, r0, r4, r3, r4)
            if (r7 == 0) goto L47
        L45:
            r7 = r4
            goto L60
        L47:
            f50.i r7 = f50.j0.m(r0, r1)
            goto L60
        L4c:
            boolean r7 = r6.e()
            if (r7 == 0) goto L53
            goto L45
        L53:
            java.lang.Object r7 = f50.j0.n(r0, r2, r1)
            boolean r5 = kotlin.Result.m6314isFailureimpl(r7)
            if (r5 == 0) goto L5e
            r7 = r4
        L5e:
            f50.i r7 = (f50.i) r7
        L60:
            if (r7 == 0) goto L63
            return r7
        L63:
            boolean r7 = r2.isEmpty()
            if (r7 == 0) goto L84
            f50.i r7 = f50.k0.p(r0)
            if (r7 != 0) goto La9
            f50.i r7 = o50.f.d(r6, r0, r4, r3, r4)
            if (r7 != 0) goto La9
            boolean r6 = j50.f2.n(r0)
            if (r6 == 0) goto L82
            f50.o r6 = new f50.o
            r6.<init>(r0)
        L80:
            r7 = r6
            goto La9
        L82:
            r7 = r4
            goto La9
        L84:
            java.util.List r7 = f50.k0.u(r6, r2, r8)
            if (r7 != 0) goto L8b
            return r4
        L8b:
            f50.n0 r8 = new f50.n0
            r8.<init>()
            f50.i r8 = f50.k0.f(r0, r7, r8)
            if (r8 != 0) goto La8
            f50.i r7 = r6.c(r0, r7)
            if (r7 != 0) goto La9
            boolean r6 = j50.f2.n(r0)
            if (r6 == 0) goto L82
            f50.o r6 = new f50.o
            r6.<init>(r0)
            goto L80
        La8:
            r7 = r8
        La9:
            if (r7 == 0) goto Lb0
            f50.i r6 = j(r7, r1)
            return r6
        Lb0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f50.o0.u(o50.f, h10.r, boolean):f50.i");
    }

    public static final h10.g v(List list) {
        return ((h10.r) list.get(0)).m();
    }

    @h
    @m80.l
    public static final <T> i<T> w(@m80.k h10.d<T> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        i<T> b11 = f2.b(dVar);
        return b11 == null ? u2.b(dVar) : b11;
    }

    @m80.l
    public static final i<Object> x(@m80.k h10.r type) {
        kotlin.jvm.internal.g0.p(type, "type");
        return k0.s(o50.h.a(), type);
    }

    @m80.l
    public static final i<Object> y(@m80.k o50.f fVar, @m80.k h10.r type) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(type, "type");
        return u(fVar, type, false);
    }

    @m80.l
    public static final List<i<Object>> z(@m80.k o50.f fVar, @m80.k List<? extends h10.r> typeArguments, boolean z11) {
        kotlin.jvm.internal.g0.p(fVar, "<this>");
        kotlin.jvm.internal.g0.p(typeArguments, "typeArguments");
        if (z11) {
            List<? extends h10.r> list = typeArguments;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(k0.n(fVar, (h10.r) it.next()));
            }
            return arrayList;
        }
        List<? extends h10.r> list2 = typeArguments;
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            i<Object> s11 = k0.s(fVar, (h10.r) it2.next());
            if (s11 == null) {
                return null;
            }
            arrayList2.add(s11);
        }
        return arrayList2;
    }
}
