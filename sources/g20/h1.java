package g20;

import a00.x1;
import e30.g2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\ntypeEnhancementUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,61:1\n1#2:62\n1#2:73\n1#2:86\n1#2:99\n1611#3,9:63\n1863#3:72\n1864#3:74\n1620#3:75\n1611#3,9:76\n1863#3:85\n1864#3:87\n1620#3:88\n1611#3,9:89\n1863#3:98\n1864#3:100\n1620#3:101\n1755#3,3:102\n*S KotlinDebug\n*F\n+ 1 typeEnhancementUtils.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/TypeEnhancementUtilsKt\n*L\n41#1:73\n43#1:86\n45#1:99\n41#1:63,9\n41#1:72\n41#1:74\n41#1:75\n43#1:76,9\n43#1:85\n43#1:87\n43#1:88\n45#1:89,9\n45#1:98\n45#1:100\n45#1:101\n54#1:102,3\n*E\n"})
/* loaded from: classes8.dex */
public final class h1 {
    @m80.k
    public static final h a(@m80.k h hVar, @m80.k Collection<h> superQualifiers, boolean z11, boolean z12, boolean z13) {
        NullabilityQualifier nullabilityQualifier;
        boolean z14;
        kotlin.jvm.internal.g0.p(hVar, "<this>");
        kotlin.jvm.internal.g0.p(superQualifiers, "superQualifiers");
        Collection<h> collection = superQualifiers;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            NullabilityQualifier b11 = b((h) it.next());
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        NullabilityQualifier e11 = e(a00.r0.f6(arrayList), b(hVar), z11);
        if (e11 == null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = collection.iterator();
            while (it2.hasNext()) {
                NullabilityQualifier f11 = ((h) it2.next()).f();
                if (f11 != null) {
                    arrayList2.add(f11);
                }
            }
            nullabilityQualifier = e(a00.r0.f6(arrayList2), hVar.f(), z11);
        } else {
            nullabilityQualifier = e11;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it3 = collection.iterator();
        while (it3.hasNext()) {
            MutabilityQualifier e12 = ((h) it3.next()).e();
            if (e12 != null) {
                arrayList3.add(e12);
            }
        }
        MutabilityQualifier mutabilityQualifier = (MutabilityQualifier) d(a00.r0.f6(arrayList3), MutabilityQualifier.MUTABLE, MutabilityQualifier.READ_ONLY, hVar.e(), z11);
        NullabilityQualifier nullabilityQualifier2 = null;
        if (nullabilityQualifier != null && !z13 && (!z12 || nullabilityQualifier != NullabilityQualifier.NULLABLE)) {
            nullabilityQualifier2 = nullabilityQualifier;
        }
        boolean z15 = false;
        if (nullabilityQualifier2 == NullabilityQualifier.NOT_NULL) {
            if (!hVar.d()) {
                if (!collection.isEmpty()) {
                    Iterator<T> it4 = collection.iterator();
                    while (it4.hasNext()) {
                        if (((h) it4.next()).d()) {
                        }
                    }
                }
            }
            z14 = true;
            if (nullabilityQualifier2 != null && e11 != nullabilityQualifier) {
                z15 = true;
            }
            return new h(nullabilityQualifier2, mutabilityQualifier, z14, z15);
        }
        z14 = false;
        if (nullabilityQualifier2 != null) {
            z15 = true;
        }
        return new h(nullabilityQualifier2, mutabilityQualifier, z14, z15);
    }

    public static final NullabilityQualifier b(h hVar) {
        if (hVar.g()) {
            return null;
        }
        return hVar.f();
    }

    public static final boolean c(@m80.k g2 g2Var, @m80.k i30.g type) {
        kotlin.jvm.internal.g0.p(g2Var, "<this>");
        kotlin.jvm.internal.g0.p(type, "type");
        n20.c ENHANCED_NULLABILITY_ANNOTATION = y10.e0.f99051v;
        kotlin.jvm.internal.g0.o(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        return g2Var.L(type, ENHANCED_NULLABILITY_ANNOTATION);
    }

    public static final <T> T d(Set<? extends T> set, T t11, T t12, T t13, boolean z11) {
        Set<? extends T> f62;
        if (!z11) {
            if (t13 != null && (f62 = a00.r0.f6(x1.D(set, t13))) != null) {
                set = f62;
            }
            return (T) a00.r0.n5(set);
        }
        T t14 = set.contains(t11) ? t11 : set.contains(t12) ? t12 : null;
        if (kotlin.jvm.internal.g0.g(t14, t11) && kotlin.jvm.internal.g0.g(t13, t12)) {
            return null;
        }
        return t13 == null ? t14 : t13;
    }

    public static final NullabilityQualifier e(Set<? extends NullabilityQualifier> set, NullabilityQualifier nullabilityQualifier, boolean z11) {
        NullabilityQualifier nullabilityQualifier2 = NullabilityQualifier.FORCE_FLEXIBILITY;
        return nullabilityQualifier == nullabilityQualifier2 ? nullabilityQualifier2 : (NullabilityQualifier) d(set, NullabilityQualifier.NOT_NULL, NullabilityQualifier.NULLABLE, nullabilityQualifier, z11);
    }
}
