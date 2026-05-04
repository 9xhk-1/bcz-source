package o10;

import a00.i0;
import a00.l1;
import a00.r0;
import e30.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmappingUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,24:1\n1557#2:25\n1628#2,3:26\n1557#2:29\n1628#2,3:30\n*S KotlinDebug\n*F\n+ 1 mappingUtil.kt\norg/jetbrains/kotlin/builtins/jvm/MappingUtilKt\n*L\n20#1:25\n20#1:26,3\n21#1:29\n21#1:30,3\n*E\n"})
/* loaded from: classes8.dex */
public final class t {
    @m80.k
    public static final v1 a(@m80.k p10.b from, @m80.k p10.b to2) {
        g0.p(from, "from");
        g0.p(to2, "to");
        from.t().size();
        to2.t().size();
        v1.a aVar = v1.f48674c;
        List<c1> t11 = from.t();
        g0.o(t11, "getDeclaredTypeParameters(...)");
        List<c1> list = t11;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c1) it.next()).o());
        }
        List<c1> t12 = to2.t();
        g0.o(t12, "getDeclaredTypeParameters(...)");
        List<c1> list2 = t12;
        ArrayList arrayList2 = new ArrayList(i0.d0(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            e30.c1 s11 = ((c1) it2.next()).s();
            g0.o(s11, "getDefaultType(...)");
            arrayList2.add(j30.e.e(s11));
        }
        return v1.a.e(aVar, l1.B0(r0.o6(arrayList, arrayList2)), false, 2, null);
    }
}
