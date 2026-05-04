package p6;

import f4.w2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nCalculateDaysLeftToFinishLearningUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalculateDaysLeftToFinishLearningUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/CalculateDaysLeftToFinishLearningUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,46:1\n1788#2,4:47\n*S KotlinDebug\n*F\n+ 1 CalculateDaysLeftToFinishLearningUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/CalculateDaysLeftToFinishLearningUC\n*L\n23#1:47,4\n*E\n"})
/* loaded from: classes3.dex */
public final class e {
    public final int a(@m80.k Map<Long, w2> studyRecord, @m80.k List<Integer> roadMap, int i11, int i12, int i13) {
        int i14;
        kotlin.jvm.internal.g0.p(studyRecord, "studyRecord");
        kotlin.jvm.internal.g0.p(roadMap, "roadMap");
        if (i12 <= 0 || i13 <= 0) {
            return -1;
        }
        List<Integer> list = roadMap;
        if ((list instanceof Collection) && list.isEmpty()) {
            i14 = 0;
        } else {
            Iterator<T> it = list.iterator();
            i14 = 0;
            while (it.hasNext()) {
                w2 w2Var = studyRecord.get(Long.valueOf(((Number) it.next()).intValue()));
                if (w2Var == null || (z5.i.r(w2Var) && !z5.i.e(w2Var))) {
                    i14++;
                    if (i14 < 0) {
                        a00.h0.a0();
                    }
                }
            }
        }
        if (i14 == 0) {
            return 0;
        }
        return (int) Math.ceil(i14 / (i12 * i13));
    }
}
