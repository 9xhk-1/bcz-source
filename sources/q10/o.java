package q10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnnotations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,123:1\n774#2:124\n865#2,2:125\n1755#2,3:127\n*S KotlinDebug\n*F\n+ 1 Annotations.kt\norg/jetbrains/kotlin/descriptors/annotations/FilteredAnnotations\n*L\n69#1:124\n69#1:125,2\n72#1:127,3\n*E\n"})
/* loaded from: classes8.dex */
public final class o implements g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g f81428a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f81429b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final x00.l<n20.c, Boolean> f81430c;

    /* JADX WARN: Multi-variable type inference failed */
    public o(@m80.k g delegate, boolean z11, @m80.k x00.l<? super n20.c, Boolean> fqNameFilter) {
        g0.p(delegate, "delegate");
        g0.p(fqNameFilter, "fqNameFilter");
        this.f81428a = delegate;
        this.f81429b = z11;
        this.f81430c = fqNameFilter;
    }

    public final boolean a(c cVar) {
        n20.c d11 = cVar.d();
        return d11 != null && this.f81430c.invoke(d11).booleanValue();
    }

    @Override // q10.g
    public boolean a0(@m80.k n20.c fqName) {
        g0.p(fqName, "fqName");
        if (this.f81430c.invoke(fqName).booleanValue()) {
            return this.f81428a.a0(fqName);
        }
        return false;
    }

    @Override // q10.g
    @m80.l
    public c i(@m80.k n20.c fqName) {
        g0.p(fqName, "fqName");
        if (this.f81430c.invoke(fqName).booleanValue()) {
            return this.f81428a.i(fqName);
        }
        return null;
    }

    @Override // q10.g
    public boolean isEmpty() {
        boolean z11;
        g gVar = this.f81428a;
        if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
            Iterator<c> it = gVar.iterator();
            while (it.hasNext()) {
                if (a(it.next())) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        return this.f81429b ? !z11 : z11;
    }

    @Override // java.lang.Iterable
    @m80.k
    public Iterator<c> iterator() {
        g gVar = this.f81428a;
        ArrayList arrayList = new ArrayList();
        for (c cVar : gVar) {
            if (a(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(@m80.k g delegate, @m80.k x00.l<? super n20.c, Boolean> fqNameFilter) {
        this(delegate, false, fqNameFilter);
        g0.p(delegate, "delegate");
        g0.p(fqNameFilter, "fqNameFilter");
    }
}
