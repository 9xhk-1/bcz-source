package f30;

import a00.i0;
import a00.r0;
import e30.c1;
import e30.e0;
import e30.k2;
import e30.l0;
import e30.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIntersectionType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,183:1\n1557#2:184\n1628#2,3:185\n1557#2:188\n1628#2,3:189\n1557#2:192\n1628#2,3:193\n*S KotlinDebug\n*F\n+ 1 IntersectionType.kt\norg/jetbrains/kotlin/types/checker/IntersectionTypeKt\n*L\n26#1:184\n26#1:185,3\n38#1:188\n38#1:189,3\n58#1:192\n58#1:193,3\n*E\n"})
/* loaded from: classes8.dex */
public final class d {
    @m80.k
    public static final k2 a(@m80.k Collection<? extends k2> types) {
        c1 Q0;
        g0.p(types, "types");
        int size = types.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        }
        if (size == 1) {
            return (k2) r0.k5(types);
        }
        Collection<? extends k2> collection = types;
        ArrayList arrayList = new ArrayList(i0.d0(collection, 10));
        boolean z11 = false;
        boolean z12 = false;
        for (k2 k2Var : collection) {
            z11 = z11 || v0.a(k2Var);
            if (k2Var instanceof c1) {
                Q0 = (c1) k2Var;
            } else {
                if (!(k2Var instanceof e30.i0)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (e0.a(k2Var)) {
                    return k2Var;
                }
                Q0 = ((e30.i0) k2Var).Q0();
                z12 = true;
            }
            arrayList.add(Q0);
        }
        if (z11) {
            return g30.i.d(ErrorTypeKind.INTERSECTION_OF_ERROR_TYPES, types.toString());
        }
        if (!z12) {
            return b0.f50421a.d(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(i0.d0(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList2.add(l0.d((k2) it.next()));
        }
        b0 b0Var = b0.f50421a;
        return e30.u0.e(b0Var.d(arrayList), b0Var.d(arrayList2));
    }
}
