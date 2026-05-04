package m6;

import com.baicizhan.app.api.service.model.game.RewardType;
import h5.e0;
import h5.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m3.v0;
import oa0.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@r
@u0({"SMAP\nExtractRewardSummaryUC.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExtractRewardSummaryUC.kt\ncom/baicizhan/app/biz/game/uc/reward/ExtractRewardSummaryUC\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n774#2:32\n865#2,2:33\n1#3:35\n*S KotlinDebug\n*F\n+ 1 ExtractRewardSummaryUC.kt\ncom/baicizhan/app/biz/game/uc/reward/ExtractRewardSummaryUC\n*L\n26#1:32\n26#1:33,2\n*E\n"})
/* loaded from: classes3.dex */
public final class o {
    public final long a(List<e0> list, RewardType rewardType) {
        Iterator<T> it = list.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            List<v0> e11 = ((e0) it.next()).e();
            ArrayList arrayList = new ArrayList();
            for (Object obj : e11) {
                if (((v0) obj).j() == rewardType) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            long j12 = 0;
            while (it2.hasNext()) {
                j12 += ((v0) it2.next()).f();
            }
            j11 += j12;
        }
        return j11;
    }

    @m80.k
    public final f0 b(@m80.k List<e0> rewards) {
        g0.p(rewards, "rewards");
        return new f0(a(rewards, RewardType.Coin), a(rewards, RewardType.EnergyEn), a(rewards, RewardType.EnergyJp), a(rewards, RewardType.RankScore), (int) a(rewards, RewardType.Hammer), (int) a(rewards, RewardType.BuddyTravelSnacks));
    }
}
