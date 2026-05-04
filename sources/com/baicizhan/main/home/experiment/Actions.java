package com.baicizhan.main.home.experiment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class Actions {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ Actions[] $VALUES;
    public static final Actions ACTION_WINNING = new Actions("ACTION_WINNING", 0);
    public static final Actions ACTION_SEARCH = new Actions("ACTION_SEARCH", 1);
    public static final Actions ACTION_MESSAGES = new Actions("ACTION_MESSAGES", 2);
    public static final Actions ACTION_TOOLS = new Actions("ACTION_TOOLS", 3);

    private static final /* synthetic */ Actions[] $values() {
        return new Actions[]{ACTION_WINNING, ACTION_SEARCH, ACTION_MESSAGES, ACTION_TOOLS};
    }

    static {
        Actions[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private Actions(String str, int i11) {
    }

    @m80.k
    public static m00.a<Actions> getEntries() {
        return $ENTRIES;
    }

    public static Actions valueOf(String str) {
        return (Actions) Enum.valueOf(Actions.class, str);
    }

    public static Actions[] values() {
        return (Actions[]) $VALUES.clone();
    }
}
