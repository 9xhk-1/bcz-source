package u40;

import a00.g0;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import kotlinx.datetime.internal.format.OptionalFormatStructure;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFormatStructure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/FormatStructureKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,271:1\n1869#2,2:272\n1869#2,2:274\n*S KotlinDebug\n*F\n+ 1 FormatStructure.kt\nkotlinx/datetime/internal/format/FormatStructureKt\n*L\n259#1:272,2\n263#1:274,2\n*E\n"})
/* loaded from: classes8.dex */
public final class p {
    public static final <T> List<l<T>> b(o<? super T> oVar) {
        List j11 = g0.j();
        c(j11, oVar);
        return g0.b(j11);
    }

    public static final <T> void c(List<l<T>> list, o<? super T> oVar) {
        if (oVar instanceof e) {
            list.add(((e) oVar).c());
            return;
        }
        if (oVar instanceof h) {
            Iterator<T> it = ((h) oVar).c().iterator();
            while (it.hasNext()) {
                c(list, (t) it.next());
            }
            return;
        }
        if (oVar instanceof j) {
            return;
        }
        if (oVar instanceof a0) {
            c(list, ((a0) oVar).f());
            return;
        }
        if (!(oVar instanceof c)) {
            if (!(oVar instanceof OptionalFormatStructure)) {
                throw new NoWhenBranchMatchedException();
            }
            c(list, ((OptionalFormatStructure) oVar).d());
        } else {
            c cVar = (c) oVar;
            c(list, cVar.d());
            Iterator<T> it2 = cVar.c().iterator();
            while (it2.hasNext()) {
                c(list, (o) it2.next());
            }
        }
    }
}
