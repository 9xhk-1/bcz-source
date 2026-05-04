package oe;

import com.baicizhan.main.activity.schedule_v2.ScheduleType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class d1 {
    public static final boolean a(@m80.k ScheduleType scheduleType) {
        kotlin.jvm.internal.g0.p(scheduleType, "<this>");
        return scheduleType == ScheduleType.ADJUST || scheduleType == ScheduleType.ADJUST_BY_DEVICE;
    }

    public static final boolean b(@m80.k ScheduleType scheduleType) {
        kotlin.jvm.internal.g0.p(scheduleType, "<this>");
        return scheduleType.compareTo(ScheduleType.FAVORITE_NEW) >= 0;
    }

    public static final boolean c(@m80.k ScheduleType scheduleType) {
        kotlin.jvm.internal.g0.p(scheduleType, "<this>");
        return scheduleType == ScheduleType.NEW_BY_DEVICE || scheduleType == ScheduleType.ADJUST_BY_DEVICE;
    }

    public static final boolean d(@m80.k ScheduleType scheduleType) {
        kotlin.jvm.internal.g0.p(scheduleType, "<this>");
        return scheduleType == ScheduleType.NEW || scheduleType == ScheduleType.NEW_BY_DEVICE;
    }

    public static final boolean e(@m80.k ScheduleType scheduleType) {
        kotlin.jvm.internal.g0.p(scheduleType, "<this>");
        return scheduleType.compareTo(ScheduleType.ADJUST) <= 0;
    }
}
