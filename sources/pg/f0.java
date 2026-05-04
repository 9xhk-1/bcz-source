package pg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.main.home.plan.data.LearnCardStatus;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class f0 extends h0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f80467b = 0;

    @Override // pg.h0
    @m80.k
    public LearnCardStatus a(@m80.k BookRecord book, @m80.k ad.c ss2) {
        kotlin.jvm.internal.g0.p(book, "book");
        kotlin.jvm.internal.g0.p(ss2, "ss");
        int M = LearnRecordManager.A().M();
        int D = q9.x.r().D();
        int E = LearnRecordManager.A().E();
        int H = LearnRecordManager.A().H();
        int I = LearnRecordManager.A().I();
        int d11 = ss2.d();
        int G = LearnRecordManager.A().G();
        int f11 = ss2.f();
        int o11 = ss2.o();
        int k11 = ss2.k();
        qb.c.i(i0.f80471a, "[totalLearnedSize,todayNewCount,remainCount,todayAlreadyLearn,todayTouchCount,todayNewLearnCount,todayReviewCount,currentReviewCount,reviewTotalCount,round, cake] [%d,%d,%d,%d,%d,%d,%d,%d,%d,%d,%d]", Integer.valueOf(M), Integer.valueOf(D), Integer.valueOf(E), Integer.valueOf(H), Integer.valueOf(I), Integer.valueOf(d11), Integer.valueOf(G), Integer.valueOf(f11), Integer.valueOf(o11), Integer.valueOf(k11), Integer.valueOf(hi.e.c()));
        return (d11 > 0 || (k11 <= 0 && G > 0)) ? LearnCardStatus.CAKE_LEARNING : (d11 > 0 || G > 0 || E <= 0) ? (E > 0 || o11 > 0) ? LearnCardStatus.CAKE_ALL_FINISHING_LEARNING_TODAY : LearnCardStatus.CAKE_ALL_KILL_TODAY : LearnCardStatus.CAKE_FINISHING_LEARNING_TODAY;
    }
}
