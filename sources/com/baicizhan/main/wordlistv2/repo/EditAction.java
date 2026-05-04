package com.baicizhan.main.wordlistv2.repo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public final class EditAction {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ EditAction[] $VALUES;
    public static final EditAction KILL = new EditAction("KILL", 0);
    public static final EditAction RELEARN = new EditAction("RELEARN", 1);
    public static final EditAction UNKILL = new EditAction("UNKILL", 2);

    private static final /* synthetic */ EditAction[] $values() {
        return new EditAction[]{KILL, RELEARN, UNKILL};
    }

    static {
        EditAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private EditAction(String str, int i11) {
    }

    @m80.k
    public static m00.a<EditAction> getEntries() {
        return $ENTRIES;
    }

    public static EditAction valueOf(String str) {
        return (EditAction) Enum.valueOf(EditAction.class, str);
    }

    public static EditAction[] values() {
        return (EditAction[]) $VALUES.clone();
    }
}
