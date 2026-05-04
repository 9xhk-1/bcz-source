package u40;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPredicate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Predicate.kt\nkotlinx/datetime/internal/format/ConjunctionPredicate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1740#2,3:37\n*S KotlinDebug\n*F\n+ 1 Predicate.kt\nkotlinx/datetime/internal/format/ConjunctionPredicate\n*L\n26#1:37,3\n*E\n"})
/* loaded from: classes8.dex */
public final class i<T> implements v<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<v<T>> f91793a;

    /* JADX WARN: Multi-variable type inference failed */
    public i(@m80.k List<? extends v<? super T>> predicates) {
        g0.p(predicates, "predicates");
        this.f91793a = predicates;
    }

    @Override // u40.v
    public boolean test(T t11) {
        List<v<T>> list = this.f91793a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!((v) it.next()).test(t11)) {
                return false;
            }
        }
        return true;
    }
}
