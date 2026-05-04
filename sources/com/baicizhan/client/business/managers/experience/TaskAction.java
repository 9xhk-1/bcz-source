package com.baicizhan.client.business.managers.experience;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class TaskAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TaskAction[] $VALUES;
    public static final TaskAction SelfTest = new TaskAction("SelfTest", 0);
    public static final TaskAction Listening = new TaskAction("Listening", 1);
    public static final TaskAction WantMoreClick = new TaskAction("WantMoreClick", 2);
    public static final TaskAction wordFM = new TaskAction("wordFM", 3);

    private static final /* synthetic */ TaskAction[] $values() {
        return new TaskAction[]{SelfTest, Listening, WantMoreClick, wordFM};
    }

    static {
        TaskAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private TaskAction(String str, int i11) {
    }

    @k
    public static a<TaskAction> getEntries() {
        return $ENTRIES;
    }

    public static TaskAction valueOf(String str) {
        return (TaskAction) Enum.valueOf(TaskAction.class, str);
    }

    public static TaskAction[] values() {
        return (TaskAction[]) $VALUES.clone();
    }
}
