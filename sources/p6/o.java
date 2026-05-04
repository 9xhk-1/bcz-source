package p6;

import a00.r0;
import com.baicizhan.app.biz.base.BizInternalException;
import com.baicizhan.app.biz.game.model.RoundType;
import com.baicizhan.app.biz.game.model.StudyStage;
import f4.w2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import m3.g1;
import m3.k2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
@u0({"SMAP\nProcessStudyResultUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProcessStudyResultUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/ProcessStudyResultUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1563#2:80\n1634#2,3:81\n1563#2:84\n1634#2,3:85\n1563#2:88\n1634#2,3:89\n295#2,2:92\n1#3:94\n*S KotlinDebug\n*F\n+ 1 ProcessStudyResultUC.kt\ncom/baicizhan/app/biz/game/uc/study/algorithm/ProcessStudyResultUC\n*L\n27#1:80\n27#1:81,3\n46#1:84\n46#1:85,3\n47#1:88\n47#1:89,3\n52#1:92,2\n*E\n"})
/* loaded from: classes3.dex */
public final class o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f79294a;

        static {
            int[] iArr = new int[RoundType.values().length];
            try {
                iArr[RoundType.LEARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoundType.AI_LEADS_U.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RoundType.SPELLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RoundType.REVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RoundType.AI_LEADS_U_R.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f79294a = iArr;
        }
    }

    public final long a(RoundType roundType, g1 g1Var) {
        Integer num;
        int i11 = a.f79294a[roundType.ordinal()];
        int i12 = 1;
        if (i11 == 1 || i11 == 2) {
            Integer valueOf = Integer.valueOf(g1Var.o());
            num = valueOf.intValue() >= 1 ? valueOf : null;
            if (num != null) {
                i12 = num.intValue();
            }
        } else if (i11 == 3) {
            Integer valueOf2 = Integer.valueOf(g1Var.o());
            num = valueOf2.intValue() >= 1 ? valueOf2 : null;
            if (num != null) {
                i12 = num.intValue();
            }
        } else {
            if (i11 != 4 && i11 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            Integer valueOf3 = Integer.valueOf(g1Var.o());
            num = valueOf3.intValue() >= 1 ? valueOf3 : null;
            if (num != null) {
                i12 = num.intValue();
            }
        }
        return i12;
    }

    public final long b(RoundType roundType) {
        int i11 = a.f79294a[roundType.ordinal()];
        if (i11 == 1) {
            return StudyStage.NewLearningCompleted.getValue();
        }
        if (i11 == 2) {
            return StudyStage.SpellSkipped.getValue();
        }
        if (i11 == 3) {
            return StudyStage.SpellCompleted.getValue();
        }
        if (i11 == 4 || i11 == 5) {
            return StudyStage.Reviewing.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    @m80.k
    public final List<w2> c(@m80.k h5.m roundInfo, @m80.k List<g1> result, long j11) {
        o oVar = this;
        kotlin.jvm.internal.g0.p(roundInfo, "roundInfo");
        kotlin.jvm.internal.g0.p(result, "result");
        d(roundInfo, result);
        long l11 = w3.g.l();
        long n11 = w3.g.n();
        RoundType a11 = RoundType.Companion.a(roundInfo.z());
        List<g1> list = result;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        for (g1 g1Var : list) {
            long a12 = oVar.a(a11, g1Var);
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new w2(roundInfo.n(), g1Var.s(), oVar.b(a11), g1Var.w() ? 1L : 0L, a12, w3.g.h(l11, a12), a11 == RoundType.SPELLING ? j11 : l11, n11));
            arrayList = arrayList2;
            oVar = this;
        }
        return arrayList;
    }

    public final void d(@m80.k h5.m roundInfo, @m80.k List<g1> result) {
        Object obj;
        kotlin.jvm.internal.g0.p(roundInfo, "roundInfo");
        kotlin.jvm.internal.g0.p(result, "result");
        List<g1> list = result;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((g1) it.next()).s()));
        }
        Set f62 = r0.f6(arrayList);
        List<k2> B = roundInfo.B();
        ArrayList arrayList2 = new ArrayList(a00.i0.d0(B, 10));
        Iterator<T> it2 = B.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(((k2) it2.next()).j()));
        }
        Set f63 = r0.f6(arrayList2);
        if (f62.size() != f63.size()) {
            z6.b.f(z6.b.f101032b, p.f79295a, "studyRecord topicId size not match " + f62 + ' ' + f63, null, 4, null);
            throw new BizInternalException("studyRecord topicId size not match", null, 0, 6, null);
        }
        Iterator it3 = f62.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it3.next();
                if (!f63.contains(Integer.valueOf(((Number) obj).intValue()))) {
                    break;
                }
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        z6.b.f(z6.b.f101032b, p.f79295a, "studyRecord topicId size not match " + f62 + ' ' + f63, null, 4, null);
        throw new BizInternalException("studyRecord topicId not match " + num.intValue(), null, 0, 6, null);
    }
}
