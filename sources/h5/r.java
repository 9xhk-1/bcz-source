package h5;

import com.baicizhan.app.biz.game.model.LavaQuestState;
import com.baicizhan.online.playground_api.LavaquestGameInfo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f58431a = 2;

    @m80.k
    public static final LavaQuestState a(@m80.k LavaquestGameInfo lavaquestGameInfo, long j11) {
        kotlin.jvm.internal.g0.p(lavaquestGameInfo, "<this>");
        long j12 = lavaquestGameInfo.cool_down_time;
        return (j12 != 0 || lavaquestGameInfo.status == 1) ? lavaquestGameInfo.end_time > j11 ? LavaQuestState.Active : (j12 <= j11 || lavaquestGameInfo.status == 1) ? lavaquestGameInfo.status == 1 ? LavaQuestState.SettledClaim : LavaQuestState.Ready : LavaQuestState.SettledNonClaim : LavaQuestState.Ready;
    }
}
