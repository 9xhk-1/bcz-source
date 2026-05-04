package oe;

import com.baicizhan.main.activity.schedule_v2.ScheduleType;
import com.baicizhan.main.vld.model.FavoritePlanInfo;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nVldUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VldUtils.kt\ncom/baicizhan/main/activity/schedule_v2/VldUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,16:1\n1#2:17\n*E\n"})
/* loaded from: classes4.dex */
public final class l1 {
    @m80.k
    public static final Pair<FavoritePlanInfo, ScheduleType> a(long j11, @m80.l FavoritePlanInfo favoritePlanInfo) {
        long j12;
        FavoritePlanInfo favoritePlanInfo2;
        if (favoritePlanInfo != null) {
            favoritePlanInfo2 = j11 == favoritePlanInfo.getBookId() ? favoritePlanInfo : null;
            if (favoritePlanInfo2 != null) {
                j12 = j11;
                return new Pair<>(favoritePlanInfo2, (favoritePlanInfo == null && j12 == favoritePlanInfo.getBookId()) ? ScheduleType.FAVORITE_ADJUST : ScheduleType.FAVORITE_NEW);
            }
        }
        j12 = j11;
        favoritePlanInfo2 = new FavoritePlanInfo(j12, 0, 2, null);
        return new Pair<>(favoritePlanInfo2, (favoritePlanInfo == null && j12 == favoritePlanInfo.getBookId()) ? ScheduleType.FAVORITE_ADJUST : ScheduleType.FAVORITE_NEW);
    }
}
