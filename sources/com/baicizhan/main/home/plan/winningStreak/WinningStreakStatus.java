package com.baicizhan.main.home.plan.winningStreak;

import androidx.compose.material.TextFieldImplKt;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WinningStreakStatus {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ WinningStreakStatus[] $VALUES;
    public static final WinningStreakStatus Finish = new WinningStreakStatus("Finish", 0);
    public static final WinningStreakStatus ComeOn = new WinningStreakStatus("ComeOn", 1);
    public static final WinningStreakStatus Hint = new WinningStreakStatus(TextFieldImplKt.PlaceholderId, 2);

    private static final /* synthetic */ WinningStreakStatus[] $values() {
        return new WinningStreakStatus[]{Finish, ComeOn, Hint};
    }

    static {
        WinningStreakStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private WinningStreakStatus(String str, int i11) {
    }

    @k
    public static m00.a<WinningStreakStatus> getEntries() {
        return $ENTRIES;
    }

    public static WinningStreakStatus valueOf(String str) {
        return (WinningStreakStatus) Enum.valueOf(WinningStreakStatus.class, str);
    }

    public static WinningStreakStatus[] values() {
        return (WinningStreakStatus[]) $VALUES.clone();
    }
}
