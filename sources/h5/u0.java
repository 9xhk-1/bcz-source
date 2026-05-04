package h5;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUnitModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnitModel.kt\ncom/baicizhan/app/biz/game/model/UnitModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n1573#2:22\n1604#2,4:23\n*S KotlinDebug\n*F\n+ 1 UnitModel.kt\ncom/baicizhan/app/biz/game/model/UnitModelKt\n*L\n11#1:22\n11#1:23,4\n*E\n"})
/* loaded from: classes3.dex */
public final class u0 {
    @m80.k
    public static final t0 a(@m80.k p8.i iVar, int i11) {
        kotlin.jvm.internal.g0.p(iVar, "<this>");
        return new t0(i11, iVar.f79909b);
    }

    @m80.k
    public static final List<t0> b(@m80.k List<p8.i> list) {
        kotlin.jvm.internal.g0.p(list, "<this>");
        List<p8.i> list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            arrayList.add(a((p8.i) obj, i12));
            i11 = i12;
        }
        return arrayList;
    }
}
