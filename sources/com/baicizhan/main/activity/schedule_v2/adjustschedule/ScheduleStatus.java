package com.baicizhan.main.activity.schedule_v2.adjustschedule;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ScheduleStatus {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ScheduleStatus[] $VALUES;
    public static final ScheduleStatus NORMAL_NEW = new ScheduleStatus("NORMAL_NEW", 0);
    public static final ScheduleStatus NORMAL_REVIEW = new ScheduleStatus("NORMAL_REVIEW", 1);
    public static final ScheduleStatus FAVORITE_PLAN = new ScheduleStatus("FAVORITE_PLAN", 2);
    public static final ScheduleStatus ALLINONE_REVIEW = new ScheduleStatus("ALLINONE_REVIEW", 3);
    public static final ScheduleStatus ALL_KILL = new ScheduleStatus("ALL_KILL", 4);

    private static final /* synthetic */ ScheduleStatus[] $values() {
        return new ScheduleStatus[]{NORMAL_NEW, NORMAL_REVIEW, FAVORITE_PLAN, ALLINONE_REVIEW, ALL_KILL};
    }

    static {
        ScheduleStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private ScheduleStatus(String str, int i11) {
    }

    @m80.k
    public static m00.a<ScheduleStatus> getEntries() {
        return $ENTRIES;
    }

    public static ScheduleStatus valueOf(String str) {
        return (ScheduleStatus) Enum.valueOf(ScheduleStatus.class, str);
    }

    public static ScheduleStatus[] values() {
        return (ScheduleStatus[]) $VALUES.clone();
    }
}
