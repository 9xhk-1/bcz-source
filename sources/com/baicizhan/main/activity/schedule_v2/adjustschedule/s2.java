package com.baicizhan.main.activity.schedule_v2.adjustschedule;

import com.baicizhan.client.business.dataset.models.BookRecord;
import com.baicizhan.main.home.plan.data.LearnCardStatus;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class s2 {
    @m80.k
    public static final ScheduleStatus a(@m80.k BookRecord book, @m80.l LearnCardStatus learnCardStatus) {
        kotlin.jvm.internal.g0.p(book, "book");
        return (learnCardStatus == null || !learnCardStatus.isAllKill()) ? book.getRemainCountNotIncludeToday() <= 0 ? ScheduleStatus.NORMAL_REVIEW : ScheduleStatus.NORMAL_NEW : ScheduleStatus.ALL_KILL;
    }
}
