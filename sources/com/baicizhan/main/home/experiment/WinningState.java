package com.baicizhan.main.home.experiment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WinningState {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WinningState[] $VALUES;
    public static final WinningState NORMAL = new WinningState("NORMAL", 0);
    public static final WinningState ALERT = new WinningState("ALERT", 1);
    public static final WinningState COMPLETED = new WinningState("COMPLETED", 2);

    private static final /* synthetic */ WinningState[] $values() {
        return new WinningState[]{NORMAL, ALERT, COMPLETED};
    }

    static {
        WinningState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private WinningState(String str, int i11) {
    }

    @m80.k
    public static m00.a<WinningState> getEntries() {
        return $ENTRIES;
    }

    public static WinningState valueOf(String str) {
        return (WinningState) Enum.valueOf(WinningState.class, str);
    }

    public static WinningState[] values() {
        return (WinningState[]) $VALUES.clone();
    }
}
