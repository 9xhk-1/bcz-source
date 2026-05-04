package p6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import m3.g1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nCalculateAccuracyUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalculateAccuracyUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/CalculateAccuracyUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,24:1\n774#2:25\n865#2,2:26\n1#3:28\n*S KotlinDebug\n*F\n+ 1 CalculateAccuracyUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/CalculateAccuracyUC\n*L\n12#1:25\n12#1:26,2\n*E\n"})
/* loaded from: classes3.dex */
public final class c {
    public final int a(@m80.k List<g1> result) {
        kotlin.jvm.internal.g0.p(result, "result");
        ArrayList arrayList = new ArrayList();
        for (Object obj : result) {
            if (!((g1) obj).w()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return 0;
        }
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((g1) it.next()).m();
        }
        Iterator it2 = arrayList.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            i12 += ((g1) it2.next()).k();
        }
        if (i12 > 0) {
            return (int) ((i11 / i12) * 100);
        }
        return 0;
    }
}
