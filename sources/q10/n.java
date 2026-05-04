package q10;

import a00.a0;
import a00.r0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import q30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,123:1\n1734#2,3:124\n1368#2:129\n1454#2,5:130\n1251#3,2:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/CompositeAnnotations\n*L\n105#1:124,3\n112#1:129\n112#1:130,5\n107#1:127,2\n*E\n"})
/* loaded from: classes8.dex */
public final class n implements g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<g> f81427a;

    /* JADX WARN: Multi-variable type inference failed */
    public n(@m80.k List<? extends g> delegates) {
        g0.p(delegates, "delegates");
        this.f81427a = delegates;
    }

    public static final c d(n20.c cVar, g it) {
        g0.p(it, "it");
        return it.i(cVar);
    }

    public static final q30.m f(g it) {
        g0.p(it, "it");
        return r0.E1(it);
    }

    @Override // q10.g
    public boolean a0(@m80.k n20.c fqName) {
        g0.p(fqName, "fqName");
        Iterator it = r0.E1(this.f81427a).iterator();
        while (it.hasNext()) {
            if (((g) it.next()).a0(fqName)) {
                return true;
            }
        }
        return false;
    }

    @Override // q10.g
    @m80.l
    public c i(@m80.k n20.c fqName) {
        g0.p(fqName, "fqName");
        return (c) k0.i1(k0.S1(r0.E1(this.f81427a), new l(fqName)));
    }

    @Override // q10.g
    public boolean isEmpty() {
        List<g> list = this.f81427a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).isEmpty()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.lang.Iterable
    @m80.k
    public Iterator<c> iterator() {
        return k0.k1(r0.E1(this.f81427a), m.f81426a).iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@m80.k g... delegates) {
        this((List<? extends g>) a0.dz(delegates));
        g0.p(delegates, "delegates");
    }
}
