package q20;

import a00.h0;
import a00.r0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p10.b1;
import x20.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSealedClassInheritorsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n183#2,2:87\n1053#3:89\n*S KotlinDebug\n*F\n+ 1 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n*L\n73#1:87,2\n82#1:89\n*E\n"})
/* loaded from: classes8.dex */
public final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f81460a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 SealedClassInheritorsProvider.kt\norg/jetbrains/kotlin/resolve/CliSealedClassInheritorsProvider\n*L\n1#1,102:1\n82#2:103\n*E\n"})
    /* renamed from: q20.a$a, reason: collision with other inner class name */
    public static final class C1001a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return e00.g.l(u20.e.o((p10.b) t11).b(), u20.e.o((p10.b) t12).b());
        }
    }

    public static final void b(p10.b bVar, LinkedHashSet<p10.b> linkedHashSet, x20.k kVar, boolean z11) {
        for (p10.h hVar : n.a.a(kVar, x20.d.f97095t, null, 2, null)) {
            if (hVar instanceof p10.b) {
                p10.b bVar2 = (p10.b) hVar;
                if (bVar2.q0()) {
                    n20.f name = bVar2.getName();
                    g0.o(name, "getName(...)");
                    p10.d h11 = kVar.h(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    bVar2 = h11 instanceof p10.b ? (p10.b) h11 : h11 instanceof b1 ? ((b1) h11).l() : null;
                }
                if (bVar2 != null) {
                    if (h.z(bVar2, bVar)) {
                        linkedHashSet.add(bVar2);
                    }
                    if (z11) {
                        x20.k I = bVar2.I();
                        g0.o(I, "getUnsubstitutedInnerClassesScope(...)");
                        b(bVar, linkedHashSet, I, z11);
                    }
                }
            }
        }
    }

    @m80.k
    public Collection<p10.b> a(@m80.k p10.b sealedClass, boolean z11) {
        p10.h hVar;
        p10.h hVar2;
        g0.p(sealedClass, "sealedClass");
        if (sealedClass.k() != Modality.SEALED) {
            return h0.J();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z11) {
            Iterator<p10.h> it = u20.e.u(sealedClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    hVar = null;
                    break;
                }
                hVar = it.next();
                if (hVar instanceof p10.g0) {
                    break;
                }
            }
            hVar2 = hVar;
        } else {
            hVar2 = sealedClass.b();
        }
        if (hVar2 instanceof p10.g0) {
            b(sealedClass, linkedHashSet, ((p10.g0) hVar2).r(), z11);
        }
        x20.k I = sealedClass.I();
        g0.o(I, "getUnsubstitutedInnerClassesScope(...)");
        b(sealedClass, linkedHashSet, I, true);
        return r0.z5(linkedHashSet, new C1001a());
    }
}
