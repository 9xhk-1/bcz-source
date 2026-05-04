package com.baicizhan.main.activity.schedule_v2;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class ScheduleType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ ScheduleType[] $VALUES;
    public static final ScheduleType NEW = new ScheduleType("NEW", 0);
    public static final ScheduleType ADJUST = new ScheduleType("ADJUST", 1);
    public static final ScheduleType NEW_BY_DEVICE = new ScheduleType("NEW_BY_DEVICE", 2);
    public static final ScheduleType ADJUST_BY_DEVICE = new ScheduleType("ADJUST_BY_DEVICE", 3);
    public static final ScheduleType FAVORITE_NEW = new ScheduleType("FAVORITE_NEW", 4);
    public static final ScheduleType FAVORITE_ADJUST = new ScheduleType("FAVORITE_ADJUST", 5);

    private static final /* synthetic */ ScheduleType[] $values() {
        return new ScheduleType[]{NEW, ADJUST, NEW_BY_DEVICE, ADJUST_BY_DEVICE, FAVORITE_NEW, FAVORITE_ADJUST};
    }

    static {
        ScheduleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private ScheduleType(String str, int i11) {
    }

    @k
    public static m00.a<ScheduleType> getEntries() {
        return $ENTRIES;
    }

    public static ScheduleType valueOf(String str) {
        return (ScheduleType) Enum.valueOf(ScheduleType.class, str);
    }

    public static ScheduleType[] values() {
        return (ScheduleType[]) $VALUES.clone();
    }
}
