package p6;

import com.baicizhan.app.biz.game.model.RoundType;
import f4.w2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nProcessStudySummary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessStudySummary.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/ProcessStudySummaryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1740#2,3:146\n774#2:149\n865#2,2:150\n1761#2,3:152\n1761#2,3:155\n1563#2:158\n1634#2,3:159\n1761#2,3:162\n1761#2,3:165\n1788#2,4:168\n1788#2,4:172\n*S KotlinDebug\n*F\n+ 1 ProcessStudySummary.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/ProcessStudySummaryKt\n*L\n66#1:146,3\n78#1:149\n78#1:150,2\n83#1:152,3\n94#1:155,3\n101#1:158\n101#1:159,3\n111#1:162,3\n118#1:165,3\n126#1:168,4\n134#1:172,4\n*E\n"})
/* loaded from: classes3.dex */
public final class r {
    public static final List<RoundType> i(List<h5.m> list) {
        List<h5.m> list2 = list;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(RoundType.Companion.a(((h5.m) it.next()).z()));
        }
        return arrayList;
    }

    public static final boolean j(List<Integer> list, Map<Long, w2> map) {
        List<Integer> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            w2 w2Var = map.get(Long.valueOf(((Number) it.next()).intValue()));
            if (w2Var == null) {
                return false;
            }
            if (!z5.i.f(w2Var) && !z5.i.e(w2Var)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean k(List<Integer> list, Map<Long, w2> map, long j11) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            w2 w2Var = map.get(Long.valueOf(((Number) next).intValue()));
            if (w2Var != null ? true ^ z5.i.e(w2Var) : true) {
                arrayList.add(next);
            }
        }
        boolean z11 = false;
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                w2 w2Var2 = map.get(Long.valueOf(((Number) it2.next()).intValue()));
                if (w2Var2 == null || z5.i.r(w2Var2) || z5.i.m(w2Var2, j11)) {
                    z11 = true;
                    break;
                }
            }
        }
        return !z11;
    }

    public static final boolean l(long j11, List<w2> list) {
        List<w2> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (w2 w2Var : list2) {
            if (z5.i.p(w2Var, j11) && z5.i.d(w2Var)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean m(long j11, List<w2> list) {
        List<w2> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            if (z5.i.a((w2) it.next(), j11)) {
                return true;
            }
        }
        return false;
    }

    public static final int n(List<w2> list) {
        List<w2> list2 = list;
        int i11 = 0;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return 0;
        }
        for (w2 w2Var : list2) {
            if (!z5.i.r(w2Var) || z5.i.e(w2Var)) {
                i11++;
                if (i11 < 0) {
                    a00.h0.a0();
                }
            }
        }
        return i11;
    }

    public static final int o(List<w2> list) {
        List<w2> list2 = list;
        int i11 = 0;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return 0;
        }
        for (w2 w2Var : list2) {
            if (z5.i.e(w2Var) || z5.i.f(w2Var)) {
                i11++;
                if (i11 < 0) {
                    a00.h0.a0();
                }
            }
        }
        return i11;
    }

    public static final int p(List<Integer> list, List<w2> list2) {
        return list.size();
    }

    public static final boolean q(@m80.k List<w2> studyRecord, long j11) {
        kotlin.jvm.internal.g0.p(studyRecord, "studyRecord");
        List<w2> list = studyRecord;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (w2 w2Var : list) {
            if (!z5.i.e(w2Var) && z5.i.m(w2Var, j11)) {
                return true;
            }
        }
        return false;
    }
}
