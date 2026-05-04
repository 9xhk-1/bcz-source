package com.baicizhan.main.activity.mytab.task.data;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class TaskStatus {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ TaskStatus[] $VALUES;
    public static final TaskStatus FINISH = new TaskStatus("FINISH", 0);
    public static final TaskStatus DOING = new TaskStatus("DOING", 1);
    public static final TaskStatus REWARDING = new TaskStatus("REWARDING", 2);

    private static final /* synthetic */ TaskStatus[] $values() {
        return new TaskStatus[]{FINISH, DOING, REWARDING};
    }

    static {
        TaskStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private TaskStatus(String str, int i11) {
    }

    @k
    public static m00.a<TaskStatus> getEntries() {
        return $ENTRIES;
    }

    public static TaskStatus valueOf(String str) {
        return (TaskStatus) Enum.valueOf(TaskStatus.class, str);
    }

    public static TaskStatus[] values() {
        return (TaskStatus[]) $VALUES.clone();
    }
}
